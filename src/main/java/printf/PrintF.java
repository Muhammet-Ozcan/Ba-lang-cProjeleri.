package printf;

public class PrintF {

    public static void main(String[] args) {

        int sayi = 123;

        String str = "Ahmet";

        double dob = 1.0205030456;

        System.out.println(sayi + "-" + str + "-" + dob + "-");

        System.out.printf("sayi : %d, str : %s, dou : %f", sayi, str, dob);

        System.out.printf("sayi : %d, str : %10S, dou : %f", sayi, str, dob); //[S] string olan Ahmet kelimesinin bütün harflerini BÜYÜTTÜK.

        System.out.printf("sayi : %d, str : %-10S, dou : %f", sayi, str, dob); //[-10S] string olan Ahmet kelimesinin SAĞINDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %d, str : %10S, dou : %f", sayi, str, dob);//[10S] string olan Ahmet kelimesinin SOLUNDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %d, str : %-10.10S, dou : %f", sayi, str, dob);//[-10.10S] string olan Ahmet bulutluoz kelimesinin SAĞINDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %10d, str : %-10.10S, dou : %f", sayi, str, dob);//[10d] Integerdan SAĞDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %-10d, str : %-10.10S, dou : %f", sayi, str, dob);//[-10d] Integerdan SOLDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %-10d, str : %-10.10S, dou : %f", sayi, str, dob);//[-10d] Integerdan SOLDAN 10 boşluk yer açtık.

        System.out.printf("sayi : %-10d, str : %-10.10S, dou : %.3f", sayi, str, dob);//[%.3f] doublarda virgülden sonrki 3 karakterden sonrakini sildi ve yazdırdı.

        System.out.printf("sayi : %-10d, str : %-10.10S, dou : %.3f", sayi, str, dob);//[%7.3f] doublarda soldan boşluk bırakır. ([%-7] sağdan boşluk bırakır.)


    }
}
