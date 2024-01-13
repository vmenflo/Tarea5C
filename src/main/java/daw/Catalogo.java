/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Víctor
 */
public class Catalogo {
    //Atributos
    private ArrayList<Cerveza> lista = new ArrayList<>();
    
    //Contructores
    //Sin elementos
    public Catalogo() {
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
