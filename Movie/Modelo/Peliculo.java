package movie.modelo;

//Consepto de JavaBeans

import java.io.Serializable;
import java.util.Objects;

//1-Implemetar Serializable 
public class Pelicula implements Serializable{

    //2-Atributos Privados
    private String nombre;

    //3-Constructor vacio 
    public Pelicula() {
    }

    //4-Constructores necesarios 
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    //5-Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //6-Método toString 
    @Override
    public String toString() {
        return this.nombre;
    }

    //7-Métedos hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
    @Override    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }    
}
