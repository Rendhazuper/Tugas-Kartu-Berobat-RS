
package tugaspolimorphisme;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author GAMES
 */
public class Poli_Kandungan extends RS{
    Random angka = new Random(); 
    
    int antrian(){
        int antrian = angka.nextInt(50);
        return antrian;
}
}

