package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//ArrayList<Conta> lista = new ArrayList<Conta>();
		List<Conta> lista = new LinkedList<Conta>();
		//Collection<Conta> lista = new Vector<Conta>();
		
		Conta cc1 = new ContaCorrente(123, 123);
		Conta cc2 = new ContaCorrente(321, 123);
		
		lista.add(cc1);
		
		Conta ref = lista.get(0);
		
		boolean existe = lista.contains(cc2);
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
}