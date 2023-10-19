
package javatreesProjeto;

import javax.swing.JTextArea;

public class BinarySearchTree<T extends Comparable<T>>{
    Node raiz=null;
    int cont;
    public int add(T novoDado){
        Node<T> novoNo = new Node<T>(novoDado);
        cont=0;
        raiz = inserir(raiz, novoNo);
        return cont;
    }
    
    private Node<T> inserir(Node<T> raiz, Node<T> novo){
           cont++;   
           if(raiz == null)
                return novo;
            
            if(novo.dado.compareTo(raiz.dado)>=0)
                raiz.direita = inserir(raiz.direita, novo);
            else
                raiz.esquerda = inserir(raiz.esquerda, novo);
            
            return raiz; // retorna a raiz atualizada
    }
    
    public void preOrder(){
        preOrder(raiz);
    }
    private void preOrder(Node<T> raiz){
        if(raiz!=null){
            System.out.print(raiz.dado+", ");
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }// fim 
    }
    
    public void inOrder(){
        inOrder(raiz);
    }
    private void inOrder(Node<T> raiz){
        if(raiz!=null){
            inOrder(raiz.esquerda);
            System.out.print(raiz.dado+", ");
            inOrder(raiz.direita);
        }// fim 
    }
    public void postOrder(){
        postOrder(raiz);
    }
    private void postOrder(Node<T> raiz){
        if(raiz!=null){
            postOrder(raiz.esquerda);
            postOrder(raiz.direita);
            System.out.print(raiz.dado+", ");
        }// fim 
    }
    //----------------------
        
    public void preOrder(JTextArea listMostraDados){
        preOrder(raiz, listMostraDados);
        listMostraDados.append("\n");
    }
    private void preOrder(Node<T> raiz, JTextArea listMostraDados){
        if(raiz!=null){
            listMostraDados.append(raiz.dado+" |");
            preOrder(raiz.esquerda, listMostraDados);
            preOrder(raiz.direita, listMostraDados);
        }// fim 
    }

//-----------------------------
    // Busca
    
    public T buscar (T dadoBusca){
        return (T)buscar (raiz,dadoBusca);
    }
    
    private T buscar (Node<T> raiz, T dadoBusca){
        if (raiz==null)
            return null;
        if (raiz.dado.equals(dadoBusca))
            return raiz.dado;
        if (dadoBusca.compareTo(raiz.dado)<0)
            return buscar(raiz.esquerda, dadoBusca);
        else
            return buscar (raiz.direita,dadoBusca);
                    
    }
}
