package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadoDeReferencias {

	public static void main(String[] args) {
			
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc1 = new ContaCorrente(123, 321);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(123, 123);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println("Tamanho: " + tamanho);
		
		Conta ref = (Conta)guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}
}
