import java.util.Arrays;
import java.util.Scanner;

public class LottoOhjelma {
    public static void main(String[] args) {
        // Tässä esitellään numerot-taulukko ja lkm sekä numero muuttujat.
        int[] numerot;
        int numero, lkm;

        // Scanner-luokkaa käytetään syötteen lukemiseen käyttäjältä.
        Scanner input = new Scanner(System.in);

        // Kysytään, montako numeroa käyttäjä haluaa syöttää.
        System.out.print("Montako numeroa annat (7-10): ");
        lkm = input.nextInt();

        // Luodaan taulukko, jonka koko on käyttäjän antaman numeron suuruinen.
        numerot = new int[lkm];

        // Täytetään taulukko käyttäjän antamilla numeroilla.
        for (int i = 0; i < numerot.length; i++) {
            System.out.print("Anna " + (i + 1) + " lottonumerosi: ");
            numero = input.nextInt();
            numerot[i] = numero;
        }

        // Lajitellaan numerot ja tulostetaan ne.
        Arrays.sort(numerot);
        System.out.print("Rivisi oli ");
        for (int i = 0; i < numerot.length; i++) {
            System.out.print(numerot[i] + " ");
        }
    }
}
