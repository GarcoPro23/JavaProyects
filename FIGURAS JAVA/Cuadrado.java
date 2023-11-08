public class Cuadrado {
    private double Area;
    private double Side;
    public Cuadrado(double Side) {
        System.out.println("creating the new square with side:"+ Side);
        this.Side=Side;
    }
    public double perimetro() {return 4*this.Side;}
    public double Area() {return this.Side*this.Side;}

    public static void main(String[] args) {
        Cuadrado cuadrado_pequeño = new Cuadrado(15);
        Cuadrado cuadrado_mediano = new Cuadrado(24);
        Cuadrado cuadrado_grande = new Cuadrado(114);

        System.out.println("Perimetro");
        System.out.println(cuadrado_pequeño.perimetro());
        System.out.println(cuadrado_mediano.perimetro());
        System.out.println(cuadrado_grande.perimetro());

        System.out.println("Area:");
        System.out.println(cuadrado_pequeño.Area());
        System.out.println(cuadrado_mediano.Area());
        System.out.println(cuadrado_grande.Area());
    }
}