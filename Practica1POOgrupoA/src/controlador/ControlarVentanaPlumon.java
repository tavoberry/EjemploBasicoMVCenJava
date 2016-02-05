/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Plumon;
import vista.VentanaPlumon;

/**
 *
 * @author tavoberry
 */
public class ControlarVentanaPlumon implements ActionListener{
    //Atributos
    Plumon miPlumon = new Plumon();
    VentanaPlumon vista = new VentanaPlumon();
    
    //Constructor
    public ControlarVentanaPlumon(Plumon miPlumon, VentanaPlumon vista){
        this.miPlumon = miPlumon;
        this.vista = vista;
        //Asignar los botones de la vista a la lista de acciones
        //Son los botones que vamos a controlar
        this.vista.btnDestapar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnPintar.addActionListener(this);
        this.vista.btnTapar.addActionListener(this);
    }
    
    //Redefinir el funcionamiento del metodo heredado
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==vista.btnGuardar){
            miPlumon.setMarca(vista.txtMarca.getText());
            miPlumon.setColor(vista.txtColor.getText());
            miPlumon.setCodigoDeBarras(vista.txtCodigoDeBarras.getText());
            miPlumon.setPrecio(Float.parseFloat(vista.txtPrecio.getText()));
        }
        if (e.getSource()==vista.btnDestapar){
            vista.lblMensaje.setText(miPlumon.destapar());
        }
        if (e.getSource()==vista.btnPintar){
            vista.lblMensaje.setText(miPlumon.pintar());
        }
        if (e.getSource()==vista.btnTapar){
            vista.lblMensaje.setText(miPlumon.tapar());
        }
    }
}
