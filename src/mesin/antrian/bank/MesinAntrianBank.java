/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesin.antrian.bank;

import java.util.Scanner;

/**
 *
 * @author User ID
 */
public class MesinAntrianBank {

    static String kelompok(String kel){
            return kel;
    }
    static String praktikan1(String Mudzik){
        return Mudzik;
    }
    static String praktikan2(){
        return "Fitra Adina Nuzulia 21120119140130";
    }
    public void pembatas(){
        System.out.println("----------------------------------");
        System.out.println("Selamat Datang di Bank Kelompok 61");
    }
    
    public static void main(String[] args) {
        System.out.println(kelompok("Kelompok 61"));
       
        System.out.println(praktikan1("Mudzik Al Fahri 21120119130100"));
        System.out.println(praktikan2());
        
        MesinAntrianBank batas = new MesinAntrianBank(); 
        batas.pembatas();
       
       Scanner scan= new Scanner(System.in);
        int tampung=0,counttel=0,countcs=0;
        
        mesin x = new mesin();
       
        while(tampung>=0)
        {
            System.out.println("Masukkan jenis layanan :\nTekan 1 untuk Transaksi Teller\nTekan 2 untuk Costumer Service");
            tampung=scan.nextInt();
            x.tombol(tampung);
            x.get_jenis_layanan();
        if(tampung!=1 & tampung !=2)
        break;
        }      
    }
}

   
    
