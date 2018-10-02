package modelos;

import java.time.LocalDate;
import java.util.List;

public class Pelicula {
    int anioEstreno;
    boolean disponible;
    int duracion;
    LocalDate fechaIngreso;
    String nombre;
    String tituloOriginal;
    PaisDeOrigen paisDeOrigen;
    Genero genero;
    Calificacion calificacion;
    List<Personaje> personajes; 

    public Pelicula(int anioEstreno, boolean disponible, int duracion, LocalDate fechaIngreso, String nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, Genero genero, Calificacion calificacion, List<Personaje> personajes) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.genero = genero;
        this.calificacion = calificacion;
        this.personajes = personajes;
    }

    public Pelicula() {
    }
    
    public int calcularDuracionEnFuncion(){
        return 0;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Pelicula{" 
                + "\n anioEstreno=" + anioEstreno 
                + "\n disponible=" + disponible 
                + "\n duracion=" + duracion 
                + "\n fechaIngreso=" + fechaIngreso 
                + "\n nombre=" + nombre 
                + "\n tituloOriginal=" + tituloOriginal 
                + "\n paisDeOrigen=" + paisDeOrigen 
                + "\n genero=" + genero 
                + "\n calificacion=" + calificacion 
                + "\n personajes=" + personajes + '}';
    }

    
    
}
