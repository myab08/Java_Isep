package TP1_Group4B_Bui;

import java.util.Scanner;

public class ex7_4 {
    public static void main(String[] args) {
        factorielle();
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saisir un entier positif ou nul :");
        int n = scanner.nextInt();
        
        // On initialise à 1 car c'est l'élément neutre de la multiplication
        long resultatFactorielle = 1;

        // Boucle itérative de 1 jusqu'à n
        for (int i = 1; i <= n; i++) {
            resultatFactorielle *= i; // Équivalent à : resultatFactorielle = resultatFactorielle * i
        }

        System.out.println(n + "! = " + resultatFactorielle);
        
        scanner.close();
    }
}