/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author Víctor
 */
public class Cerveza {
    //Atributos
    private String nombre;
    private String tipo;
    private String procedencia;
    private double graduacion;
    
    //Constructores
    //Vacio
    public Cerveza() {
    }
    
    // Con parametros
    public Cerveza(String nombre, String tipo, String procedencia, double graduacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.procedencia = procedencia;
        this.graduacion = graduacion;
    }

    //Copiar Objeto
    public Cerveza(Cerveza original) {
        this.nombre = original.nombre;
        this.tipo = original.tipo;
        this.procedencia = original.procedencia;
        this.graduacion = original.graduacion;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }
    
    //TO String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cerveza{");
        sb.append("nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", procedencia=").append(procedencia);
        sb.append(", graduacion=").append(graduacion);
        sb.append('}');
        return sb.toString();
    }
    
    //Equals y Hash

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.tipo);
        hash = 47 * hash + Objects.hashCode(this.procedencia);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.graduacion) ^ (Double.doubleToLongBits(this.graduacion) >>> 32));
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
        final Cerveza other = (Cerveza) obj;
        if (Double.doubleToLongBits(this.graduacion) != Double.doubleToLongBits(other.graduacion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return Objects.equals(this.procedencia, other.procedencia);
    }
    
    
    
}
