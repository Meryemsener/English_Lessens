package day04_ifStatements;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun adi yaziniz");
        String gunAdi= scan.next();

        if(gunAdi.equalsIgnoreCase("Cuma")) {
            System.out.println("Bugun muslumanlara bayram");

        }
         if(gunAdi.equalsIgnoreCase("Cumartesi")) {
             System.out.println("Bugun yahudilere bayram");

        }
       if (gunAdi.equalsIgnoreCase("Pazar")){
           System.out.println("Bugun hristiyanlara bayram");

        }
    }
}
