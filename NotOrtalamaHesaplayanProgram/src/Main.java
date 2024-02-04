import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik, kimya, mat, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Fizik notunu girin:");
        fizik = input.nextInt();

        System.out.print("Kimya notunu girin:");
        kimya = input.nextInt();

        System.out.print("Matematik notunu girin:");
        mat = input.nextInt();

        System.out.print("Türkçe notunu girin:");
        turkce = input.nextInt();

        System.out.print("Tarih notunu girin:");
        tarih = input.nextInt();

        System.out.print("Müzik notunu girin:");
        muzik = input.nextInt();

        int sonuc = fizik + kimya + mat + turkce + tarih + muzik;
        double ortalama = sonuc / 6.0;

        System.out.print("Ortalamanız :"+ortalama);

        boolean kosul= sonuc>=60;
        String str= kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(" " +str);


    }
}