package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

		public static void main(String[] args) {
			Conta conta = new ContaCorrente(10799, 201198);
			
			conta.deposita(100.0);
			
			try {
				conta.saca(150.0);
			} catch(SaldoInsuficienteException ex) {
				System.out.println("Exception: " + ex.getMessage());
				//ex.printStackTrace();
			}
			
			System.out.println("Saldo: " + conta.getSaldo());
		}
}
