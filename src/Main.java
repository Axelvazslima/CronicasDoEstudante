import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     CronicasDoEstudanteSistema cronicasDoEstudanteSistema = new CronicasDoEstudanteSistema();
     Scanner sc = new Scanner(System.in);
     System.out.println(cronicasDoEstudanteSistema.registraCronica(sc.nextLine(), sc.nextLine(), sc.nextLine()));
     System.out.println(cronicasDoEstudanteSistema.registraCronica(sc.nextLine(), sc.nextLine()));
    }
}