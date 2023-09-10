import java.util.Scanner;

public class Kellonaika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tulos = tarkastaKellonaika(kysyKellonaika());
        System.out.println(tulos); // Tulostetaan tarkastelun tulos
    }

    public static String kysyKellonaika() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anna kellonaika muodossa tt:mm: ");
        String kellonaika = input.nextLine();
        return kellonaika;
    }

    public static String tarkastaKellonaika(String kellonaika) {
        String[] kellonajat = kellonaika.split(":");

        if (kellonajat.length != 2) {
            return "Kellonaika ei ole oikein";
        }

        try {
            int tunnit = Integer.parseInt(kellonajat[0]);
            int minuutit = Integer.parseInt(kellonajat[1]);

            if (tunnit < 0 || tunnit > 23) {
                return "Kellonaika on väärin";
            } else if (minuutit < 0 || minuutit > 59) {
                return "Kellonaika on väärin";
            } else {
                return "Kellonaika on oikein";
            }
        } catch (NumberFormatException e) {
            return "Kellonaika on väärin"; // Virhe tapahtuu, kun käyttäjä syöttää ei-numeerisia arvoja.
        }
    }
}
