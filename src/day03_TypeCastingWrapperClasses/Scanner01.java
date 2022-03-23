package day03_TypeCastingWrapperClasses;
import java.util.Scanner;
    public class Scanner01 {
        public static void main(String[] args) {
            //scanner class is used to get data from user in Java
            //how will we get data from user
            //kullanicidan bilgi almak icin Scanner methodu kullanilir
            //scan object adidir
            //new siniftan object olusturmak icin kullanilan anahtar kelimedir
            //new yazmazsan Java object i yaratamaz.
            //new java ya object olusturmak icin emir kelimesidir
            //object in yaratilacagi class yeridir
            //System.in kullanicidan alinan bilgiyi buraya getir demektir
            //System.out.println(); bu kisim kodlarimizin disinda olan konsola yazdiracagimiz icin out yazilir
            //System.in ise kodlarimizin icine getir demektir

            //first step:
            Scanner scan=new Scanner(System.in);
            // second step:
            System.out.println("Enter your age");
            //3. step
            int age=scan.nextInt();
            //kullanicidan yasini istedigimiz inicn scan.nextInt yani yasi getir deriz
            System.out.println("The user's age is " + age);
        }

    }
