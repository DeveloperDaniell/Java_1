import java.util.Scanner;

public class Cooper {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna juostu matka: ");
        int matka = lukija.nextInt();

        int kierros = 400;
        int kokonaisMatka = matka / kierros;

        System.out.println("Kokonaisia 400 metrin kierroksia oli " + kokonaisMatka);
    }
}