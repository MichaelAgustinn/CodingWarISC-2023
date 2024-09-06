import java.util.Scanner;

public class HasilPenjualanTanah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meter = 300000;

        System.out.print("Masukkan Luas Tanah: ");
        double luas = in.nextDouble();

        double total = meter * luas;
        if (meter * luas > 100000000) {
            luas = ((meter * luas) * 0.05);
        } else if (meter * luas > 50000000) {
            luas = ((meter * luas) * 0.03);
        } else {
            luas = ((meter * luas) * 0.01);
        }

        System.out.println(total);
        in.close();
    }
}
