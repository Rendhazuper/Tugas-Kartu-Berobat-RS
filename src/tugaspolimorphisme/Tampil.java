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
public class Tampil extends RS {
Scanner input = new Scanner(System.in);

    public void tampilkan (){
        
        System.out.println("Selamat Datang di Rumah Sakit X"); 
        System.out.println("Informasi Pasien");
        System.out.print("Masukan nomor kartu pasien : ");
        setNomorKartu(input.nextInt());
        System.out.print("Nama : ");
        setNamaPasien(input.next());
        System.out.print("Umur : ");
        setUmur(input.nextInt());
        System.out.print("Jenis Kelamin : ");
        setGender(input.next());
        
        
         
          
                 
    }
}
