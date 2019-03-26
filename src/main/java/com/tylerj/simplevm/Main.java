package com.tylerj.simplevm;

public class Main {
    public static void main(String[] args) {
        VirtualMachine virtualMachine = new VirtualMachine(100);

        Instruction[] instructions = new Instruction[4];

        instructions[0] = new Instruction(Opcode.ICONST, 1);
        instructions[1] = new Instruction(Opcode.ICONST, 2);
        instructions[2] = new Instruction(Opcode.IADD);
        instructions[3] = new Instruction(Opcode.PRINT);

        virtualMachine.execute(instructions);
    }
}
