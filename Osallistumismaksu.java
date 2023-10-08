import java.util.Scanner;

public class Osallistumismaksu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Osallistuja (OS) / Katsoja (KA): ");
        String role = scanner.nextLine().toUpperCase();

        double fee = 0.0;

        if (role.equals("OS")) {
            System.out.print("Nuoret (NU) / Aikuiset (AI): ");
            String category = scanner.nextLine().toUpperCase();
            if (category.equals("NU")) {
                fee = 10.00;
            } else if (category.equals("AI")) {
                fee = 20.00;
            } else {
                System.out.println("Virheellinen syöte.");
                scanner.close();
                return;
            }
        } else if (role.equals("KA")) {
            System.out.print("Ikä: ");
            int age = scanner.nextInt();
            if (age < 18) {
                fee = 8.00;
            } else {
                fee = 12.50;
            }
        } else {
            System.out.println("Virhe");
            scanner.close();
            return;
        }

        System.out.printf("Maksu on %.2f euroa%n", fee);
        scanner.close();
    }
}
