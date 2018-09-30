package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program cakep
 * */
public class Main {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static String jawab(){
        System.out.print(BLUE+"Jawab"+RED+" (Yoi/Enggak): "+RESET);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
        System.out.println(RED+"Kamu "+GREEN+"ngerjain sendiri "+YELLOW+"latihan 17 sampe "
                +RESET+BLUE+"latihan 30 ini "+RESET);
        String jawab = jawab().toLowerCase();
        System.out.println();
        if (jawab.equals("yoi")){
            System.out.println(RED+"Cakep Bener. "+PURPLE+"Good Job "+RESET);
        }else if(jawab.equals("enggak")){
            System.out.println(RED+"Tetep cakep sih."+RESET);
            System.out.println(CYAN+"Sing penting paham konsep nya yee."+RESET);
            System.out.println("Keep the code works dude");
        }else{
            System.out.println(RED+"Opsi tidak di temukan."+RESET);
        }


    }
}
