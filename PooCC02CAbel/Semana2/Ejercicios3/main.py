from Vector import * 

def main():
    v1 = Vector(1,2,3)
    v2 = Vector(2,3,4)
    v3 = Vector()
    v3.sumar(v1, v2)
    imprimir(v1)
    imprimir(v2)
    imprimir(v3)
    
def imprimir(Vector):
    lista = []
    lista.append(Vector.x)
    lista.append(Vector.y)
    lista.append(Vector.z)
    print(lista)

main()