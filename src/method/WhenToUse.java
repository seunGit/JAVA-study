package method;

public class WhenToUse {
    public static int getPower(int number) {
        // int result = number * number;
        // return result;
        // return number * number;
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유 : 중복을 줄일 수 있다.

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2));

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3));

        // 4의 2승을 구하기
        System.out.println(getPower(4, 2));

    }
}
