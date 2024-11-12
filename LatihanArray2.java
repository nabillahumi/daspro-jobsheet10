public class LatihanArray2 {
    public static void main(String[] args) {
        
        int[][] survey = {
            {3, 4, 5, 2, 1, 5},
            {4, 5, 3, 3, 2, 4},
            {5, 4, 4, 5, 3, 3},
            {2, 2, 3, 4, 5, 5},
            {3, 3, 4, 2, 4, 5},
            {5, 5, 5, 5, 5, 5},
            {1, 2, 3, 4, 5, 3},
            {3, 3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4, 4},
            {5, 5, 4, 4, 3, 3}
        };

        int jmlhResponden = survey.length;
        int jmlPernyataan = survey[0].length;

        for (int i = 0; i < jmlhResponden; i++) {
            double total = 0;
            for (int j = 0; j < jmlPernyataan; j++) {
                total += survey[i][j];
            }
            double rata2 = total / (jmlPernyataan);
            System.out.println("Rata-rata responden ke "+ (i + 1) + " : " + rata2);
        }

        for (int j = 0; j < jmlPernyataan; j++) {
            double total = 0;
            for (int i = 0; i < jmlhResponden; i++) {
                total += survey[i][j];
            }
            double rata2 = total / (jmlhResponden);
            System.out.println("Rata-rata pernyataan ke "+  (j + 1) + " : " +  rata2);
        } 

        int totalKeseluruhan = 0;
        for (int i = 0; i < jmlhResponden; i++) {
            for (int j = 0; j < jmlPernyataan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rata2Keseluruhan = totalKeseluruhan / (jmlhResponden * jmlPernyataan);
        System.out.println("Rata-rata Keseluruhan : " + rata2Keseluruhan);
    }
}
