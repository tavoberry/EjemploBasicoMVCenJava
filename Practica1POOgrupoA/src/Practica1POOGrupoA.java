
import controlador.ControlarVentanaPlumon;
import modelo.Plumon;
import vista.VentanaPlumon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tavoberry
 */
public class Practica1POOGrupoA {
    
    public static void main(String []arg){
        Plumon marcador = new Plumon();
        VentanaPlumon ventana = new VentanaPlumon();
        ControlarVentanaPlumon controlador = new ControlarVentanaPlumon(marcador, ventana);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
