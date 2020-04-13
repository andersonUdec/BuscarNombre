/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import jdk.nashorn.internal.runtime.Debug;

/**
 *
 * @author ANDERSON
 */
public class Modelo {
    private String nombre;
    private List nombres;
    private List nombresCoincidencias;
    public List getNombres() {
        return nombres;
    }

    public void setNombres(List nombres) {
        this.nombres = nombres;
    }


    public List getNombresCoincidencias() {
        return nombresCoincidencias;
    }

    public void setNombresCoincidencias(List nombresCoincidencias) {
        this.nombresCoincidencias = nombresCoincidencias;
    } 
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    public List coincidencias(){
        for(int i=0;i<this.nombres.getItemCount();i++){
            if(nombres.getItem(i).equals(this.nombre)){
                String n = nombres.getItem(i);
                System.out.println("lo encontro");                                               
                System.out.println(n);
                nombresCoincidencias.add(n);
            }
            else{
                System.out.println("No lo encontro");
            }
        }
        return this.getNombresCoincidencias();
    }
}
