package interf.sorts;

import interf.sorts.sorter.ISorter;

import java.util.Comparator;

public class SelectionSort implements ISorter {
    private Object[] arr;

    public SelectionSort(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public Object[] Sort(Comparator comparator) {
        Object[] arr = this.arr;
        for (int i = 0; i < arr.length; i++) {
            Object min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[j], min) < 0) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                Object tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
}
