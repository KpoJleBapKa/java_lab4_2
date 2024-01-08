package com.kroll;

public class Encoder {
    public static String encodeVowelSubstitution(String message) {
        if (message == null || message.isEmpty()) {
            return message;
        }

        return message
                .replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");
    }

    public static String encodeConsonantSubstitution(String message) {
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder encodedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            if (Character.isLetter(letter)) {
                char lowerCaseLetter = Character.toLowerCase(letter);
                if (isConsonant(lowerCaseLetter)) {
                    char newLetter = getNewConsonant(consonants, lowerCaseLetter);
                    encodedMessage.append(Character.isUpperCase(letter) ? Character.toUpperCase(newLetter) : newLetter);
                } else {
                    encodedMessage.append(letter);
                }
            } else {
                encodedMessage.append(letter);
            }
        }
        return encodedMessage.toString();
    }

    private static boolean isConsonant(char letter) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(letter) != -1;
    }

    private static char getNewConsonant(char[] consonants, char letter) {
        char lowerCaseLetter = Character.toLowerCase(letter);
        int index = new String(consonants).indexOf(lowerCaseLetter);
        int newIndex = (index - 1 + consonants.length) % consonants.length;
        return consonants[newIndex];
    }
}
