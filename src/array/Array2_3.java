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
public class Array2_3 {
    public static void main(String[] args) {
              String [][] kontak = {{"Lala","08111"},{"Lili","08122"},{"Lulu","08133"}};
        
        for (String[] kontak1 : kontak) {
            System.out.println("Nama: " + kontak1[0]);
            System.out.println("Nomor:" + kontak1[1]);
            System.out.println("--------------------------");
        }

    }
}
