class Caja:
    def __init__(self, longitud, ancho, alto):
        self.longitud = longitud
        self.ancho = ancho
        self.alto = alto

    def areaSuperficie(self):
        return (2 * self.longitud * self.ancho + 2 * self.longitud * self.alto + 2 * self.ancho * self.alto)
    
    def areaSuperficieLateral(self):
        return (2 * self.longitud * self.alto + 2 * self.ancho * self.alto)
    
    def volumen(self):
        return (self.longitud * self.ancho * self.alto)