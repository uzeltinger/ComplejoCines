/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumno13
 */
public class Listados {
    
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
}
