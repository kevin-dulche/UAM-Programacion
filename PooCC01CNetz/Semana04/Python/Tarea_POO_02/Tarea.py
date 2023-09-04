from Punto import *
from Fecha import *
from time import sleep

import os

class Tarea:
    def main(self):
        while True:
            os.system('cls')
            print("Menu")
            print("1. Coordenadas Cartesianas y polares")
            print("2. Fecha")
            print("3. Numeros Complejos")
            print("4. Suma de polinomios (grado dos)")
            print("5. Rectangulos")
            print("6. Salir")
            opcion = int(input("\nIngrese la opcion deseada: "))
            self.menu(opcion)
            
    def menu(self, opcion):
        match opcion:
            case 1:
                self.coordenadas()
                sleep(5)
            case 2:
                self.fecha()
                sleep(5)
            case 3:
                pass
            case 4:
                pass
            case 5:
                pass
            case 6:
                print("Fin del programa")
                sleep(5)
                exit()
            case _:
                print("Respuesta invalida")
                sleep(5)

    def coordenadas(self):
        puntos = Punto()
        x = float(input("Dame el valor de la coordenada X: "))
        puntos.setCoorX(x)
        y = float(input("Dame el valor de la coordenada Y: "))
        puntos.setCoorY(y)
        print("Coordenadas cartesinas: " + puntos.to_string_cartesianas())
        print("Coordenadas polares: " + puntos.to_string_polares())
    
    def fecha(self):
        fecha = Fecha()
        print("Ingresaras una fecha DD MM AAAA")
        dia = input("Ingresa el dia(DD): ")
        mes = input("Ingresa el mes(MM): ")
        año = input("Ingresa el año(AAAA): ")
        fecha.setDia(dia)
        fecha.setMes(mes)
        fecha.setAño(año)
        print("Fecha abreviada: " + fecha.fechaCorta())
        print("Fecha extendida: " + fecha.fechaLarga())

# Intanciamos la clase Tarea y llamamos al metodo main
tarea = Tarea()
tarea.main()