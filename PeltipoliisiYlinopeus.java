public class PeltipoliisiYlinopeus {
    public static void main(String[] args) {
        // Alustetaan taulukko peltipoliisin antamilla tiedoilla
        String[] peltipoliisi = { "ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83" };

        // Käydään läpi jokainen taulukon elementti
        for (String tieto : peltipoliisi) {
            // Jaetaan merkkijono kahteen osaan: rekisterinumero ja nopeus
            String[] osat = tieto.split(";");
            // Otetaan rekisterinumero ja nopeus omiin muuttujiin
            String rekisterinumero = osat[0];
            int nopeus = Integer.parseInt(osat[1]);

            // Tarkistetaan, onko nopeus yli 83 (80 + 3)
            if (nopeus >= 84) {
                System.out.println(rekisterinumero + " " + nopeus);
            }
        }
    }
}
