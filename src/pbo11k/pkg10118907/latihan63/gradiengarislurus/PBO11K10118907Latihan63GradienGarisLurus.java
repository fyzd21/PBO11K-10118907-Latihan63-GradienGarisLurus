/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan gradien garis lurus
 * 
 */
public class PBO11K10118907Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k = new Koordinat(2, 5, 10, 7);
        System.out.println("Garis yang melalui titik ("+k.getX1()+","+k.getY1()+") dan ("+k.getX2()+","+k.getY2()+") memiliki gradien sebesar "+k.hitungGradien());
        Koordinat k2 = new Koordinat(5, 3, 1, 12);
        System.out.println("Garis yang melalui titik ("+k2.getX1()+","+k2.getY1()+") dan ("+k2.getX2()+","+k2.getY2()+") memiliki gradien sebesar "+k2.hitungGradien());
    }
    
}
