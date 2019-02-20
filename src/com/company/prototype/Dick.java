package com.company.prototype;

public class Dick implements Person {

    private final String NAME = "Dick";


    @Override
    public Person clone() {
        return new Dick();
    }
}
