import java.util.Scanner;

public class YouAndIEND {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Msukkan angka: ");
            int input = in.nextInt();
            if (input % 2 == 0) {
                System.out.println(input + " adalah angka genap");
            } else if (input % 2 == 1) {
                System.out.println("You and I, END");
                break;
            }
        }
        in.close();
    }
}
