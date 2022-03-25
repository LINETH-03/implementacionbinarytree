package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        System.out.println("ARBOL COMPLETO");
        bt.traverseInOrder(bt.root);
        System.out.println("\n"+"ENCONTRAR UN ELEMENTO");
        System.out.println(bt.containsNode(10));

        System.out.println("ELIMINAR UN ELEMENTO ");
        System.out.println(bt.containsNode(7));
        bt.delete(7);
        System.out.println(bt.containsNode(7));



        System.out.println("\n"+"BUSQUEDA EN  PROFUNDIDAD PRIMERO");
        System.out.println("\n"+"INORDEN");
        bt.traverseInOrder(bt.root);
        System.out.println("\n"+"PREORDEN");
        bt.traversePreOrder(bt.root);
        System.out.println("\n"+"POSORDER");
        bt.traversePostOrder(bt.root);
        System.out.println("\n"+"Busqueda primero en amplitud");
        bt.traverseLevelOrder();





    }

}
