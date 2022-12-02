// 메소드의 실행 흐름 파악하기
// 간단하지만 확실하게 익혀 놓을 것!

public class method1 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();                    // 2. 객체 생성.
        long result1 = mm.add(2, 3);          // 3. 메서드 호출.
        long result2 = mm.subtract(result1, 1);
        long result3 = mm.multiply(6, 2);
        double result4 = mm.divide(4, 2);
        long result = mm.max(4,5);

        System.out.println(result1);                // 4. 결과값 출력.
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result);
    }
}
class MyMath {                                      // 1. 클래스 생성.       메서드 총 4개.
    long add(long a, long b) {                      // add 메서드      메서드는 클래스 영역 내에서만 정의 가능.
//      long result  = a + b;                       // 두줄로 표현가능.
//      return result;
        return a + b;                               // 한줄로 표현.
    }
    long max(long a, long b) {
        long result = 0;                            // 작업값을 담을 변수 선언.
        result = a > b ? a : b;                     // 삼항 연산자.
        return result;

//        if(a<b) {
//            result = a;
//        } else {
//            result = b;
//        }
//        return result;
    }
    long subtract(long a, long b) {
        return a - b;
    }
    long multiply(long a, long b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
}
