/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author gpucheta
 */
public class PilaArray implements IPila{

    private int top = -1;
    private Object s[];
    private int capacidad = 0;

    public PilaArray() {
        this(500);
    }

    public PilaArray(int cap) {
        capacidad = cap;
        s = new Object[capacidad];
    }

    public int longitud() {
        return (top + 1);
    }

    public boolean esVacia() {
        return (top < 0);
    }

    public void push(Object o) {
        if(longitud()<capacidad) s[++top] = o;
    }

    public Object pop() {
        Object aux;
        
        if(esVacia()) return null;
        aux = s[top];
        s[top--] = null;
        return aux;        
    }

    public Object primero() {
        if(esVacia()) return null;
        else return s[top];
    }
}
