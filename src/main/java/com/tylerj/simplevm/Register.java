package com.tylerj.simplevm;

public class Register {
    private int value;
    private final String name;

    Register(String name) {
        this.name = name;
        this.value = 0;
    }

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }
}