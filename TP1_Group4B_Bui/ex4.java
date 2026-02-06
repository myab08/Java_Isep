package TP1_Group4B_Bui;

import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.print("Veuillez saisir un entier : ");
        int unEntier = scanner.nextInt();
        
        System.out.print("Veuillez saisir un reel (ex: 15.5) : ");
        float unReel = scanner.nextFloat();
        
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);

        scanner.nextLine(); 

        // PARTIE MESSAGES
        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        
        System.out.println("Bonjour, " + prenom);
        scanner.close(); 
    }
}