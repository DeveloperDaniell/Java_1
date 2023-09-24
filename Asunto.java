import java.util.Locale;

public class Asunto {
    private String tyyppi;
    private String osoite;
    private double pintaAla;
    private double hinta;
    private String kuvaus;
    
// Parametrtiton konstruktori
    public Asunto() {
        this.tyyppi = "";
        this.osoite = "";
        this.pintaAla = 0.0;
        this.hinta = 0.0;
        this.kuvaus = "";
    }
// Parametrillinen konstruktori
    public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public double getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    @Override
    public String toString() {
        return "Tyyppi: " + tyyppi + "\nOsoite: " + osoite + "\nPinta-ala: " 
            + String.format(Locale.FRENCH, "%.2f", pintaAla) 
            + "\nHinta: " + String.format(Locale.FRENCH, "%.2f", hinta)
            + " euroa \nKuvaus: " + kuvaus + "\n";
    }
}
