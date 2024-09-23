package MyCollections;

public class MyLinkedList<T> implements MyList<T> {
    private int length;
    private Node<T> head;

    static class Node<T> {
        T value;
        Node<T> next, prev;

        public Node(T value) {
            next = null;
            prev = null;
            this.value = value;
        }

        public Node (T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public MyLinkedList(MyLinkedList<T> list) {
        if (list == null || list.head == null) {
            new MyLinkedList<>();
        } else {
            head = new Node<>(list.head.value);
            Node<T> destNode = head, srcNode = list.head;
            length = 1;
            while (srcNode.next != null) {
                destNode.next = new Node<>(srcNode.next.value, srcNode.next.prev, srcNode.next.prev);
                destNode = destNode.next;
                srcNode = srcNode.next;
                length++;
            }
        }
    }

    public MyLinkedList(T[] elems) {
        if (elems == null || elems.length == 0) {
            new MyLinkedList<T>();
        } else {
            head = new Node<>(elems[0]);
            Node<T> currNode = head, prevNode;
            length = 1;
            for (var i = 1; i < elems.length; i++) {
                currNode.next = new Node<>(elems[i], currNode, null);
                currNode = currNode.next;
                length++;
            }
        }
    }

    @Override
    public int length() {
        return this.length;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("MyLinkedList (" + length + ") : ");
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
            head.prev = newNode;
        }

        head = newNode;
        length++;
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
             newNode.prev = currNode;
             currNode.next = newNode;

         }
         length++;
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
    public void add(T value, int index) {
        if (index == 0) {
            push(value);
            return;
        }
        var currNode = getNode(index);
        if (currNode == null) {
            System.out.println("Выход за пределы диапазона");
        } else {
            Node<T> newNode;
            newNode = new Node<>(value, currNode.prev, currNode);
            currNode.prev.next = newNode;
        }
    }

    private Node<T> getNode (int index) {
        Node<T> currNode = head;
        while (currNode != null) {
            if (index-- == 0) {
                return currNode;
            } else {
                currNode = currNode.next;
            }
        }
        return null;
    }

    @Override
    public T get(int index) {
        return getNode(index) != null ? getNode(index).value : null;
    }

    @Override
    public T remove(int index) {
        System.out.println("не реализовано");
        return null;
    }
}
