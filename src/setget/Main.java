/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setget;

/**
 *
 * @author MOKLET-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SetGet java = new SetGet();
        
        java.setLaptop("Asus");
        java.setTipe("VivoBook");
        java.setJumlah(1);
        java.setHarga(8000000);
        
        System.out.println("Merk Laptop : " +java.getLaptop());
        System.out.println("Tipe : " +java.getTipe());
        System.out.println("Jumlah : "+java.getJumlah());
        System.out.println("Harga : "+java.getHarga());
        
    }
    
}
