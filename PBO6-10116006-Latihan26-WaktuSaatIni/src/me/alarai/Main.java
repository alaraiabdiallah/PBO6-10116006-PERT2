package me.alarai;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program waktu saat ini
 * */
public class Main {

    public static void main(String[] args) {
        String[] hariIndo = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        LocalDateTime waktu = LocalDateTime.now();
        String tanggal = waktu.format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss"));
        int dayOfWeek = waktu.getDayOfWeek().getValue();
        System.out.println("Hari ini adalah hari " + hariIndo[dayOfWeek- 1] +", "+ tanggal);
    }
}
