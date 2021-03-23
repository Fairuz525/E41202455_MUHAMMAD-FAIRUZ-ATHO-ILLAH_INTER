/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasw3;

/**
 *
 * @author Cybernet
 */
public class Task3W3 {
    
    public static void main(String[] args) {
        int [][] number = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        for (int line = 0; line < 4; line++) {
            for (int kolom = 0; kolom < 4; kolom++){
                System.out.print(number[line][kolom]+"  ");
            }
            System.out.println("");
        }
    }     
}
