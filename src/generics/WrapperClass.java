package generics;

public class WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스
        // int double float char
        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("================");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("================");
        String s = i.toString();
        System.out.println(s);
        String it = c.toString();
        System.out.println(it);
    }
}
