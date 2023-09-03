import java.util.Scanner;
import java.util.Locale;

public class Palkka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.GERMAN); // Asetetaan lokaali, joka käyttää pilkkua desimaalierottimena.

        System.out.println("Anna palkka: ");
        double palkka = input.nextDouble();

        System.out.println("Anna veroprosentti: ");
        double veroprosentti = input.nextDouble();

        System.out.println("Anna ikä: ");
        int ika = input.nextInt();

        double vero = palkka * veroprosentti / 100.0;
        double tyottomyysvakuutus = palkka * 0.015;
        double tyoelakemaksu;

        if (ika >= 53 && ika <= 62) {
            tyoelakemaksu = palkka * 0.0865;
        } else {
            tyoelakemaksu = palkka * 0.0715;
        }

        double kateen = palkka - vero - tyottomyysvakuutus - tyoelakemaksu;

        System.out.printf("Bruttopalkka %.2f%n", palkka);
        System.out.printf("Veron osuus %.2f%n", vero);
        System.out.printf("Työeläkevakuutusmaksun osuus %.2f%n", tyoelakemaksu);
        System.out.printf("Työttömyysvakuutuksen osuus %.2f%n", tyottomyysvakuutus);
        System.out.printf("Käteen jää %.2f%n", kateen);
    }
}
