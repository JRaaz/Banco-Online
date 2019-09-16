package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(456, 654);
		cc.deposita(500);
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
