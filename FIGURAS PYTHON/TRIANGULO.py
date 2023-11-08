import math
class Triangulo:
    def __init__(self, ladob, ladoa):
        a=ladoa
        b=ladob
        c=math.sqrt((a*a)+(b*b))
        self.ladoa = ladoa
        self.ladob = ladob
        self.ladoc = c
        print("creating the new triangule with sides:", (a,b,c))
    def perimetro(self):
        return (self.ladoa+self.ladob+self.ladoc)
    def Area(self):
        return (self.ladoa*self.ladob)/2
    
    
Triangulo_pequeño = Triangulo(3, 4)
Triangulo_mediano= Triangulo(15, 20)
Triangulo_grande = Triangulo(60, 80)

print("Perimetro")
print(Triangulo_pequeño.perimetro())
print(Triangulo_mediano.perimetro())
print(Triangulo_grande.perimetro())

print("Area:")
print(Triangulo_pequeño.Area())
print(Triangulo_mediano.Area())
print(Triangulo_grande.Area())