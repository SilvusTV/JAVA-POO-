package Courses.TP.tp3.Views;

import Courses.TP.tp3.Controllers.Timbre;
import Courses.TP.tp3.Models.TCollectionTimbre;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TP3_2 {
    public static void view() {
        System.out.println("\n ==== TP3.2 ==== \n");
        Scanner sc = new Scanner(System.in);
        //demander quel type d'action il veut faire entre regarder la collection, la sauvegarder ou la charger
        System.out.println("Que voulez-vous faire ?\n1. Regarder la collection\n2. Sauvegarder la collection\n3. Charger la collection");
        System.out.println("\nEntrez le numéro de l'action que vous voulez faire (1, 2 ou 3)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi de regarder la collection :");
                regarderCollection();
                break;
            case 2:
                System.out.println("Vous avez choisi de sauvegarder la collection");
                sauvegarderCollection();
                break;
            case 3:
                System.out.println("Vous avez choisi de charger la collection");
                chargerCollection();
                break;
            default:
                System.out.println("Cette action n'existe pas");
                break;
        }

    }

    private static void regarderCollection() {
        TCollectionTimbre[] collectionTimbres = Timbre.CreerCollectionTimbres();
        for (TCollectionTimbre collection : collectionTimbres) {
            System.out.println("\nCollection de timbres de thème " + collection.getTheme());
            for (int i = 0; i < collection.getTimbres().length; i++) {
                System.out.println("Timbre " + (i + 1) + " : " + collection.getTimbres()[i].getTimbreInfo());
            }
        }
    }
    
    // creer une private qui stocke dans un fichier la collection
    private static void sauvegarderCollection() {
        String fileName = "Collection_De_Timbre.txt";
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("Fichier creer: " + myObj.getName());
            } else {
                System.out.println("Le fichier existe deja.");
            }
            try {
                FileWriter myWriter = new FileWriter(fileName);
                myWriter.write(GenerateText());
                myWriter.close();
                System.out.println("Le fichier a ete sauvegarde avec succes.");
            } catch (IOException e) {
                System.out.println("Une erreur est survenue.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }   
    }
    
    private static String GenerateText() {
        String text = "";
        TCollectionTimbre[] collectionTimbres = Timbre.CreerCollectionTimbres();
        for (TCollectionTimbre collection : collectionTimbres) {
            text += "\nCollection de timbres de thème " + collection.getTheme();
            for (int i = 0; i < collection.getTimbres().length; i++) {
                text += "\nTimbre " + (i + 1) + " : " + collection.getTimbres()[i].getTimbreInfo();
            }
        }
        return text;
    }
    // creer une private qui charge la collection depuis un fichier
    private static void chargerCollection() {
        String fileName = "Collection_De_Timbre.txt";
        System.out.println("Vous allez lie la collection de timbres depuis le fichier " + fileName);
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }   
    }
}
