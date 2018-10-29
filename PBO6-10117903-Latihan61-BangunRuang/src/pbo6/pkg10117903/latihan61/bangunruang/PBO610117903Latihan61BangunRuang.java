/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan61.bangunruang;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#.#");
        Bola ball = new Bola();
        ball.setR(7);
        System.out.print("Volume Bola : ");
        System.out.println(df.format(ball.hitungVolume())+" cm3");
        
        Tabung tb = new Tabung();
        tb.setR(10);
        tb.setT(21);
        System.out.print("Volume Tabung : ");
        System.out.println(df.format(tb.hitungVolume())+" cm3");
        
        Kerucut k = new Kerucut();
        k.setR(14);
        k.setT(9);
        System.out.print("Volume Kerucut : ");
        System.out.println(NumberFormat.getIntegerInstance().format(k.hitungVolume())+" cm3");
    }
    
}
