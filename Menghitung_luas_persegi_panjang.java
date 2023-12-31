package program_java;
import java.util.Scanner;

public class Menghitung_luas_persegi_panjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, luas;
        
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.println("============================================");
        
        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        
        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : "+luas);
        
    }
    
}
