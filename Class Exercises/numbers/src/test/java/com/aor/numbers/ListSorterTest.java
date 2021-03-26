package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    @Test
    public void sort() {

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(helper());

        Assertions.assertEquals(helper2(), sorted);
    }
    public List<Integer> helper(){
        return Arrays.asList(1,2,4,2);
    }

    public List<Integer> helper2(){
        return Arrays.asList(1, 2, 2,4);
    }
}
