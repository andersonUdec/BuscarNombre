/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.udec.buscarnombremvc;
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.PaginaPrincipal;

/**
 *
 * @author ANDERSON SUAREZ ALBERT CHARRY
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {
    PaginaPrincipal pagina = new PaginaPrincipal();
    Modelo modelo = new Modelo();
    Controlador controlador = new Controlador(modelo, pagina);
    
    controlador.inicioPagina();
    pagina.setVisible(true);
    }
}
