package com.tylerj.simplevm;

public class VirtualMachine {
    private int[] stack;

    private int ip;
    private int sp;

    private Register r1;
    private Register r2;
    private Register r3;
    private Register r4;

    VirtualMachine(int stackSize) {
        this.r1 = new Register("r1");
        this.r2 = new Register("r2");
        this.r3 = new Register("r3");
        this.r4 = new Register("r4");
        this.stack = new int[stackSize];
        this.sp = -1;
    }

    public VirtualMachine(int[] stack, int stackSize, int ip, Register r1, Register r2, Register r3, Register r4, int stackPointer) {
        this.stack = stack;
        this.ip = ip;
        this.sp = stackPointer;
    }

    void execute(Instruction[] instructions) {
        while (ip < instructions.length) {
            Instruction instruction = instructions[ip];

            ip++;

            if (instruction.getOpcode() == Opcode.HALT) {
                return;
            } else if (instruction.getOpcode() == Opcode.PRINT) {
                int i = stack[sp];

                System.out.println(i);
            } else if (instruction.getOpcode() == Opcode.PUSH) {
                int i = instruction.getOperands()[0];

                sp++;

                stack[sp] = i;
            } else if (instruction.getOpcode() == Opcode.IADD) {
                int i = stack[sp];

                sp--;

                int j = stack[sp];

                stack[sp] = j + i;
            } else if (instruction.getOpcode() == Opcode.ISUB) {
                int i = stack[sp];

                sp--;

                int j = stack[sp];

                stack[sp] = j - i;
            } else if (instruction.getOpcode() == Opcode.LOADVALUE) {
                sp++;

                if (instruction.getRegister().equals("r1")) {
                    r1.setValue(instruction.getOperands()[0]);
                } else if (instruction.getRegister().equals("r2")) {
                    r2.setValue(instruction.getOperands()[0]);
                } else if (instruction.getRegister().equals("r3")) {
                    r3.setValue(instruction.getOperands()[0]);
                } else if (instruction.getRegister().equals("r4")) {
                    r4.setValue(instruction.getOperands()[0]);
                } else {
                    throw new IllegalStateException("Unknown register: " + instruction.getRegister());
                }
            } else if (instruction.getOpcode() == Opcode.READVALUE) {
                int i = 0;

                if (instruction.getRegister().equals("r1")) {
                    i = r1.getValue();
                } else if (instruction.getRegister().equals("r2")) {
                    i = r2.getValue();
                } else if (instruction.getRegister().equals("r3")) {
                    i = r3.getValue();
                } else if (instruction.getRegister().equals("r4")) {
                    i = r4.getValue();
                } else {
                    throw new IllegalStateException("Unknown register: " + instruction.getRegister());
                }

                sp++;

                stack[sp] = i;
            } else if (instruction.getOpcode() == Opcode.NOP) {
                return;
            } else {
                throw new IllegalStateException("Unknown opcode: " + instruction.getOpcode());
            }
        }
    }

    public void printStack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i]);
        }
    }
}
