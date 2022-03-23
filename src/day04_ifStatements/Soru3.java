package day04_ifStatements;
import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;
public class Soru3 {
    public static void main(String[] args) {
//Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin Ornek: gun=Pazar output = “Hafta sonu”
//gun=Sali output = “Hafta ici”
//*** String icin equals method’unu kullani

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz");
        String haftaninGunleri=scan.next().toLowerCase();
        if(haftaninGunleri.equals("cumartesi")|| (haftaninGunleri.equals("pazar")))
        {
            System.out.println("Girdiginiz gun hafta sonudur");


        }
        else{
            System.out.println("Girdiginiz gun hafta icidir");
        }
}
}
