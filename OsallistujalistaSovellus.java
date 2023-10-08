import java.util.ArrayList;
import java.util.Scanner;

public class OsallistujalistaSovellus {

    public static void main(String[] args) {
        ArrayList<Osallistuja> osallistujalista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int valinta = -1;

        while (valinta != 0) {
            System.out.println("1 = Lisää osallistuja");
            System.out.println("2 = Näytä kaikki osallistujat");
            System.out.println("3 = Näytä kansallisuudella");
            System.out.println("4 = Muuta osallistujan nimeä");
            System.out.println("0 = Lopeta");
            System.out.print("Anna valintasi (0-5): ");

            if (!scanner.hasNextInt()) { 
                break; 
            }
            valinta = scanner.nextInt();
            scanner.nextLine();


            if (valinta == 1) {
                System.out.print("Anna osallistujan nimi: ");
                String nimi = scanner.nextLine();
                System.out.print("Anna kansallisuus: ");
                String kansallisuus = scanner.nextLine();
                System.out.print("Anna syntymävuosi: ");
                int syntymavuosi = scanner.nextInt();
                scanner.nextLine();
                osallistujalista.add(new Osallistuja(nimi, kansallisuus, syntymavuosi));
            } else if (valinta == 2) {
                for (Osallistuja osallistuja : osallistujalista) {
                    System.out.println(osallistuja);
                }
            } else if (valinta == 3) {
                System.out.print("Anna kansallisuus: ");
                String haettuKansallisuus = scanner.nextLine();
                for (Osallistuja osallistuja : osallistujalista) {
                    if (osallistuja.getKansallisuus().equalsIgnoreCase(haettuKansallisuus)) {
                        System.out.println(osallistuja);
                    }
                }
            }  else if (valinta == 4) {
                System.out.print("Anna muutettavan osallistujan nimi: ");
                String vanhaNimi = scanner.nextLine();
                System.out.print("Anna osallistujan uusi nimi: ");
                String uusiNimi = scanner.nextLine(); 
            
                boolean loytyi = false;
                for (Osallistuja osallistuja : osallistujalista) {
                    if (osallistuja.getNimi().equalsIgnoreCase(vanhaNimi)) {
                        osallistuja.setNimi(uusiNimi);
                        loytyi = true;
                        break;
                    }
                }
                
                if (!loytyi) {
                    System.out.println("Ei löytynyt");
                }
            }
            
        }
    }
}