package modelos;

import java.util.List;

public class Genero {
    String nombre;

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Genero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }     
    
}
