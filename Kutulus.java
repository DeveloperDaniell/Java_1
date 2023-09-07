import java.util.Scanner;
import java.util.Locale;

public class Kulutus {
    private Scanner scanner;

    public Kulutus() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
    }

    public int kysyKilometrit() {
        System.out.print("Anna ajetut kilometrit: ");
        return scanner.nextInt();
    }

    public double kysyTankkaus() {
        System.out.print("Anna tankattu määrä: ");
        return scanner.nextDouble();
    }

    public double laskeKulutus(int kilometrit, double tankattu) {
        return (tankattu / kilometrit) * 100;
    }

    public void naytaKulutus(double kulutus) {
        System.out.printf("Kulutus/100km on %.2f litraa%n", kulutus);
    }

    public static void main(String[] args) {
        Kulutus kulutusOlio = new Kulutus();

        int km = kulutusOlio.kysyKilometrit();
        double tankattu = kulutusOlio.kysyTankkaus();
        double kulutus = kulutusOlio.laskeKulutus(km, tankattu);

        kulutusOlio.naytaKulutus(kulutus);
    }
}
