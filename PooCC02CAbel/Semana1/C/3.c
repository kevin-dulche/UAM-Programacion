#include <stdio.h>

// Función para verificar si un número es primo
int esPrimo(int num) {
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

int main() {
    int numero;

    printf("Ingrese un numero: ");
    scanf("%d", &numero);

    if (esPrimo(numero)) {
        printf("%d es un numero primo.\n", numero);
    } else {
        printf("%d no es un numero primo.\n", numero);
    }

    return 0;
}