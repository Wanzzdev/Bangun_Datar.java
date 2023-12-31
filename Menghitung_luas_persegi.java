package program_java;
import java.util.Scanner;

public class Menghitung_luas_persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi, luas;
        
        System.out.println("PROGRAM MENGHITUNG LUAS PERSEGI");
        System.out.println("===============================");

        System.out.print("Masukkan nilai sisi : ");
        sisi = input.nextInt();
        
        luas = sisi * sisi;
        System.out.println("Luas Persegi : "+luas);
    }
    
}
