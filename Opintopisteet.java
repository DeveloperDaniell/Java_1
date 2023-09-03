import java.util.Scanner;

public class Opintopisteet {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna lukukausien määrä: ");
        int lukukaudet = scanner.nextInt();

        double tavoite = lukukaudet * 30;
        double yhteensa = 0.0;

        for(int i=1; i<=lukukaudet; i++) {
            System.out.println("Anna " + i + ". lukukauden opintopisteesi: ");
            double opintopisteet = scanner.nextInt();
            yhteensa += opintopisteet;
        }

        System.out.println("Sinulla pitäisi olla tähän mennessä "+ String.format("%.2f",tavoite) + " opintopistettä.");
        System.out.println("Sinulla on "+ String.format("%.2f", yhteensa) + " opintopistettä.");
        
        if (yhteensa > tavoite) {
            System.out.println("Olet edellä tavoitteesta.");
        } else if (yhteensa == tavoite) {
            System.out.println("Olet tavoitteessa.");
        } else {
            System.out.println("Olet jäljessä tavoitteesta.");
        }

        double puuttuvat = 210 - yhteensa;
        System.out.println("Tutkinnosta puuttuu vielä "+ String.format("%.2f", puuttuvat) + " opintopistettä.");
    }
}
