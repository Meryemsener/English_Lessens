package day04_ifStatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin
        //ve girilen karakterin harf olup olmadigini yazdirin
        System.out.println("Lutfen bir karakter giriniz: ");
        Scanner scan=new Scanner(System.in);
        char c=scan.nextLine().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println("Girdiginiz karakter  harftir= "+c);
        }
        else if(c>='a' && c<='z'){
            System.out.println("Girdiginiz karakter  harftir= "+c);
        }
      else {
            System.out.println("Bu bir harf degildir");
        }
        }
    }


