package service;

public interface InterfaceCollection {

    boolean add(Object o);

    boolean add(int index, Object o);

    boolean delete(Object o);

    public Object get(int index);

    boolean contain(Object o);

    boolean equals (InterfaceCollection str);

    boolean clear();

    public int size();
}
