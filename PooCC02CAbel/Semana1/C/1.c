#include <stdio.h>

int main() {
    int n, m, sum = 0;

    printf("Ingrese el valor de n: ");
    scanf("%d", &n);

    printf("Ingrese el valor de m (debe ser mayor o igual que n): ");
    scanf("%d", &m);

    if (n % 2 != 0) {
        n++; // Aseguramos que n sea par para empezar desde un número par
    }

    printf("La suma de los numeros pares entre %d y %d es: ", n, m);

    for (int i = n; i <= m; i += 2) {
        sum += i;
        if (i == n) {
            printf("%d", i);
        } else {
            printf(" + %d", i);
        }
    }

    printf(" = %d\n", sum);

    return 0;
}
