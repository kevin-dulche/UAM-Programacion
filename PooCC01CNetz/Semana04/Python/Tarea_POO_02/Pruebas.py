from Punto import *
from time import sleep

def error():
    print("Aqui habra un error")
    sleep(5)
    raise(ValueError("Aqui esta el error"))


fecha1 = Punto()
# print(fecha1.__dia)
fecha1.setCoorX(3)
print(fecha1.getCoorX())
error()