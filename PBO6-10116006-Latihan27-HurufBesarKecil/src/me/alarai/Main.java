package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program format text besar dan kecil
 * */
public class Main {
    public static String kalimat(){
        System.out.print("Masukkan Kalimat : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
	    String kalimat = kalimat();
	    System.out.println("====== HASIL FORMATTING ======");
        System.out.println("Huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
}
