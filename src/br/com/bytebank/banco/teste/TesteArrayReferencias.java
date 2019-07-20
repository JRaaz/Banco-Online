package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(456, 654);
		contas[1] = cc2;
				
		System.out.println(contas[0].getNumero());
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		System.out.println(contas[0].getNumero());
		
		
	}

}
