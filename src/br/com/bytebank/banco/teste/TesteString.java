package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome1 = "Sarah";
		String nome2 = new String("João"); //má prática
		
		StringBuilder nomeNormal = new StringBuilder("Pantera");
		System.out.println(nomeNormal.reverse());
		
		System.out.println(nome1);
		String novoNome = nome2.replace("o", "a");
		System.out.println(novoNome);
		
		if(nome1.matches(nome2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String nome3 = nome1.toUpperCase();
		System.out.println(nome3);
		String nome4 = nome3.toLowerCase();
		System.out.println(nome4);
		
		char c = nome1.charAt(2);
		System.out.println(c);
		
		int posicao = nome1.indexOf("ah");
		System.out.println(posicao);
		
		String substring = nome1.substring(2, 4);
		System.out.println(substring);
		
		for(int i = 0; i < nome1.length(); i++) {
			System.out.println(nome1.charAt(i));
		}
		
		String vazio = "    Sem espaço    ";
		System.out.println(vazio.isEmpty());		
		System.out.println(vazio.trim());
		
		System.out.println(nome1.contains("ar"));
		
		String nomeReferencia1 = new String("Sarah");
		String nomeReferencia2 = new String("Sarah");
				
		if(nomeReferencia1 == nomeReferencia2) {
			System.out.println("Referência igual");
		} else {
			System.out.println("Referência diferente");
		}
		if(nomeReferencia1.equals(nomeReferencia2)) {
			System.out.println("Conteúdo igual");
		}else {
			System.out.println("Conteúdo dferente");
		}
	}

}
