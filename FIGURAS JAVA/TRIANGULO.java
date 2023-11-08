import java.util.*;
public class TRIANGULO {
    private double Area;
    private double SideA;
    private double SideB;
    private double SideC;
    public TRIANGULO(double SideA,double SideB) {
        System.out.println("creating the new triangule with side:"+SideA+" "+SideB);
        this.SideA=SideA;
        this.SideB=SideB;
        this.SideC=(Math.sqrt((SideA*SideA)+(SideB*SideB)));

    }
    public double perimetro() {return this.SideA+this.SideB+this.SideC;}
    public double Area() {return (this.SideA*this.SideB)/2;}

    public static void main(String[] args) {
        TRIANGULO triangulo_pequeño = new TRIANGULO(15, 20);
        TRIANGULO triangulo_mediano = new TRIANGULO(24, 34);
        TRIANGULO triangulo_grande = new TRIANGULO(114, 124);

        System.out.println("Perimetro");
        System.out.println(triangulo_pequeño.perimetro());
        System.out.println(triangulo_mediano.perimetro());
        System.out.println(triangulo_grande.perimetro());

        System.out.println("Area:");
        System.out.println(triangulo_pequeño.Area());
        System.out.println(triangulo_mediano.Area());
        System.out.println(triangulo_grande.Area());
    }
}