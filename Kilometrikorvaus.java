import java.util.Scanner;

public class Kilometrikorvaus {

    public static void main(String[] args) {
        
        Scanner kilometrit = new Scanner(System.in);
        int matka = 0;
        double korvaus = 0.0;

        while (true) { 
            
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            int lisakilometrit = kilometrit.nextInt();

            if(lisakilometrit == 0) { 
                break;
            }

            matka += lisakilometrit;
            korvaus = matka * 0.46;

        }
        
        System.out.println("Yhteensä "+ matka + " kilometriä");
        System.out.println("Korvaus on " + String.format("%.2f", korvaus) + " euroa");  // Muotoillaan tulostus kahteen desimaaliin

        kilometrit.close();
    }
}
