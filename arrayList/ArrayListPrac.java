package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("승기1");
        list.add("승기2");
        list.add("승기3");
        list.add("승기4");
        list.add("승기5");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("====================");

        // 삭제
        System.out.println("신청 학생 수 : " + list.size());
        list.remove("승기4");
        System.out.println("신청 학생 수 : " + list.size());
        System.out.println(list.get(3));
        System.out.println("====================");

        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() -1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());
        System.out.println("====================");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("====================");

        // 변경
        System.out.println(list.get(0));
        list.set(0, "승기가 들어감");
        System.out.println(list.get(0));
        System.out.println("=========================");

        // 확인 (인덱스 위치 확인 - indexOf)
        System.out.println(list.indexOf("승기가 들어감"));
        // 확인 (포함 여부 - contains)
        if (list.contains("승기가 들어감")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("=========================");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생수 :" + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("=========================");

        // 새로 추가
        list.add("승기2");
        list.add("승기1");
        list.add("승기5");
        list.add("승기4");
        list.add("승기3");

        // 정렬 (Collections.sort)
        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }

    }
}
