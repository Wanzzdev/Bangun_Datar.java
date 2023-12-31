package program_java;
import java.util.Scanner;

public class Menghitung_luas_segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,t;
        double luas;
        
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS SEGITIGA");
        System.out.println("=====================================");
        
        System.out.print("Masukkan Alas : ");
        a = input.nextInt();
        
        System.out.print("Masukkan Tinggi : ");
        t = input.nextInt();
        
        luas = 0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
        
    }
    
}
