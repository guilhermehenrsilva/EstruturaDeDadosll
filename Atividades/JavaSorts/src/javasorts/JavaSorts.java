/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class JavaSorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho;
            System.out.println("Tamanho do vetor:");
            tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        
            System.out.println("Dados vetor:");
        for(int i=0; i<vetor.length; i++){
            vetor[i] = scanner.nextInt();
            vetor2[i] = vetor[i];
        }//fim do for "vetor"
        
        System.out.println("Vetor original:");
        printArray(vetor);
        System.out.println("");
           
        BubbleSort.bSortComentado(vetor);
        System.out.println("Vetor ordenado");
        printArray(vetor);  
        System.out.println("");
        
        BubbleSort.bSortDecrescente(vetor2);
        System.out.println("Vetor decrescente ordenado ");
        printArray(vetor2); 
        System.out.println("");
        
    }// fim main


    
    public static void printArray(int array[]){
          for(int i=0;i<array.length;i++)
              System.out.print(array[i]+"| ");
    }// fim printArray
  
    
    
          

    }
    