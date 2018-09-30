package me.alarai;

import java.util.Scanner;

/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program check kepribadian warna
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
    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    public static final String[] merahPersonal = {
            "Periang",
            "Pemberani",
            "Berani mengambil resiko dalam setiap langkah",
            "Menyukai tantangan",
            "Kurang sabar",
            "Dapat menahan marah namum jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol",
            "Meliiki energi kehangatan dan cinta"
    };
    public static final String[] kuningPersonal = {
            "Optimis",
            "Suka bergaul",
            "Periang",
            "Senang menolong",
            "Lincah dan aktif",
            "Tidak suka meremehkan kekurangan orang lain",
            "Loyal",
            "Hangat",
            "Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil",
            "Cenderung penakut"
    };

    public static final String[] unguPersonal = {
            "Optimis",
            "Tidak pernah ragu",
            "Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat",
            "Memiliki ambisi yang besar",
            "Memiliki empati yang besar",
            "Memiliki sisi misterius sebab seringkali menutupu perasaannya",
            "Terkadang bersikap keras kepala dan angkuh"
    };

    public static final String[] hijauPersonal = {
            "Romantis",
            "Menyukai hal yang berbau alami dan keindahan",
            "Teguh pada prinsip",
            "Menginginkan kesempurnaan",
            "Mudah cemburu",
            "Mudah merasa iri",
            "Menjunjung tinggi suatu nilai toleransi dan kepercayaan"
    };

    public static final String[] biruPersonal = {
            "Menyenangkan",
            "Bijaksana",
            "pembawaan diri tenang saat menghadapi masalah",
            "Dinamis",
            "Senang berbagi",
            "Bersahabat",
            "Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai"
    };

    public static String pilihWarna(){
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String inputNama(){
        System.out.print("NAMA KAMU : ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
	    System.out.println(RED+"YUK "+GREEN+"CEK "+YELLOW+"KEPRIBADIANMU "
        +RESET+CYAN+"DARI "+PURPLE+"WARNA "+BLUE+"FAVORITMU ");
	    System.out.println();
        System.out.println(RED_BACKGROUND+"\t\tMERAH\t\t"+RESET);
        System.out.println(GREEN_BACKGROUND+"\t\tHIJAU\t\t"+RESET);
        System.out.println(BLUE_BACKGROUND+"\t\tBIRU\t\t"+RESET);
        System.out.println(PURPLE_BACKGROUND+"\t\tUNGU\t\t"+RESET);
        System.out.println();
            String warna = pilihWarna();
            String nama  = inputNama();
        System.out.println();
        System.out.println("=========== HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+" ===========");
        String warnaPilihan;
        String[] personal = new String[20];
        switch (warna.toLowerCase()){
            case "merah":
                warnaPilihan = RED;
                personal = merahPersonal;
                break;
            case "hijau":
                warnaPilihan = GREEN;
                personal = hijauPersonal;
                break;
            case "biru":
                warnaPilihan = BLUE;
                personal = biruPersonal;
                break;
            case "ungu":
                warnaPilihan = PURPLE;
                personal = unguPersonal;
                break;
            case "kuning":
                warnaPilihan = YELLOW;
                personal = kuningPersonal;
                break;
            default:
                warnaPilihan = RESET;
        }

        System.out.println("Warna Favoritmu adalah "+warnaPilihan+warna.toUpperCase()+RESET);
        String text;
        for (int i=1;i <= personal.length;i++){
            text = i+". ";
            text += personal[i-1];
            text += (i == personal.length)?".":",";
            System.out.println(text);
        }
    }
}
