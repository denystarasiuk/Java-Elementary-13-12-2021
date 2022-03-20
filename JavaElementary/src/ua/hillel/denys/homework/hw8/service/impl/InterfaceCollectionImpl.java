package ua.hillel.denys.homework.hw8.service.impl;

import ua.hillel.denys.homework.hw8.service.InterfaceCollection;

import java.util.Arrays;
import java.util.Iterator;

public class InterfaceCollectionImpl implements InterfaceCollection, Iterable<Object> {

    private Object[] ArrayInterfaceCollection;
    private int count;

    public InterfaceCollectionImpl() {
        ArrayInterfaceCollection = new Object[3];
        count = 0;
    }

    private void checkCollectionLength() {
        if (ArrayInterfaceCollection.length < count + 1) {
            Object[] bigArrayInterfaceCollection = new Object[ArrayInterfaceCollection.length + 3];
            System.arraycopy(ArrayInterfaceCollection, 0, bigArrayInterfaceCollection, 0, ArrayInterfaceCollection.length);
            ArrayInterfaceCollection = bigArrayInterfaceCollection;
        }
    }

    @Override
    public boolean add(Object o) {
        checkCollectionLength();
        ArrayInterfaceCollection[count] = o;
        count++;
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        checkCollectionLength();
        if (index > count) {
            index = count;
        }
        if (ArrayInterfaceCollection.length - 1 - index >= 0)
            System.arraycopy(ArrayInterfaceCollection, index, ArrayInterfaceCollection, index + 1, ArrayInterfaceCollection.length - 1 - index);
        ArrayInterfaceCollection[index] = o;
        count++;
        return true;
    }

    public void deleteIndex(int index) {
        if (index >= ArrayInterfaceCollection.length) {
            System.out.println("Индекса с таким номером нет!");
        }
        for (int i = index; i < count; i++) {
            ArrayInterfaceCollection[i] = ArrayInterfaceCollection[i + 1];
        }
        count--;
    }

    @Override
    public boolean delete(Object o) {
        for (int i = 0; i < count; i++) {
            if (ArrayInterfaceCollection[i].equals(o)) {
                deleteIndex(i);
            }
        }
        return true;
    }

    @Override
    public Object get(int index) {
        if (index > count) {
            return "Индекса с таким номером нет!";
        }
        return ArrayInterfaceCollection[index];
    }

    @Override
    public boolean contain(Object o) {
        for (int i = 0; i < count; i++) {
            if (ArrayInterfaceCollection[i].equals(o)) {
                return true;
            }
        }
        System.out.println("Такого значения в массиве нет!");
        return false;
    }

    @Override
    public boolean equals(InterfaceCollection str) {
        if (count != str.size()) {
            System.out.println("Коллекции не равны по индексу!");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (!ArrayInterfaceCollection[i].equals(str.get(i))) {
                System.out.println("Коллекции не равны по значению!");
                return false;
            }
        }
        System.out.println("Коллекции равны!");
        return true;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < ArrayInterfaceCollection.length; i++) {
            ArrayInterfaceCollection[i] = null;
        }
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "InterfaceCollectionImpl{" +
                "ArrayInterfaceCollection=" + Arrays.toString(ArrayInterfaceCollection) +
                ", count=" + count +
                '}';
    }

    @Override
    public Iterator<Object> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Object> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public Object next() {
            return ArrayInterfaceCollection[currentIndex++];
        }
    }
}
