package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testNatoEncoding() {
        //given
        String textToEncode = "Jutro mamy zebranie";
        String expectedResult = "Juliett Uniform Tango Romeo Oscar / Mike Alfa Mike Yankee / Zulu Echo Bravo Romeo Alfa November India Echo";

        //when
        String result = NatoUtil.encodeNato(textToEncode);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testNatoDecoding() {
        //given
        String textToDecode = "Juliett Uniform Tango Romeo Oscar / Mike Alfa Mike Yankee / Zulu Echo Bravo Romeo Alfa November India Echo";
        String expectResult = "Jutro mamy zebranie";

        //
        String result = NatoUtil.decodeNato(textToDecode);

        //then
        Assert.assertEquals(expectResult.toUpperCase(), result);

    }
}
