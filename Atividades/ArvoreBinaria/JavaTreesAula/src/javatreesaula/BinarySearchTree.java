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
public class BinarySearchTree<T extends Comparable<T>>{
Node raiz = null;

public void add(T newNode){
Node<T> newNo = new Node<T>(newNode);
raiz = inserir(raiz, newNo);
}

private Node<T> inserir(Node<T> raiz, Node<T> newNode) {

 if(raiz == null){
     return newNode;
 }
 if(newNode.dado.compareTo(raiz.dado) >= 0){
     raiz.direita = inserir(raiz.direita, newNode);
 }else{
     raiz.esquerda = inserir(raiz.esquerda, newNode);
 }
 
 return raiz;
}



public void preOrder(Node<T> raiz){

 if(raiz != null){
     System.out.println(raiz.dado + " ");
     preOrder(raiz.esquerda);
     preOrder(raiz.direita);
 }
}

public void postOrder(Node<T> raiz){

 if(raiz != null){
     postOrder(raiz.esquerda);
     postOrder(raiz.direita);
     System.out.println(raiz.dado + " ");
    
 }//fim
}

public void inOrder(Node<T> raiz){
    
    if(raiz != null){
     inOrder(raiz.esquerda);
     System.out.println(raiz.dado + " "); 
     inOrder(raiz.direita);
     
    }
}
}
