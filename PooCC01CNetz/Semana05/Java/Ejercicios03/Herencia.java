import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ingeniero[] Inges = new Ingeniero[3];
        for (int i = 0; i < Inges.length; i++) {
            Inges[i] = new Ingeniero();
            System.out.printf("Ingresa el nombre del inge%d: ", i+1);
            String nombre = scanner.nextLine();
            Inges[i].setName(nombre);
            System.out.println(Inges[i].getName());
        }
        scanner.close();
    }
}
