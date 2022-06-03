/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafosPkg;

import java.util.Objects;

/**
 *
 * @author Ruldin Ayala Preguntas: Para qué sirve la implementación Comparable?
 * y porqué es de tipo Nodo
 */
public class Nodo implements Comparable<Nodo>{

    private String nombre;
    private int distancia = Integer.MAX_VALUE;
    private Nodo procedencia = null;

    public Nodo(String x, int d, Nodo p) {
        nombre = x;
        distancia = d;
        procedencia = p;
    }

    public Nodo(String x) {
        this(x, 0, null);
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public Nodo getProcedencia() {
        return procedencia;
    }

    @Override
    public int compareTo(Nodo tmp) {
        return this.distancia - tmp.distancia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
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
        final Nodo other = (Nodo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
