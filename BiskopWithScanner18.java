import java.util.Scanner;

public class BiskopWithScanner18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) { 

            //input data penonton
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();
            
            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input Penonton lainnya? (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
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
    }
}
