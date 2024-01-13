/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Víctor
 */
public class Catalogo {

    //Atributos
    private ArrayList<Cerveza> lista = new ArrayList<>();
    private Comparator<Cerveza> ordenarNombre
            = (e1, e2)
            -> e1.getNombre().compareToIgnoreCase(e2.getNombre());
     private Comparator<Cerveza> ordenarGraduacion
            = (e1, e2)
            -> Double.compare(e1.getGraduacion(), e2.getGraduacion());
    //METODOS

    //Contructor Sin elementos
    public Catalogo() {
    }

    //Devuelve el número de elementos
    public int numeroElementos() {
        return lista.size();
    }

    //Devuelve si está vacio
    public boolean estaVacio() {
        return lista.isEmpty();
    }

    //Devuelve un elemento
    public void verElemento(int posicion) {
        System.out.println(lista.get(posicion));
    }

    //Cambia elemento
    public void cambiarElemento(int posicion, Cerveza cerveza) {
        lista.add(posicion, cerveza);
    }

    //Guardar elemento
    public void guardarElemento(Cerveza cerveza) {
        lista.add(cerveza);
    }

    //Eleminar elemento
    public void eliminarElemento(int posicion) {
        lista.remove(posicion);
    }

    //Eliminar elemento especificado
    public void eliminarElemento(Cerveza cerveza) {
        lista.remove(cerveza);
    }

    //eliminarElementos
    public void eliminarElementos(ArrayList<Cerveza> listaABorrar) {
        lista.removeAll(listaABorrar);
    }

    //Eliminar todos los elementos
    public void eliminarTodos() {
        lista.removeAll(lista);
    }

    //Imprimir el catalogo
    public void imprimirCatalogo() {
        lista.forEach(System.out::println);
    }

    //Buscar un objeto en la lista y devuelve posicion
    public int buscarElemento(Cerveza c) {
        return lista.indexOf(c);
    }

    //Metodos de ordenacion usando sort
    //Por nombre
    public void ordenarNombre() {
        lista.sort(ordenarNombre);
    }
    //Por graduacion
    public void ordenarGraduacion(){
        lista.sort(ordenarGraduacion);
    }
    
    //Por graduación y nombre
    public void ordenarGraduacionNombre(){
        lista.sort(ordenarGraduacion.thenComparing(ordenarNombre));
    }
    
    //Busqueda
    public int buscarElementoBinario(Cerveza c){
       Cerveza x = new Cerveza();
       x.setNombre(c.getNombre());
       return Collections.binarySearch(lista, x, ordenarNombre);
        
    }

    // Getter and Setter
    public ArrayList<Cerveza> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cerveza> lista) {
        this.lista = lista;
    }

    //To String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogo{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }

    //Equals y HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.lista);
        return hash;
    }

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
        final Catalogo other = (Catalogo) obj;
        return Objects.equals(this.lista, other.lista);
    }

}
