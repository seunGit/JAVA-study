package method;

public class MethodQuiz {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";

        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "가나다";
        String id = "900220-1234567";
        String phone = "010-1234-1234";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
