package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program rata rata nilai mahasiswa
 * */
public class Main {
    public static int jumlahMahasiswa(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static double nilaiMahasiswa(int i){
        System.out.print("Nilai Mahasiswa ke-"+i+" : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static void main(String[] args) {
        int jumlahMhs = jumlahMahasiswa();
        double jumlahNilai = 0;
        for (int i = 1; i <= jumlahMhs; i++){
            jumlahNilai += nilaiMahasiswa(i);
        }

        double rata2 = jumlahNilai / jumlahMhs;
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata2);
        System.out.println("Developed by : Ala Rai AbdiAllah");
    }
}
