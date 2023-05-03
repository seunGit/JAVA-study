package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrac {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("승기1");
        list.add("승기2");
        list.add("승기3");
        list.add("승기4");
        list.add("승기5");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가
        list.addFirst("승기0");
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("==============");

        list.addLast("승기6");
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("==============");
        list.add(1, "승기1-1");
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("==============");

        // 삭제
        System.out.println(list.size());
        list.remove(list.size()-1);
        System.out.println(list.size());
        System.out.println("==============");

        // 삭제2
        System.out.println(list.size());
        list.removeFirst(); // 처음 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제
        System.out.println(list.size());
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("==============");

        // 변경
        list.set(0, "승기1-2");
        System.out.println(list.get(0));
        System.out.println("==============");

        // 확인
        System.out.println(list.indexOf("승기1-2"));
        if (list.contains("승기1-2")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }
        System.out.println("==============");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        // 추가
        list.add("승기1");
        list.add("승기2");
        list.add("승기3");
        list.add("승기4");
        list.add("승기5");

        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }
    }
}
