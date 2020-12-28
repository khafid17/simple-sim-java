/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTestBAB5;

public class masjid extends kampus{
    private String tahmir;

    public masjid(String tahmirx, String namax, String kegunaanx, String isix) {
        super(namax, kegunaanx, isix);
        this.tahmir = tahmirx;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Tugas Tahmir : "+tahmir);
        System.out.println("_______________________________");
    }
    
    
    
}
