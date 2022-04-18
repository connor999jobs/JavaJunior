package knu.mit.collections.CarListSet;

public interface CarCollection<T> extends Iterable<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();

    boolean contains(T car);
}