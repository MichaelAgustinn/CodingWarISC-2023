import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gajiLembur = 55000;
        System.out.print("Masukkan Gaji: ");
        double gajiPokok = in.nextDouble();
        System.out.print("Masukkan Lama Lembur: ");
        double jam = in.nextDouble();

        double gajiTotal = gajiPokok + (jam * gajiLembur);

        System.out.println(gajiTotal);
        in.close();
    }
}
