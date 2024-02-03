import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,fiz,turk,kim,muzik;
        int ortalamayaKatilicakDersSayisi = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextDouble();
        if (0>mat || mat>100){
            mat = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.print("Fizik notunuz : ");
        fiz = inp.nextDouble();
        if (0>fiz || fiz>100){
            fiz = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.print("Turkce notunuz : ");
        turk = inp.nextDouble();
        if (0>turk || turk>100){
            turk = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.print("Kimya notunuz : ");
        kim = inp.nextDouble();
        if (0>kim || kim>100){
            kim = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        System.out.print("Muzik notunuz : ");
        muzik = inp.nextDouble();
        if (0>muzik || muzik>100){
            muzik = 0;
            ortalamayaKatilicakDersSayisi--;
        }

        double avarage = (mat+fiz+turk+kim+muzik)/ortalamayaKatilicakDersSayisi;
        if (avarage<55)
            System.out.println("Sinifta kaldiniz");
        else
            System.out.println("Gectiniz");
        System.out.println("Ortalama notunuz : " + avarage);
    }
}