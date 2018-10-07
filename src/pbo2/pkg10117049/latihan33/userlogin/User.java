/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan33.userlogin;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
     * Kelas : PBO2 
     * Nim : 10117049 
     * Deskripsi Program : Program ini berisi program yang memerlukan username
     * dan password untuk login
 */
public class User {
    public boolean statusAkun;
    private String username = "RizkiAdam";
    private String password = "terbaikselalu";
    
    public boolean cekAkun(String parUserName, String parPassword) {
        if(parUserName.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        } else {
            statusAkun = false;
        }
        return statusAkun;
    }
    public void hasilLogin(boolean status, String parUsername) {
        if(status) {
            System.out.println("****** HALLO " + username.toUpperCase() + " ******");
            System.out.println("Selamat Datang di Aplikasi ini.");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    public void pengecekanLogin(String parUserName, String parPassword) {
        System.out.println(cekAkun(parUserName,parPassword));
        hasilLogin(statusAkun,parUserName);
    }
    
}
