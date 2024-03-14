package helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World (Bonjour le monde");
        System.out.println("Appuyer sur la touche q pour quitter");
        String quit = sc.nextLine();
        if ("q".equals(quit)) return;
        if ("Q".equals(quit)) {
            System.out.println("Appuyer la touche q et pas Q pour quitter");
            sc.nextLine();
        } else {
            System.out.println("Appuyer sur Ia touche q pour quitter");
            quit = sc.nextLine();
            if ("q".equals(quit)) return;
            else System.out.println("Dernier essai, appuyer sur Ia touche q pour quitter");
            sc.nextLine();
            System.out.println("Good bye");
        }
    }
}