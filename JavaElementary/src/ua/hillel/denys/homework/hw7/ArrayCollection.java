package ua.hillel.denys.homework.hw7;

public class ArrayCollection {

    private String[] ArrayCollection;
    private int count;

    public ArrayCollection() {
        ArrayCollection = new String[10];
        count = 0;
    }

    private void checkArrayLength() {
        if (ArrayCollection.length < count + 1) {
            int bigSize = (ArrayCollection.length + 2);
            String[] bigArrayCollection = new String[bigSize];
            System.arraycopy(ArrayCollection, 0, bigArrayCollection, 0, ArrayCollection.length);
            ArrayCollection = bigArrayCollection;
        }
    }

    public void add(String value) {

    }


}
