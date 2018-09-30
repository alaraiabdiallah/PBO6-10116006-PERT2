package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program mengganti kata
 * */
public class Main {
    public static String kalimat(){
        System.out.print("Masukkan Kalimat : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static String yangdiganti(){
        System.out.print("Ganti Kata : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String pengganti(){
        System.out.print("Menjadi Kata : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
        System.out.println("====== Program Mengganti Kata ======");
        System.out.println();
        String kalimat = kalimat();
        String yangdiganti = yangdiganti();
        String pengganti = pengganti();
        System.out.println();
        System.out.println("====== HASIL FORMATTING ======");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+kalimat.replace(yangdiganti,pengganti));
    }
}
