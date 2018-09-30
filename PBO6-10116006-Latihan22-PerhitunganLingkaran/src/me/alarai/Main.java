package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program perhitungan lingkaran
 * */
public class Main {
    public static double inputDiameter(){
        System.out.print("Masukkan nilai diameter lingkaran : ");
        Scanner scan = new Scanner(System.in);
        double diameter;
        try{
            diameter = Double.parseDouble(scan.nextLine());
            return diameter;
        }catch(NumberFormatException e){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println();
            return inputDiameter();
        }

    }
    public static void main(String[] args) {
        System.out.println("====== Perhitungan Lingkaran ======");
        double diameter = inputDiameter();
        double jari = diameter / 2;
        double luas = Math.PI * (jari * jari);
        double keliling = Math.PI * diameter;
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.println("Jari-jari lingkaran = "+String.format("%.0f",jari)+" cm");
        System.out.println("Luas lingkaran \t\t= "+String.format("%.02f",luas).replace('.',',')+" cm");
        System.out.println("Keliling lingkaran \t= "+String.format("%.02f",keliling).replace('.',',')+" cm");
    }
}
