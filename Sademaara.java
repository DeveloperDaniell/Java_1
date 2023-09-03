
public class Sademaara {
    public static void main(String[] args) {
        
        double [] sademaarat = {47.0,36.6,34.7,37.0,41.9,47.5,61.7,74.8,65.4,69.7,66.1,54.6};

        double summa = 0;
        
        for (int i=0; i<sademaarat.length; i++) {
            summa += sademaarat[i];
        }

        System.out.println("Vuoden sademäärä on " + String.format("%.2f", summa) + " mm");
        
    }
}