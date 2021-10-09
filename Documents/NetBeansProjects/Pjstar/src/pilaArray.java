/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j_sta
 */
public class pilaArray implements IPila {

    private static int TOP = -1;
    private Object s[];
    private int capacidad = 0;

    public pilaArray() {
        this(1000);
    }

    public pilaArray(int cap) {
        capacidad = cap;
        s = new Object[capacidad];
    }

    @Override
    public int longitud() {
        return (TOP + 1);
    }

    @Override
    public boolean esVacia() {
        return (TOP < 0);
    }

    @Override
    public void push(Object o) {
        if (longitud()<capacidad) s[++TOP]=0; 
            
        

    }

    @Override
    public Object pop() {
        Object aux;
        
        if (esVacia()) return null;
        aux = s[TOP];
        s[TOP--] = null;
        return aux;
        
                }

    @Override
    public Object primero() {
        if (esVacia()) return null;
        else return s[TOP];
            
        
    }
}
