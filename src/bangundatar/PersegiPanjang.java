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
public class PersegiPanjang {
    
    //atribut
    public int panjang;
    public int lebar;
    
    //method
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
    
    public void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang adalah : " + keliling);
    }
}
