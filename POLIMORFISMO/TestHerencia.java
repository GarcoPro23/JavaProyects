package test;
import inhiretance.*;
import java.util.Date;
    public class TestHerencia {
        
    public static void main(String[] args) {
        Person persona = new Person("Alex", 'M', 25, "Cusco");
        //System.out.println(persona.obtenerDetalle());
        imprimir (persona);
        //Crear empleados
        Employee empleado1 = new Employee("Gutierrez", 3000);
        //System.out.println(empleado1.obtenerDetalle());
        imprimir (empleado1);
        var fecha = new Date();
        Client cliente = new Client(fecha, true, "Juan", 'M',25, "Santo Tomás");
        //System.out.println(cliente.obtenerDetalle());
        imprimir (cliente);
}
    public static void imprimir(Person personaje) {
        System.out.println(personaje.obtenerDetalle());
    }
}