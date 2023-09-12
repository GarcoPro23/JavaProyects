public class Calculator {
  public Calculator() {
    
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  } 

  public int multiply(int a, int b) {
    return a*b;
  }

  public double divide(int a, int b) {
    return a/b;
  }

  public int modulo(int a, int b) {
    return a%b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator(); 
    System.out.println(myCalculator.add(5,2));
    System.out.println(myCalculator.substract(100,31));
    System.out.println(myCalculator.multiply(9,9));
  
  }
}