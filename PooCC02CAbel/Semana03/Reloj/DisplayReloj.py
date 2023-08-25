from DisplayNumero import *
import time
from os import system
class DisplayReloj:
    def main():
        hora = DisplayNumero(11, 23)
        minutos = DisplayNumero(3, 59)
        segundos = DisplayNumero(1, 59)
        while(True):
            if segundos.valor == 0:
                minutos.incrementar()
            if minutos.valor == 0 and segundos.valor == 0:
                hora.incrementar()
            system("cls")
            print(f"{hora.valor} : {minutos.valor} : {segundos.valor}")
            time.sleep(1)
            segundos.incrementar()
    
    main()