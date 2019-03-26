package com.tylerj.simplevm;

public enum Opcode {
    HALT("HALT"),
    IADD("IADD"),
    ISUB("ISUB"),
    PUSH("PUSH"),
    LOADVALUE("LOADVALUE"),
    READVALUE("READVALUE"),
    NOP("NOP"),
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