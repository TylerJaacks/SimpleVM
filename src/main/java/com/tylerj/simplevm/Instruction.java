package com.tylerj.simplevm;

/* TODO Cleanup this classes to have a more consistent way of calling the constructor, also maybe make an enum or registers. */
/* OPCODE OPERANDS... */
/* OPCODE */
/* OPCODE REG OPERANDS */
/* OPCODE REG */
public class Instruction {
    private final Opcode opcode;
    private final int[] operands;
    private final String register;

    Instruction(Opcode opcode) {
        this.opcode = opcode;
        this.operands = new int[0];
        this.register = null;
    }

    Instruction(Opcode opcode, int... operands) {
        this.opcode = opcode;
        this.operands = operands;
        this.register = null;
    }

    Instruction(Opcode opcode, String... registers) {
        this.opcode = opcode;
        this.operands = new int[0];
        this.register = null;
    }

    Instruction(Opcode opcode, String register, int... operands) {
        this.opcode = opcode;
        this.operands = operands;
        this.register = register;
    }

    Instruction(Opcode opcode, String register) {
        this.opcode = opcode;
        this.operands = null;
        this.register = register;
    }

    Opcode getOpcode() {
        return opcode;
    }

    int[] getOperands() {
        return operands;
    }

    String getRegister() {
        return this.register;
    }
}
