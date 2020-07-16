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
public class Array1_2 {
    public static void main(String[] args) {
             int matrik [][] = {{1,2},{3,4}};
                
        for (int[] matrik1 : matrik) {
            for (int b = 0; b < matrik[0].length; b++) {
                System.out.print(matrik1[b] + "  ");
            }
            System.out.println("     ");
        }

    }
   
}
