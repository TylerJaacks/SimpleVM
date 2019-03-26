package com.tylerj.simplevm;

public class Main {
    public static void main(String[] args) {
        VirtualMachine virtualMachine = new VirtualMachine(100);

        Instruction[] instructions = new Instruction[6];

        instructions[0] = new Instruction(Opcode.LOADVALUE, "r1", 1);
        instructions[1] = new Instruction(Opcode.READVALUE, "r1");
        instructions[2] = new Instruction(Opcode.PRINT);
        instructions[3] = new Instruction(Opcode.PUSH, 2);
        instructions[4] = new Instruction(Opcode.ISUB);
        instructions[5] = new Instruction(Opcode.PRINT);

        virtualMachine.execute(instructions);
    }
}
