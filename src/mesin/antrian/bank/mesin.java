/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesin.antrian.bank;

/**
 *
 * @author User ID
 */
public class mesin {
 
private int no_urut_tel,no_urut_cs,jenis_layanan;

    public mesin()
    {
        
    }

    mesin(int tampung) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tombol(int tampung)
    {
        jenis_layanan=tampung;
    }
    
    public int get_nomorurut()
    {
        if(jenis_layanan==1)
        {
            //no_urut_tel=jenis_layanan;
            no_urut_tel++;
            return no_urut_tel;
        }
        else 
        {
            //no_urut_cs=jenis_layanan;
            no_urut_cs++;
            return no_urut_cs;
        }
    }
    
    
    public void get_jenis_layanan()
           
    {
    switch (jenis_layanan) {
        case 1:
            System.out.println("\n     Selamat Datang\n            Di\n     Bank Kelompok 61");
            System.out.printf("\nNomor Antrian anda : %d\n",get_nomorurut());
            System.out.println("\nLayanan : Transaksi Teller\n");
            System.out.println("Mohon Bersabar ini Antrian\n");
            break;
        case 2:
            System.out.println("\n     Selamat Datang\n            Di\n     Bank Kelompok 61");
            System.out.printf("\nNomor Antrian anda : %d\n",get_nomorurut());
            System.out.println("\nLayanan : Transaksi Customer Service\n");
            System.out.println("Mohon Bersabar ini Antrian\n");
            break;
        default:
            System.out.println("Format Salah");
            break;
    }          
    }

    void getJenis_layanan(int tampung, int counttel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNo_urut_tel(int tampung) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNo_urut_cs(int tampung) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

