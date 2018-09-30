package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perbandingan 2 nilai
 * */
public class Main {

    public static String perintahUlangi(){
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().toLowerCase();
    }

    public static int nilai(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        String ulangi = "ya";
        System.out.println("========== Program Perbandingan Nilai ==========");
        do {
            int nilai1 = nilai("Masukkan nilai pertama : ");
            int nilai2 = nilai("Masukkan nilai kedua : ");
            String ket = null;
            if (nilai1 > nilai2){
                ket = " Lebih besar dari ";
            }else if(nilai1 < nilai2){
                ket = " Lebih kecil dari ";
            }else if(nilai1 == nilai2){
                ket = " Sama dengan ";
            }
            System.out.println("Hasil : "+nilai1+ket+nilai2);
            System.out.println();
            ulangi = perintahUlangi();
            System.out.println();
        }while(ulangi.equals("ya"));
    }
}
