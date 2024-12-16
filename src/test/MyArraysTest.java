package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import Search.MyArrays;
import java.util.Comparator;



public class MyArraysTest {
    @Test
    public void testBinarySearchInt(){
        int[] testarr = new int[]{12, 23, 43, 45, 56, 73, 78};
        int testvalue = MyArrays.binarySearch(testarr, 43);
        assertEquals(2 , testvalue);
    }
    @Test
    public void testBinarySearchLong(){
        long[] testarr = new long[]{12L, 23L, 43L, 45L, 56L, 73L, 78L};
        int testvalue = MyArrays.binarySearch(testarr, 56);
        assertEquals(4, testvalue);
    }
    @Test
    public void testBinarySearchShort(){
        short[] testarr = new short[] {12, 23, 43, 45, 56, 73, 78};
        short key = 56;
        int testvalue = MyArrays.binarySearch(testarr, key);
        assertEquals(4, testvalue);
    }
    @Test
    public void testBinarySearchByte(){
        byte[] testarr = new byte[] {1, 3, 4, 6, 7, 10};
        byte key = 4;
        int testvalue = MyArrays.binarySearch(testarr, key);
        assertEquals(2, testvalue);
    }
    @Test
    public void testBinarySearchChar(){
        char[] testarr = new char[] {'1', '3', '4', '6', '7', '9'};
        char key = '6';
        int testvalue = MyArrays.binarySearch(testarr, key);
        assertEquals(3, testvalue);
    }
    @Test
    public void testBinarySearchDouble(){
        double[] testarr = new double[] {2.3, 3.3, 3.5, 4.6, 5.4, 6.4, 7.5};
        double key = 5.4;
        int testvalue = MyArrays.binarySearch(testarr, key);
        assertEquals(4, testvalue);
    }
    @Test
    public void testBinarySearchFloat(){
        float[] testarr = new float[] {2.3f, 3.3f, 3.5f, 4.6f, 5.4f, 6.4f, 7.5f};
        float key = 5.4f;
        int testvalue = MyArrays.binarySearch(testarr, key);
        assertEquals(4, testvalue);
    }
    @Test
    public void testBinarySearchT(){
        Box[] boxes = new Box[5];
        boxes[0] = new Box(1, "item1");
        boxes[1] = new Box(3, "item2");
        boxes[2] = new Box(4, "item4");
        boxes[3] = new Box(6, "item5");
        boxes[4] = new Box(7, "item7");
        Box testbox = new Box(4, "item4");
        Comparator find = new findItem();
        int testvalue = MyArrays.binarySearch( boxes, testbox , find);
        assertEquals( 2, testvalue);
    }
    @Test
    public void testBinarySearchTId(){
        Box[] boxes = new Box[5];
        boxes[0] = new Box(1, "item1");
        boxes[1] = new Box(3, "item2");
        boxes[2] = new Box(4, "item4");
        boxes[3] = new Box(6, "item5");
        boxes[4] = new Box(7, "item7");
        Box testbox = new Box(6, "item5");
        Comparator find = new findItem();
        int testvalue = MyArrays.binarySearch(boxes, 2, 4, testbox, find);
        assertEquals(3, testvalue);
    }

    @Test
    public void testBinarySearchIntIdFalse(){
        int[] testarr = new int[]{12, 23, 43, 45, 56, 73, 78};
        int testvalue = MyArrays.binarySearch(testarr,1, 5, 44);
        assertEquals(-4 , testvalue);
    }




}
class Box implements Comparable<Box>{
    private String store;
    private int number;
    public Box(int num, String store){
        this.number = num;
        this.store = store;
    }

    public int getNumber() {
        return number;
    }

    public String getStore() {
        return store;
    }

    @Override
    public int compareTo(Box a){
        return this.getNumber() - a.getNumber();
    }
}
class findItem implements Comparator<Box>{
    @Override
    public int compare( Box a, Box b){
        return a.getNumber() - b.getNumber();
    }
}