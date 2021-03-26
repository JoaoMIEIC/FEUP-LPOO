package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private Integer number;

    DivisibleByFilter(Integer number){
        this.number = number;
    }

    @Override
    public boolean accept(Integer number) {
        if(number % this.number == 0)
            return true;
        return false;
    }
}
