package iterator;

import java.util.*;

public class IteratorPrac {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("승기");
        list.add("(알 수 없음)");
        list.add("승기2");
        list.add("(알 수 없음)");
        list.add("승기3");
        list.add("(알 수 없음)");
        list.add("승기4");
        list.add("(알 수 없음)");
        list.add("승기5");

        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("===================");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("===================");

        it = list.iterator(); // 커서를 처음위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===================");

        it = list.iterator(); // 커서를 처음위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove();
            }
        }
        it = list.iterator(); // 커서를 처음위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("===================");

        HashSet<String> set = new HashSet<>();
        set.add("승기4");
        set.add("승기3");
        set.add("승기2");
        set.add("승기1");
        set.add("승기5");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("==========================================");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("승기1", 10);
        map.put("승기2", 7);
        map.put("승기3", 17);
        System.out.println("==========================================");
        // map.iterator() 제공되지 않음

        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("==========================================");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("==========================================");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
