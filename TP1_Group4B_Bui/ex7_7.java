package TP1_Group4B_Bui;

public class ex7_7 {
    public static void main(String[] args) {
        tableMultiplication();
    }

    public static void tableMultiplication() {
        System.out.println("--- Table de Multiplication (1 à 10) ---");

        for (int i = 1; i <= 10; i++) {     
            for (int j = 1; j <= 10; j++) {
                // Calcul et affichage avec tabulation
                System.out.print((i * j) + "\t");
            }
            // Après avoir fini une ligne de 10 colonnes, on saute une ligne
            System.out.println(); 
        }
    }
}