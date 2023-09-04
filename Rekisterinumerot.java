import java.util.Scanner;

public class Rekisterinumerot {
    public static void main(String[] args) {

        final int max = 20;
        String[] autot = new String[max];
        String tunnus;
        int maara = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Anna rekisterinumero: ");
        tunnus = input.nextLine();

        
        while (!tunnus.equals("-") && maara < max) {
            autot[maara] = tunnus;
            maara++;
            
            if (maara < max) {
                System.out.print("Anna rekisterinumero: ");
                tunnus = input.nextLine();
            }
        }

        for (int i = 0; i < maara; i++) {
            System.out.println(autot[i] + " ");
            
        }
    }
}