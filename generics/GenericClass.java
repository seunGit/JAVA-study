package generics;

import generics.coffee.*;
import generics.user.User;
import generics.user.VipUser;

public class GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("승기");
        c2.ready();
        System.out.println("===========================");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("승기2");
        c4.ready();
        System.out.println("===========================");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name;
        System.out.println("===========================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);

        Coffee<String> c6 = new Coffee<>("승기3");
        c6.ready();
        String c6Name = c6.name;
        System.out.println(c6Name);

        System.out.println("===========================");
        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("승기4"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("승기5"));
        c8.ready();

        orderCoffee("김영철");
        orderCoffee(36);
        System.out.println("========================");
        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}
