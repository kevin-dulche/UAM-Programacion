import java.util.Scanner;

public class Primo {
    // Función para verificar si un número es primo
    static int esPrimo(int num) {
        if (num <= 1) {
            return 0;  // No es primo
        }
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;  // No es primo
            }
        }
        
        return 1;  // Es primo
    }
    
    public static void primos() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();

        if (esPrimo(numero) == 1) {
            System.out.printf("%d es un numero primo.%n", numero);
        } else {
            System.out.printf("%d no es un numero primo.%n", numero);
        }

        scanner.close();
    }
}

