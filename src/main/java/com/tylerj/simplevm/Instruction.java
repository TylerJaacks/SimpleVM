package com.tylerj.simplevm;

public class Instruction {
    private final Opcode opcode;
    private final int[] operands;
    private final Register[] registers;

    public Instruction(Opcode opcode) {
        this.opcode = opcode;
        this.operands = new int[0];
        this.registers = new Register[0];
    }

    public Instruction(Opcode opcode, int... operands) {
        this.opcode = opcode;
        this.operands = operands;
        this.registers = new Register[0];
    }

    public Instruction(Opcode opcode, Register... registers) {
        this.opcode = opcode;
        this.operands = new int[0];
        this.registers = registers;
    }

    public Instruction(Opcode opcode, Register register, int... operands) {
        this.opcode = opcode;
        this.operands = operands;
        this.registers = new Register[0];
    }

    public Instruction(Opcode opcode, int operand, Register... registers) {
        this.opcode = opcode;
        this.operands = new int[0];
        this.registers = registers;
    }

    public Opcode getOpcode() {
        return opcode;
    }

    public int[] getOperands() {
        return operands;
    }

    public Register[] getRegisters() {
        return registers;
    }
}
