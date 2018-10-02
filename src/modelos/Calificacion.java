package modelos;

public class Calificacion {
    String nombre;

    public Calificacion(String nombre) {
        this.nombre = nombre;
    }

    public Calificacion() {
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
