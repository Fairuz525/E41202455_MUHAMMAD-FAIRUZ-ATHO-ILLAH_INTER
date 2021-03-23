/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw3;

import java.util.Scanner;

public class Task2W3 {

    public static void main(String[] args) {
        //membuat objek input untuk di scanner
        Scanner input = new Scanner(System.in);
        int jumblahderet = 0;
        
        System.out.print("Masukkan jumblah deret : ");
        jumblahderet = input.nextInt();
        
        int[] deretarray = new int [jumblahderet];
        
        for (int i=0; i<jumblahderet; i++) {
            deretarray[i] = (int) (Math.random()* 10);
        }
        for (int j=0; j<jumblahderet; j++) {
            System.out.print(deretarray[j]+"\t");               
        }                        
    }    
}