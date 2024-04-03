
package odev2;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dosyanin yeni ismini giriniz: ");
        String yeni = input.nextLine();
        File oldFile = new File("src/odev2/a.txt");
        String path = "src/odev2/" + yeni + ".txt";
        if (oldFile.renameTo(new File(path))) {
            System.out.println("Renamed");
        } else {
            System.out.println("Error");

        }
        A a = new A(path);
        a.reading();
        a.sorting();
    }
    
}