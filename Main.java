import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int max = 0, pos;    // 가장 작은값으로 초기화
        String[] strArr = str.split(" ");
        for(String s : strArr) {
            int len = s.length();
            if(len > max) {
                max = len;
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}