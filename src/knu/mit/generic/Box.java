package knu.mit.generic;

//public class Box<K, V, T> {
//    private K key;
//    private V value;
//    private T value2;
//
//    public Box(K key, V value, T value2) {
//        this.key = key;
//        this.value = value;
//        this.value2 = value2;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//
//    public T getValue2() {
//        return value2;
//    }
//
//    public void setValue2(T value2) {
//        this.value2 = value2;
//    }
//}

import java.io.Serializable;
import java.util.List;

public class Box<T extends Number & Comparable<T> & Serializable> {

    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double avg() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

//    public static void method(List<Number> numbers) {
//
//    }

    public static void method(List<? extends Number> numbers) {

    }

    public static <U> U getFirstElement(List<U> list){
        return list.get(0);
    }

    public  static  <U> void transfer(List<? extends U> scr, List<? super U> dst){
        dst.addAll(scr);
        scr.clear();
    }

    public int compare(Box<?> another) {
        if (avg() > another.avg()) {
            return 1;
        } else if (avg() == another.avg()) {
            return 0;
        } else  {
            return -1;
        }
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}