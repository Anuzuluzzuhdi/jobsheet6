import java.util.Scanner;
    public class Pemilihan2Percobaan1_01 {
        public static void main(String[] args) {
            Scanner input01 = new Scanner(System.in);

            System.out.println("Masukkan Tahun:");
            int tahun = input01.nextInt();
            //output Masukkan Tahun :
            // 2100

            if ((tahun % 4) == 0) {
                if ((tahun % 100) != 0)
                    System.out.println("Tahun Kabisat");
            else
                System.out.println("Bukan Tahun Kabisat");
                }
            //output Bukan Tahun Kabisat
        }
    }