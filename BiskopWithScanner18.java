import java.util.Scanner;

public class BiskopWithScanner18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom, pilihan;

        while (true) { 

            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                //input data penonton
                System.out.print("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine(); 

                penonton[baris - 1][kolom - 1] = nama;

            } else if (pilihan == 2) {
                System.out.println("=== daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("Baris %d, kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                    } else {
                        System.out.printf("Baris %d, Kolom %d: Kosong\n", i + 1, j +1);
                    }
                    }
              
                } 
            } else if (pilihan == 3) {
                System.out.println("Terimakasih telah menggunakan program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }     
    }
}