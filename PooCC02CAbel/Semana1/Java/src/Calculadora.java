import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculadora {
    static float calculadora(float a, float b, int opcion) {
        switch (opcion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0) {
                    System.out.println("No se puede dividir por cero.");
                    return 0; // O alguna acción apropiada
                }
                return a / b;
            default:
                return 0; // Valor por defecto
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opc;
        int v1, v2;
        float resultado;

        while (true) {
            System.out.println("\n\tMENU");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("5.- Salir");
            
            String entero = JOptionPane.showInputDialog("Ingresa la opcion que desea: ");
            opc = Integer.parseInt(entero);

            if (opc < 1 || opc > 5) {
                System.out.println("Respuesta erronea");
                continue;
            }

            if (opc == 5) {
                break;
            }

            System.out.print("Dame el primer numero: ");
            v1 = scanner.nextInt();
            System.out.print("Dame el segundo numero: ");
            v2 = scanner.nextInt();

            resultado = calculadora(v1, v2, opc);
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
