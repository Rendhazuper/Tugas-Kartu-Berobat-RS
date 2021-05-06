/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspolimorphisme;

/**
 *
 * @author GAMES
 */
public class RS {
    
    private String nama;
    private String poli;
    private String gender; 
    protected int umur;
    private int nomor_kartu; 
    
    
    
    public void setNamaPasien(String nama){
        this.nama = nama;
    }
    public String getNamaPasien(){
        return nama; 
    }
    public void setPoli(String poli){
        this.poli = poli;
    }
    public String getPoli(){
        return poli;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur; 
    }
    public void setNomorKartu(int nomor_kartu){
        this.nomor_kartu = nomor_kartu;
    }
    public int getNomorKartu(){
        return nomor_kartu;
    }

    public void tampil(){
        System.out.println("Terima kasih telah memilih Rumah Sakit X, semoga diberi kesehatan dan kesembuhan");
    }
    
    
        
    }

