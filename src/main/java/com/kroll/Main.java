package com.kroll;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the message (or type 'exit' to quit): ");
            String originalMessage = scanner.nextLine();

            if (originalMessage.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            String vowelEncoded = Encoder.encodeVowelSubstitution(originalMessage);
            String consonantEncoded = Encoder.encodeConsonantSubstitution(originalMessage);

            System.out.println("Original: " + originalMessage);
            System.out.println("Vowel Encoded: " + vowelEncoded + ", Decoded: " + Decoder.decode(vowelEncoded));
            System.out.println("Consonant Encoded: " + consonantEncoded + ", Decoded: " + Decoder.decode(consonantEncoded));
        }
    }
}

