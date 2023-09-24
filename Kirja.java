public class Kirja {
    private String nimi;
    private String isbn;
    private double hinta;
    private int julkaisuvuosi;
    private Kustantaja kustantaja;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public Kustantaja getKustantaja() {
        return kustantaja;
    }

    public void setKustantaja(Kustantaja kustantaja) {
        this.kustantaja = kustantaja;
    }

    public Kirja() {
        this.nimi = "";
        this.isbn = "";
        this.hinta = 0.0;
        this.julkaisuvuosi = 0;
    }

    public Kirja(String nimi, String isbn, double hinta, int julkaisuvuosi) {
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.julkaisuvuosi = julkaisuvuosi;
        this.kustantaja = null;  // alustetaan kustantaja arvoksi null
    }
    

    @Override
        public String toString() {
            return "Nimi: " + nimi + 
                "\nIsbn: " + isbn + 
                "\nHinta: " + String.format("%.2f", hinta) + 
                "\nJulkaisuvuosi: " + julkaisuvuosi + 
                "\nKustantaja: " + kustantaja.toString();  // Lisää kustantajan tiedot
        }

}
