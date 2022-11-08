/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detik;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Detik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double jam,detik,menit;
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan detik = ");
        detik = masukan.nextInt();
        menit = 3600/60;
        jam = detik/menit;
        System.out.println("konversi jam = "+jam/menit);
        
        
    }
    
}
