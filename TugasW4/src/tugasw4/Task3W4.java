/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw4;

import java.util.Scanner;

public class Task3W4 {

    public static void main(String[] args) {    
    Scanner angka = new Scanner(System.in);
    
    int maksimum = 0, minimum = 0, jumlah, rata=0;
    System.out.print("Masukkan banyaknya data nilai: ");
    jumlah = angka.nextInt();
    int[] array = new int[jumlah];
    for(int i = 0; i < array.length; i++) {
      System.out.print("Masukan data nilai ke-"+ (i+1) +": " );
      array[i] = angka.nextInt();
  
      if (i == 0){
          minimum = array[i]; 
          maksimum = array[i]; 
      }
      if (array[i] < minimum) {
          minimum = array[i];
      }
      else if(array[i] > maksimum){
                 maksimum = array[i];    
      }
      rata += array[i];
    }
    angka.close();
    System.out.println("");
    System.out.println("Nilai minimum  = "+minimum);
    System.out.println("Nilai maksimum = "+maksimum);
    System.out.println("Nilai rata ratanya = "+rata / jumlah);
  }  
 }
    
