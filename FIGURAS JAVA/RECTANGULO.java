public class RECTANGULO {
    private double Area;
    private double SideA;
    private double SideB;
    public RECTANGULO(double SideA,double SideB) {
        System.out.println("creating the new rectangle with side:"+ SideA+ " " + SideB);
        this.SideA=SideA;
        this.SideB=SideB;

    }
    public double perimetro() {return (2*this.SideA)+(2*this.SideB);}
    public double Area() {return (this.SideA*this.SideB);}

    public static void main(String[] args) {
        RECTANGULO rectangulo_pequeño = new RECTANGULO(3, 4);
        RECTANGULO rectangulo_mediano = new RECTANGULO(15, 20);
        RECTANGULO rectangulo_grande = new RECTANGULO(60, 80);

        System.out.println("Perimetro");
        System.out.println(rectangulo_pequeño.perimetro());
        System.out.println(rectangulo_mediano.perimetro());
        System.out.println(rectangulo_grande.perimetro());

        System.out.println("Area:");
        System.out.println(rectangulo_pequeño.Area());
        System.out.println(rectangulo_mediano.Area());
        System.out.println(rectangulo_grande.Area());

    }
}