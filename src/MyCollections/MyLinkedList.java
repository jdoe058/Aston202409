package MyCollections;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;

    static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.next = null;
            this.value = value;
        }
    }

    public MyLinkedList() {
        this.head = null;
    }

    //public MyLinkedList(T value) {        this.head = new Node<>(value);    }

    public MyLinkedList(MyLinkedList<T> list) {
        if (list == null || list.head == null) {
            this.head = null;
        } else {
            head = new Node<>(list.head.value);
            Node<T> destNode = head, srcNode = list.head;
            while (srcNode.next != null) {
                destNode.next = new Node<>(srcNode.next.value);
                destNode = destNode.next;
                srcNode = srcNode.next;
            }
        }
    }

    public MyLinkedList(T[] elems) {
        if (elems == null || elems.length == 0) {
            this.head = null;
        } else {
            head = new Node<>(elems[0]);
            Node<T> currNode = head;
            for (var i = 1; i < elems.length; i++) {
                currNode.next = new Node<>(elems[i]);
                currNode = currNode.next;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("MyLinkedList : ");
        Node<T> currentNode = head;
        while (currentNode != null) {
            s.append(currentNode.value).append(" ");
            currentNode = currentNode.next;
        }
        return s.toString();
    }


    @Override
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    @Override
    public void add(T value) {
         Node<T> newNode = new Node<>(value);
         if (head == null) {
             head = newNode;
         } else {
             Node<T> currNode = head;
             while (currNode.next != null) {
                 currNode = currNode.next;
             }
             currNode.next = newNode;
         }
    }

    @Override
    public void add(T value, int index) {
        if (index == 0) {
            push(value);
            return;
        }
        Node<T> newNode = new Node<>(value), currNode = head, prev = null;

        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                newNode.next = currNode;
                prev.next = newNode;
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println("Выход за пределы диапазона");
        }
    }

    @Override
    public T get(int index) {
        Node<T> currNode = head;

        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                return currNode.value;
            } else {
                currNode = currNode.next;
                counter++;
            }
        }
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T remove(int index) {
        System.out.println("не реализовано");
        return null;
    }
}
