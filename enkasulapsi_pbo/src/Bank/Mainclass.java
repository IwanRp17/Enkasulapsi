/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author MSI TRIDENT
 */
public class Mainclass {

    public static void main(String args[]) {
        int tmp;
        boolean status;
        Nasabah nasabah1 = new Nasabah("Budiman", "Namun tidak");
        System.out.println("Nasabah atas nama : " + nasabah1.getNamaAwal() + " " + nasabah1.getNamaAkhir());
        
        nasabah1.setTabungan(new Tabungan(10000));
        tmp = nasabah1.getTabungan().getSaldo();
        System.out.println("Saldo awal : " + tmp);
        
        nasabah1.getTabungan().simpanUang(4000);
        tmp = nasabah1.getTabungan().getSaldo();
        System.out.println("Jumlah uang yang disimpan : 4000");
        System.out.println("Saldo sekarang = " + tmp);
  
        status = nasabah1.getTabungan().ambilUang(5000);
        System.out.print("Jumlah uang yang diambil : 5000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }        
        tmp = nasabah1.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

    
            
       System.out.println();
       Nasabah nasabah2 = new Nasabah("Sumadi", "Madi");
       System.out.println("Nasabah atas nama : " + nasabah2.getNamaAwal() + " " + nasabah2.getNamaAkhir());
       
       nasabah2.setTabungan(new Tabungan(3000));
       nasabah2.getTabungan().simpanUang(7000);
       System.out.println("Jumlah uang yang disimpan : 7000");
       status = nasabah2.getTabungan().ambilUang(6000);
       System.out.print("Jumlah uang yang diambil : 6000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        } 
       
       tmp = nasabah1.getTabungan().getSaldo();
       System.out.println("Saldo sekarang = " + tmp);
       
       System.out.println();
       System.out.println(nasabah1.toString());
       System.out.println(nasabah2.toString());
        
       nasabah2.getTabungan().transfer(nasabah1.getTabungan(),1000);
      
       System.out.println();
       System.out.println("transfer");
       System.out.println("jumlah yang ditransfer Sumadi=1000");
       System.out.println(nasabah2.toString());
       System.out.println(nasabah1.toString());

    }
}