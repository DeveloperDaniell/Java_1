import java.util.Scanner;

public class Maalaus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kysytään käyttäjältä huoneen mitat
        System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
        double leveys = scanner.nextDouble();
        double pituus = scanner.nextDouble();
        double korkeus = scanner.nextDouble();

        // Kysytään maalin peittävyys
        System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
        double maalin_peittavyys = scanner.nextDouble();

        // Lasketaan tarvittava maalin määrä
        double pinta_ala = (2 * leveys + 2 * pituus) * korkeus; // lasketaan molemmat seinät kummaltakin pitkältä
                                                                // sivulta
        double maalin_tarve = pinta_ala / maalin_peittavyys;

        // Tulostetaan vastaus kahdella desimaalilla
        System.out.printf("Maalin tarve on %.2f litraa%n", maalin_tarve);
    }
}
