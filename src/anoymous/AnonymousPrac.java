package anoymous;

public class AnonymousPrac {
    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c1.order("라떼");

        // 익명 클래스 - 이름이 없는 클래스
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크는 서비스입니다.");
            }

            @Override
            public void returnTray() {
                super.returnTray();
                System.out.println("자리에 두시면 제가 치울게요.");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + "나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피잔 반납");
    }
}