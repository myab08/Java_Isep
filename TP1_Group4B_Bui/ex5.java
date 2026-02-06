package TP1_Group4B_Bui;

import java.util.Scanner;
import java.util.Locale;

public class ex5 {

    public static void main(String[] args) {
        // somme();
        // division();
        // volume();
        // discriminant();
        // parite();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Saisir le premier entier :");
        int a = scanner.nextInt();
        System.out.println("Saisir le deuxième entier :");
        int b = scanner.nextInt();
        
        System.out.println("La somme est : " + (a + b));
        scanner.close();
    }
    
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.print("Numérateur : ");
        int a = scanner.nextInt();
        System.out.print("Dénominateur : ");
        int b = scanner.nextInt();

        if (b != 0) {
            double res = (double) a / b;
            System.out.println("Résultat : " + res);
        } else {
            System.out.println("Erreur : Division par zéro impossible.");
        }
        scanner.close();
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Longueur : ");
        double l = scanner.nextDouble();
        System.out.print("Largeur : ");
        double w = scanner.nextDouble();
        System.out.print("Hauteur : ");
        double h = scanner.nextDouble();

        System.out.println("Volume du pavé : " + (l * w * h));
        scanner.close();
    }
}