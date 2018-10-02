package modelos;

public class PaisDeOrigen {
    String idioma;
    String nombre;

    public PaisDeOrigen(String idioma, String nombre) {
        this.idioma = idioma;
        this.nombre = nombre;
    }

    public PaisDeOrigen() {
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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
