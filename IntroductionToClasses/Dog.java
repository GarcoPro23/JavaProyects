public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invocado!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Metodo principal iniciado");
    Dog fido = new Dog("Golden Retriever", false, 4);
    Dog nunzio = new Dog("Pastor Aleman", true, 12);
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Dos perros creados: a " + fido.breed + " y a" + nunzio.breed);
    System.out.println("La frase de que fido es el perro mayor es: " + isFidoOlder);
    System.out.println("La edad total de los perros es: " + totalDogYears);
    System.out.println("Metodo principal finalizado");
  }
}