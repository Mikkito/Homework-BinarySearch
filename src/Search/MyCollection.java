package Search;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class MyCollection {

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key){
        int min = 0;
        int max = list.size() - 1;
        int mid = (min + max) >>> 1;
        while (min <= max){
            mid = (min + max) >>> 1;
            Comparable<? super T> midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                min = mid + 1;
            else if (cmp > 0)
                max = mid - 1;
            else
                return mid;
        }
        return -mid - 1;
    }
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super  T> c){
        if (c == null)
            return binarySearch((List<? extends Comparable<? super T>>) list, key);
        if (list instanceof RandomAccess || list.size() < 5000)
            return MyCollection.indexedBinarySearch(list, key, c);
        return MyCollection.iteratorBinarySearch(list, key, c);
    }
    private static <T> int indexedBinarySearch(List<? extends T> l, T key, Comparator<? super T> c) {
        int low = 0;
        int high = l.size()-1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = l.get(mid);
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -low - 1;
    }

    private static <T> int iteratorBinarySearch(List<? extends T> l, T key, Comparator<? super T> c) {
        int low = 0;
        int high = l.size()-1;
        ListIterator<? extends T> i = l.listIterator();
        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = get(i, mid);
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid;
        }
        return -low - 1;
    }
    private static <T> T get(ListIterator<? extends T> i, int index) {
        T obj = null;
        int pos = i.nextIndex();
        if (pos <= index) {
            do {
                obj = i.next();
            } while (pos++ < index);
        } else {
            do {
                obj = i.previous();
            } while (--pos > index);
        }
        return obj;
    }
}
