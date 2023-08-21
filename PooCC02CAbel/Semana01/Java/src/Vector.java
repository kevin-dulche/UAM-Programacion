import java.util.Scanner;

public class Vector {
    public static void invertirVector() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese la longitud del vector: ");
        n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + (i + 1) + "] = ");
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Vector original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Invertir el vector sin usar vector auxiliar
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            // Intercambiar los elementos en las posiciones start y end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Mover los índices hacia el centro del vector
            start++;
            end--;
        }
        
        System.out.print("\nVector invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}
