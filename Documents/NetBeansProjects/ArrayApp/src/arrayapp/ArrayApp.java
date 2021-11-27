/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

import java.util.ArrayList;

/**
 *
 * @author j_sta
 */
public class ArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] alumnos = {"raul", "Guillermo", "Roberto", "Reyna", "Jorge", "Alberto", "Edith"};
        System.out.println("Longitud = " + alumnos.length);

        String[] materias = new String[5];
        System.out.println("Longitud = " + materias.length);
        System.out.println("Elemento[0] = " + materias[0]);
        materias[0] = "Estructura de Datos";
        materias[1] = "Base de Datos";
        materias[2] = "Progracion Orientada a Objetos";
        materias[3] = "Programacion Web";
        materias[4] = "Ensamblador y Compiladores";
        System.out.println("Elemento [0] = " + materias[0]);
        System.out.println("Elemento [1] = " + materias[1]);
        System.out.println("Elemento [2] = " + materias[2]);
        System.out.println("Elemento [3] = " + materias[3]);
        System.out.println("Elemento [4] = " + materias[4]);

        /* tercer ejemplo*/
        float[] costos = new float[3];
        System.out.println("Longitud = " + costos.length);
        System.out.println("Elemento[0] = " + costos[0]);
        costos[0] = (float) 10.65;
        costos[1] = (float) 89.45;
        costos[2] = (float) 32.98;
        System.out.println("Elemento [0] = " + costos[0]);
        System.out.println("Elemento [1] = " + costos[1]);
        System.out.println("Elemento [2] = " + costos[2]);

        /*cuarto ejemplo*/
        float[] costos1 = {(float) 10.56, (float) 89.46, (float) 56.77, (float) 167.45};
        System.out.println("Longitud = " + costos1.length);
        System.out.println("Elemento = " + costos1[2]);

        ArrayList<Prueba> p1 = new ArrayList<Prueba>(2); //Definicion de arreglo de objettos
        Prueba prueba1 = new Prueba(1, "AC");
        p1.add(prueba1);
        Prueba prueba2 = new Prueba(2, "BA");
        p1.add(prueba2);
        System.out.println("Longitud de arrego de objetos = " + p1.size());
        System.out.println("Datos del objeto 1: "+ p1.get(0).getEstatus());

    }

}
