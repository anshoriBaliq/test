import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int fn_1, fn_2, fn, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Mengambil nilai fibanacci ke- : ");
        n = input.nextInt();

        fn_2 = 0;
        fn_1 = 1;
        fn = 1;

        for (int i = 0; i < n; i++) {
            System.out.println("nilai ke- " + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }

    }
}
