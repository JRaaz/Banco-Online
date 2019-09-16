package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
			
		ContaCorrente cc = new ContaCorrente(1234, 12345);
		cc.deposita(100);
		cc.getSaldo();
		System.out.println("Primeiro saldo cc: " + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(4321, 54321);
		//cp.deposita(50);

		cc.transfere(50, cp);
		
		System.out.println("Imposto: " + cc.getValorImposto());
		
		System.out.println("CC = " + cc.getSaldo());
		System.out.println("CP = " + cp.getSaldo());		
	}
}
