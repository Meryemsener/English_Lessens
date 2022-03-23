package day04_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve
        // //dikdortgenin kare olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        if(kenar1==kenar2){
            System.out.println("Girdiginiz uzunluklar bir kareye aittir");

        }
        else{
            System.out.println("Girdiginiz uzunluklar bir dikdortgene aittir");
        }
    }
}
