package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    @Test
    public void deduplicate() {

        List<Integer> list = helper();
        List<Integer> expected = helper2();

        GenericListSort listSorter = Mockito.mock(GenericListSort.class);
        Mockito.when(listSorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));

        ListDeduplicator deduplicator = new ListDeduplicator();
        //Stubsorter listSorter = new Stubsorter();
        List<Integer> distinct = deduplicator.deduplicate(list,listSorter);

        Assertions.assertEquals(expected, distinct);
    }

    public List<Integer> helper(){
        return Arrays.asList(1,2,4,2);
    }

    public List<Integer> helper2(){
        return Arrays.asList(1,2,4);
    }
}
