/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTestBAB5;

public class fakultas extends kampus{
    private String data_dosen;
    private String data_mahasiswa;

    public fakultas(String data_dosenx, String data_mahasiswax, String namax, String kegunaanx, String isix) {
        super(namax, kegunaanx, isix);
        this.data_dosen = data_dosenx;
        this.data_mahasiswa = data_mahasiswax;
    }
    public void view(){
        super.view();
        System.out.println("Status Dosen : "+data_dosen);
        System.out.println("Status Mahasiswa : "+data_mahasiswa);
        System.out.println("_______________________________");
    
    }
}
