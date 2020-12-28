/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTestBAB5;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        kampus k;
        fakultas fks = new fakultas("Pengajar","seorang yang menuntut ilmu","Fakultas Teknologi Industri","tempat perkuliahan","sarana perkuliahan");
        masjid mjd = new masjid("Merawat Masjid","Masjid","Tempat Beribadah","Sarana Ibadah");
        perpustakaan ps = new  perpustakaan(102,"Ekonomi Teknik","Perpustakaan","Tempat mencari reverensi Buku","Buku");
        
        k = fks;
        k.view();
        k = mjd;
        k.view();
        k = ps;
        k.view();
    }
    
}
