#include <stdio.h>
#include <stdlib.h>
#include "sumas.h"
#include "invertirVector.h"
#include "numeroPrimo.h"
#include "calculadora.h"

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
        
        switch (opcion)
        {
            case 1:
                sumas();
                break;
            case 2:
                invertirVector();
                break;
            case 3:
                primo();
                break;
            case 4:
                menu();
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
