import java.util.Scanner;

public class MasterCLass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int input = in.nextInt();

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("Master Class");
        } else if (input % 3 == 0) {
            System.out.println("Pride Of 3");
        } else if (input % 5 == 0) {
            System.out.println("Pride Of 5");
        }
        in.close();
    }
}
