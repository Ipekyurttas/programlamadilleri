
package odev2;

import java.io.*;
import java.util.ArrayList;

public class A {
    public String path;
    ArrayList<Integer> x = new  ArrayList<>();
    ArrayList<Integer> a = new  ArrayList<>();
    ArrayList<Integer> y = new  ArrayList<>();
    ArrayList<Integer> b = new  ArrayList<>();
    int i=0,gecici,j=0;
    
    public A(String path){
        this.path=path;
    }
    
    public void reading(){
        String value=" ";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader gs = new BufferedReader(fileReader);
            while ((value = gs.readLine()) != null) {
                gecici= Integer.parseInt(value);
                x.add(i, gecici);
                a.add(i,gecici);
                y.add(i);
                i++;
            }
            fileReader.close();
        } catch (IOException ex) {
            
        }
    }
    
    private void yazdir(){
        i=0;
        System.out.println("Siralanmamis Dizi :"+"\t"+"Siralanmis Dizi : ");
        System.out.println("Veri"+"\t"+"Adres"+"\t\t"+"Veri"+"\t"+"Adres");
        for(int value : x){
            System.out.println(value+"\t"+y.get(i)+"\t\t"+a.get(i)+"\t"+b.get(i));
            i++;
        }
    }
    
    public void sorting(){
        int tmp,tmp2;
        for(i=0;i<a.size();i++){
            for(j=0;j<(a.size()-1)-i;j++){
                tmp=a.get(j);
                tmp2=a.get(j+1);
                if(tmp>tmp2){
                    a.set(j, tmp2);
                    a.set(j+1, tmp);
                }
            }
        }
        for(i=0;i<a.size();i++){
            tmp=a.get(i);
            for(j=0;j<x.size();j++){
                tmp2=x.get(j);
                if(tmp == tmp2){
                    b.add(j);
                }
            }
        }
        yazdir();
    }
    
}