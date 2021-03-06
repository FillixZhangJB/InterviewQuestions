package algorithm;

import java.util.Comparator;

/**
 * Created by zjb on 2019/8/22.
 * 冒泡排序
 */
public class BubbleSorter implements Sorter {
    @Override
    public <T extends Comparable<T>> void sort(T[] list) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;

            for (int j = 0; j < len - i; ++j) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    swapped = true;
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] list, Comparator<T> comp) {
        boolean swapped = true;
        for (int i = 1, len = list.length; i < len && swapped; ++i) {
            swapped = false;

            for (int j = 0; j < len - i; ++j) {
                if (comp.compare(list[j], list[j + 1]) > 0) {
                    T temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    swapped = true;
                }
            }
        }
    }
}
