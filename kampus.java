/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTestBAB5;

public class kampus {
    private String nama;
    private String kegunaan;
    private String isi;

    public kampus(String namax, String kegunaanx, String isix) {
        this.nama = namax;
        this.kegunaan = kegunaanx;
        this.isi = isix;
    }
    public void view(){
        
        System.out.println("Nama Gedung : "+nama);
        System.out.println("Di Gunakan Untuk : "+kegunaan);
        System.out.println("Berisi Tentang : "+isi);
        System.out.println("_______________________________");
    }
    }