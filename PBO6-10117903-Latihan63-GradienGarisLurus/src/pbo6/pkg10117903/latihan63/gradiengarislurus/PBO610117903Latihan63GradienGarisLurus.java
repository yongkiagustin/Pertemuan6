/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan63.gradiengarislurus;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k1,k2;
        k1 = new Koordinat(2, 5, 10, 7);
        System.out.println("Garis Yang Melalui Titik (2,10) dan (5,7)\n"
                + "Memiliki gradien sebesar "+k1.HitungGradien());
        k2 =  new Koordinat(5, 3, 1, 12);
        System.out.println("Garis Yang Melalui Titik (5,1) dan (3,12)\n"
                + "Memiliki gradien sebesar "+k2.HitungGradien());
    
    }
    
}
