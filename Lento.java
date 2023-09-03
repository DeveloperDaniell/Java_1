import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String code;

        System.out.println("Anna lennon numero: ");
        code = input.next();

        if (code.substring(0, 2).equals("AY")) {
            if (code.substring(2, 3).equals("1")) {
                System.out.println("Kaukolento");
            } else if (code.substring(2, 3).equals("7")) {
                System.out.println("Venäjän lento");
            } else {
                System.out.println("Kotimaan lento");
            }
        } else {

            System.out.println("Ei ole Finnairin lento");
        }
        input.close();
    }
}
