/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatreesaula;

/**
 *
 * @author guilh
 */
public class JavaTreesAula {
public static void main(String[] args) {
BinarySearchTree tree = new BinarySearchTree();

 tree.add(new Aluno(30,"Athos"));
 tree.add(new Aluno(50,"Ryan"));
 tree.add(new Aluno(40,"Luiz"));
 tree.add(new Aluno(45,"Sabrina"));
 tree.add(new Aluno(15,"Andre"));

 
    System.out.println("pre Ordem");
    //tree.inOrder();
    
 
 //tree.postOrder();
}

 }
   