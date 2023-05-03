package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        // 맵 (Key, Value), 순서보장 x , 중복 x
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("승기1", 10);
        map.put("승기2", 5);
        map.put("승기3", 3);
        map.put("승기4", 33);

        // 총 고객수
        System.out.println(map.size());
        System.out.println("=====================");

        // Value 조회
        System.out.println(map.get("승기1"));
        System.out.println(map.get("승기2"));
        System.out.println(map.get("승기3"));
        System.out.println("=====================");

        // 확인
        if (map.containsKey("승기4")) {
            int point = map.get("승기4");
            map.put("승기4", ++point);
            System.out.println("승기4 누적 포인트 : " + map.get("승기4"));
        } else {
            map.put("승기4", 1);
            System.out.println("승기4님의 신규 등록 (포인트 1)");
        }
        System.out.println("===============================");

        // 삭제
        map.remove("승기4");
        System.out.println(map.get("승기4"));

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수  : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("===============================");

        map.put("승기1", 10);
        map.put("승기2", 5);
        map.put("승기3", 3);
        map.put("승기4", 15);

        // key 확인
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println("===============================");
        // value 확인
        for (Integer value:map.values()) {
            System.out.println(value);
        }

        // ket, value 함께 확인하기
        for (String key: map.keySet()) {
            System.out.println("고객 이름 : " + key + " , 포인트 : " + map.get(key));
        }
        System.out.println("===============================");

        map.put("승기3", 3);
        map.put("승기3", 5);
        map.put("승기3", 6);
        map.put("승기3", 9);
        for (String key: map.keySet()) {
            System.out.println("고객 이름 : " + key + " , 포인트 : " + map.get(key));
        }
    }
}
