class Circle {
  double pi = 3.14;
  double radius;

  Circle(double diameter) {
    System.out.println("Creating circle with diameter " + diameter);
    this.radius = diameter / 2;
  }

  double circumference() {
    return 2 * this.pi * this.radius;
  }
}

Circle medium_pizza = new Circle(12);
Circle teaching_table = new Circle(36);
Circle round_room = new Circle(11460);
System.out.println(medium_pizza.circumference());
System.out.println(teaching_table.circumference());
System.out.println(round_room.circumference());