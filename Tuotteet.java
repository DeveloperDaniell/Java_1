import java.util.Scanner;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna tuotenumero: ");
        String numero = scanner.nextLine();

        System.out.print("Anna tuotteen nimi: ");
        String nimi = scanner.nextLine().trim().toUpperCase();

        System.out.print("Anna tuotteen hinta: ");
        String hinta = scanner.nextLine();

        System.out.print("Anna tuotteen kuvaus: ");
        String kuvaus = scanner.nextLine().trim();

        System.out.println("Numero: " + numero);
        System.out.println("Nimi: " + nimi);
        System.out.println("Hinta: " + hinta);
        if (!kuvaus.isEmpty()) {
            System.out.println("Kuvaus: " + kuvaus);
        }
    }
}
