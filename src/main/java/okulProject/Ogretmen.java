package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();


    public static void feykOgretmenEkle() {

        ogretmenlerMap.put("123456987411", "Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412", "Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413", "Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415", "Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = scan.nextLine();

        do {

            System.out.println("=============YILDIZ KOLEJİ================\n" +
                    "============OGRETMEN MENU =============\n " +
                    "\t   1-Ogretmenler Listesi Yazdir\t\t\t\n " +
                    "\t   2-Soyisimden Ogretmen Bulma \n " +
                    "\t   3-Branstan Ogretmen Bulma \n " +
                    "\t   4-Bilgilerini girerek Ogretmen Ekleme\n" +
                    "\t   5-Kimlik No ile Kayit Silme \t \n " +
                    "\t   A-ANAMENU \n " +
                    "\t   Q-ÇIKIŞ\n");

            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    OgretmenEklemeMethodu();
                    break;
                case "5":
                    OgretmenkayitSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("lütfen gecerli tercih yapiniz");
            }

        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();
    }

    public static void OgretmenkayitSilme() {

        System.out.println("silinecek öğretmen tc kimlik numarasını giriniz");

        String silinecekOgretmenTc = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmenTc);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmenTc);

        try {
            if (sonucValue.equals((silinecekValue))){
                System.out.println("istenen ogretmen listeden silindi");
            }else {
                System.out.println("verilen kimlik numarasi ile öğretmen bulunamadı");
            }
        } catch (Exception e) {
            System.out.println("verilen kimlik numarasi ile öğretmen bulunamadı");
        }

    }

    public static void OgretmenEklemeMethodu() {

        System.out.println("TC numaranızı giriniz");
        String tcNo = scan.nextLine();

        System.out.println("isminizi giriniz");
        String ogretmenIsmi = scan.nextLine();

        System.out.println("soyadinizi giriniz");
        String ogretmenSoyadi = scan.nextLine();

        System.out.println("Doğum yilinizi giriniz");
        String dogumYili = scan.nextLine();

        System.out.println("Lütfen branşınızı giriniz");
        String brans = scan.nextLine();

        String eklenecekValue = ogretmenIsmi + ", " + ogretmenSoyadi + ", " + dogumYili + ", " + brans;

        ogretmenlerMap.put(tcNo, eklenecekValue);

    }

    private static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println(" Ogretmenin branşını giriniz");
        String istenenSoyisim = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println("=============YILDIZ KOLEJİ================\n" +
                "============ SOYİSİM İLE OGRETMEN ARAMA =============\n" +
                " TcNo         Isım     Soyisim   D.Yili   Brans");


        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[] = eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[3])) {
                System.out.printf("%11s  %-6s   %-8s  %4s  %s\n", eachKey, eachValuarr[0], eachValuarr[1],
                        eachValuarr[2], eachValuarr[3]);
            }
        }

        Thread.sleep(3000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {

        System.out.println(" Ogretmenin soyismini giriniz");
        String istenenSoyisim = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println("=============YILDIZ KOLEJİ================\n" +
                "============ SOYİSİM İLE OGRETMEN ARAMA =============\n" +
                " TcNo         Isım     Soyisim   D.Yili   Brans");


        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[] = eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])) {
                System.out.printf("%12s  %-6s   %-8s  %4s  %s\n", eachKey, eachValuarr[0], eachValuarr[1],
                        eachValuarr[2], eachValuarr[3]);
            }
        }

        Thread.sleep(3000);


    }

    public static void ogretmenListesiYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println("=============YILDIZ KOLEJİ================\n" +
                "============OGRETMEN LISTESI =============\n" +
                " TcNo         Isım     Soyisim   D.Yili   Brans");


        for (Map.Entry<String, String> each : ogretmenlerEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[] = eachValue.split(", ");

            System.out.printf("%11s  %-6s   %-8s  %4s  %s\n", eachKey, eachValuarr[0], eachValuarr[1],
                    eachValuarr[2], eachValuarr[3]);
        }

        Thread.sleep(3000);
    }


}