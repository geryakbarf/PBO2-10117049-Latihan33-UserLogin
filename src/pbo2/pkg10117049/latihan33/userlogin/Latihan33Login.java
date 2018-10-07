/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 */
public class Latihan33Login {

    private String usName;
    private String passWord;

    /**
     * @param args the command line arguments 
     * Nama : Gery Akbar Fauzi 
     * Kelas : PBO2 
     * Nim : 10117049 
     * Deskripsi Program : Program ini berisi program yang memerlukan username
     * dan password untuk login
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User masuk = new User();
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Username\t: ");
        String user = scn.next();
        System.out.print("Masukkan Password\t: ");
        String pass = scn.next();
        System.out.println();
        
        masuk.pengecekanLogin(user,pass);
    }

}
