class Ejercicio01:
    def main():
        p = int
        q = int
        p = int(input("Dame el valor (entero) de p: "))
        q = int(input("Dame el valor (entero) de q: "))
        if q == 0:
            print("error, division por cero")
        else:
            c = 0
            r = p
            while r >= q:
                r = r - q
                c = c - 1
            print(f"Valor de c: {c}, Valor de r: {r}")
    
    main()