package day04_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //ask user to enter an integar print even
        //if the integar is even
        //print odd if the integar is odd

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integar to check if is even or odd...");
        int num=scan.nextInt();
//even=means divisible by 2,
        // odd means not divisible by 2
        //"modulus" operators gives you the remainder in a division operation
        // == means equal,  !=means does not equal
        //!true means false , !false means true,  !!true means true

        if (num % 2==0) {
            System.out.println("even");

        }
        if (num % 2!=0) {
            System.out.println("odd");

        }

    }
}
