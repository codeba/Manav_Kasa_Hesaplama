package patika;

import java.util.Scanner;

//        Armut : 2,14 TL
//        Elma : 3,67 TL
//        Domates : 1,11 TL
//        Müze: 0,95 TL
//        Patlıcan : 5,00 TL
public class Manav_Kasa_Hesaplama {
    public static void main(String[] args) {
       int armut,elma,domates,muz,patlıcan;
       double armutfiyat=2.14,elmafiyat=3.67,domatesfiyat=1.11;
       double muzfiyat=0.95,patlıcanfiyat=5.0,total;
        Scanner scan=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?:");
        armut=scan.nextInt();
        System.out.println("Elma Kaç Kilo ?:");
        elma=scan.nextInt();
        System.out.println("Domates Kaç Kilo ?:");
        domates=scan.nextInt();
        System.out.println("Muz Kaç Kilo ?:");
        muz=scan.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?:");
        patlıcan=scan.nextInt();
        total=armut*armutfiyat+elma*elmafiyat+domates*domatesfiyat+muz*muzfiyat+patlıcan*patlıcanfiyat;
        System.out.println("Toplam fiyat:"+total);


    }
}
