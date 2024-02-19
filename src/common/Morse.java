package common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Morse {
//test kommentar
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Converter converter = new Converter();

        int choice = 0;

        while (true) {
            System.out.println("Välj konvertering: ");
            System.out.println("1. Engelska --> Morse");
            System.out.println("2: Morse --> Engelska");
            System.out.println("3: Avsluta.");

            try {
                choice = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException error) {
                System.out.println("Ogiltigt val, välj en siffra mellan 1, 2, eller 3.");
                scan.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Skriv in bokstäver för att konventera de till Morsekod: ");
                    String englishText = scan.nextLine();
                    System.out.println(converter.getMorse(englishText));
                    break;

                case 2:
                    System.out.print("Skriv in Morsekod för att konventera de till bokstäver: ");
                    String morseCode = scan.nextLine();
                    System.out.println(converter.getEnglish(morseCode));
                    break;

                case 3:
                    System.out.println("Avsluta");
                    scan.close();
                    return;

                default:
                    System.out.println("Ogiltigt val skriv 1, 2, eller 3.");
            }
        }
    }
}
