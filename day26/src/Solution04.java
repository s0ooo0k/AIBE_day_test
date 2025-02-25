import java.util.*;

public class Solution04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 원시타입은 wrapper 클래스가 필요하다
        // List~list => 인터페이스 / new ArrayList<>() 구현체?

        list.add("Java");
        list.add("Python");
        list.add("JS");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());


        // Map Set
        Map<String, Integer> map = new HashMap<>();
        map.put("자바", 100);
        map.put("python", 200);
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());

        Set<String> set = new HashSet<>();
        set.add("자바");
        set.add("자바");
        set.add("자바");
        set.add("파이썬");
        System.out.println("set = " + set);
        System.out.println("set.size() = " + set.size());

    }
}
