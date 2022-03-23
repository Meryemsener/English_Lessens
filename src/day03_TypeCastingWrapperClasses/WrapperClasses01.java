package day03_TypeCastingWrapperClasses;

public class WrapperClasses01 {
    public static void main(String[] args) {

        //non-primitive'ler daha kullanislidir. Primitive ler maymun ise non-p ler insandir
        //P'lerin bas harflerinin buyuk yazildigi ve method eklendigi class lara wrapper denir
        //int---Integer
        //char---Character
        //byte---Byte
        //short---Short
        //long---Long
        //boolean--Boolean
        //float---Float
        //double---Double
        //how to convert primitive data types to wrapper classes=AAUTOBOXING
        //primitive data yi wrapper a cevirme

        char c='d';
        Character wc=c;
        System.out.println(wc);

        int i=12;
        Integer wi=i;
        System.out.println(wi);

        float f=1.2f;
        Float wf=f;
        System.out.println(wf);
        //how to convert wrapper classes to primitieve data types=UNBOXING
        //wrapper class i primitive cevirme
        Short s=23;
        short ps=s;
        System.out.println(ps);
        //method u gormek icin
        System.out.println(Integer.MAX_VALUE);
        //find the min and max value of byte data type
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //find the sum of max value of short min value of long
        System.out.println(Short.MAX_VALUE+Long.MIN_VALUE);
    }
}
