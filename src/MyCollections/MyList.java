package MyCollections;

public interface MyList<T> {
    static void sort(MyList list) { list.sort(); }

    int length();
    String toString();

    void push(T value);
    void add(T value);

    T pop();
    T remove();

    // void add(MyList<T> values, int index);
    // MyList<T> get(int index, int count);
    // MyList<T> remove(int index, int count);

    T get(int index);
    void add(T value, int index);
    T remove(int index);

    void sort();
}