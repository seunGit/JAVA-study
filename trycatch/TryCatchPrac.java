package trycatch;

public class TryCatchPrac {
    public static void main(String[] args) {
        // 예외처리
        // 오류 : 컴파일 오류, 런타임 오류

        try {
            // 확인하고자 하는 코드 작성
            // System.out.println(3 / 0);
            // int[] arr = new int[3];
            // arr[5] = 100;
            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("문제발생" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
