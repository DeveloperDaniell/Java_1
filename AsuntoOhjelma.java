import java.util.Scanner;

public class AsuntoOhjelma {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Asunto asunto = new Asunto();

        System.out.print("Anna asunnon tyyppi: ");
        asunto.setTyyppi(scanner.nextLine());

        System.out.print("Anna osoite: ");
        asunto.setOsoite(scanner.nextLine());

        System.out.print("Anna pinta-ala: ");
        asunto.setPintaAla(scanner.nextDouble());

        System.out.print("Anna hinta: ");
        asunto.setHinta(scanner.nextDouble());

        scanner.nextLine();

        System.out.print("Anna kuvaus: ");
        asunto.setKuvaus(scanner.nextLine());

        System.out.print(asunto.toString());
    }
}
