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
        System.out.println("Esta vacio el catalogo ? " + catalogo.estaVacio());
        catalogo.guardarElemento(new Cerveza("Cruzcampo","Trigo",
                "Española",4.5));
        catalogo.guardarElemento(new Cerveza("Paulaner","Malta",
                "Alemana",6.5));
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
        
        // Ver catalogo
        catalogo.imprimirCatalogo();
        System.out.println("Tamaño : " + catalogo.numeroElementos());
        
        // Crear lista de cervezas que queremos borrar
        
        Catalogo aBorrar = new Catalogo();
        Cerveza sanMiguel = new Cerveza("San Miguel","Trigo",
                "Española",4);
        Cerveza mahou = new Cerveza("Mahou","Trigo",
               "Española",1);
        aBorrar.guardarElemento(sanMiguel);
        aBorrar.guardarElemento(mahou);
        System.out.println("--- Vamos a borrar los siguientes elementos de"
                + " la lista");
        aBorrar.imprimirCatalogo();
        System.out.println("--- Así queda de nuevo nuestro catalogo");
        catalogo.eliminarElementos(aBorrar.getLista());
        catalogo.imprimirCatalogo();
        
        //cambiamos la alhambra normal por una roja
        catalogo.cambiarElemento(4, new Cerveza("Alhambra ROJA",
                "Trigo","Española",9.5));
        System.out.println("--- Cambiamos Alhambra normal por la ROJA");
        catalogo.imprimirCatalogo();
        //Probar metodos de eliminar
        System.out.println("--- borramos Mahou");
        aBorrar.eliminarElemento(mahou);
        aBorrar.imprimirCatalogo();
        System.out.println("--- Borramos todo:");
        aBorrar.eliminarTodos();
        aBorrar.imprimirCatalogo();
        System.out.println(aBorrar.numeroElementos());
        //Probar metodos de ordenar y buscar
        
        catalogo.ordenarGraduacion();
        System.out.println("Ordenar el catalogo por Graduacion de menor a mayor: ");
        catalogo.ordenarGraduacion();
        catalogo.imprimirCatalogo();
        System.out.println("Ordenar el catalogo por Nombre");
        catalogo.ordenarNombre();
        catalogo.imprimirCatalogo();
        System.out.println("Ordenar por gracuacion y nombre");
        catalogo.ordenarGraduacionNombre();
        catalogo.imprimirCatalogo();
        
        System.out.println("--- Añado Estrella y hago buqueda"
                + " binaria por nombre de Cruzcampo ");
        Cerveza estrella = new Cerveza("Estrella", "trigo", "Española", 6.5);
        catalogo.guardarElemento(estrella);
        catalogo.ordenarNombre();
        int posicion = catalogo.buscarElementoBinario(estrella);
        catalogo.imprimirCatalogo();
        System.out.println("Esta en la posicion : " + posicion);
        posicion = catalogo.buscarElemento(estrella);
        System.out.println("Busqueda no binaria : " + posicion);
        
        System.out.println("--- Eliminamos la posicion 3");
        catalogo.eliminarElemento(3);
        catalogo.imprimirCatalogo();
        
         
        
        
        
        
        
        
        
        
    }
}
