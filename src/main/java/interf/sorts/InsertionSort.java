package interf.sorts;

import interf.sorts.sorter.ISorter;

import java.util.Comparator;

public class InsertionSort implements ISorter {
    private Object[] arr;

    public InsertionSort(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public Object[] Sort(Comparator comparator) {
        Object[] arr = this.arr;
        Object key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(arr[j], arr[j + 1]) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
