import java.nio.channels.Pipe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiminizi Giriniz :");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;

            case 2:
                System.out.println("Çıkarma :"+(n1-n2));
                break;

            case 3:
                if (n2==0){
                    System.out.println("Bir Sayı Sıfıra Bölünemez.");
                } else {
                    System.out.println("Bölüm :"+(n1/n2));
                }
                break;

            case 4:
                System.out.println("Çarpma :"+(n1*n2));
                break;

            default:
                System.out.println("Yanlış Seçim Yaptınız .");
        }
    }
}