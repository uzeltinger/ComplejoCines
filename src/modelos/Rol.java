
package modelos;

public class Rol {
    String nombre;

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public Rol() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol: " + "nombre = " + nombre;
    }
    
}
