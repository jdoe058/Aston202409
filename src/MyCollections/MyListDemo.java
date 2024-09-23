package MyCollections;


public class MyListDemo {
    public static void main (String[] args) {
        MyList<String> a = new MyLinkedList<>(), c =
            new MyLinkedList<>("5 2 7 4 1 6 3 8".split(" "));
        System.out.println(a);
        a.push("One"); System.out.println(a);
        a.push("Two"); System.out.println(a);
        a.add("Three"); System.out.println(a);
        a.add("Four", 2); System.out.println(a);
        a.add("Four", 4); System.out.println(a);
        a.add("Five", 0); System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.get(5));

        a.pop();
        System.out.println(a);

        a.remove();
        System.out.println(a);


        System.out.println(c);
        System.out.println( c.pop() + " / " + c);
        c.push("11"); System.out.println(c);
        c.remove(); System.out.println(c);
        MyList.sort(c); System.out.println(c);
    }
}
