import java.util.Scanner;

class Henkilo {
    private String nimi;
    private String osoite;
    private Henkilo aiti;
    private Henkilo isa;

    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public void setAiti(Henkilo aiti) {
        this.aiti = aiti;
    }

    public void setIsa(Henkilo isa) {
        this.isa = isa;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public Henkilo getAiti() {
        return aiti;
    }

    public Henkilo getIsa() {
        return isa;
    }
}

public class PerheOhjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna isän nimi: ");
        String isanNimi = scanner.nextLine();
        System.out.print("Anna isän osoite: ");
        String isanOsoite = scanner.nextLine();

        Henkilo isa = new Henkilo(isanNimi, isanOsoite);

        System.out.print("Anna äidin nimi: ");
        String aidinNimi = scanner.nextLine();
        System.out.print("Anna äidin osoite: ");
        String aidinOsoite = scanner.nextLine();

        Henkilo aiti = new Henkilo(aidinNimi, aidinOsoite);

        System.out.print("Anna lapsen nimi: ");
        String lapsenNimi = scanner.nextLine();
        System.out.print("Anna lapsen osoite: ");
        String lapsenOsoite = scanner.nextLine();

        Henkilo lapsi = new Henkilo(lapsenNimi, lapsenOsoite);
        lapsi.setAiti(aiti);
        lapsi.setIsa(isa);

        System.out.println("Lapsen isä on " + lapsi.getIsa().getNimi() + " ja äiti on " + lapsi.getAiti().getNimi());

        if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite()) && lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {
            System.out.println("Perhe asuu samassa osoitteessa");
        } else {
            if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite())) {
                System.out.println("Lapsi ja äiti asuvat samassa osoitteessa");
            }

            if (lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {
                System.out.println("Lapsi ja isä asuvat samassa osoitteessa");
            }
        }
    }
}
