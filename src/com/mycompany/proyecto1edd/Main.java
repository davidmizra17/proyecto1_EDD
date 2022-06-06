package com.mycompany.proyecto1edd;

import com.mycompany.proyecto1edd.grafo.Grafo;
import static com.mycompany.proyecto1edd.ManejoArchivo.*;
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davidmizrahi
 */
public class Main {
    
    public static void main(String[] args){
    
        //crearArchivo("archivo.txt");
        
//        Object contenido = "Almacenes\n Almacen A:Pantalla,3RAM,2Procesador,1\nAlmacen B:Pantalla,3Grafica,5\nAlmacen C:Placa,7Teclado,8\nAlmacen D:Mouse,2\nAlmacen E:Microfono,7Audifonos,10\nRutas;A,B,10\nA,C,20\nB,C,5\nB,D,8\nC,D,4\nC,E,13\nD,E,3\nE,A,25"  ;
//        
//        escribirArchivo("archivo.txt", contenido);

        Grafo grafo = new Grafo();
        
        File file = new File("/Users/davidmizrahi/NetBeansProjects/proyecto1EDD_5-05/amazon.txt");
        
        ManejoArchivo.leerArchivo(file, grafo);
        
        int[][] dijkstra = Metodos.dijkstra(grafo, 0);
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(15);
        stack.push(14);
        stack.push(7772);
        
        stack.printStack();
        
        System.out.println("");
        stack.pop();
        
        stack.printStack();
        
        stack.emptyStack();
        stack.printStack();
        
        int origen = 0;
        
        System.out.println(Metodos.bfs(grafo, origen));
        
        
        Metodos.dfs(grafo, origen);

        System.out.println("cualquier cosa");
        
    }
    
}
