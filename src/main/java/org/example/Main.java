package org.example;

public class Main {
    public static void main(String[] args) {
        Lecturer ogretimGorevlisi=new Lecturer(
                "Semih",
                "Açık",
                "045678946231",
                "sack@gmail.com",
                "FİZİK",
                "PROFESOR",
                20
        );
        ogretimGorevlisi.giris();
        ogretimGorevlisi.attendClass();
        ogretimGorevlisi.senateMeeting();
        ogretimGorevlisi.takeATest();
        ogretimGorevlisi.cikis();

        Asistant asistan=new Asistant(
                "Fatma",
                "Karaböcek",
                "04569764561",
                "fatma@gmail.com",
                "KİMYA",
                "KİMYA ASİSTANI",
                "12.00"
        );
        asistan.giris();
        asistan.attendClass();
        asistan.cikis();

        Computing bilgiIslem=new Computing(
                "Salih",
                "Kaya",
                "0321654789",
                "salih@gmail.com",
                "BİLGİ İŞLEM",
                "8.00",
                "ÖĞRENCİ KORDİNATÖRLÜĞÜ"
        );
        bilgiIslem.giris();
        bilgiIslem.work();
        bilgiIslem.cikis();

        SecurityGuard guvenlikGorevlisi=new SecurityGuard(
                "Ahmet",
                "Samsa",
                "0978645231",
                "samsa@gmail.com",
                "GÜVENLİK BİRİMİ",
                "17.00",
                "MEVCUT"
        );
        guvenlikGorevlisi.giris();
        guvenlikGorevlisi.work();
        guvenlikGorevlisi.cikis();
    }
}