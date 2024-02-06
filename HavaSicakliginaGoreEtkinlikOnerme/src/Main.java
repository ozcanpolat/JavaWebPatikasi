import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz :");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }else if(heat <= 25) {
            if (heat <= 15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Pikniğe Gidebilirsiiz.");
            }

        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}