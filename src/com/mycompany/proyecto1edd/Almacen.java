/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1edd;

/**
 *
 * @author davidmizrahi
 */

//Clase Almacen
public class Almacen {
    //Campos de la clase
    
    private char id;
    
    private Lista<String> productos;
    
    /**
     *
     * @param id
     */
    //Constructor de la clase
    public Almacen(char id){
    
        this.id = id;
        
        this.productos = new Lista<>();
        
    }

    /**
     *
     * @return id del vertice tipo char
     */
    public char getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(char id) {
        this.id = id;
    }

    /**
     *
     * @return lista de strings referente a los productos que contiene un almacen
     */
    public Lista<String> getProductos() {
        return productos;
    }

    /**
     *
     * @param productos
     */
    public void setProductos(Lista<String> productos) {
        this.productos = productos;
    }

    /**
     *
     * @param obj
     * @return tipo de dato boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Almacen other = (Almacen) obj;
        return this.id == other.id;
    }
    
    
    
    
    
    
    
}
