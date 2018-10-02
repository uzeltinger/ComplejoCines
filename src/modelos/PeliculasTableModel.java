/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
 

/**
 *
 * @author alumno13
 */
public class PeliculasTableModel extends AbstractTableModel {
    private static final String[] columnNames = {"Nombre","Estreno","Duracion"};
    private List<Pelicula> peliculas;
    
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }

    public PeliculasTableModel(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    public int getRowCount() { return peliculas.size(); }
    
    public int getColumnCount() { return columnNames.length; }
    
    public Object getValueAt(int row, int col) {
        Object retorno = null;
        Pelicula pelicula = peliculas.get(row);
        switch(col){
            case 0:
                retorno = pelicula.getNombre();
                break;
            case 1:
                retorno = pelicula.getAnioEstreno();
                break;
            case 2:
                retorno = pelicula.getDuracion();
                break;
            default: 
                break;
        }
        return retorno;
    }
    
    



}
