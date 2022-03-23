package day04_ifStatements;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun = scan.next().toUpperCase();
        if (gun.equals("PAZARTESI") || gun.equals("SALI") || gun.equals("CARSAMBA") || gun.equals("PERSEMBE")
                || gun.equals("CUMA") || gun.equals("CUMARTESI") || gun.equals("PAZAR")) {
            System.out.println(gun.charAt(0) + " " + gun.toLowerCase().charAt(1) + " " + gun.toLowerCase().charAt(2));
        } else {
            System.out.println("Gecerli bir gun ismi giriniz.");
        }
    }}
