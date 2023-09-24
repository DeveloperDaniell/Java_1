import java.util.Scanner;

public class KirjaKustantajaOhjelma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kirja kirja = new Kirja("Java-ohjelmointi", "978-952-14-3556-0", 65.50, 2018);

        System.out.print("Kustantajan nimi: ");  
        String nimi = lukija.nextLine();
        
        System.out.print("Kustantajan osoite: "); 
        String osoite = lukija.nextLine();
        
        System.out.print("Kustantajan puhelin: ");  
        String puhelinnumero = lukija.nextLine();

        Kustantaja kustantaja = new Kustantaja(nimi, osoite, puhelinnumero);
        kirja.setKustantaja(kustantaja);  

        System.out.println("Kirjan " + kirja.getNimi() + " kustantaja on " + kirja.getKustantaja().getNimi());
    }
}
