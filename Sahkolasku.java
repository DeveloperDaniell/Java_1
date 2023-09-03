import java.text.DecimalFormat;
import java.util.Scanner;

public class Sahkolasku {

    public static void main(String[] args) {
        final int MAX = 6;

        int[] sahkolukemat = new int[MAX];
        int lukema;
        double kilowatti, hinta;

        Scanner input = new Scanner(System.in);

        System.out.print("Anna kilowattitunnin hinta euroina: ");
        kilowatti = input.nextDouble();

        System.out.println();

        for (int i = 0; i < sahkolukemat.length; i++) {
            System.out.print("Anna kuukauden " + (i + 1) + " sähkölukema: ");
            lukema = input.nextInt();
            sahkolukemat[i] = lukema;

        }

        System.out.println();

        DecimalFormat desimaalit = new DecimalFormat("0.00");

        for (int i = 0; i < sahkolukemat.length; i++) {
            hinta = sahkolukemat[i] * kilowatti;
            System.out.println(
                    (i + 1) + ". kuukauden kulutus: " + sahkolukemat[i] + " kWh " + desimaalit.format(hinta)
                            + " euroa");
        }

    }

}