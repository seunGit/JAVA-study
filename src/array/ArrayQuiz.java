package array;

// 신발 사이즈는 250부터 295까지 5단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...
public class ArrayQuiz {
    public static void main(String[] args) {
        int[] shoe = new int[10];
        for (int i = 0; i < shoe.length; i++) {
            shoe[i] = 250 + (5 * i);

        }
        for (int size : shoe) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
