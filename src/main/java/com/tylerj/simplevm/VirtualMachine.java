package com.tylerj.simplevm;

public class VirtualMachine {
    private int[] stack;

    private int ip;
    private int sp;

    private Register r1;
    private Register r2;
    private Register r3;
    private Register r4;

    public VirtualMachine(int stackSize) {
        this.stack = new int[stackSize];
        this.sp = -1;
    }

    public VirtualMachine(int[] stack, int stackSize, int ip, int stackPointer) {
        this.stack = stack;
        this.ip = ip;
        this.sp = stackPointer;
    }

    public void execute(Instruction[] instructions) {
        while (ip < instructions.length) {
            Instruction instruction = instructions[ip];

            ip++;

            if (instruction.getOpcode() == Opcode.HALT) {
                return;
            } else if (instruction.getOpcode() == Opcode.PRINT) {
                int i = stack[sp];

                System.out.println(i);
            } else if (instruction.getOpcode() == Opcode.ICONST) {
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


            } else if (instruction.getOpcode() == Opcode.READVALUE) {
                int i = instruction.getRegisters()[0].getValue();

                sp++;

                stack[sp] = i;
            }

            else {
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
