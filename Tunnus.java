import java.util.Scanner;

public class Tunnus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Anna sukunimi: ");
        String suku = input.nextLine();

        System.out.print("Anna etunimi: ");
        String etu = input.nextLine();

        System.out.println("Tunnus on " + teeTunnus(etu, suku));

    }

    public static String teeTunnus(String etu, String suku) {
        String tunnus = suku.substring(0, 3) + etu.substring(0, 3);
        return tunnus.toLowerCase();
    }

}