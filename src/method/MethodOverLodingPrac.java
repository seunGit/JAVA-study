package method;

public class MethodOverLodingPrac {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 전달값(Parameter)의 타입이 다르거나 전달값의 갯수가 다르면 중복해서 정의 가능하다
        System.out.println(getPower(3));
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3));

    }
}
