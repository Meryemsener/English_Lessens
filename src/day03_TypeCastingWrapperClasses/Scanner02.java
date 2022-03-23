package day03_TypeCastingWrapperClasses;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);//burada scanner kirmizi olursa import class a ihtiyacin var
        System.out.println("Enter your fullname");

        String fullName=scan.nextLine();
        System.out.println("The user names is "+ fullName);
    }
}
