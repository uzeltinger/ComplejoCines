/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelos.Actor;
import modelos.Calificacion;
import modelos.Genero;
import modelos.PaisDeOrigen;
import modelos.Pelicula;
import modelos.Personaje;
import modelos.Rol;
import modelos.Sexo;
/**
 *
 * @author alumno13
 */
public class ListadoPeliculas {
    public List obtenerListado() {
        
        List<Genero> generos = getGeneros();   
        List<Calificacion> calificaciones = getCalificaciones();
        List<PaisDeOrigen> paises = getPaisesDeOrigen();      
        List<Sexo> sexos = getSexos();
        List<Actor> actores = getActores(sexos);
        List<Rol> roles = getRoles();     
        List<Personaje> personajes =  getPersonajes(actores, roles); 
        
        List<Pelicula> peliculas = new ArrayList(); 
        
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setAnioEstreno(2018);
        pelicula1.setDisponible(true);
        pelicula1.setDuracion(120);
        pelicula1.setFechaIngreso(LocalDate.of(2018, 5, 10));
        pelicula1.setNombre("Rápido y Furioso 2");
        pelicula1.setTituloOriginal("Fast Furious 2");
        pelicula1.setPaisDeOrigen(paises.get(1));
        pelicula1.setGenero(generos.get(0));
        pelicula1.setCalificacion(calificaciones.get(0));
        pelicula1.setPersonajes(personajes);
        System.out.println(pelicula1.toString());
        
        System.out.println("pelicula1: " + pelicula1.getNombre());
        
        Pelicula pelicula2 = new Pelicula();
        pelicula2.setAnioEstreno(2017);
        pelicula2.setDisponible(false);
        pelicula2.setDuracion(95);
        pelicula2.setFechaIngreso(LocalDate.of(2018, 4, 10));
        pelicula2.setNombre("La Roca");
        pelicula2.setTituloOriginal("La ROca");
        pelicula2.setPaisDeOrigen(paises.get(1));
        pelicula2.setGenero(generos.get(0));
        pelicula2.setCalificacion(calificaciones.get(0));
        pelicula2.setPersonajes(personajes);
        
        System.out.println("pelicula2: " + pelicula2.getNombre());
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        return peliculas;
    }
    
    public List getGeneros(){
        List<Genero> generos = new ArrayList();
        Genero genero1 = new Genero("Terror");
        Genero genero2 = new Genero("Ciencia Ficcón");
        Genero genero3 = new Genero("Comedia");
        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);        
        Iterator gIterator = generos.iterator();        
        while(gIterator.hasNext()){
            Object g = gIterator.next();
            System.out.println(g.toString());
        }
        return generos;
    }
    
    public List getCalificaciones(){
        List<Calificacion> calificaciones = new ArrayList();        
        Calificacion calificacion1 = new Calificacion("ATP");
        Calificacion calificacion2 = new Calificacion("13+");
        Calificacion calificacion3 = new Calificacion("18+");        
        calificaciones.add(calificacion1);
        calificaciones.add(calificacion2);
        calificaciones.add(calificacion3);
        for (Calificacion c : calificaciones) {
            System.out.println(c.toString());
        }
        return calificaciones;
    }
    
    public List getPaisesDeOrigen(){
        List<PaisDeOrigen> paises = new ArrayList();
        PaisDeOrigen p = new PaisDeOrigen("Castellano","Argentina");
        paises.add(p);
        PaisDeOrigen p2 = new PaisDeOrigen("Portugués","Brasil");
        paises.add(p2);
        PaisDeOrigen p3 = new PaisDeOrigen("Latino","Uruguay");
        paises.add(p3);        
        for (PaisDeOrigen po : paises){
            System.out.println(po.toString());
        }
        return paises;
    }
    
    public List getSexos(){
        ArrayList<Sexo> sexos = new ArrayList();        
        Sexo s = new Sexo("Masculino");
        sexos.add(s);
        Sexo s2 = new Sexo("Femenino");
        sexos.add(s2);
        Sexo s3 = new Sexo("Indistinto");
        sexos.add(s3);        
        sexos.forEach((sx) -> {
            System.out.println(sx.toString());
        });
        return sexos;
    }
    
    public List getActores(List<Sexo> sexos){
        List<Actor> actores = new ArrayList();
        Actor a1 = new Actor(false,"García","Juan",sexos.get(0));
        Actor a2 = new Actor(false,"Perez","José",sexos.get(1));
        Actor a3 = new Actor(false,"López","María",sexos.get(2));
        Actor a4 = new Actor(false,"García","Andrea",sexos.get(1));
        actores.add(a1);
        actores.add(a2);
        actores.add(a3);
        actores.add(a4);        
        for (Actor at : actores){
            System.out.println(at.toString());
        }
        return actores;
    }
    
    public List getRoles(){
        List<Rol> roles = new ArrayList();
        Rol r1 = new Rol("Actor Principal");
        roles.add(r1);
        Rol r2 = new Rol("Actriz de reparto");
        roles.add(r2);        
        for (Rol rl : roles){
            System.out.println(rl.toString());
        }
        return roles;
    }
    
    public List getPersonajes(List<Actor> actores, List<Rol> roles){
        List<Personaje> personajes = new ArrayList();        
        Personaje pj1 = new Personaje(actores.get(2),"Juilio Verne", roles.get(0));
        Personaje pj2 = new Personaje(actores.get(1),"Juana de Arco", roles.get(1));
        Personaje pj3 = new Personaje(actores.get(0),"Lara Croft", roles.get(1));        
        personajes.add(pj1);
        personajes.add(pj2);
        personajes.add(pj3);        
        Iterator<Personaje> itPj = personajes.iterator();
        while(itPj.hasNext()){
            Personaje pj = itPj.next();
            System.out.println(pj.toString());
        }
        return personajes;
    }
}
