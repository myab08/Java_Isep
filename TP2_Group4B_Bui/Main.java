import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        // Menu d'exercices [cite: 76, 78]
        do {
            System.out.println("\n--- Menu d'exercices ---");
            System.out.println("9. Règle graduée");
            System.out.println("11. Manipulations sur un tableau");
            System.out.println("0. Quitter");
            System.out.print("Quel exercice ? ");
            choix = scanner.nextInt();

            // Utilisation du switch pour appeler les fonctions [cite: 91, 92]
            switch (choix) {
                case 9:
                    regle();
                    break;
                case 11:
                    manipulationsTableau();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        } while (choix != 0);
        scanner.close();
    }

    // --- Tes fonctions ---

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int longueur;
        do {
            System.out.println("Longueur ? ");
            longueur = scanner.nextInt();
        } while (longueur <= 0); // Saisie d'une valeur strictement positive [cite: 48]

        for (int i = 0; i <= longueur; i++) {
            if (i % 10 == 0) {
                System.out.print("|"); // Graduation des dizaines [cite: 50]
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        scanner.close();
    }

    public static void manipulationsTableau() {
        int[] tableau = new int[20]; // Initialisation d'un tableau de 20 [cite: 63]
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Saisir un entier : ");
            tableau[i] = scanner.nextInt(); // Remplissage [cite: 66]
        }

        int min = tableau[0], max = tableau[0], somme = 0;
        for (int val : tableau) {
            if (val < min) min = val; // Calcul du minimum [cite: 70]
            if (val > max) max = val; // Calcul du maximum [cite: 70]
            somme += val; // Somme des éléments [cite: 71]
        }

        System.out.println("Min: " + min + ", Max: " + max + ", Somme: " + somme);

        System.out.print("Éléments pairs : "); // [cite: 72]
        for (int val : tableau) if (val % 2 == 0) System.out.print(val + " ");

        System.out.print("\nIndices pairs : "); // [cite: 73]
        for (int i = 0; i < tableau.length; i += 2) System.out.print(tableau[i] + " ");
        System.out.println();
        scanner.close();
    }

    public static int cherche(char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) return i; // Retourne l'indice si trouvé [cite: 101]
        }
        return -1; // Sinon -1 [cite: 101]
    }

    public static String suppression(char c, String s) {
        int index = cherche(c, s);
        if (index == -1) return s; // Chaîne inchangée si absent [cite: 111]
        return s.substring(0, index) + s.substring(index + 1); // Reconstruction [cite: 114]
    }

    public static boolean scrabble(String mot, String lettres_disponibles) {
        String reserve = lettres_disponibles;
        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (cherche(lettre, reserve) != -1) {
                reserve = suppression(lettre, reserve); // Suppression successive [cite: 120]
            } else {
                return false;
            }
        }
        return true;
    }
}