import static org.junit.Assert.assertEquals;

import com.jap.utils.StringManipulationHandler;
import org.junit.Test;

/**
 * @author jap
 * @since 2021.05
 */

public class StringManipulationTest {

    @Test
    public void snakeToCamelCase() {
        String snake = "aku_adalah";
        String convert = StringManipulationHandler.toCamelCase(snake);
        System.out.println(convert);
        assertEquals("akuAdalah", convert);
    }

    @Test
    public void snakeToPascalCase() {
        String snake = "aku_adalah";
        String convert = StringManipulationHandler.toPascalCase(snake);
        System.out.println(convert);
        assertEquals("AkuAdalah", convert);
    }

    @Test
    public void snakeToClassName() {
        String snake = "aku_adalah";
        String convert = StringManipulationHandler.convertToClassName(snake);
        System.out.println(convert);
        assertEquals("AkuAdalah", convert);
    }

    @Test
    public void containtUnderscore() {
        String snake = "aku_adalah";
        assertEquals(true, snake.contains("_"));
    }
}
