package com.jap.utils;

public class StringManipulationHandler {
    /**
     * Convert any String to Capital
     * @param str string hello world
     * @return Hello Word
     */
    public static String convertToUppercase(String str)
    {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        // Create a char array of given String
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (ch[i] == '_' || ch[i] == '-') {
                capitalizeNext = true;
                continue;
            }
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                    ch[i] != ' ' && ch[i - 1] == ' ') {

                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {

                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }

            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z') {

                // Convert into Lower-Case
                ch[i] = (char) (ch[i] + 'a' - 'A');
            }

            if (capitalizeNext){
                // Convert into Upper-case
                ch[i] = (char)(ch[i] - 'a' + 'A');
                capitalizeNext = false;
            }
            sb.append(ch[i]);
        }

        // Convert the char array to equivalent String
        // String st = new String(ch);
        return sb.toString();
    }

    /**
     * Convert any String to Class Name Format
     * @param str string hElLo-worlD
     * @return HelloWorld
     */
    public static String convertToClassName(String str)
    {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        // Create a char array of given String
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (ch[i] == '_' || ch[i] == '-' || ch[i] == ' ') {
                capitalizeNext = true;
                continue;
            }
            // If first character of a word is found
            if (i == 0 || ch[i - 1] == '-' ||
                    ch[i - 1] == '_' ||
                    ch[i - 1] == ' ') {

                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {

                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                    capitalizeNext = false;
                }

                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    capitalizeNext = false;
                }
            }

            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z') {

                // Convert into Lower-Case
                ch[i] = (char) (ch[i] + 'a' - 'A');
            }

            if (capitalizeNext){
                // Convert into Upper-case
                ch[i] = (char)(ch[i] - 'a' + 'A');
                capitalizeNext = false;
            }
            sb.append(ch[i]);
        }

        // Convert the char array to equivalent String
        // String st = new String(ch);
        return sb.toString();
    }

    public static String convertUnderscoreToDash(String string) {
        StringBuilder sb = new StringBuilder();

        // Create a char array of given String
        char[] ch = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (ch[i] != ' ') {
                if (ch[i] == '_') {
                    ch[i] = '-';
                }

                // if capital convert to lowercase
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    // Convert into Lower-Case
                    ch[i] = (char) (ch[i] + 'a' - 'A');
                }
                sb.append(ch[i]);
            }
        }

        return sb.toString();

    }

    public static String convertUnderscoreToSpace(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        // Create a char array of given String
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (ch[i] == '_') {
                sb.append(' ');
                capitalizeNext = true;
                continue;
            }

            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' ||
                    ch[i] != ' ' && ch[i - 1] == ' ') {

                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {

                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }

            if (capitalizeNext){
                // Convert into Upper-case
                ch[i] = (char)(ch[i] - 'a' + 'A');
                capitalizeNext = false;
            }
            sb.append(ch[i]);
        }

        // Convert the char array to equivalent String
        // String st = new String(ch);
        return sb.toString();

    }
}
