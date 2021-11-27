/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author j_sta
 */
public class BinaryTreeImpl implements IBinaryTree {

    @Override
    public void insert(Nodo nodo, int value) {
        if (value < nodo.getValue()) {
            if (nodo.getLeft() != null) {
                insert(nodo.getLeft(), value);

            } else {
                System.out.println("Inserted" + value + "to left of" + nodo.getValue);
                nodo.setLeft(new Nodo(value));
            }

        } else if (value > nodo.getValue()) {
            if (nodo.getRight() != null) {
                insert(nodo.getRight(), value);
            } else {
                System.out.println(" Inserted" + value + "to right of" + nodo.getValue);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void traverseInOrder(Nodo nodo) {
        if (nodo != null) {
            traverseInOrder(nodo.getLeft());
            System.out.print("  " + nodo.getValue());
            traverseInOrder(nodo.getRight());
            }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
        

    

