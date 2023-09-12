import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     CronicasDoEstudanteSistema cronicasDoEstudanteSistema = new CronicasDoEstudanteSistema();
     Scanner sc = new Scanner(System.in);
     System.out.println(cronicasDoEstudanteSistema.registerChronicle(sc.nextLine(), sc.nextLine(), LocalDate.parse(sc.nextLine()), sc.nextLine()));
     System.out.println(cronicasDoEstudanteSistema.registerChronicle(sc.nextLine(), sc.nextLine(), LocalDate.parse(sc.nextLine())));
     cronicasDoEstudanteSistema.listChronicles();
     System.out.println(cronicasDoEstudanteSistema.showMostReadChronicle());
    }
}