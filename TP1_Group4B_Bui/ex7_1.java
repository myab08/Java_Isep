package TP1_Group4B_Bui;

import java.util.Scanner;
import java.util.Locale;

public class ex7_1 {
    public static void main(String[] args) {
        discriminant();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("--- Calcul du discriminant Delta ---");
        
        System.out.print("Quelle est la valeur de a ? ");
        int a = scanner.nextInt();
        
        System.out.print("Quelle est la valeur de b ? ");
        int b = scanner.nextInt();
        
        System.out.print("Quelle est la valeur de c ? ");
        int c = scanner.nextInt();

        // Calcul de Delta : b² - 4ac
        // Math.pow(base, exposant) pour le carré
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println("Valeur de Delta : " + delta);

        

        if (delta < 0) {
            // Cas Delta strictement négatif
            System.out.println("Ce polynome n'a pas de racine reelle.");
            // Bonus : Affichage sous forme complexe
            double partieReelle = -b / (2.0 * a);
            double partieImaginaire = Math.sqrt(-delta) / (2.0 * a);
            System.out.println("Racines complexes : " + partieReelle + " ± i" + partieImaginaire);
            
        } else if (delta == 0) {
            // Cas Delta égal à zéro
            double x0 = -b / (2.0 * a);
            System.out.println("Le polynome a une racine double : x0 = " + x0);
            
        } else {
            // Cas Delta strictement positif
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Le polynome a deux racines distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}