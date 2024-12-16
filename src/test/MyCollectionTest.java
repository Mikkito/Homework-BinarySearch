package test;
import Search.MyCollection;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyCollectionTest {
    @Test
    public void testBinarySearchCom(){
        List<Chest> chests = new ArrayList<>();
        chests.add(new Chest(1, "item2", 3));
        chests.add(new Chest(3, "item3", 4));
        chests.add(new Chest(5, "item4", 5));
        chests.add(new Chest(6, "item6", 6));
        chests.add(new Chest(8, "item7",12));
        chests.add(new Chest(11, "item9",34));
        chests.add(new Chest(12, "item12",42));
        Comparator com = new c();
        Chest testChest = new Chest(5, "item4",5);
        int testChestPos = MyCollection.binarySearch(chests, testChest, com);
        assertEquals(2, testChestPos);
    }
    @Test
    public void testBinarySearchFalse(){
        List<Chest> chests = new ArrayList<>();
        chests.add(new Chest(1, "item2", 3));
        chests.add(new Chest(3, "item3", 4));
        chests.add(new Chest(5, "item4", 5));
        chests.add(new Chest(6, "item6", 6));
        chests.add(new Chest(8, "item7",12));
        chests.add(new Chest(11, "item9",34));
        chests.add(new Chest(12, "item12",42));
        Comparator com = new c();
        Chest testChest = new Chest(5, "item10",7);
        int testChestPos = MyCollection.binarySearch(chests, testChest, com);
        assertEquals(-5, testChestPos);
    }
    @Test
    public void testBinarySearch(){
        List<Chest> chests = new ArrayList<>();
        chests.add(new Chest(1, "item2", 3));
        chests.add(new Chest(3, "item3", 4));
        chests.add(new Chest(5, "item4", 5));
        chests.add(new Chest(6, "item6", 6));
        chests.add(new Chest(8, "item7",12));
        chests.add(new Chest(11, "item9",34));
        chests.add(new Chest(12, "item12",42));
        Chest testChest = new Chest(8, "item7",12);
        int testChestPos = MyCollection.binarySearch(chests, testChest);
        assertEquals(4, testChestPos);
    }
}
class Chest implements Comparable<Chest>{
    private String store;
    private int number;
    private int size;
    public Chest(int num, String store, int size){
        this.number = num;
        this.store = store;
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public String getStore() {
        return store;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Chest a){
        return this.getNumber() - a.getNumber();
    }
}
class c implements Comparator<Chest>{
    @Override
    public int compare( Chest a, Chest b){
        return a.getSize() - b.getSize();
    }
}
