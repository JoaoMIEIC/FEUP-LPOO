package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    List<Integer> list;

    ListFilterer(List<Integer> list){
        this.list = list;
    }

    public List<Integer> filter(GenericListFilter filter){
        List<Integer> newList = new ArrayList<>();
        for(Integer number : list){
            if(filter.accept(number))
                newList.add(number);
        }
        return newList;
    }
}
