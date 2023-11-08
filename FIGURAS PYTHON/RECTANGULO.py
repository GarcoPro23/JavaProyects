class Rectangulo:
    def __init__(self, ladoa, ladob):
        a=ladoa
        b=ladob
        self.ladoa = ladoa
        self.ladob = ladob
        print("creating the new rectangle with sides:", (a,b))
    def perimetro(self):
        return (2*self.ladoa)+(2*self.ladob)
    def Area(self):
        return (self.ladoa*self.ladob)
    
    
Rectangulo_pequeño = Rectangulo(15, 20)
Rectangulo_mediano= Rectangulo(24, 34)
Rectangulo_grande = Rectangulo(114, 124)

print("Perimetro")
print(Rectangulo_pequeño.perimetro())
print(Rectangulo_mediano.perimetro())
print(Rectangulo_grande.perimetro())

print("Area:")
print(Rectangulo_pequeño.Area())
print(Rectangulo_mediano.Area())
print(Rectangulo_grande.Area())