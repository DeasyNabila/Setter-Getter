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
public class SetGet {
    private String laptop;
    private String tipe;
    private int jumlah;
    private double harga;
    
    public void setLaptop(String laptop){
        this.laptop = laptop;
    }
    
    public String getLaptop(){
        return laptop;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double getHarga(){
        return harga;
    }
}
