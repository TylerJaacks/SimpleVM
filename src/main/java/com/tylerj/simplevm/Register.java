package com.tylerj.simplevm;

public class Register {
    private int iValue;
    private float fValue;
    private final String name;

    Register(String name) {
        this.name = name;
        this.iValue = 0;
        this.fValue = 0.0f;
    }

    int getiValue() {
        return this.iValue;
    }

    void setiValue(int iValue) {
        this.iValue = iValue;
    }

    float getfValue() {
        return this.fValue;
    }

    void setfValue(int fValue) {
        this.fValue = fValue;
    }

    public String getName() {
        return this.name;
    }
}