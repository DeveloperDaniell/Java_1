import java.util.Scanner;
import java.util.Locale;

public class Lahjavero {
    public static void main(String[] args) {
        Lahjavero lahjavero = new Lahjavero();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN); // Asettaa desimaalierottimeksi pilkun

        System.out.println("Anna lahjan suuruus: ");
        double arvo = scanner.nextDouble();

        double vero = lahjavero.laskeVero(arvo);

        System.out.println("Lahjavero on " + String.format(Locale.GERMAN, "%.2f", vero) + " euroa");
    }

    public double laskeVero(double arvo) {
        double vero = 0.0;
        if (5000 <= arvo && arvo <= 25000) {
            vero = (arvo - 5000) * 0.08 + 100;
        } else if (25000 < arvo && arvo <= 55000) {
            vero = (arvo - 25000) * 0.10 + 1700;
        } else if (55000 < arvo && arvo <= 200000) {
            vero = (arvo - 55000) * 0.12 + 4700;
        } else if (200000 < arvo && arvo <= 1000000) {
            vero = (arvo - 200000) * 0.15 + 22100;
        } else if (arvo > 1000000) {
            vero = (arvo - 1000000) * 0.17 + 142100;
        }
        return vero;
    }
}
