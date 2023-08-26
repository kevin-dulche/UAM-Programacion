class DisplayNumero:
    valor = int
    limite = int
    def __init__(self, valor, limite):
        self.valor = valor
        self.limite = limite
    
    def incrementar(self):
        if self.valor < self.limite:
            self.valor += 1
        else:
            self.valor = 0
    
        