/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw4;

import java.util.Scanner;

public class Task1W4 {

    public static void main(String[] args) {
        Scanner angka = new Scanner (System.in);
        int a;
        int b;
        
        System.out.print("Masukkan Batas Awal  : ");
        a=angka.nextInt();
        
        System.out.print("Masukkan Batas Akhir : ");
        b=angka.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i % 2 ==0)
               System.out.print(i + " " );
        }   
    }   
}
