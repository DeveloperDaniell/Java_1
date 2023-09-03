import java.util.Scanner;

public class Hissi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double yhteensa = 0.0;
        double paino;

        while (true) {
            
            System.out.println("Paljonko painat: ");
            paino = scanner.nextDouble();

            if (paino == 0) {
                break;
            }

            if (yhteensa + paino > 240) {
                System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
                break;
            }

            yhteensa += paino;
            System.out.println("Tule kyytiin.");
        }

        scanner.close();
    }
}
