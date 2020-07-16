/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author LENOVO
 */
public class Array1_3 {
    public static void main(String[] args) {
            int matrikA [][] = {{7,9,5},
                            {1,5,0},
                            {4,1,2}};
        int matrikB [][] = {{5,7,3},
                            {0,4,6},
                            {3,4,5}};
        System.out.println("Matrik A");
        for (int i = 0 ; i < matrikA.length ; i++)
        {
            for (int j= 0 ; j< matrikA[i].length ;j++)
            {
                System.out.print(matrikA [i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Matrik B");
        for (int[] matrikB1 : matrikB) {
            for (int l = 0; l < matrikB [0].length; l++) {
                System.out.print(matrikB1[l] + " ");
            }
            System.out.println();
        }

    }
  
}
