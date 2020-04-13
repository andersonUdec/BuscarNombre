/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Modelo;
import Vista.PaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ANDERSON
 */
public class Controlador implements ActionListener { 
    Modelo modelo;
    PaginaPrincipal vista;   
    /**
     * Constructor que recibe los parametros necesarios para conectar vista con
     * el modelo
     *
     * @param modelo
     * @param vista
     */
     public Controlador(Modelo modelo, PaginaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.JBT_Buscar.addActionListener(this);     
    }
    /**
    * Metodo que centra la pantalla y crea un titulo a la misma.
    */
     public void inicioPagina() {
        vista.setTitle("Busqueda de nombres MVC");
        vista.setLocationRelativeTo(null);
    }
     /**
     * Metodo encargado de recibir cuando se oprime el boton de buscar
     * @param e variable que controla los eventos de los botones
     */
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.JBT_Buscar){   
            if(vista.JTF_Busqueda.getText() != null){
                modelo.setNombre(vista.JTF_Busqueda.getText());
                coincidencias();
            }
        }
    }
    public void coincidencias(){
        modelo.setNombre(vista.JTF_Busqueda.getText());
        modelo.setNombres(vista.LT_Nombres);
        modelo.coincidencias();
        vista.LT_NO =(modelo.getNombresCoincidencias());
    }
}
