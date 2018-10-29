/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan61.bangunruang;

/**
 *
 * @author yongki
 */
public class Kerucut extends BangunRuang{
    private double r,t;

    public void setR(double r) {
        this.r = r;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    @Override
    public double hitungVolume() {
    return 22*(r*r)*t/3/7;
    
    }
    
}
