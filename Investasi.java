import java.util.Scanner;

public class Investasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Modal Awal: ");
        double modalAwal = in.nextDouble();
        System.out.print("Masukkan Lama Investasi: ");
        int lama = in.nextInt();
        double keuntungan = 0;
        for (int i = 1; i <= lama; i++) {
            keuntungan = modalAwal * 0.05;
            modalAwal += keuntungan;
        }
        System.out.println(modalAwal);
        in.close();
    }
}
