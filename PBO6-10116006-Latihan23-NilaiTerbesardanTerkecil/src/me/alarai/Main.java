package me.alarai;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menentukan nilai terbesar dan terkecil
 * */
public class Main {
    public static String inputPetugas(){
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static int jumlahMahasiswa(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static int nilaiMahasiswa(int i){
        System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void tampilkan(int[] nilai){
        for (int i = 1; i <= nilai.length ; i++){
            System.out.println("Nilai Mahasiswa ke-"+i+" = "+ nilai[i - 1]);
        }
    }
    public static void main(String[] args) {
        System.out.println("========= Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =========");
        String petugas = inputPetugas();
        int jumlahMhs = jumlahMahasiswa();
        int[] nilai = new int[jumlahMhs];
        for (int i = 1; i <= jumlahMhs; i++){
            nilai[i-1] = nilaiMahasiswa(i);
        }

        System.out.println();
        System.out.println("======== Hasil Nilai Mahasiswa ========");
        tampilkan(nilai); // tampilkan array nilai

        Arrays.sort(nilai); // urutkan array
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+nilai[jumlahMhs-1]);
        System.out.println("Nilai Terkecil adalah "+nilai[0]);
        System.out.println();
        System.out.println("Petugas : "+ petugas);
    }
}
