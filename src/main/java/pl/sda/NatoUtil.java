package pl.sda;

public class NatoUtil {
    public static String encodeNato(String textToEncode){
        NatoEncoder encoder = new NatoEncoder();
        return encoder.encode(textToEncode);
        //metoda przyjmująca String jako parametr
    }
    public static String decodeNato (String textToDecode){
        NatoDecoder decoder = new NatoDecoder();
        return decoder.decode(textToDecode);
    }

}

