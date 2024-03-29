package common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TDD {

    @Test
    public void testConvertEtoStar() {
        Converter converter = new Converter();

        String testdata = "E";

        String expected = "*";

        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testConvertTtoStar() {
        Converter converter = new Converter();

        String testdata = "T";

        String expected = "-";

        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testConvertHejtoStar() {
        Converter converter = new Converter();

        String testdata = "Hej";

        String expected = "**** * *---";

        String actual = converter.getMorse(testdata);

        assertEquals(expected, actual);

    }
    @Test
    public void testConvertAtoStar() {
        Converter converter = new Converter();

        String testdata = "*-";

        String expected = "A";

        String actual = converter.getEnglish(testdata);

        assertEquals(expected, actual);

    }

}
