package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perhitungan tunjangan dari gaji
 * */
public class Main {

    public static String getStatus(){
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static double getGaji(){
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("=================Program Tunjangan=================");

        double gaji = getGaji();
        String status = getStatus();
        double tunjangan = (status.equals("Menikah"))? (gaji * 0.35) : 0;
        System.out.println();
        System.out.println("===========Hasil Perhitungan Gaji Anda===========");
        System.out.println("Gaji Pokok \t\t : Rp "+gaji);
        System.out.println("Tunjangan \t\t : Rp "+tunjangan);
        System.out.println("Total Gaji \t\t : Rp "+(gaji+tunjangan));
        System.out.println("(Developed By: Ala Rai AbdiAllah)");
    }
}
