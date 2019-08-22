package algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zjb on 2019/8/22.
 */
public class BubbleSorterTest {
    Integer[] list;
    Sorter sorter;

    @Before
    public void before() {
        list = new Integer[]{1, 2, 4, 5, 3};
        sorter = new BubbleSorter();
    }

    @Test
    public void sort() throws Exception {
        sorter.sort(list);
        print();
    }

    @Test
    public void sort1() throws Exception {
        sorter.sort(list, Integer::compare);
        print();
    }

    private void print() {
        for (Integer integer : list) {
            System.out.print(integer + ",");
        }
    }

}