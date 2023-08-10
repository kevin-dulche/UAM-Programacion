#include <stdio.h>
#include <stdlib.h>

void mostrarSuma(){
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
}

void intercambiarVector(){
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
}

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

void verificarPrimo(){
    int numero;

    printf("Ingrese un numero: ");
    scanf("%d", &numero);

    if (esPrimo(numero)) {
        printf("%d es un numero primo.\n", numero);
    } else {
        printf("%d no es un numero primo.\n", numero);
    }
}

float calculadora(float a, float b, int opcion){
    switch (opcion)
    {
    case 1:
        return a + b;
        break;
    case 2:
        return a - b;
        break;
    case 3:
        return a * b;
        break;
    case 4:
        if (b == 0) {
            printf("No se puede dividir por cero.\n");
            return 0; // O alguna acción apropiada
        }
        return a / b;
        break;
    default:
        break;
    }
}

void Calculadora(){
    int opc;
    int v1, v2;
    float resultado;
    while (1){
        printf("\n\tMENU\n");
        printf("1.- Suma\n");
        printf("2.- Resta\n");
        printf("3.- Multiplicacion\n");
        printf("4.- Division\n");
        printf("5.- Salir\n");
        printf("Ingresa la opcion que desea: ");
        scanf("%d", &opc);
        if (opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5 )
        {
            printf("Respuesta erronea\n");
            continue;
        }
        if (opc == 5)
        {
            exit(0);
        }
        
        printf("Dame el primer numero: ");
        scanf("%d", &v1);
        printf("Dame el segundo numero: ");
        scanf("%d", &v2);

        resultado = calculadora(v1, v2, opc);
        printf("El resultado es: %f\n", resultado);
    }
}

int main(){
    int opcion;
    while (1){
        printf("\n\tMENU\n");
        printf("1.- Mostrar suma\n");
        printf("2.- Intercambiar vector\n");
        printf("3.- Verificar si un numero es primo\n");
        printf("4.- Calculadora\n");
        printf("5.- Salir\n");
        printf("Ingresa la opcion que desea: ");
        scanf("%d", &opcion);
        if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 )
        {
            printf("Respuesta erronea\n");
            continue;
        }
        if (opcion == 5)
        {
            exit(0);
        }
        switch (opcion)
        {
            case 1:
                mostrarSuma();
                break;
            case 2:
                intercambiarVector();
                break;
            case 3:
                verificarPrimo();
                break;
            case 4:
                Calculadora();
                break;
            case 5:
                exit(0);
                break;
            default:
                break;
        }
    }
    return 0;
}
