package riscv

import chisel3.iotesters.PeekPokeTester

class AluCntrlTests(c: AluCntrl) extends PeekPokeTester(c) {
        poke(c.io.aluOp, 1)
        poke(c.io.funct3, 0)
	poke(c.io.funct7, 0)
        step(1)
	expect(c.io.out, 0)
}
