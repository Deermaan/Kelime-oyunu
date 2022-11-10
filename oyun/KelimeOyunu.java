package regular.day14.oyun;

import java.util.Scanner;

public class KelimeOyunu {


    static int oyuncu=1;
    static int puan1=0;
    static int puan2=0;
    static String kelime="";
    static String eklenenKelime="";
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(oyuncu+". oyuncu bir kelime giriniz");
        kelime=input.next();//oyuncunun verdiği kelimeyihiçlik olarak atamıştık.

        oyuncuDegistir();//method olusturduk
        onaySor();
    }

    public static void onaySor() {
        System.out.println("Girilen kelime "+kelime);
        System.out.println(oyuncu+". oyuncu girilen kelimeyi kabul ediyor musunuz?\n 1:Evet\n 0:Hayır");

        int kabul =input.nextInt();
        if(kabul==1){//1 tercihi girilen kelimeyi kabulettiğini gösterir.

            if (oyuncu==1){//islemi yapan 1 ise
                puan2+=kelime.length();

            }else puan1+=kelime.length();
            oyunaDevamEdecekMi();

        }else oyunBitir();//girilen kelimeyi kabul etmiyor

    }

    public static void oyunBitir() {
        System.out.println("Oyunu "+oyuncu+". oyuncu kazandı");

    }

    public static void oyunaDevamEdecekMi() {
        System.out.println("oyuna devam etmek ister misiniz (1: evet 0: hayır)");
        int tercih=input.nextInt();
        if (tercih==1){
            //1se devam


            kelimeEkle();
    }else System.out.println("Oyun bitti");
        System.out.println("1. oyuncu puanı= "+puan1);
        System.out.println("2. oyuncu puanı= " +puan2);
        if (puan1>puan2){
            System.out.println("Kazanan 1. oyuncu");

        }else if (puan2>puan1){
            System.out.println("Kazanan 2. oyuncu");
        }else System.out.println("Oyun berabere");
    }

    public static void kelimeEkle() {
        System.out.println("Eski kelimeye eklenecek kelimeyi giriniz");

        eklenenKelime=input.next();
        System.out.println("Yeni kelimeyi başa mı sona mı ekleyelim ?\n 1: Basa ekle 0: Sona ekle");

        int tercih =input.nextInt();


        if (tercih==1){
            kelime=eklenenKelime+kelime;

        }else kelime=kelime+eklenenKelime;

        oyuncuDegistir();
        onaySor();








    }

    public static void oyuncuDegistir() {
        if(oyuncu==1){//1.oyuncuu
            oyuncu=2;//2. oyncuya değiştir
        }else oyuncu=1;//2yse 1 yap
    }



}
