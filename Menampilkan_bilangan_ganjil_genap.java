package program_java;
import java.util.Scanner;

public class Menampilkan_bilangan_ganjil_genap {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int pilihan, awal, akhir;
    
    System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN GANJIL DAN GENAP");
    System.out.println("===================================================");
    
    System.out.print("Masukkan Pilihan [1. Ganjil] | [2. Genap] : ");
    pilihan = input.nextInt();
    System.out.print("Masukkan Nilai Awal : ");
    awal = input.nextInt();
    System.out.print("Masukkan Nilai Akhir : ");
    akhir = input.nextInt();
    
    System.out.println("===================================================");
    
    switch (pilihan){
        case 1:
            System.out.println("Deret Bilangan Ganjil");
            for (int i=awal;i<=akhir;i++){
                if (i%2!=0)
                    System.out.println(i+" ");
            }
            break;
        case 2:
            System.out.println("Deret Bilangan Genap");
            for (int i=awal;i<=akhir;i++){
                if (i%2==0)
                    System.out.println(i+" ");
            }
            break;
    }
    
        System.out.println("");
    
    }
}
