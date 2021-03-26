package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(helper());

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(helper());

        Assertions.assertEquals(4, max);
    }

    @Test
    public void max_bug_7263(){

        List<Integer> list1 = Arrays.asList(-1,-4,-5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list1);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void min() {

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(helper());

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        GenericListSort listSorter = Mockito.mock(GenericListSort.class);
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList(),Mockito.any())).thenReturn(Arrays.asList(1, 2, 4));


        List<Integer> list = Arrays.asList(1,2,4,2);

        ListAggregator aggregator = new ListAggregator();
        /*Stubdeduplicator deduplicator = new Stubdeduplicator();
        Stubsorter listSorter = new Stubsorter();*/
        int distinct = aggregator.distinct(list, deduplicator, listSorter);

        Assertions.assertEquals(3, distinct);
    }

    @Test
    public void testDistinct(){
        GenericListSort listSorter = Mockito.mock(GenericListSort.class);
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList(),Mockito.any())).thenReturn(Arrays.asList(1, 2, 4));
        List<Integer> list1 = Arrays.asList(1,2,4,2);

        ListAggregator aggregator = new ListAggregator();

        int distinct = aggregator.distinct(list1,deduplicator,listSorter);

        Assertions.assertEquals(3, distinct);

    }

    public List<Integer> helper(){
        return Arrays.asList(1,2,4,2);
    }
}
