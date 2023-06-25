package multiArray;

public class ASCIIPrac {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c = 'A';
        // 알파벳 대문자(A)는 65부터 시작
        // 알파벳 소문자(B)는 97부터 시작
        // 숫자(0)는 48부터 시작
        System.out.println(c); // 0
        System.out.println((int) c); // 48

        c = '1';
        System.out.println(c); // 1
        System.out.println((int) c); // 49

        c++;
        System.out.println(c); // 2
        System.out.println((int) c); // 50

        System.out.println("============================================");

        // 세로(10) x 가로(15) 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // 세로 기준
            for (int j = 0; j < seats3[i].length; j++) { // 가로 기준
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
