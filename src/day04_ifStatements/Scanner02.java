package day04_ifStatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Get the firstaen, middelname,SSN from user user them like the following
        //Ali Mert Can
        //123456788
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name...");
        String firstName=scan.next();
           //nextLine ile next arasi fark: next line tum cumle ile ilgili next sadece ilk kelimeyi ister
      //kisiden bir kac bilgi istiyorsaniz kelime kelime isteyin
        System.out.println("Enter your middle name...");
        String middleName=scan.next();

        System.out.println("Enter your last name..");
        String lastName=scan.next();

        System.out.println("Enter your SSN...");
        String ssn=scan.next();

        System.out.println(firstName + " " + middleName + " "  + lastName);
        System.out.println(ssn);

    }
}
