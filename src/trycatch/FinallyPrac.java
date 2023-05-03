package trycatch;

public class FinallyPrac {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 엽니다.");
            throw  new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("!! 문제발생 : "+ e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
