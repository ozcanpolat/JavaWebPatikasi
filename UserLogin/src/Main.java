import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, enteredPassword,choice,newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Girin :");
        userName = input.nextLine();
        System.out.print("Şifrenizi Girin :");
        enteredPassword = input.nextLine();

        if(userName.equals("ozcan") && enteredPassword.equals("ozcan123")){
            System.out.print("Giriş Yaptınız.");
        }else{
            System.out.print("Hatalı Giriş Yaptınız. Şifrenizi Sıfırlamak İster Misiniz? (evet/hayir)");
            choice = input.nextLine();

            if(choice.equals("evet")) {
                System.out.print("Şifrenizi Girin: ");
                newPassword = input.nextLine();

                if (newPassword.equals(enteredPassword) || newPassword.equals("ozcan123")) {
                    System.out.print("Şifre oluşturulamadı. Lütfen tekrar deneyin.");
                } else {
                    System.out.print("Şifre Oluşturuldu.");

                }
            }

        }
    }
}