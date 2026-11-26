package Pertemuan6;
import java.util.Scanner;
public class tugasnomor2 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passwordpercobaan=0;
        boolean berhasil = false;
        String password= "Adel070407";
        while (passwordpercobaan < 3 ) {
        System.out.print("Masukkan Kata Sandi: ");    
        String masukkankatasandi = input.nextLine();
        if (masukkankatasandi.equals(password)){
            System.out.println("Kata Sandi Benar");
            berhasil = true;
            break;
        } else {
            passwordpercobaan++;
            if (passwordpercobaan < 3){
                System.out.println("Kata Sandi Salah Silahkan Coba Kembali");              
            }
        }            
        }
        if (!berhasil){
            System.out.println("Anda Gagal Sebanyak 3 Kali. Akses diblokir");
        }
    }   
}
