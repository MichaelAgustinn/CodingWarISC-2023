import java.util.Scanner;

public class PenghasilanBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Penghasilan: ");
        double penghasilan = in.nextDouble();
        System.out.print("Masukkan Pekerjaan: ");
        in.nextLine();
        String pekerjaan = in.nextLine();
        double pajak = penghasilan;
        if (pekerjaan.equalsIgnoreCase("PNS")) {
            pajak *= 0.05;
            if (penghasilan > 3000000) {
                pajak *= 0.05;
            } else if (penghasilan > 5000000) {
                pajak *= 0.1;
            }
        } else {
            if (penghasilan > 3000000) {
                pajak *= 0.05;
            } else if (penghasilan > 5000000) {
                pajak *= 0.1;
            } else {
                pajak = 0;
            }
        }
        System.out.println("Penghasilan Bersih: " + (penghasilan - pajak));
        in.close();
    }
}
