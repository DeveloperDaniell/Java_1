import java.util.Scanner;

public class Puoluetuki {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna kansanedustajien lukumäärä: ");
        int edustajienLukumaara = lukija.nextInt();

        int puoluetuki = 178175; 
        int kokonaisTuki = edustajienLukumaara * puoluetuki;

        System.out.println("Puoluetuen määrä on " + kokonaisTuki + " euroa");
    }
}
