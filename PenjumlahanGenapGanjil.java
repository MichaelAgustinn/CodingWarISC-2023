import java.util.Scanner;

public class PenjumlahanGenapGanjil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        int pertama = in.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        int kedua = in.nextInt();
        int hasil = pertama + kedua;
        if (hasil % 2 == 0) {
            hasil += 1;
        } else if (hasil % 2 == 1) {
            hasil += 2;
        }
        System.out.println(hasil);
        in.close();
    }
}
