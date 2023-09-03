import java.util.Scanner;

public class KoepisteOhjelma {
    public static void main(String[] args) {
        final int MAX = 100; // Maksimimäärä koepisteitä, joita voidaan tallentaa
        int[] koepisteet = new int[MAX]; // Taulukko koepisteille
        int koepiste; // Yksittäinen koepiste
        int lkm = 0; // Koepisteiden lukumäärä

        Scanner input = new Scanner(System.in); // Käyttäjäsyöte

        System.out.print("Anna koepisteet (-1 lopettaa): ");
        koepiste = input.nextInt();

        while (koepiste != -1 && lkm < MAX) { // Silmukka koepisteiden kysymiseen
            koepisteet[lkm] = koepiste; // Tallennetaan koepiste taulukkoon
            lkm++; // Kasvatetaan koepisteiden lukumäärää

            if (lkm < MAX) {
                System.out.print("Anna koepisteet (-1 lopettaa): ");
                koepiste = input.nextInt();
            }
        }
        System.out.println("Ei enää koepisteitä"); // Lopetusviesti

        System.out.print("\nKoepisteet ovat "); // Tulostetaan koepisteet
        for (int i = 0; i < lkm; i++) {
            System.out.print(koepisteet[i] + " ");
        }
    }
}
