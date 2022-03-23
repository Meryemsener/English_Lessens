package day04_ifStatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //ask user to enter integar, then
        // print "positive " on the consol if the number is positive
        //print "negative " on the consol if the number is negative
        //print "Neuter " on the consol if the number is zero

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        if(num<0){
            System.out.println("Negative");

        }
        if(num==0){
            System.out.println("Neuter");
        }

    }
}
