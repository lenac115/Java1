package org.example.day12;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Java");
        stringSet.add("Spring");
        stringSet.add("JSP");
        stringSet.add("Java");
        stringSet.add("DBMS");

        System.out.println(stringSet.size());

        stringSet.remove("Java");

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//      stringSet.clear();

        if (stringSet.isEmpty()) {
            System.out.println("비었습니다.");
        } else {
            System.out.println("비지 않았습니다.");
        }


        Map<String, List<String>> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("홍길동");
        stringList.add("홍길동");
        stringList.add("홍길동");
        map.put("홍길동", stringList);

        Set<String> strings = map.keySet();
        Iterator<String> iterator1 = strings.iterator();

        while (iterator1.hasNext()) {
            String next = iterator1.next();
            List<String> stringList1 = map.get(next);
            System.out.println(stringList1);

        }

        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(new Student(50, "홍길동4"), 1);
        studentMap.put(new Student(50, "홍길동1"), 2);
        studentMap.put(new Student(50, "홍길동2"), 3);
        studentMap.put(new Student(50, "홍길동3"), 4);

        Set<Map.Entry<Student, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<Student, Integer> entry : entries) {
            Student key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("이름 : " + key.getName() + ", 키 : " + value);
        }

        Map<String, String> map1 = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        map1.put("spring", "qwer");
        map1.put("summer", "qwer1234");
        map1.put("fall", "qwer123");
        map1.put("winter", "qwer123");

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            System.out.println("아이디 : ");
            String id = sc.nextLine();

            System.out.println("비밀번호 : ");
            String password = sc.nextLine();

            System.out.println("=============");

            if (map.containsKey(id)) {
                String mapPassword = map1.get(id);
                if (mapPassword.equals(password)) {
                    System.out.println("로그인에 성공했습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                }

            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }

        Stack<Coin> coinStack = new Stack<>();

        coinStack.push(new Coin(100));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(50));

        while(!coinStack.isEmpty()){
            Coin pop = coinStack.pop();
            System.out.println(pop.getValue());
        }
    }
}
