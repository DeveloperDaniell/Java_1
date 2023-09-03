import java.util.Arrays;
import java.util.Scanner;

public class Lampotilat {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] lista = new int[MAX];
        int lampotila;
        int lkm = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Anna lämpötila: ");
        lampotila = input.nextInt();

        while (lampotila != -999 && lkm < MAX) {
            lista[lkm] = lampotila;
            lkm++;

            if (lkm < MAX) {
                System.out.println("Anna lämpötila: ");
                lampotila = input.nextInt();
            }

        }

        System.out.println("Annoit lämpötilat: ");

        Arrays.sort(lista, 0, lkm);


        for (int i = 0; i < lkm; i++) {
            System.out.print(lista[i] + " ");

        }

    }
}
