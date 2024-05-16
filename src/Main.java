import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int bakiye=1000,input,miktar;
        System.out.println("X Banka Hoşgeldiniz");
        System.out.println("Bakiyeniz:"+bakiye);

        while(bakiye>0){
            System.out.println();
            System.out.println("1-)PARA YATIRMA");
            System.out.println("2-)PARA ÇEKME");
            System.out.println("3-BAKİYE SORGULAMA");
            System.out.println("4-ÇIKIŞ");
            input = scan.nextInt();

            if(input==1){
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz:");
                miktar = scan.nextInt();
                bakiye += miktar;
            }else if(input==2){
                System.out.println("Çekmek İstediğiniz Miktarı Giriniz:");
                miktar = scan.nextInt();
                bakiye -=miktar;
                if(miktar>bakiye){
                    System.out.println("Yetersiz Bakiye");
                }
            }else if(input==3){
                System.out.println("Bakiyeniz:"+bakiye);

            }else if(input==4){
                System.out.println("Çıkış Yapılıyor");
                break;
            }else{
                System.out.println("Geçersiz İşlem Girdiniz");
            }

        }


    }
}