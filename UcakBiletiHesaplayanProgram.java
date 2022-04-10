
package ucakbiletihesaplayanprogram;
import java.util.*;
public class UcakBiletiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Km cinsinden mesafeyi giriniz.");
        int mesafe = input.nextInt();
        double ucret = (mesafe*0.10);
        System.out.print("Yaşınızı giriniz:");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipi seçiniz:");
        System.out.println("1-Tek Yön");
        System.out.println("2-Gidiş Dönüş");
        int secim = input.nextInt();
        
        switch(secim){
            case 1:
                if(yas<=12)
                {
                    ucret = ucret-(ucret/2);
                    System.out.println("%50 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL");
                    break;
                }
                else if(yas>12 && yas<=24)
                {
                    ucret = ucret-(ucret/10);
                    System.out.println("%10 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL");
                    break;
                }
                else if(yas>65)
                {
                    ucret = ucret -((ucret*3)/10);
                    System.out.println("%30 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL");
                    break;
                }
            case 2:
                ucret = ucret -(ucret/5);
                System.out.println("Gidiş dönüş yolculuğu için %20 indirim uygulandı.");
                if(yas<=12)
                {
                    ucret = ucret-(ucret/2);
                    System.out.println("%50 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL");
                    break;
                }
                else if(yas>12 && yas<=24)
                {
                    ucret = ucret-(ucret/10);
                    System.out.println("%10 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL ");
                    break;
                }
                else if(yas>65)
                {
                    ucret = ucret -((ucret*3)/10);
                    System.out.println("%30 indirim uygulandı.");
                    System.out.println("Toplam Tutar:" + ucret + " " + "TL");
                    break;
                }
                default:
                    System.out.println("Lütfen bir yolculuk tipi seçiniz.");
                    break;
                    
             }
      
        }
    }
    