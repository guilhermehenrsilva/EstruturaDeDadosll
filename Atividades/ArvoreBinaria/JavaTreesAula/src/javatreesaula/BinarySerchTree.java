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
public class BinarySerchTree <T extends Comparable<T>>{
    Node raiz = null;
    public void add (T novoDado){
        Node<T> novoNo = new Node<T> (novoDado);
        raiz = inserir(raiz, novoNo);
    }
    private Node<T> inserir (Node<T>) raiz, Node<T> novoNode){
        
    }
}
