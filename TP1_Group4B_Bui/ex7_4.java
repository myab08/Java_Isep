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
        
        // long == int mais code sur 64 bit et peut stocker des nombres plus grands
        long resultatFactorielle = 1;

        // de 1 jusqu'à n
        for (int i = 1; i <= n; i++) {
            resultatFactorielle *= i; 
        }

        System.out.println(n + "! = " + resultatFactorielle);
        
        scanner.close();
    }
}