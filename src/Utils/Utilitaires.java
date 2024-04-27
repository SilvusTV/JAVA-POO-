package Utils;

import java.util.Scanner;

public class Utilitaires {

    static public double secureScannerDouble(Scanner scanner , String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("\nle type attendu est une double");
            }
        }
    }

    static public int secureScannerInt( Scanner scanner , String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("\nle type attendu est un int");
            }
        }
    }
    static public String scannerString( Scanner scanner , String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
