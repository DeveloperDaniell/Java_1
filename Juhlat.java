import java.util.Scanner;

public class Juhlat {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anna juhliin tulevien aikuisten määärä: ");
        int vieraat = input.nextInt();

        int pullot = (int) Math.ceil((double) vieraat / 7);

        System.out.println("Pulloja tarvitaan yhteensä " + pullot + " kappaletta");
    }
}
