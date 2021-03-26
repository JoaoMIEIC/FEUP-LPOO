package com.aor.numbers;

public class PositiveFilter implements GenericListFilter{
    @Override
    public boolean accept(Integer number) {
        if(number.compareTo(0) > 0)
            return true;
        return false;
    }
}
