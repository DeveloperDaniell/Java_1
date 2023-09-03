import java.util.Scanner;
import java.util.Locale;

public class Kotitalousvahennys {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.FRANCE);  // Käytetään Ranskan localea, joka käyttää pilkkua desimaalierottimena
        double summa = 0.0;
        double korvaus = 0.0;

        while (true) {

            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            double maara = input.nextDouble();

            if (maara == 0.0) {
                break;
            }

            summa += maara;

            if (summa > 100) {
                korvaus = summa * 40 / 100 - 100;
            } else {
                korvaus = 0;
            }
            if (korvaus > 2250) {
                korvaus = 2250;
            }
        }

        System.out.println("Kotitalousvähennyksen määrä on " + String.format("%.2f", korvaus) + " euroa");

        input.close();
    }
}
