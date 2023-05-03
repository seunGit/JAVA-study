package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        // Set - 중복 허용하지 않는다. 순서 보장 x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("음료");
        set.add("소금");
        set.add("야채");
        set.add("깻잎");
        set.add("소금");
        set.add("삼겹살");
        set.add("상추");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String s:set) {
            System.out.println(s);
        }
        System.out.println("======================");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("====================");

        // 삭제
        System.out.println("총 구매 상품 수 : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 : " + set.size());

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println(set.size());
        }
        // LinkedHashSet 을 사용하면 순서 보장된다.
        HashSet<Integer> intset = new LinkedHashSet<>();
        intset.add(1);
        intset.add(13);
        intset.add(2);

        for (int i : intset) {
            System.out.println(i);
        }
    }
}
