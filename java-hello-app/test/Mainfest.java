import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testGreet() {
        String result = Main.greet("Alice");
        assertEquals("Hello, Alice", result);
    }
}
