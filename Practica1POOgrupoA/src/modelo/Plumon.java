/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tavoberry
 */
public class Plumon {
    private String marca;
    private float precio;
    private String color;
    private String codigoDeBarras;

    //Constructores de la clase
    public Plumon(){
        marca = "";
        precio = 0;
        color = "";
        codigoDeBarras = "";
    }
    
    public Plumon(String marca, float precio, String color, String codigoDeBarras) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.codigoDeBarras = codigoDeBarras;
    }
    
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the codigoDeBarras
     */
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    /**
     * @param codigoDeBarras the codigoDeBarras to set
     */
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
    /**
     * Este método indica que el plumón fue destapado
     * @return String o cadena
     */ 
    public String destapar(){
        return "El plumon está destapado";
    }
    
    /**
     * Este método indica que el plumón está pintando y en que color
     * @return String o cadena
     */
    public String pintar(){
        return "Pintando en color "+color;
    }
    
    /**
     * Este método indica que el plumón fue cerrado
     * @return String o cadena
     */
    public String tapar(){
        return "El plumon "+marca+" está tapado";
    }
    
}
