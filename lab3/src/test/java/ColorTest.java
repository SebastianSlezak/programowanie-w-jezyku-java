import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorTest {
    @Test
    void testColorWithAlpha() {
        Color color = new Color(255, 128, 64, 100);
        assertEquals(255, color.red());
        assertEquals(128, color.green());
        assertEquals(64, color.blue());
        assertEquals(100, color.alpha());
    }

    @Test
    void testColorWithoutAlpha() {
        Color color = new Color(0, 0, 0);
        assertEquals(0, color.red());
        assertEquals(0, color.green());
        assertEquals(0, color.blue());
        assertEquals(0, color.alpha());
    }

    @Test
    void testInvalidColorValues() {
        Color color = new Color(-1, 300, 128);
        assertEquals(-1, color.red());
        assertEquals(300, color.green());
        assertEquals(128, color.blue());
        assertEquals(0, color.alpha(), "Alpha powinno domyślnie wynosić 0.");
        }
}