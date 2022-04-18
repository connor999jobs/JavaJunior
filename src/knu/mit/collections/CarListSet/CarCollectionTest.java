package knu.mit.collections.CarListSet;

import knu.mit.collections.arrayList.cw1.Car;
import knu.mit.collections.linkedList.CarLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarCollectionTest {
    private CarCollection<Car> carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new CarLinkedList<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
        assertTrue(carCollection.contains(new Car("Brand20", 20)));
        assertFalse(carCollection.contains(new Car("Brand200", 20)));
    }

    @Test
    public void testForeach() {
        int index = 0;
        for (Car car : carCollection) {
            index++;
        }
        assertEquals(100, index);
    }
}