import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void test_formatWithAllParts() {

        String expected = "Johnson, Dr. Mel B";

        String actual = NameFormatter.format("Dr.", "Mel", "B", "Johnson", null);

        assertEquals(expected, actual);
    }
}