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
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        PilaArray pilaArray = new PilaArray();
        System.out.println("ES VACIA -->" + pilaArray.esVacia());
        System.out.println("LONGITUD -->" + pilaArray.longitud());
        
        System.out.println("POP -->" + pilaArray.pop());
        System.out.println("PRIMERO -->" + pilaArray.primero());
    }

}
