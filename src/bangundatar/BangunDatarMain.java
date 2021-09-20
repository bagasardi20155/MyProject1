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
public class BangunDatarMain {
    
    public static void main (String [] args) {
        
        PersegiPanjang pp = new PersegiPanjang();
        
        pp.lebar = 38;
        pp.panjang = 25;
        
        pp.hitungKeliling();
        pp.hitungLuas();
        
        
        
        System.out.println("-----------------------------------");
        
        Persegi persegi = new Persegi();
        
        persegi.sisi = 10;
        persegi.namaPersegi = "A";
        persegi.hitungLuasPersegi();
        persegi.hitungKelilingPersegi();
        
        System.out.println("");
        
        persegi.sisi = 15;
        persegi.namaPersegi = "B";
        persegi.hitungLuasPersegi();
        persegi.hitungKelilingPersegi();
        
        
        
        System.out.println("-----------------------------------");
        
        Lingkaran lingkaran  = new Lingkaran();
        
        lingkaran.r = 25;
        lingkaran.namaLingkaran = "X";
        lingkaran.hitungLuasLingkaran();
        lingkaran.hitungKelilingLingkaran();
        
        System.out.println("");
        
        lingkaran.r = 37;
        lingkaran.namaLingkaran = "Z";
        lingkaran.hitungLuasLingkaran();
        lingkaran.hitungKelilingLingkaran();
    }
}
