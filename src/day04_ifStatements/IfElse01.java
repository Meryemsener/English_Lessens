package day04_ifStatements;

public class IfElse01 {
    public static void main(String[] args) {

        //   ||   //
    // true + true= true
        //true + false=true,
        //false+false=false
        //false+true+true
        if(false || true){
            System.out.println("it is true");
        }
boolean cashMoney =true;
        boolean debitCard=false;
        if(cashMoney  || debitCard) {
            System.out.println("I can bu a PC");
        }
        else {
            System.out.println("I can not buy a pc");
        }


    }
}
