package program_java;
import java.util.Scanner;

public class Menentukan_bilangan_ganjil_genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bil;
        System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN GANJIL DAN GENAP");
        System.out.println("=================================================");
        
        System.out.print("Masukkan Bilangan : ");
        bil = input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
            System.out.println("Bilangan "+bil+" adalah bilangan ganjil"); 
        }
    }
}