package algorithm;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by zjb on 2019/8/22.
 */
public class BinarySearchTest {

    Integer[] list;

    @Before
    public void before() {
        list = new Integer[]{1, 2, 4, 5, 3};
    }

    @org.junit.Test
    public void binarySearch() throws Exception {
        Sorter sorter = new BubbleSorter();
        sorter.sort(list);
        int index = BinarySearch.binarySearch(list, 2);
        System.out.println(index);
    }
}