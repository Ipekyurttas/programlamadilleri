
package odev1;

import java.util.ArrayList;

public class Methodlar {
    public int ozne(String kelime){
        ArrayList<String> ozne = new ArrayList<>();
        ozne.add("Ben");
        ozne.add("Sen");
        ozne.add("Hasan");
        ozne.add("Nurşah");
        ozne.add("Elif");
        ozne.add("Abdulrezzak");
        ozne.add("Şehribanu");
        ozne.add("Zeynelabidin");
        ozne.add("Naki");
        for(int i=0;i<ozne.size();i++){
            if(ozne.get(i).equals(kelime)){
                return 1;
            }
        }
        return 0;
    }
    
    public int nesne(String kelime){
        ArrayList<String> nesne = new ArrayList<>();
        nesne.add("Bahçe");
        nesne.add("Okul");
        nesne.add("Park");
        nesne.add("Sınıf");
        nesne.add("Yarın");
        nesne.add("Pazartesi");
        nesne.add("Salı");
        nesne.add("Çarşamba");
        nesne.add("Perşembe");
        nesne.add("Cuma");
        nesne.add("Cumartesi");
        nesne.add("Pazar");
        nesne.add("Merkez");
        nesne.add("Ev");
        nesne.add("Kitap");
        nesne.add("Defter");
        nesne.add("Güneş");
        nesne.add("Beydağı");
        for(int i=0;i<nesne.size();i++){
            if(nesne.get(i).equals(kelime)){
                return 1;
            }
        }
        return 0;
    }
    
    public int yüklem(String kelime){
        ArrayList<String> yüklem = new ArrayList<>();
        yüklem.add("Gitmek");
        yüklem.add("Gelmek");
        yüklem.add("Okumak");
        yüklem.add("Yazmak");
        yüklem.add("Yürümek");
        yüklem.add("Görmek");
        for(int i=0;i<yüklem.size();i++){
            if(yüklem.get(i).equals(kelime)){
                return 1;
            }
        }
        return 0;
    }
}