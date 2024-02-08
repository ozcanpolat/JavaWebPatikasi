import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean isValid;

        Scanner input= new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isValid = true;
                }else {
                    isValid = false;
                }
            }
            else {
                isValid = true;
            }
        } else {
            isValid = false;
        }

        if(isValid){
            System.out.println(year + " Artık bir yıldır.");
        }else{
            System.out.println(year + " Artık bir yıl değildir.");
        }

    }
}