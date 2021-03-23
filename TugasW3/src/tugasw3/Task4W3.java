/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw3;

import java.util.Scanner;
/**
 *
 * @author Cybernet
 */
public class Task4W3 {

    public static void main(String[] args) {
         Scanner beli = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("          Kharisma Agung Plaza < KAP >");
        System.out.println("            Promo Belanja Berhadiah");
        System.out.println("        Khusus Pembelian 5 Barang Pertama");
        System.out.println("         Dengan harga minimum Rp 10000,00");
        System.out.println("---------------------------------------------");
        
        // Nama Pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = beli.nextLine();
        System.out.println();
        // Harga Barang
        System.out.print("Masukkan harga barang ke-1  : ");
            int harga1 = beli.nextInt();
        System.out.print("Masukkan harga barang ke-2  : ");
            int harga2 = beli.nextInt();
        System.out.print("Masukkan harga barang ke-3  : ");
            int harga3 = beli.nextInt();
        System.out.print("Masukkan harga barang ke-4  : ");
            int harga4 = beli.nextInt();
        System.out.print("Masukkan harga barang ke-5  : ");
            int harga5 = beli.nextInt();
        // Total
        int total = harga1 + harga2 + harga3 + harga4 + harga5;
        
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println();
        System.out.println("Selamat.....");
        System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("                 Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");   
    }  
}
  
