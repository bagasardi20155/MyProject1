/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Predator
 */
public class Kerucut {
    
    //atribut
    public int r;
    public int s;
    public int t;
    
    //method
    public void hitungVolumeKerucut() {
        double vol = ((3.14 * r * r) * t ) / 3;
        System.out.println("Volume Kerucut adalah : " + vol);
    }
    
    public void hitungSelimutKerucut() {
        double selimut = 3.14 * r * (r + s);
        System.out.println("Luas Selimut Kerucut adalah : " + selimut);
    }
    
}
