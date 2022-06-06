/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1edd;
import com.mycompany.proyecto1edd.grafo.Grafo;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidmizrahi
 */
public class ManejoArchivo {
    //en esta clase se implementaran los metodos necesarios que nos dejaran crear, leer, actualizar y eliminar un archivo

    /**
     *
     * @param nombreArchivo
     */
    
    public static void crearArchivo(String nombreArchivo){
    
        File archivo = new File(nombreArchivo);
        
        try{
        
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo.");
            
            
        }catch(FileNotFoundException ex){ex.printStackTrace(System.out);}
    }
    
    /**
     *
     * @param nombreArchivo
     * @param contenido
     */
    public static void escribirArchivo(String nombreArchivo, Object contenido){
    
        File archivo = new File(nombreArchivo);
        
        try{
        
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        }catch(FileNotFoundException ex){ex.printStackTrace(System.out);}
        catch(IOException ex){ex.printStackTrace(System.out);}
    }
    
    /**
     *
     * @param archivo
     * @param grafo
     */
    public static void leerArchivo(File archivo, Grafo grafo){
    //En este método se lee el archivo de texto y se utilizan las funciones necesarias para crear el grafo
        
        try {
            Scanner scanner = new Scanner(archivo);
            
            scanner.nextLine();
            
            while(scanner.hasNext()){
                
            
                String linea = scanner.nextLine();
                
                if(linea.equals("Rutas;")) break;

                char id = linea.charAt(8);
                
                String productos = linea.substring(10);
                
                String[] arregloProductos = productos.split(",");         
                
                Lista<String> listaProductos = new Lista<>();
                
                for(int i = 0; i < arregloProductos.length; i++){
                
                    listaProductos.agregarElemento(arregloProductos[i]);
                }
                
                Almacen almacen = new Almacen(id);
                
                almacen.setProductos(listaProductos);
                
                grafo.insertarAlmacen(almacen);
       
            }
            
            while(scanner.hasNext()){
            
                String linea = scanner.nextLine();
                
                String[] palabras = linea.split(",");
                
                grafo.insertarArista(palabras[0].charAt(0), palabras[1].charAt(0), Integer.parseInt(palabras[2]));
            }
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace();
        }
        
        
        
    }
    
}
