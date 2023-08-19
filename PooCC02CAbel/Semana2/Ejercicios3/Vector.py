from math import sqrt
class Vector:
    # Constructor
    def __init__(self, x=0, y=0, z=0):
        self.x = x
        self.y = y
        self.z = z

    # Metodo
    def magnitud(self):
        return sqrt((self.x*self.x) + (self.y*self.y) + (self.z*self.z))

    # Metodo
    def sumar(self,vector1, vector2):
        self.x = vector1.x + vector2.x
        self.y = vector1.y + vector2.y
        self.z = vector1.z + vector2.z

    # Metodo
    def producto_punto(self, vector1, vector2):
        self.x = vector1.x * vector2.x
        self.y = vector1.y * vector2.y
        self.z = vector1.z * vector2.z
    
    # Metodo
    def producto_cruz(self):
        print("Aqui va algo")

    # Metodo
    def angulo(self):
        print("Aqui va algo")

    def reiniciar(self):
        self.x = 0
        self.y = 0
        self.z = 0