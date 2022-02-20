package ua.hillel.denys.homework.hw7;

import java.util.Arrays;

public class ArrayCollection {

    private String[] ArrayCollection;
    private int count;

    public ArrayCollection() {
        ArrayCollection = new String[5];
        count = 0;
    }

    private void checkArrayLength() {
        if (ArrayCollection.length < count + 1) {
            String[] bigArrayCollection = new String[ArrayCollection.length + 2];
            System.arraycopy(ArrayCollection, 0, bigArrayCollection, 0, ArrayCollection.length);
            ArrayCollection = bigArrayCollection;
        }
    }

    public boolean add(String value) {
        checkArrayLength();
        ArrayCollection[count] = value;
        count++;
        return true;
    }

    public boolean add(int index, String value) {
        checkArrayLength();
        if (index > count) {
            index = count;
        }
        if (ArrayCollection.length - 1 - index >= 0)
            System.arraycopy(ArrayCollection, index, ArrayCollection, index + 1, ArrayCollection.length - 1 - index);
        ArrayCollection[index] = value;
        count++;
        return true;
    }

    public boolean delete(int index) {
        if (index >= ArrayCollection.length) {
            System.out.println("Индекса с таким номером нет!");
        }
        for (int i = index; i < count; i++) {
            ArrayCollection[i] = ArrayCollection[i + 1];
        }
        count--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < count; i++) {
            if (ArrayCollection[i].equals(value)) {
                delete(i);
            }
        }
        return true;
    }

    public String get(int index) {
        if (index > count) {
            return "Индекса с таким номером нет!";
        }
        return ArrayCollection[index];
    }


    @Override
    public String toString() {
        return "ArrayCollection{" +
                "ArrayCollection=" + Arrays.toString(ArrayCollection) +
                ", count=" + count +
                '}';
    }

}
