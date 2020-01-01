package com.jap.utils;

import java.io.*;
import java.util.Date;
import java.util.regex.Pattern;

public class FileHandler {
    public static void copyOfAssets(String[] assets, String destination) throws IOException {
        for (String asset : assets) {
            String[] s = asset.split(Pattern.quote("/"));
            if (s.length>1) {
                String newDir = destination;
                for (int i = 0; i < s.length -1; i++) {
                    newDir += s[i] + "/";
                    generateDirectory(newDir);
                }
            }
            String file = FileHandler.class.getClassLoader().getResource(asset).toString().substring(5);
            String dest = destination.concat(asset);
            copy(file, dest);
        }
    }

    private static void copy(String pathFile, String pathDest) throws IOException {
        File file = new File(pathFile);
        File dest = new File(pathDest);
        try (InputStream is = new FileInputStream(file); OutputStream os = new FileOutputStream(dest)) {
            // buffer size 1K
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        }
    }

    public static void writeFile(String pathName, String content) throws IOException {
        writeFile(pathName, content, false);
    }
    public static void writeFile(String pathName, String content, boolean append) throws IOException {
        writeFile(pathName, content, append, true);
    }
    public static void writeFile(String pathName, String content, boolean append, boolean withWatermark) throws IOException {
        FileWriter fw = new FileWriter(new File(pathName), append);
        generateFile(fw, content, withWatermark);
    }

    public static void generateFile(Writer fileWriter, String content, Boolean withWatermark) throws IOException {
        BufferedWriter bw = new BufferedWriter(fileWriter);
        String write = content;
        if (withWatermark) {
            String watermark = "/** Generate by Johnny Austor Builder at " + new Date().toString() + " */\n";
            write = watermark.concat(content);
        }
        bw.write(write);
        bw.flush();
        bw.close();
    }

    public static boolean generateDirectory(String path) {
        File file = new File(path);
        return file.mkdirs();
    }
}
