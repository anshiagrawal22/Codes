package Strings;

public class VowelConsonants {
    public static void main(String[] args) {
        String str="ELEPHANT";
        int vowels=0,consonants=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("No. of Vowels:"+vowels);
        System.out.println("No. of Consonants:"+consonants);
    }
}
