/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author Víctor
 */
public class Main {
    public static void main(String[] args) {
        //Creamos una lista y la rellenamos con varios objetos Cerveza
        
        Catalogo catalogo = new Catalogo();
        catalogo.guardarElemento(new Cerveza("Cruzcampo","Trigo",
                "Española",4.5));
        catalogo.guardarElemento(new Cerveza("Paulaner","Malta",
                "Alemana",7.5));
        catalogo.guardarElemento(new Cerveza("Heineken","Pilsen",
                "Holandesa",6.5));
        catalogo.guardarElemento(new Cerveza("Judas","Strong Ale",
                "Belga",8.5));
        catalogo.guardarElemento(new Cerveza("San Miguel","Trigo",
                "Española",4));
        catalogo.guardarElemento(new Cerveza("Mahou","Trigo",
                "Española",1));
        catalogo.guardarElemento(new Cerveza("Alhambra","Trigo",
                "Española",5.5));
        
        // Verlo
        catalogo.imprimirCatalogo();
        
        
    }
}
