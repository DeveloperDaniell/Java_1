import java.util.Scanner;

public class KirjaOhjelma {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Kirja kirja = new Kirja();

        System.out.println("Anna nimi: ");
        kirja.setNimi(scanner.nextLine());

        System.out.println("Anna isbn: ");
        kirja.setIsbn(scanner.nextLine());

        System.out.println("Anna hinta: ");
        kirja.setHinta(scanner.nextDouble());
        
        System.out.println("Anna julkaisuvuosi: ");
        kirja.setJulkaisuvuosi(scanner.nextInt());

        System.out.println(kirja.toString());
    }
}
