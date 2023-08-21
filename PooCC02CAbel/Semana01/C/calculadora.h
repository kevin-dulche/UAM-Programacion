#include <stdio.h>
float calculadora(float a, float b, int opcion){
    switch (opcion)
    {
    case 1:
        return a + b;
    case 2:
        return a - b;
    case 3:
        return a * b;
    case 4:
        if (b == 0) {
            printf("No se puede dividir por cero.\n");
            return 0; // O alguna acción apropiada
        }
        return a / b;
    default:
        break;
    }
}

void menu(){
    int opc;
    float v1, v2;
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
            break;
        }
        
        printf("Dame el primer numero: ");
        scanf("%f", &v1);
        printf("Dame el segundo numero: ");
        scanf("%f", &v2);

        resultado = calculadora(v1, v2, opc);
        printf("El resultado es: %f\n", resultado);
    }
}