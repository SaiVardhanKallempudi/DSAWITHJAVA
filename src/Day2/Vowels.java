package Day2;

import static java.lang.Integer.parseInt;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(isVowel("6"));
        System.out.println(isVowel("p"));
        System.out.println(isVowel("a"));
        System.out.println(isVowel("b"));
        System.out.println(isVowel("&"));
    }
    public static String isVowel(String s) {
        if (s == null || s.length() != 1) {
            return "Invalid";
        }

        char ch = s.charAt(0);
        if (!Character.isLetter(ch)) {
            return "Invalid";
        }
        if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u")) {
            return "Vowel";
        }
        return "Consonant";
    }
}
