package modelos;

public class Personaje {
    Actor actor;
    String nombreEnPelicula;
    Rol rol;

    public Personaje() {
    }
/** Metodo para crear un nuevos personaje
 * 
 * @param actor
 * @param nombreEnPelicula
 * @param rol 
 */
    public Personaje(Actor actor, String nombreEnPelicula, Rol rol) {
        this.actor = actor;
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
    }    

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    @Override
    public String toString() {
        return "Personaje: " + "actor = " + actor + ", nombreEnPelicula=" + nombreEnPelicula + ", rol=" + rol;
    }

    
    
}
