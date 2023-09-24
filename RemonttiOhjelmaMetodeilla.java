import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {

    private static Remontti remontti;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        remontti = new Remontti();

        while (true) {
            System.out.println("1. Tee remontti");
            System.out.println("2. Näytä remonttitiedot");
            System.out.println("3. Muuta remonttia");
            System.out.println("0. Lopetus");
            System.out.print("Anna valintasi (0-3): ");

            int valinta = scanner.nextInt();
            switch (valinta) {
                case 1:
                    teeRemontti();
                    break;
                case 2:
                    naytaRemontti();
                    break;
                case 3:
                    muutaRemontti();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valinta ei kelpaa. Yritä uudelleen.");
                    break;
            }
        }
    }

    public static void teeRemontti() {
        System.out.print("Anna vuosi: ");
        int vuosi = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Anna kuvaus: ");
        String kuvaus = scanner.nextLine();

        remontti.setVuosi(vuosi);
        remontti.setKuvaus(kuvaus);

        System.out.println(remontti.toString());
    }

    public static void naytaRemontti() {
        System.out.println("Vuosi: " + remontti.getVuosi());
        System.out.println("Kuvaus: " + remontti.getKuvaus());
    }

    public static void muutaRemontti() {
        System.out.print("Anna vuosi: ");
        int vuosi = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Anna kuvaus: ");
        String kuvaus = scanner.nextLine();

        remontti.setVuosi(vuosi);
        remontti.setKuvaus(kuvaus);

        System.out.println(remontti.toString());
    }
}
