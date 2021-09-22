import java.util.Scanner;
public class main {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);

        String secenek="1-Sayisal puanı hesaplama\n"+
                       "2-Esit agırlık puanı hesaplama\n";

        System.out.println(secenek);

        while(true){
            System.out.println("Cıkıs icin q'ya basın");
            String cevap=scanner.nextLine();
            if(cevap.equals("q") ){
                System.out.println("Uygulama sonlanıyor...");
                break;
            }

            System.out.println("Birinci ögrencinin ismi: ");
            String isim=scanner.nextLine();
            System.out.print("Netler(Türkçe, Matematik, Edebiyat, Fizik): ");
            int turkce1=scanner.nextInt();
            int matematik1=scanner.nextInt();
            int edebiyat1=scanner.nextInt();
            int fizik1=scanner.nextInt();
            scanner.nextLine();

            System.out.println("İkinci ögrencinin ismi: ");
            String isim2=scanner.nextLine();
            System.out.print("Netler(Türkçe, Matematik, Edebiyat, Fizik): ");
            int turkce2=scanner.nextInt();
            int matematik2=scanner.nextInt();
            int edebiyat2=scanner.nextInt();
            int fizik2=scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ücüncü ögrencinin ismi: ");
            String isim3=scanner.nextLine();
            System.out.print("Netler(Türkçe, Matematik, Edebiyat, Fizik): ");
            int turkce3=scanner.nextInt();
            int matematik3=scanner.nextInt();
            int edebiyat3=scanner.nextInt();
            int fizik3=scanner.nextInt();
            scanner.nextLine();

            System.out.println("--------------------------------");
            System.out.print("Bir islem seciniz: ");
            String islem=scanner.nextLine();


            if(islem.equals("1")){
                esitAgirlik ogrenci1=  new esitAgirlik(edebiyat1,turkce1,fizik1,matematik1,isim);
                esitAgirlik ogrenci2=  new esitAgirlik(edebiyat2,turkce2,fizik2,matematik2,isim2);
                esitAgirlik ogrenci3=  new esitAgirlik(edebiyat3,turkce3,fizik3,matematik3,isim3);

                esitAgirlik birinci=birinci(ogrenci1,ogrenci2,ogrenci3);
                System.out.println("Birinci eşit agırlık ögrencisi: "+birinci.getIsim());
                System.out.println("Ogrencinin puanı: "+birinci.puanHesapla());
            }
            else if(islem.equals("2")){
               sayisal ogrenci1=  new sayisal(edebiyat1,turkce1,fizik1,matematik1,isim);
               sayisal ogrenci2=  new sayisal(edebiyat2,turkce2,fizik2,matematik2,isim2);
               sayisal ogrenci3=  new sayisal(edebiyat3,turkce3,fizik3,matematik3,isim3);

               sayisal birinci=birinci(ogrenci1,ogrenci2,ogrenci3);
               System.out.println("Birinci sayisal ögrencisi: "+birinci.getIsim());
               System.out.println("Ogrencinin puanı: "+birinci.puanHesapla());
           }
            else{
               System.out.println("Gecersiz islem");
           }

        }

    }
    public static <E extends aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()){
            return e1;
        }

        else if(e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
            return e2;
        }
        else if(e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            return e3;
        }
        else{
            return e1;
        }

    }
}
