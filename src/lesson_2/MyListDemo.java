package lesson_2;

import java.util.List;

public class MyListDemo {
    public static void main (String[] args) {
        MyList<String> a = new MyLinkedList<>(), b, c =
            new MyLinkedList<>("1 2 3 4 5 6 7 8".split(" "));
        System.out.println(a);
        a.push("One"); System.out.println(a);
        a.push("Two"); System.out.println(a);
        a.add("Three"); System.out.println(a);
        a.add("Four", 2); System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.get(4));
        b = new MyLinkedList<>((MyLinkedList<String>) a);
        System.out.println(b);
        System.out.println(c);
    }
}
