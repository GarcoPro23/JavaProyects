class Cuadrado:
    def __init__(self, lado):
        print("creating the new square with side: {c}" .format(c=lado))
        self.lado = lado
    def perimetro(self):
        return 4*self.lado
    def Area(self):
        return (self.lado*self.lado)
    
    
cuadrado_pequeño = Cuadrado(15)
cuadrado_mediano= Cuadrado(24)
cuadrado_grande = Cuadrado(114)

print("Perimetro")
print(cuadrado_pequeño.perimetro())
print(cuadrado_mediano.perimetro())
print(cuadrado_grande.perimetro())

print("Area:")
print(cuadrado_pequeño.Area())
print(cuadrado_mediano.Area())
print(cuadrado_grande.Area())