#include <stdio.h>

int main() {
    int n;
    printf("Ingrese la longitud del vector: ");
    scanf("%d", &n);
    
    int arr[n];
    printf("Ingrese los elementos del vector:\n");
    for (int i = 0; i < n; i++) {
        printf("[%d] = ", i+1);
        scanf("%d", &arr[i]);
    }
    
    printf("Vector original: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
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
    
    printf("\nVector invertido: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    
    return 0;
}