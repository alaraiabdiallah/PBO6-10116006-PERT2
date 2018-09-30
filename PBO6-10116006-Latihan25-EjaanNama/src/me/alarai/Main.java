package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program eja nama
 * */
public class Main {
    public static String inputNama(){
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
	    String nama = inputNama();
	    System.out.println();
        System.out.println("Ejaan untuk \""+nama+"\" adalah : ");
        for (int i = 1; i <= nama.length(); i++){
            System.out.println("Huruf ke-"+i+" : "+nama.charAt(i-1));
        }
    }
}
