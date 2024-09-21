package lesson_2;

public class MyListDemo {
    public static void main (String[] args) {
        MyList<String> a = new MyLinkedList<>();
        System.out.println(a);
        a.push("One"); System.out.println(a);
        a.push("Two"); System.out.println(a);
        a.add("Three"); System.out.println(a);
        a.add("Four", 2); System.out.println(a);
    }
}
