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
public class Array1_4 {
    public static void main(String[] args) {
        int matrikA [][] = {{7,9,5},
                            {1,5,0},
                            {4,1,2}};
        int matrikB [][] = {{5,7,3},
                            {0,4,6},
                            {3,4,5}};
        System.out.println("Matrik A");
        for (int[] matrikA1 : matrikA) {
            for (int j = 0; j < matrikA1.length; j++) {
                System.out.print(matrikA1[j] + " ");
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
            int matrikC [][] = new int[matrikA.length] [matrikA[0].length];
            System.out.println();
            System.out.println("Hasil Pengurangan");
            System.out.println();
            for (int m = 0; m < matrikC.length; m++) {
                for (int n = 0; n < matrikC[0].length; n++) {
                    matrikC[m][n] = matrikA[m] [n] - matrikB [m][n];
                    System.out.print(matrikC[m][n] + "\t");
                }
                System.out.println();
            }   System.out.println();
            System.out.println("Hasil Penjumlahan");
            System.out.println();
            for (int m = 0; m < matrikC.length; m++) {
                for (int n = 0; n < matrikC[0].length; n++) {
                    matrikC[m][n] = matrikA[m][n] + matrikB [m][n];
                    System.out.print(matrikC[m][n] + "\t");
                }
                System.out.println();
            }
        }
    }}
