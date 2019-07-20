package br.com.bytebank.banco.teste;

import java.util.ArrayList;

public class TestesArrayListEquals {

	public static void main(String[] args) {

		ArrayList listaTeste = new ArrayList(26);
		listaTeste.add("RJ");
		listaTeste.add("SP");
		System.out.println("Lista: " + listaTeste);
		
		ArrayList nova = new ArrayList(listaTeste);
		System.out.println("Nova lista: " + nova);
	}

}
