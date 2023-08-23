from Producto import *
from Persona import *

def main():
    Atun = Producto("Atun", 15.50)
    Agua = Producto("Agua", 20.00)
    Jamon = Producto("Jamon", 32.50)

    Juan = Persona("Juan", 50.0)
    comprar(Juan, Agua)
    comprar(Juan, Atun)
    comprar(Juan, Jamon)

    print("La bolsa de Juan es: " + str(Juan.bolsa))

def comprar(Person = Persona, Prod = Producto):
    if Person.dinero > Prod.costo:
        Person.bolsa.append(Prod.nombre)
        Person.dinero -= Prod.costo
    else:
        print("No se puede agregar a la bolsa")

main()