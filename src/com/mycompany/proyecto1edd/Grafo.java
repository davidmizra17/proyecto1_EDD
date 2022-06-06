/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1edd.grafo;

import com.mycompany.proyecto1edd.Almacen;
import com.mycompany.proyecto1edd.Lista;

/**
 *
 * @author davidmizrahi
 */
public class Grafo {
    //Campos de la clase
    private Lista<Almacen> vertices;
    
    private Integer [][] aristas;
    
    /**
     *Constructor de la clase
     */
    public Grafo(){
    
        this.vertices = new Lista<>();
        
        
        
    }
    
    /**
     *Método para insertar un almacen en el grafo
     * @param almacen
     */
    public void insertarAlmacen(Almacen almacen){
     
        vertices.agregarElemento(almacen);
        
        Integer[][] newArista = new Integer[vertices.Size()][vertices.Size()];
        if(aristas != null)
       for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas.length; j++) {
                newArista[i][j] = aristas[i][j];
                
            }
            
       }
        this.aristas = newArista;
    }
    
    /**
     *Método para insertar una arista 
     * @param origen
     * @param llegada
     * @param peso
     */
    public void insertarArista(char origen, char llegada, int peso){
        
        int posicionOrigen = vertices.buscarPosicion(new Almacen(origen));
        
        int posicionLlegada = vertices.buscarPosicion(new Almacen(llegada));
        
        this.aristas[posicionOrigen][posicionLlegada] = peso;
    
        
    }

    /**
     *
     * @return Lista de almacenes que contienen vertices + lista de productos
     */
    public Lista<Almacen> getVertices() {
        return vertices;
    }

    /**
     *
     * @return arreglo de enteros referente a las aristas
     */
    public Integer[][] getAristas() {
        return aristas;
    }
    
    
}
