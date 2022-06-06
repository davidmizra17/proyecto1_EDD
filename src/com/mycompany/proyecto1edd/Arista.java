/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1edd;

/**
 *
 * @author davidmizrahi
 */
public class Arista {
    //este método va a generar las aristas para el grafo
    
    //la hacemos genérica para que nuestro grafo pueda aceptar cualquier tipo de dato
    private char origen;
    
    private char llegada;
    
    private int peso;
    
    public Arista(char origen, char llegada, int peso){
    
        this.origen = origen;
        
        this.llegada = llegada;
        
        this.peso = peso;
    }
}
