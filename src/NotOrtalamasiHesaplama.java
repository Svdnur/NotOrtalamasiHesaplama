import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    // Not ortalaması hesaplama ve sonucunda boolean ile sınıfı geçtiniz veya kaldınız yazdırma:

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mat,turkce,kimya,fizik,tarih,muzik,beden;
        double ortalama;



        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.println("Türkçe notunu giriniz :");
        turkce = input.nextInt();

        System.out.println("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("Fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz:");
        muzik = input.nextInt();

        System.out.println("Beden notunu giriniz:");
        beden = input.nextInt();

        ortalama = ( mat + turkce + kimya + fizik + tarih + muzik + beden )/ 7;

        System.out.println("Ortalamanız : " + ortalama);

        boolean sonuc = ortalama >= 60;
        String str = sonuc ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";
        System.out.println(str);





    }
}
