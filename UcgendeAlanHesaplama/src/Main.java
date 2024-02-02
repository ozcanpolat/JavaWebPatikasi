import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        double cevre, alan, u;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenini birinci kenarını girin: ");
        kenar1 = input.nextInt();

        System.out.print("Üçgenini ikinci kenarını girin: ");
        kenar2 = input.nextInt();

        System.out.print("Üçgenini üçüncü kenarını girin: ");
        kenar3 = input.nextInt();

        cevre = kenar1 + kenar2 + kenar3;
        u = cevre/2;

        alan = u* (u-kenar1)* (u-kenar2)* (u-kenar3);


        System.out.print("Üçgenin alanı :"+ Math.sqrt(alan));


    }
}