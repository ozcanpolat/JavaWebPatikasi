import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input= new Scanner(System.in);

        System.out.print("Tabanı girin :");
        n= input.nextInt();
        System.out.print("Ussu girin ");
        k=input.nextInt();

        for(int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Sonuç :"+total);

    }
}