package knu.mit.collections.Queu;

import knu.mit.collections.CarListSet.CarCollection;

public interface CarQueue<T> extends CarCollection<T> {
    boolean add(T car);

    T peek();

    T poll();
}