package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Map<String, String> ogrenciListesi = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void feykOgrenciEkle() {
        ogrenciListesi.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciListesi.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciListesi.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciListesi.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciListesi.put("123456987415","Alp, Yan, 2009, 3769, 11, A");
    }

    public static void ogrenciMenu() throws InterruptedException {

        String tercih = "";

        do {

            System.out.println("=============YILDIZ KOLEJİ===============\n" +
                    "============ OGRENCİ MENU =============\n" +
                    "\n" +
                    "\t  1-Ogrenci Listesi Yazdir \t\t\t\n" +
                    "\t  2-Soyisimden Ogrenci Bulma\n" +
                    "\t  3-Sinif ve Sube Ile Ogrenci Bulma\n" +
                    "\t  4-Bilgilerini girerek Ogrenci Eklleme\n" +
                    "\t  5-Kimlik No ile Kayit Silme \t\n" +
                    "\t  A-ANAMENU\n " +
                    "\t  Q-ÇIKIŞ ");

            tercih = scan.nextLine();

            switch (tercih) {

                case "1":
                    ogrenciListesiYazdir();
                    break;
                case "2":
                    SoyisimdenOgrenciBulma();
                    break;
                case "3":
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkle();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("");
            }

        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();

    }

    private static void tcNoIleOgrenciSilme() {

        System.out.println("silinecek öğrenci tc kimlik numarasını giriniz");

        String silinecekOgrenciTc = scan.nextLine();

        String silinecekValue = ogrenciListesi.get(silinecekOgrenciTc);

        String sonucValue = ogrenciListesi.remove(silinecekOgrenciTc);

        try {
            if (sonucValue.equals((silinecekValue))){
                System.out.println("istenen öğrenci listeden silindi");
            }else {
                System.out.println("verilen kimlik numarasi ile öğrenci bulunamadı");
            }
        } catch (Exception e) {
            System.out.println("verilen kimlik numarasi ile öğrenci bulunamadı");
        }
    }

    private static void ogrenciEkle() {

        System.out.println("TC numaranızı giriniz");
        String tcNo = scan.nextLine();

        System.out.println("isminizi giriniz");
        String ogrenciIsmi = scan.nextLine();

        System.out.println("soyadinizi giriniz");
        String ogrenciSoyadi = scan.nextLine();

        System.out.println("Doğum yilinizi giriniz");
        String dogumYili = scan.nextLine();

        System.out.println("Lütfen numaranızı giriniz");
        String OkulNo = scan.nextLine();

        System.out.println("Lütfen sinifinizi giriniz");
        String sinif = scan.nextLine();

        System.out.println("Lütfen subenizi giriniz");
        String sube = scan.nextLine();

        String Key = tcNo;

        String Value = ogrenciIsmi+", "+ogrenciSoyadi+", "+dogumYili+", "+OkulNo+", "+sinif+", "+sube;

        ogrenciListesi.put(tcNo,Value);

    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {

        System.out.println("lütfen Sınıfınızı giriniz giriniz");

        String sinif = scan.nextLine();

        System.out.println("lütfen şubenizi giriniz");

        String sube = scan.nextLine();

        Set<Map.Entry<String, String>> myEntrySet = ogrenciListesi.entrySet();

        System.out.println("=============YILDIZ KOLEJİ===============\n" +
                "============ OGRENCİ LİSTESİ =============\n " +
                "Tc No        Isim    Soyisim     Dyili OkulNo Sinif Sube");

        for (Map.Entry<String, String> each : myEntrySet) {

            String ogrenciKey = each.getKey();
            String ogrenciValue = each.getValue();

            String ogrenciValueArr[] = ogrenciValue.split(", ");

            if (sinif.equalsIgnoreCase(ogrenciValueArr[4]) && sube.equalsIgnoreCase(ogrenciValueArr[5])) {
                System.out.printf("%-12s  %-6s   %-9s  %-4s  %-4s %6s %4s \n", ogrenciKey, ogrenciValueArr[0], ogrenciValueArr[1], ogrenciValueArr[2],
                        ogrenciValueArr[3], ogrenciValueArr[4], ogrenciValueArr[5]);
            }
        }
        Thread.sleep(3000);

    }

    private static void SoyisimdenOgrenciBulma() throws InterruptedException {

        System.out.println("lütfen soyisim giriniz");

        String soyisim = scan.nextLine();

        Set<Map.Entry<String, String>> myEntrySet = ogrenciListesi.entrySet();

        System.out.println("=============YILDIZ KOLEJİ===============\n" +
                "============ OGRENCİ LİSTESİ =============\n " +
                "Tc No        Isim    Soyisim     Dyili OkulNo Sinif Sube");

        for (Map.Entry<String, String> each : myEntrySet) {

            String ogrenciKey = each.getKey();
            String ogrenciValue = each.getValue();

            String ogrenciValueArr[] = ogrenciValue.split(", ");

            if (soyisim.equalsIgnoreCase(ogrenciValueArr[1])) {
                System.out.printf("%-12s  %-6s   %-9s  %-4s  %-4s %6s %4s \n", ogrenciKey, ogrenciValueArr[0], ogrenciValueArr[1], ogrenciValueArr[2],
                        ogrenciValueArr[3], ogrenciValueArr[4], ogrenciValueArr[5]);
            }
        }
        Thread.sleep(3000);
    }



    private static void ogrenciListesiYazdir() throws InterruptedException {


        Set<Map.Entry<String, String>> myEntrySet = ogrenciListesi.entrySet();

        System.out.println("=============YILDIZ KOLEJİ===============\n" +
                "============ OGRENCİ LİSTESİ =============\n " +
                "Tc No        Isim    Soyisim     Dyili OkulNo Sinif Sube");

        for (Map.Entry<String, String> each : myEntrySet) {

            String ogrenciKey = each.getKey();
            String ogrenciValue = each.getValue();

            String ogrenciValueArr[] = ogrenciValue.split(", ");

            System.out.printf("%-12s  %-6s   %-9s  %-4s  %-4s %6s %4s \n",ogrenciKey, ogrenciValueArr[0], ogrenciValueArr[1], ogrenciValueArr[2],
            ogrenciValueArr[3],ogrenciValueArr[4], ogrenciValueArr[5]);
        }
      Thread.sleep(3000);
    }

}
