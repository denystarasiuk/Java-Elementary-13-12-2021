package service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceCollectionImplTest {

    private InterfaceCollectionImpl interfaceCollection;

    @BeforeEach
    void setUp() {
        interfaceCollection = new InterfaceCollectionImpl();
        interfaceCollection.add("ValueOne");
        interfaceCollection.add(2);
        interfaceCollection.add(3);
    }

    @AfterEach
    void tearDown() {
        interfaceCollection.clear();
    }

    @Test
    void addPositive() {
        interfaceCollection.add(4);
        assertEquals(4, interfaceCollection.get(3));
        assertEquals(4, interfaceCollection.size());
    }

    @Test
    void addNegative() {
        Assertions.assertNotSame(2, interfaceCollection.add("Two"));
    }

    @Test
    void addIndexPositive() {
        interfaceCollection.add(2, "Three");
        interfaceCollection.add(4, "Five");
        assertEquals("Three", interfaceCollection.get(2));
        assertEquals("Five", interfaceCollection.get(4));
        assertEquals(5, interfaceCollection.size());
    }

    @Test
    void addIndexNegative() {
        assertNotEquals("Three", interfaceCollection.get(2));
        assertNotEquals("Five", interfaceCollection.get(4));
        assertNotEquals(2, interfaceCollection.size());
    }

    @Test
    void deleteIndexPositive() {
        assertTrue(interfaceCollection.deleteIndex(1));
    }

    @Test
    void deleteIndexNegative() {
        assertTrue(interfaceCollection.deleteIndex(20));
    }

    @Test
    void deletePositive() {
        assertTrue(interfaceCollection.delete(2));
        assertEquals("ValueOne", interfaceCollection.get(0));
        assertEquals(2,interfaceCollection.size());
    }

    @Test
    void deleteNegative() {
        assertFalse(interfaceCollection.delete("One"));
        assertEquals(3,interfaceCollection.size());
    }

    @Test
    void getPositive() {
        assertEquals("ValueOne", interfaceCollection.get(0));
        assertEquals(2, interfaceCollection.get(1));
    }

    @Test
    void getNegative() {
        assertNotEquals(2, interfaceCollection.get(0));
    }

    @Test
    void containPositive() {
        assertTrue(interfaceCollection.contain("ValueOne"));
    }

    @Test
    void containNegative() {
        assertFalse(interfaceCollection.contain(10));
    }

    @Test
    void testEqualsPositive() {
        InterfaceCollectionImpl interfaceCollection1 = new InterfaceCollectionImpl();
        interfaceCollection1.add("ValueOne");
        interfaceCollection1.add(2);
        interfaceCollection1.add(3);
        assertTrue(interfaceCollection.equals(interfaceCollection1));
    }

    @Test
    void testEqualsNegative() {
        InterfaceCollectionImpl interfaceCollection2 = new InterfaceCollectionImpl();
        interfaceCollection2.add(10);
        interfaceCollection2.add(11);
        interfaceCollection2.add(12);
        assertFalse(interfaceCollection.equals(interfaceCollection2));
    }

    @Test
    void clearPositive() {
        interfaceCollection.clear();
        assertEquals(0, interfaceCollection.size());
    }

    @Test
    void clearNegative() {
        interfaceCollection.clear();
        assertNotEquals(1, interfaceCollection.size());
    }

    @Test
    void sizePositive() {
        assertEquals(3, interfaceCollection.size());
    }

    @Test
    void sizeNegative() {
        assertNotEquals(2, interfaceCollection.size());
    }

}