import java.util.Scanner;

public class Suma {
    public static void sumas() {
        Scanner scanner = new Scanner(System.in);
        int n, m, sum = 0;

        System.out.print("Ingrese el valor de n: ");
        n = scanner.nextInt();

        System.out.print("Ingrese el valor de m (debe ser mayor o igual que n): ");
        m = scanner.nextInt();

        if (n % 2 != 0) {
            n++; // Aseguramos que n sea par para empezar desde un número par
        }

        System.out.print("La suma de los numeros pares entre " + n + " y " + m + " es: ");

        for (int i = n; i <= m; i += 2) {
            sum += i;
            if (i == n) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }

        System.out.println(" = " + sum);

        scanner.close();
    }
}
