#include <stdio.h>

int main(){
    int nAsig, sum = 0;
    printf("Ingrese el numero de asignaturas a guardar: ");
    scanf("%d", &nAsig);
    char nombresAsig[nAsig][30];
    int calificaciones[nAsig];
    char califFinal;
    float prom;
    for (int i = 0; i < nAsig; i++)
    {
        printf("Dame el nombre de la asignatura %d: ", i+1);
        scanf("%s", nombresAsig[i]);

        printf("Dame la calificaion de %s (0 a 100): ", nombresAsig[i]);
        scanf("%d", &calificaciones[i]);
        printf("\n");

        sum += calificaciones[i];
    }
    prom = sum/nAsig;

    if (prom >= 90) {
        califFinal = 'A';
    } else if (prom >= 80) {
        califFinal = 'B';
    } else if (prom >= 70) {
        califFinal = 'C';
    } else if (prom >= 60) {
        califFinal = 'D';
    } else {
        califFinal = 'F';
    }

    printf("El promedio fue: %.1f y su calificacion final fue: %c\n", prom, califFinal);
    
    return 0;
}