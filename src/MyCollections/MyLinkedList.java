package MyCollections;

public class MyLinkedList<T> implements MyList<T> {
    private int length;
    private Node<T> head,
            tail;

    static class Node<T> {
        T value;
        Node<T> next,
                prev;

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
        tail = null;
        length = 0;
    }

    public MyLinkedList(MyLinkedList<T> list) {
        if (list == null || list.head == null) {
            new MyLinkedList<>();
        } else {
            tail = head = new Node<>(list.head.value);
            Node<T> srcNode = list.head;
            length = 1;
            while (srcNode.next != null) {
                tail.next = new Node<>(srcNode.next.value, srcNode.next.prev, srcNode.next.prev);
                tail = tail.next;
                srcNode = srcNode.next;
                length++;
            }
        }
    }

    public MyLinkedList(T[] elems) {
        if (elems == null || elems.length == 0) {
            new MyLinkedList<T>();
        } else {
            tail =  head = new Node<>(elems[0]);
            length = 1;
            for (var i = 1; i < elems.length; i++) {
                tail.next = new Node<>(elems[i], tail, null);
                tail = tail.next;
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
        Node<T> newNode = new Node<>(value, null, head);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        length++;
    }

    @Override
    public void add(T value) {
         Node<T> newNode = new Node<>(value,tail,null);
         if (head == null) {
             tail = head = newNode;
         } else {
             tail =  tail.next = newNode;
         }
         length++;
    }

    @Override
    public T pop() {
        T result = null;
        if (head == tail) {
            if (head != null) {
                result = head.value;
                tail = head = null;
            }
        } else {
            result = head.value;
            head = head.next;
        }
        length--;
        return  result;
   }

    @Override
    public T remove() {
        T result = null;
        if (head == tail) {
            if (head != null) {
                result = head.value;
                tail = head = null;
            }
        } else {
            result = tail.value;
            tail = tail.prev;
        }
        length--;
        return result;
    }

    // операции с индексированием
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
        if (index < 0 || index >= length) {
            System.out.println("Выход за пределы диапазона");
            return null;
        }
        return getNode(index).value;
    }

    @Override
    public void add(T value, int index) {
        if (index == 0) {
            push(value);
            return;
        }

        var currNode = getNode(index);

        Node<T> newNode;
        newNode = new Node<>(value, currNode.prev, currNode);
        currNode.prev.next = newNode;
    }

    @Override
    public T remove(int index) {
        System.out.println("не реализовано");
        return null;
    }
}
