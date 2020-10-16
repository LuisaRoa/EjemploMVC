/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplomvc;

import controlador.Controlador;
import modelo.modelo;
import vista.Vista;

/**
 *
 * @author luisa
 */
public class Main {
    public static void main(String [] args){
        modelo mod = new modelo(); //se crean los objetos de cada componente del modelo
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view,mod); //Se envian los objetos a la clase controlador
        ctrl.iniciar(); //Se invoca el metodo iniciar que configura la vista
        view.setVisible(true); 
        
    }
}
