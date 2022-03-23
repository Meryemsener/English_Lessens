package day03_TypeCastingWrapperClasses;

public class TypeCasting01 {
    public static void main(String[] args) {
        //converting small data type or converting large data type to small data type is colled "type casting".

        //byte< short< int< long< float< double

        //how to convert small data type to large data type=AUTO WIDENING
        byte b=47;//47 byte data type

        int i=b;// 47 is in int data type


        //how to convert large data type to small data type=EXPLICIT NARROWING
        //it is a risc voor your information
        double d=1.2;
        //buyugu kucuge cevirirken java risk almak istemedigi icin riski sen al der
        short s=(short)d;//with (short) you  took the responsibilty

        //convert short to 257 to byte?
        short k=257;
        byte c=(byte)k;
        System.out.println(c);//1
        //consolda 1 cokmasinin sebebi;
        // byte -128..........-1 0 1..........127 ye olan kismmi alir
        //ondan 257 yi icine almasini istedigimizde -128 ile -1 arasinda toplam128 deger,
        //0 bir deger
        //1 ile 128 arasinda toplam 128 deger olur ve toplami da 256 olur.
        //257 yi icine al dedigimizde dongu gibi basa doner ve 257-256=1 olur



    }
}
