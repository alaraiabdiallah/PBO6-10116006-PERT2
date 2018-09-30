package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perhitungan saldo tabungan
 * */
public class Main {

    public static void main(String[] args) {
        int    saldo     = 2500000;
        double bunga     = 15;
        int    lamaNabung= 6;

        for (int i = 1; i <= lamaNabung;i++){
            saldo += (saldo * (bunga/100));
            String saldoFormatted = String.format("%,d",saldo).replace(',','.');
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+saldoFormatted);
        }

    }
}
