import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        final int RAJOITUS = 80;
        final double ALIN_SAKKO = 6.0;

        System.out.println("Anna nopeutesi: ");
        int nopeus = input.nextInt();

        int ylinopeus = nopeus - RAJOITUS;

        if (ylinopeus <= 0) {
            System.out.println("Ei sakkoja");
        } else if (ylinopeus <= 20) {
            System.out.println("Liikennevirhemaksu");
        } else {
            System.out.println("Päiväsakko");
            System.out.println("Anna nettokuukausitulosi: ");
            double tulo = input.nextDouble();
            
            double sakko = (tulo - 255) / 60;
            sakko = Math.max(sakko, ALIN_SAKKO); 
            System.out.println("Päiväsakon määrä on " + df.format(sakko) + " euroa");
        }

        input.close();
    }
}
