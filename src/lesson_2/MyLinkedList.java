package lesson_2;

public class MyLinkedList<T> implements MyList<T> {
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

    Node<T> head;

     static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.next = null;
            this.value = value;
        }
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
    public void add(MyList<T> values, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public MyList<T> get(int index, int count) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(int index, int count) {

    }
}
