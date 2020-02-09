/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Negocio.Excepcion.ExcepcionOrdenArbolInvalido;
import java.util.Scanner;

/**
 *
 *
 */
public class ArbolTest {
    public static void main(String[] args) throws ExcepcionOrdenArbolInvalido {
        /*IArbolBusqueda<Integer> unArbol= new ArbolMViasBusqueda<>(4);*/
        ArbolMViasBusqueda<String> unArbol = new ArbolMViasBusqueda<>(4);

    
        Palabra word=new Palabra("mom","mama");
        //unArbol.insertar("word1");
        //Palabra word1=new Palabra("hello","hola");
        /*unArbol.insertar(word1);
        Palabra word2=new Palabra("aunt","tia");
        unArbol.insertar(word2);
        Palabra word3=new Palabra("sad", "triste");
        unArbol.insertar(word3);
        Palabra word4=new Palabra("duck", "pato");
        unArbol.insertar(word4);
        Palabra word5=new Palabra("cat", "gato mishi");
        unArbol.insertar(word5);
        Palabra word6=new Palabra("hi", "hola");
        unArbol.insertar(word6);*/
        
        System.out.println(unArbol.recorridoEnInOrden());
        System.out.println(unArbol.size());
        
    } 
    
}