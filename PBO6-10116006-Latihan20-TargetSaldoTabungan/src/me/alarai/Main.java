package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perhitungan saldo tabungan berdasarkan target
 * */
public class Main {

    public static void main(String[] args) {
        int    saldo     = 3500000;
        double bunga     = 8;
        int    target    = 6000000;

        int i = 1;
        do {
            saldo += (saldo * (bunga/100));
            String saldoFormatted = String.format("%,d",saldo).replace(',','.');
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+saldoFormatted);
            i++;
        }while(saldo < target);

    }
}
