package MyCollections;

public interface MyList<T> {
    void push(T value);

    void add(T value);

    void add(T value, int index);

    T get(int index);

    T pop();

    T remove();

//    T remove(int index);

    // void add(MyList<T> values, int index);
    // MyList<T> get(int index, int count);
    // MyList<T> remove(int index, int count);

    T remove(int index);

}