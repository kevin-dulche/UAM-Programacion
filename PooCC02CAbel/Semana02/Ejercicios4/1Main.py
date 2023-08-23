from Caja import *

def main():
    caja = Caja(2,3,4)

    print("Area de la superficie: " + str(caja.areaSuperficie()))
    print("Area de la superficie lateral: " + str(caja.areaSuperficieLateral()))
    print("Volumen: " + str(caja.volumen()))

main()