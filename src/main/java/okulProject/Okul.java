package okulProject;

public class Okul {

    //Okul bilgilerini static yapmamızın nedeni heryerden kolayca ulaşabilmek için.

    //Final yapmamızın nedeni okul bilgilerinin  değiştirilmesini istemediğimiz için.

    static final String okulIsmi = "Yildiz Koleji";
    static final String adres = "Cankaya / Ankara";
    static final String telefon = "0312 2366554";



    private Okul(){}

}

//Okul classının constructorını belirli kılıp private yapmamızın sebebi bu classdan obje üretilmesini istemediğimiz için.