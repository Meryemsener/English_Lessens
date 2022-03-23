package day04_ifStatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //ask user to enter day name then print weekday or weekend
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = scan.next();
        //for string you can noet use == sign

        if (dayName.equals("Monday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");

        }
        if (dayName.equals("Saturday")) {
            System.out.println("Weekend");

        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend");

        }

    }




          /*
        Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        isimlerini yazdirin
        Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali”
     *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
     */
       /* System.out.print("Lütfen P, S, C harflerinden birini seciniz= ");
        Scanner scan=new Scanner(System.in);
        String ılkHarf= scan.next().toUpperCase();
        if(ılkHarf.equals("P")){
            System.out.println("Haftanın P ile başlayan gunleri= PAZARTESİ, PERSEMBE ve PAZAR'dır.");
        }
        else if(ılkHarf.equals("S")){
            System.out.println("Haftanın S ile başlayan gunleri= SALI'dır.");
        }
        else{
            System.out.println("Haftanın P ile başlayan gunleri= CARSAMBA, CUMA ve CUMARTESI'dir.");
        }*/
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day name...");
        String gun=scan.next().toUpperCase();
        if (gun.equals("PAZARTESI")||gun.equals("SALI")||gun.equals("CARSAMBA")||gun.equals("PERSEMBE")
                ||gun.equals("CUMA")||gun.equals("CUMARTESI")||gun.equals("PAZAR")){
            System.out.println(gun.charAt(0));
            System.out.println(gun.toLowerCase().charAt(1));
            System.out.println(gun.toLowerCase().charAt(2));
        }
        else{System.out.println("Gecerli bir gun ismi giriniz.");}*/
    }











