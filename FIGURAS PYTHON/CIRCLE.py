class Circle:
    pi = 3.14
    def __init__(self, diameter):
        print("creating the circle with diameter: {d}" .format(d=diameter))
        self.radius = diameter/2
    def perimetro(self):
        return 2*self.pi*self.radius
    def Area(self):
        return self.pi*(self.radius*self.radius)
    
    
medium_pizza = Circle(12)
teaching_table= Circle(36)
round_room = Circle(11460)

print("Perimetro")
print(medium_pizza.perimetro())
print(teaching_table.perimetro())
print(round_room.perimetro())

print("Area:")
print(medium_pizza.Area())
print(teaching_table.Area())
print(round_room.Area())