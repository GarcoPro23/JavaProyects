public class Circle {
    private static final double pi =3.14;
    private double Radius;
    private double Area;
    public Circle(double diameter) {
        System.out.println("creating the Circle with diameter:"+ diameter);
        this.Radius = diameter/2;
    }
    public double Circunference(){return 2*pi*this.Radius;}
    public double Area() { return  pi*this.Radius*this.Radius;}

    public static void main(String[] args) {
        System.out.println("Perimetro:");
        Circle medium_pizza = new Circle(12);
        Circle teaching_table = new Circle(36);
        Circle round_room = new Circle(11400);
        System.out.println(medium_pizza.Circunference());
        System.out.println(teaching_table.Circunference());
        System.out.println(round_room.Circunference());

        System.out.println("Area:");
        System.out.println(medium_pizza.Area());
        System.out.println(teaching_table.Area());
        System.out.println(round_room.Area());
    }
}