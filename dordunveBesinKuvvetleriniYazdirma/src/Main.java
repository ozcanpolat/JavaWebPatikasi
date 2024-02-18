import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz :");
        k=input.nextInt();


        for(int i=1, j=1 ; i<=k && j<=k; i*=4, j*=5 ){
            System.out.println(i + "\t" + j);
        }

    }
}