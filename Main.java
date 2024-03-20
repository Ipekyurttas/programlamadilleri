
package odev1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz : ");
        String cumle = input.nextLine();
        System.out.println("Girilen cumle : "+cumle);
        ArrayList<String> kelime = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(cumle);
        while(tokenizer.hasMoreTokens()){
            kelime.add(tokenizer.nextToken());
        }
        int i = 0, kontrol = 0;
        Methodlar mth = new Methodlar();
        int boyut = kelime.size();
        if (boyut == 3) {
            kontrol = mth.ozne(kelime.get(i));
            i++;
            kontrol = mth.nesne(kelime.get(i));
            i++;
            kontrol = mth.yüklem(kelime.get(i));
            if (kontrol == 1) {
                System.out.println("EVET");
            } else {
                System.out.println("HAYIR");
            }
        } else {
            System.out.println("HAYIR");
        }
    }
    
}