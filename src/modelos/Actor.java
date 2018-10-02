package modelos;

public class Actor {
    boolean animado;
    String apellido;
    String nombre;
    Sexo sexo;

    public Actor(boolean animado, String apellido, String nombre, Sexo sexo) {
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Actor() {
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Actor: " + "animado=" + animado + ", apellido=" + apellido + ", nombre=" + nombre + ", sexo=" + sexo;
    }
    
}
