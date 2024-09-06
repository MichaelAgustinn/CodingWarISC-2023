import java.util.Scanner;

public class HabisBagi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas: ");
        int batas = in.nextInt();
        int k = 0;
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0) {
                k++;
            }
        }
        System.out.println(k);
        in.close();
    }
}
