import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, fak;

        System.out.print("angka faktorial = ");
        angka = input.nextInt();

        fak = 1;
        for (int i = 1; i <= angka; i++) {

            // System.out.print(fak *= i);
            // System.out.print(" ");
            fak *= i;
        }
        System.out.println("nilai faktorial dari " + angka + " adalah " + fak);
    }
}
