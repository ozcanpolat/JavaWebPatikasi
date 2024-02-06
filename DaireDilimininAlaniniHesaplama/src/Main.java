import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int r, merkezaci;
       double pi = 3.14, alan;

        System.out.print("Dairenin yarıçapını girin :");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısının ölçüsünü girin :");
        merkezaci = input.nextInt();

        alan = (pi * (r*r) * merkezaci) /360;

        System.out.print("Daire Diliminin Alanı :" +alan);

    }
}