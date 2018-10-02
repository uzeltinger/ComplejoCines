
package modelos;

public class Sexo {
    String nombre;

    public Sexo(String nombre) {
        this.nombre = nombre;
    }

    public Sexo() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sexo: " + "nombre = " + nombre;
    }
    
}
