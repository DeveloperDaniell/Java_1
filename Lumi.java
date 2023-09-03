import java.util.Scanner;

public class Lumi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lumi = 0;
        int counter = -1;
        String nimi = "";

        while (!nimi.equalsIgnoreCase("LOPPU")) { 
            
            System.out.println("Anna nimi: ");
            nimi = input.next();
            
            if (nimi.equalsIgnoreCase("Lumi")) {
                lumi ++;
                counter ++;
            } else {
                counter ++;
            }
       }
       System.out.println("Nimiä oli "+ counter + " kappaletta.");
       System.out.println("Nimi Lumi esiintyi " + lumi + " kertaa.");
       
    }
}
