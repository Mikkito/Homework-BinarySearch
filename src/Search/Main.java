package Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArr = new int[]{12, 23, 43, 45, 56, 73, 78};
        long[] longArr = new long[]{12L, 23L, 43L, 45L, 56L, 73L, 78L};
        char[] charArr = new char[] {'1', '3', '4', '6', '7', '9'};
        double[] doubleArr = new double[] {2.3, 3.3, 3.5, 4.6, 5.4, 6.4, 7.5};
        List<Chest> chests = new ArrayList<>();
        chests.add(new Chest(1, "item2", 3));
        chests.add(new Chest(3, "item3", 4));
        chests.add(new Chest(5, "item4", 5));
        chests.add(new Chest(6, "item6", 6));
        chests.add(new Chest(8, "item7",12));
        chests.add(new Chest(11, "item9",34));
        chests.add(new Chest(12, "item12",42));
        Chest testChest = new Chest(12, "item12",42);
        if (MyArrays.binarySearch(intArr, 2, 5, 56) == 4)
            System.out.println(MyArrays.toString(intArr) + "Число 56 имеет индекс 4");
        if (MyArrays.binarySearch(longArr, 0, 4, 23L) == 1)
            System.out.println(MyArrays.toString(longArr) + "Число 23 имеет индекс 1");
        if (MyArrays.binarySearch(charArr, 1, 3, '4') == 2)
            System.out.println(MyArrays.toString(charArr) + "Символ 4 имеет индекс 2");
        if (MyArrays.binarySearch(doubleArr, 2, 5, 5.4) == 4)
            System.out.println(MyArrays.toString(doubleArr) + "Число 5.4 имеет индекс 4");
        if (MyCollection.binarySearch(chests, testChest) == 6)
            System.out.println("Искомый chest под индексом 6");
    }
}
class Chest implements Comparable<Chest> {
    private String store;
    private int number;
    private int size;

    public Chest(int num, String store, int size) {
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
    public int compareTo(Chest a) {
        return this.getNumber() - a.getNumber();
    }
}