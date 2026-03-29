package lab3.interfaces;

public interface MyCollection<T> {
    void add(T element);
    void remove(T element);
    int size();
}