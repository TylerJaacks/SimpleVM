package com.tylerj.simplevm;

public enum Opcode {
    HALT("HALT"),
    IADD("IADD"),
    ISUB("ISUB"),
    ICONST("ICONST"),
    LOADVALUE("LOADVALUE"),
    READVALUE("READVALUE"),
    PRINT("PRINT");

    private final String opcode;

    Opcode(String opcode) {
        this.opcode = opcode;
    }

    public String getOpcode() {
        return opcode;
    }

    @Override
    public String toString() {
        return opcode;
    }
}