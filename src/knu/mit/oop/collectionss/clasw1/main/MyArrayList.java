package knu.mit.oop.collectionss.clasw1.main;

public class MyArrayList {
//    private String[] arrays = new String[10];
//    private int size=0;
//    public void add(String s){
//        arrays[size] = s;
//        size++;
//        if (size == arrays.length){
//            String[] newArray = new String[arrays.length *2];
//            for (int i = 0; i < arrays.length; i++) {
//                newArray[i] = arrays[i];
//            }
//            arrays = newArray;
//        }
//    }
//
//    public void remove(int index){
//        if(index >= 0 && index < size) {
//            for (int i = index; i < size - 1; i++) {
//                arrays[i] = arrays[i + 1];
//            }
//            size--;
//        }
//    }
//
//    public void remove(String s){
//        int index = -1;
//        for (int i = 0; i < size; i++) {
//            if (s.equals(arrays[i])){
//                index = i;
//                break;
//            }
//        }
//        if (index != 1){
//            remove(index);
//        }
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public String get(int index){
//        if(index >= 0 && index < size) {
//            return arrays[index];
//        } else return "Error";
//    }

    private String [] arrays = new String[10];
    int size = 0;

    public void add(String s){
        arrays[size] = s;
        size++;

        if (size == arrays.length) {
            String [] newArray = new String[arrays.length * 2];
            for (int i = 0; i < arrays.length; i++) {
                newArray[i] = arrays[i];
            }
            arrays = newArray;
        }
    }

    public void remove(int index){
        for (int i = index; i <  size -1; i++) {
            arrays[i] = arrays[i + 1];
        }
        size--;
    }

    public int getSize(){
        return size;
    }

    public String get(int index){
        return arrays[index];
    }
}
