package lesson_2;

public interface MyList<T> {
    void push (T value);
    void add(T value);
    void add(T value, int index);
    void add(MyList<T> values, int index);

    T get(int index);
    MyList<T> get(int index, int count);

    void remove(int index);
    void remove(int index, int count);
}
