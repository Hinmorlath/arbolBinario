/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreesproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gateway
 */
public class BinaryTreeProject {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        char respuesta;
        int dato;
        
        System.out.println("---------------------------------------------------");
        System.out.println("Programa que crea un árbol binario");
        
        BinaryTree arbol = new BinaryTree();
        
        do{
            System.out.println("Escribe dato para ingresar al árbol: ");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            
            arbol.add(dato);
            System.out.println("Escribe  n  para parar, cualquier otra tecla para ingresar otro dato: ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
        } while ( respuesta != 'n');
        
        System.out.println("Recorrido del árbol en preorder: ");
        arbol.preorden(arbol.root);
    }
    
}
