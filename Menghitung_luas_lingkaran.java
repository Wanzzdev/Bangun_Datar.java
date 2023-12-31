package program_java;
import java.util.Scanner;

public class Menghitung_luas_lingkaran {
    public static void main(String[] args) {
     // Inisialisasi objek input dari class Scanner
        Scanner input = new Scanner(System.in); 
        // Deklarasi variabel
        double luas, phi = 3.14;
        int r;
        
        // Agar program rapi
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS LINGKARAN");
        System.out.println("======================================");
        
        // Input nilai jari-jari
        System.out.print("Masukkan Jari-jari : ");
        r = input.nextInt();
        
        // Menghitung luas lingkaran
        luas = phi * r * r;
        System.out.println("Luas Lingkaran : "+luas);
        
    }
    
}
