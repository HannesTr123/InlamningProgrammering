package common;
import java.util.HashMap;
public class Converter {

    private HashMap<String, String> Eng = new HashMap<>();
    private HashMap<String, String> Mor = new HashMap<>();
    public Converter() {
        Eng = new HashMap<>();
        Mor = new HashMap<>();


        String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};
        String[] morseCodes = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-", "--**--", "**--**"};

        for (int i = 0; i < symbols.length; i++) {
            Eng.put(symbols[i], morseCodes[i]);
            Mor.put(morseCodes[i], symbols[i]);
        }
    }
    public String getMorse(String text) {
        StringBuilder morse = new StringBuilder();
        for (char character : text.toUpperCase().toCharArray()) {
            if (character == ' ') {
                morse.append("/ ");
            } else {
                morse.append(Eng.get(String.valueOf(character))).append(" ");
            }
        }
        return morse.toString().trim();
    }

    public String getEnglish(String morseCode) {
        StringBuilder english = new StringBuilder();
        String[] words = morseCode.split(" / ");
        for (String word : words) {
            for (String morseCharacter : word.split(" ")) {
                english.append(Mor.getOrDefault(morseCharacter, "Använd endast dessa tecken: * -"));
            }
            english.append(" ");
        }
        return english.toString().trim();
    }

}
