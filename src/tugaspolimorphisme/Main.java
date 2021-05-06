/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspolimorphisme;
import java.util.*;
/**
 *
 * @author GAMES
 */
public class Main extends RS{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        //scanner
        Scanner key = new Scanner (System.in);
        //objek 
        RS input = new RS();
        Tampil yoi = new Tampil();
        Poli_gizi ya = new Poli_gizi();
        Poli_Kandungan yeah = new Poli_Kandungan();
         do {  
        yoi.tampilkan();
        
       
            System.out.println("Pilih poliklinik : ");
            System.out.println("1.Poli Gizi");
            System.out.println("2.Poli Kandungan");
            System.out.println("3.Keluar Program");
            System.out.println("Masukan pilihan : ");
            pilih = key.nextInt();
            if (pilih == 1){
                System.out.println("============================================");
                System.out.println("     KARTU BEROBAT RUMAH SAKIT X   ");
                System.out.println("Nama : "+yoi.getNamaPasien());
                System.out.println("Umur : "+yoi.getUmur());
                System.out.println("Jenis Kelamin : "+yoi.getGender());
                System.out.println("Poliklinik : Poli Gizi");
                System.out.println("Antrian : "+ya.antrian());
                System.out.println("      Nomor Kartu :"+yoi.getNomorKartu());
                input.tampil();
                System.out.println("============================================");
            }else if (pilih == 2){
                 System.out.println("============================================");
                System.out.println("     KARTU BEROBAT RUMAH SAKIT X   ");
                System.out.println("Nama : "+yoi.getNamaPasien());
                System.out.println("Umur : "+yoi.getUmur());
                System.out.println("Jenis Kelamin : "+yoi.getGender());
                System.out.println("Poliklinik : Poli kandungan");
                System.out.println("Antrian : "+yeah.antrian());
                System.out.println("      Nomor Kartu :"+yoi.getNomorKartu());
                input.tampil();
                System.out.println("============================================");
            }
         
        
        
        } while (pilih==3);
    }
    
}
