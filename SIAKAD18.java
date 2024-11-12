import java.util.Scanner;

public class SIAKAD18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jmlhSiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmlhMatkul = sc.nextInt();

        int[][] nilai = new int[jmlhSiswa][jmlhMatkul];

        for (int i = 0; i < jmlhSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < jmlhMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata : " + totalPersiswa/jmlhMatkul);
        }
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah : ");

        for (int j = 0; j < jmlhMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlhSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+ 1) + " : " + totalPerMatkul/jmlhSiswa);
        }
    }
}
