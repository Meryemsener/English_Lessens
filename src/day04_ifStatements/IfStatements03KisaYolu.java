package day04_ifStatements;

import java.util.Scanner;

public class IfStatements03KisaYolu {
    public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a day name");
        String dayNAme=scan.nextLine();
boolean isWeekendDay=dayNAme.equalsIgnoreCase("Saturday") ||
                     dayNAme.equalsIgnoreCase("Sunday");
        if(isWeekendDay){
            System.out.println("Weekend");
        }
        boolean isWeekDay=dayNAme.equalsIgnoreCase("Monday")  ||
                dayNAme.equalsIgnoreCase("Tuesday") ||
                dayNAme.equalsIgnoreCase("Wednesday") ||
                dayNAme.equalsIgnoreCase("Thursday" ) ||
                dayNAme.equalsIgnoreCase("Friday");
        if(isWeekDay){
            System.out.println("Weekday");
        }
    }
}
