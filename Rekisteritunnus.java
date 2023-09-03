import java.util.Scanner;

public class Rekisteritunnus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna rekisterinumero: ");
        String rekisterinumero = scanner.nextLine();

        // Muunnetaan merkkijono suurilla kirjaimilla kirjoitetuksi
        rekisterinumero = rekisterinumero.toUpperCase();

        // Tarkistetaan, että rekisterinumero on kelvollinen
        if (rekisterinumero.matches("[A-ZÅÄÖ]{2,3}-[1-9][0-9]{0,2}")) {
            System.out.println("Rekisterinumero on kelvollinen");
        } else {
            System.out.println("Rekisterinumero ei ole kelvollinen");
        }
    }
}
