
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void listebastır(LinkedList<String> gidilecek_yerler){
        //Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..
        /*for(String s:gidilecek_yerler){
            System.out.println(s);
        }*/
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
    public static void sıralı_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator = gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
            int karsılastır = iterator.next().compareTo(yeni);
            if(karsılastır == 0){
                System.out.println("listede bu eleman zaten var");
                return;//bir değer döndüremeyiz sadece sonlandırabiliriz.Çünkü yapı void
            }else if(karsılastır <0){
                //yeni değer iterator.next'ten daha büyük
                
            }else if(karsılastır>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
      /*  ArrayList<String> diller = new ArrayList<>();
        diller.add("java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");
        /*for(int i = 0;i<diller.size();i++){
            System.out.println("dillerimiz : " +diller.get(i));
        }
        for(String s : diller){
            System.out.println("Dillerimiz : "+s);
        }
        System.out.println("-----------------------------");
        //1.indexe C++ ekliyoruz
        diller.add(1,"C++");
        for(String s :diller){
        System.out.println(s);
    }
    //arraylist 1. indexe veri eklemek için 1. index dahil bir alta kaydırıyor bellekte
    //byük verilerle çalıştığında büyük bir zaman gerekirdi.
    //arraylistlerin yapıpı arraylistten farklı bu zaman kaybı linkedlistlerde yok
    //Linkedlistlin bir devavantajı ise bir objenin hem değerini hem referansını taşıyor olması
    //linkedlist bellekte arrayliste göre daha fazla yer kaplıyor
    
        */
        LinkedList<String> gidilecek_yerler = new LinkedList<>();//referansımız şuan herhangi bir noktayı göstermiyor
      /*  gidilecek_yerler.add("Sivas");
                                    gidilecek_yerler.add("Konya");
                                                                gidilecek_yerler.add("Amasya");
                                                                                            gidilecek_yerler.add("Karabük");
                                                                gidilecek_yerler.add("İstanbul");
                                    gidilecek_yerler.add("Antep");
        gidilecek_yerler.add("Rize");
        
        listebastır(gidilecek_yerler);
        System.out.println("--------------------------------------");
        System.out.println("**************************************");
        gidilecek_yerler.add(4,"Kanada");
        listebastır(gidilecek_yerler);
        System.out.println("--------------------------------------");
        System.out.println("**************************************");
        gidilecek_yerler.remove(5);
        listebastır(gidilecek_yerler);
        */
        sıralı_ekle(gidilecek_yerler, "postane");
        sıralı_ekle(gidilecek_yerler, "Market");
        sıralı_ekle(gidilecek_yerler, "Ev");
        listebastır(gidilecek_yerler);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
