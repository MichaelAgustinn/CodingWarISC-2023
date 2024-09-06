import java.util.Scanner;

public class TotalDariInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int input = in.nextInt();
        int j = 0;
        for (int i = 1; i <= input; i++) {
            j += i;
            System.out.print(i);
            if (input > i) {
                System.out.print("+");
            }
        }
        System.out.println("=" + j);
        in.close();
    }
}
