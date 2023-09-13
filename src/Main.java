import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
     CronicasDoEstudanteSistema cronicasDoEstudanteSistema = new CronicasDoEstudanteSistema();
     System.out.println(cronicasDoEstudanteSistema.registerChronicle("a", "abc", LocalDate.of(22, 06, 22), "Axel"));
     System.out.println(cronicasDoEstudanteSistema.registerChronicle("b", "def", LocalDate.of(2006, 03, 03)));
     System.out.println(cronicasDoEstudanteSistema.registerChronicle("b", "def", LocalDate.of(2006, 03, 03), "Mari"));
     cronicasDoEstudanteSistema.listChronicles();
     System.out.println(cronicasDoEstudanteSistema.showMostReadChronicle());
     cronicasDoEstudanteSistema.createBooklet(cronicasDoEstudanteSistema, new int[]{0, 1, 2});
     System.out.println(cronicasDoEstudanteSistema.readBooklet(0));
    }
}