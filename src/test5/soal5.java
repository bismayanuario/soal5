/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        
        String kataasli, katabalik = "";
        
        System.out.print("Masukan Kata : ");
        kataasli = masukan.nextLine();
        int panjang = kataasli.length();
        
        for(int a=panjang-1; a>=0; a--){
            katabalik = katabalik + kataasli.charAt(a);
        }
        if (kataasli.equals(katabalik)){
            System.out.println("Kata termasuk Palindrome");
        }
        else{
            System.out.println("Kata bukan termasuk Palindrome");
        }
    }
    
}
