/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTestBAB5;

public class perpustakaan extends kampus {
    private int kode;
    String nama_buku;

    public perpustakaan(int kodex, String nama_bukux, String namax, String kegunaanx, String isix) {
        super(namax, kegunaanx, isix);
        this.kode = kodex;
        this.nama_buku = nama_bukux;
    }
    public void view(){
        super.view();
        System.out.println("Kode Buku : "+kode);
        System.out.println("Nama Buku : "+nama_buku);
        System.out.println("_______________________________");
    }
    
    
}
