/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Predator
 */
public class Lingkaran {
    
    //atribut
    public String namaLingkaran;
    public int r;
    
    //method
    public void hitungLuasLingkaran() {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran " + namaLingkaran + " adalah : " + luas);
    }
    
    public void hitungKelilingLingkaran() {
        double keliling = 3.14 * 2 * r;
        System.out.println("Keliling Lingkaran " + namaLingkaran + " adalah : " + keliling);
    }
}
