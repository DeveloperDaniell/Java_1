import java.util.Scanner;

public class Dominion {

    public static void main(String[] args) {
        Dominion dominion = new Dominion();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna kirouskorttien määrä: ");
        int kirous = scanner.nextInt();

        System.out.print("Anna tilakorttien määrä: ");
        int tila = scanner.nextInt();

        System.out.print("Anna pitäjäkorttien määrä: ");
        int pitaja = scanner.nextInt();

        System.out.print("Anna läänikorttien määrä: ");
        int laani = scanner.nextInt();

        int pisteet = dominion.laskePisteet(kirous, tila, pitaja, laani);

        System.out.println("Pisteiden yhteismäärä on " + pisteet);
    }

    public int laskePisteet(int kirous, int tila, int pitaja, int laani) {
        int yhteispisteet = kirous * -1 + tila * 2 + pitaja * 3 + laani * 6;

        return yhteispisteet;
    }
}
