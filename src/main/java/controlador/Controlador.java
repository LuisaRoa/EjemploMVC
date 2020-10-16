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
    private Vista view;
    private modelo model;

    public Controlador(Vista view, modelo model) {
        this.view = view;
        this.model = model;
        this.view.BtnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Operación");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.TxNumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.TxNumero2.getText()));
        model.Multiplicar();
        view.TxResultado.setText(String.valueOf(model.getResultado()));
    }
}
