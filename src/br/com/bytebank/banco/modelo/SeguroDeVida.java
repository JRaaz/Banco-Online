package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 100; //valor apenas para teste
	}
}