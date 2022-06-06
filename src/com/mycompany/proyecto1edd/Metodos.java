/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1edd;

import com.mycompany.proyecto1edd.grafo.Grafo;


/**
 *
 * @author davidmizrahi
 */
public class Metodos {
    
    /**
     * 
     * Esta clase contiene los metodos que se van a utilizar para realizar ciertas funciones a lo largo del proyecto
    
    
//    public void actualizarRepo(){
//    
//        
//    }
    
    /**
     *
     * @param grafo
     * @param origen
     * @return arreglo de enteros referente a las rutas  tomadas hasta averiguar la mas cercana
     */
    public static int[][] dijkstra(Grafo grafo, int origen){
        
        Queue<Integer> cola = new Queue<>();
        
        boolean[] visitados = new boolean[grafo.getVertices().Size()];
        
        visitados[origen] = true;
        
        int[][] distancias = new int[2][grafo.getVertices().Size()];
        
        for(int i = 0; i < distancias.length; i++){
        
            distancias[0][i] = Integer.MAX_VALUE; //valor infinito
            distancias[1][i] = -1;
        }
        distancias[0][origen] = 0;
        
        
        cola.enqueue(origen);
        
        while(!cola.isEmpty()){
            
            int almacen = cola.dequeue();
            
            visitados[almacen] = true;
            
           Integer[] adyacentes = grafo.getAristas()[almacen];
           
            for (int i = 0; i < adyacentes.length; i++) {
                
                
                if(adyacentes[i] != null && !visitados[i]){
                    
                    int distancia = Math.min(distancias[0][i], distancias[0][almacen] + adyacentes[i]);
                    
                    int salto = distancia == distancias[0][i] ? distancias[1][i] : almacen;
                    
                    
                    distancias[0][i] = distancia;
                    
                    distancias[1][i] = salto;
                    if(!cola.existe(i)){
                        
                        cola.enqueue(i);
                    
                    }
                    
                    
                }
            }
        }
        return distancias;
    
    }
    
    //reporte de disponibilidad de almacenes
    
    /**s
     * 
     * @param grafo
     * @param origen
     */
    public static void dfs(Grafo grafo, int origen){
    
        Stack<Integer> stack = new Stack<>();
        
        boolean[] visitados = new boolean[grafo.getVertices().Size()];
        
        visitados[origen] = true;
        
        stack.push(origen);
       
        while(!stack.isEmpty()){
            
            int vertice = stack.pop();
            
            visitados[vertice] = true;
            
            Integer[] adyacentes = grafo.getAristas()[vertice];
            do {
                
                for (int i = 0; i < adyacentes.length; i++) {
                    if(adyacentes[i] == null){
                    
                        stack.push(i);
                        visitados[i] = true;
                        
                    }
                }
                
            } while (true);
            
        
    
    }
    }

    /**
     *
     * @param grafo
     * @param origen
     * @return arreglo de tipo boolean referente a las rutas de los nodos hasta recorrer todo el grafo
     */
    public static boolean[] bfs(Grafo grafo, int origen){
        
        Queue<Integer> cola = new Queue<>();
        
        boolean[] visitados = new boolean[grafo.getVertices().Size()];
        
        visitados[origen] = true;
        
        cola.enqueue(origen);
       
        while(!cola.isEmpty()){
            
            int vertice = cola.dequeue();
            
            visitados[vertice] = true;
            
            
            Integer[] adyacentes = grafo.getAristas()[vertice];
            
            for (int i = 0; i < adyacentes.length; i++) {
                    
                if(adyacentes[i] != null && !visitados[i]){
                
                    cola.enqueue(i);
                    
                    }
                }

            }

        return visitados;

    }
}
