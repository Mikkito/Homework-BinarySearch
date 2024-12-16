package Search;
import java.util.Comparator;

public class MyArrays {

    static void rangeCheck(int fromIndex, int toIndex, int arrayLength){
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex: " + fromIndex + "> toIndex: " + toIndex);
        if (fromIndex < 0)
            throw new IllegalArgumentException("fromIndex: " + fromIndex + "< 0");
        if (toIndex > arrayLength)
            throw new IllegalArgumentException("toIndex: " + toIndex + "> length: " + arrayLength);
    }
    public static int binarySearch(byte[] a, byte key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(char[] a, char key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(double[] a, double key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(float[] a, float key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(int[] a, int key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(long[] a, long key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(short[] a, short key){
        int min = 0;
        int max = a.length - 1;
        while (min <= max){
            int mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = min + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key){
        rangeCheck(fromIndex, toIndex, a.length);
        int min = fromIndex;
        int max = toIndex - 1;
        int mid;
        while (min <= max){
            mid = min + max / 2;
            if (key < a[mid])
                max = mid - 1;
            else if (key > a[mid])
                min = mid + 1;
            else return mid;
        }
        return -min - 1;
    }
    public static <T> int binarySearch(T[] a, T key, Comparator c){
        int min = 0;
        int max = a.length;
        int mid = min + max >>> 1;
        if (c == null){
            while (min <= max){
                mid = min + max >>> 1;
                Comparable midValue = (Comparable) a[mid];
                int cmp = midValue.compareTo(key);
                if (cmp < 0)
                    min = mid + 1;
                else if (cmp > 0)
                    max = mid - 1;
                else return mid;
            }
            return -mid - 1;
        }
        while (min <= max){
            mid = min + max >>> 1;
            T midValue = a[mid];
            int cmp = c.compare(midValue, key);
            if (cmp < 0)
                min = mid + 1;
            else if (cmp > 0)
                max = mid - 1;
            else return mid;
        }
        return -mid - 1;
    }
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c){
        int min = fromIndex;
        int max = toIndex - 1;
        int mid = min + max >>> 1;
        if (c == null){
            while (min <= max){
                mid = min + max >>> 1;
                Comparable midValue = (Comparable) a[mid];
                int cmp = midValue.compareTo(key);
                if (cmp < 0)
                    min = mid + 1;
                else if (cmp > 0)
                    max = mid - 1;
                else return mid;
            }
            return -mid - 1;
        }
        while (min <= max){
            mid = min + max >>> 1;
            T midValue = a[mid];
            int cmp = c.compare(midValue, key);
            if (cmp < 0)
                min = mid + 1;
            else if (cmp > 0)
                max = mid - 1;
            else return mid;
        }
        return -mid - 1;
    }
    public static String toString(int[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(char[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(byte[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(short[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(long[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(String[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(float[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(double[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(boolean[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(a[i]);
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
    public static String toString(Object[] a){
        if (a == null)
            return "Null";
        if (a.length == 0)
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = 0;
        while (i < a.length){
            str.append(String.valueOf(a[i]));
            if (i == a.length - 1)
                break;
            str.append(", ");
            i++;
        }
        return str.append("]").toString();
    }
}
