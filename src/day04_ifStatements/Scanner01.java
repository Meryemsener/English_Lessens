package day04_ifStatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Type a program which calculates the valume of a rectangular prism whose length,
        //width and height are entered by user.
        //hint:valume of a rectangular prism is width*length*height

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        double length=scan.nextDouble();
        System.out.println("Enter the width");
        double width=scan.nextDouble();
        System.out.println("Enter the height");
        double height=scan.nextDouble();
        System.out.println("The volume is " + length*width*height);
    }
}
