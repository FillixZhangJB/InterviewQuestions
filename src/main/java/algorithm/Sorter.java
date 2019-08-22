package algorithm;

import java.util.Comparator;

/**
 * Created by zjb on 2019/8/22.
 */
public interface Sorter {

    /**
     * @param list 待排序的数组
     * @param <T>
     */
    public <T extends Comparable<T>> void sort(T[] list);

    /**
     * @param list 待排序数组
     * @param comp 比较两个对象的比较器
     * @param <T>
     */
    public <T> void sort(T[] list, Comparator<T> comp);
}
