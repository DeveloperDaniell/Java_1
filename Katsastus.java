import java.util.Scanner;

public class Katsastus {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int summa = 0;

        while (true) {
            summa = 0; 

            System.out.println("Onko 1=katsastus, 2=jälkitarkastus: ");
            int tyyppi = input.nextInt();

            if (tyyppi == 2) {
                System.out.println("Hinta on 30");
                break;
            } else {
                summa += 50;
                System.out.println("Mitataanko päästöt 0=ei, 1=kyllä:");
                int paastot = input.nextInt();

                if (paastot == 1) {
                    System.out.println("Onko auto 0=bensa, 1=diesel: ");
                    int aine = input.nextInt();

                    if (aine == 0) {
                        summa += 22;
                    } else {
                        summa += 31;
                    }
                }
            }

            System.out.println("Hinta on " + summa);
            break; 
        }
    }
}
