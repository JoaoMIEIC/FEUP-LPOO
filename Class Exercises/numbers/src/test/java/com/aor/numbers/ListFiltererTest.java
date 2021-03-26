package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    List<Integer> list = helperPos();

    @Test
    public void filterPositive(){
        GenericListFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(list);

        List<Integer> expected = helperPosAns();

        List<Integer> actual = filterer.filter(filter);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void filter_with_divisible(){
        GenericListFilter filter = new DivisibleByFilter(2);
        ListFilterer filterer = new ListFilterer(list);

        List<Integer> expected = helperDivAns();

        List<Integer> actual = filterer.filter(filter);

        Assertions.assertEquals(expected, actual);
    }

    public List<Integer> helperPos(){
        return Arrays.asList(-1,2,3);
    }

    public List<Integer> helperPosAns(){
        return Arrays.asList(2,3);
    }

    public List<Integer> helperDivAns(){
        return Arrays.asList(2);
    }


}
