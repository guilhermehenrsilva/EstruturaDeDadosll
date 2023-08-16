package javasorts;

import java.util.Scanner;

public class SeletionSort {
    private static int indexMinArray(int array[], int posAtual){
        int k = posAtual;//K indice do menor
        for (int i=posAtual +1 ; i<array.length ; i++)
        if (array[i]<array[k])
            k = i;
        return k; // indice do menor valor
    }
//------------------------------------------------------------------------------
    public static void sSort(int array[]){
        for(int i=0; i < array.length-1; i++){
        int k = indexMinArray(array,i);
        //trocar os valores de i com k 
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
        }
    }
//------------------------------------------------------------------------------
    public static void sSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i < array.length-1; i++){
        System.out.println("Fase -> " + i);
        int k = indexMinArray(array,i);
        System.out.println("\n Atual: "+ array[i] + " Trocando com o menor "+array[k]);
        scanner.nextLine();
        //trocar os valores de i com k 
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
//------------------------------------------------------------------------------

    JavaSorts.printArray(array);
    scanner.nextLine();//pause
        }
    }
}
