/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.Vista;

/**
 *
 * @author luisa
 */
public class Controlador implements ActionListener{
    private Vista view; //Se crean las variables tipo vista y modelo
    private modelo model;

    public Controlador(Vista view, modelo model) { // constructor de la clase para inicializar las variables
        this.view = view;
        this.model = model;
        this.view.BtnMultiplicar.addActionListener(this); //Se accede a los controles de la vista
    }
    public void iniciar(){ //En este metodo se inicia la vista y sus propiedades
        view.setTitle("Operación");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){//Esta clase establece la función que realiza el boton
        model.setNumeroUno(Integer.parseInt(view.TxNumero1.getText()));//Se envian los datos a la clase modelo
        model.setNumeroDos(Integer.parseInt(view.TxNumero2.getText()));
        model.Multiplicar(); //Se invoca el metodo que realiza la operación
        view.TxResultado.setText(String.valueOf(model.getResultado())); // se muestra el resultado de la operacion
    }
}
