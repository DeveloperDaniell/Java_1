import java.util.Scanner;

class Osallistuja {
    private String nimi;
    private String kansallisuus;
    private int syntymavuosi;

    public Osallistuja() {

    }

    public Osallistuja(String nimi, String kansallisuus, int syntymavuosi) {
        this.nimi = nimi;
        this.kansallisuus = kansallisuus;
        this.syntymavuosi = syntymavuosi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setKansallisuus(String kansallisuus) {
        this.kansallisuus = kansallisuus;
    }

    public void setSyntymavuosi(int syntymavuosi) {
        this.syntymavuosi = syntymavuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getKansallisuus() {
        return kansallisuus;
    }

    public int getSyntymavuosi() {
        return syntymavuosi;
    }

    @Override
    public String toString() {
        return "Nimi: " + nimi + "\nKansallisuus: " + kansallisuus + "\nSyntymävuosi: " + syntymavuosi;
    }
}

class OsallistujaOhjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Osallistuja osallistuja = new Osallistuja();

        System.out.print("Anna osallistujan nimi: ");
        osallistuja.setNimi(scanner.nextLine());

        System.out.print("Anna kansallisuus: ");
        osallistuja.setKansallisuus(scanner.nextLine());

        System.out.print("Anna syntymävuosi: ");
        osallistuja.setSyntymavuosi(scanner.nextInt());

        System.out.println(osallistuja);

        scanner.close();
    }
}
