import java.util.Scanner;
import java.time.LocalDate;
import java.time.DateTimeException;
//import java.time.format.DateTimeParseException;

public class Erapaiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
            String inputDate = scanner.nextLine(); 
            LocalDate today = LocalDate.parse(inputDate); 
            LocalDate future = today.plusDays(14); 

            System.out.println("Eräpäivä on " + future);
        } catch (DateTimeException e) {
            System.out.println("Laskun päivämäärä on virheellinen");
        } finally {
            scanner.close();
        }
    }
}
