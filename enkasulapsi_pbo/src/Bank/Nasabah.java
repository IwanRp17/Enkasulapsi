/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author ASUS
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
     
    }
      public Nasabah(String namaAwal, String namaAkhir, Tabungan tabungan) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.tabungan = tabungan;
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
    
        this.namaAkhir = namaAkhir;
        
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
    public String getNamaAwal() {
        return namaAwal;
    }
    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }
 
    @Override
    public String toString() {
        return "Data Nasabah||" + "namaAwal=" + namaAwal + ", namaAkhir=" + namaAkhir + ", tabungan=" + tabungan.getSaldo() + '}';
    }
    
    

}