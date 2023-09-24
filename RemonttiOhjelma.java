import java.util.Scanner;

public class RemonttiOhjelma {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Remontti remontti = new Remontti();

        System.out.println("Anna vuosi: ");
        boolean vuosiOk = remontti.setVuosi(scanner.nextInt());    

        if (!vuosiOk) {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
            return; // Lopettaa ohjelman suorituksen
        }

        System.out.print("Anna kuvaus: ");
        scanner.nextLine();
        remontti.setKuvaus(scanner.nextLine());

        System.out.print(remontti.toString());
    }
}