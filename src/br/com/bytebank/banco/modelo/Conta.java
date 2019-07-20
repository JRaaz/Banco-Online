package br.com.bytebank.banco.modelo;

public abstract class Conta implements Comparable<Conta>{   // toda classe já herda a classe Object,
													 		// logo, não precisa usar 'extends Object'	
		protected double saldo;
		private int agencia; 
		private int numero;
		private Cliente titular;
		private static int total = 0;
		/**
		 * Construtor para inicializar o objeto Conta a partir da agencia e numero
		 * @param agencia
		 * @param numero
		 */
		
		public Conta(int agencia, int numero) {
			total++;
			this.agencia = agencia;
			this.numero = numero;
			//this.saldo = 50;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
		
		public abstract void deposita(double valor);		
		/**
		 * @param valor
		 * @throws SaldoInsuficienteException
		 */
		
		public void saca(double valor) throws SaldoInsuficienteException {
			if(this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			}
			this.saldo -= valor;
		}
		
		public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
			this.saca(valor);
			destino.deposita(valor);
		}
		
		@Override
		public int compareTo(Conta outra) {
		        return Double.compare(this.saldo, outra.saldo);
		}
		
		@Override
		public boolean equals(Object ref) {
			
			if(ref == null) {
				return false;
			} else {
				Conta outra = (Conta) ref;
				
				if(this.agencia != outra.agencia) {
					return false;
				}
				if(this.numero != outra.numero) {
					return false;
				}			
				return true;
			}
		}
		/**
		 * java.lang.Object
		 * O toString é chamado pela classe PrintStream.
		 * Se o Java encontra um objeto no meio da concatenação, 
		 * ele também chama o toString dele.
		 */
		@Override
		public String toString() {
			return "Numero: " + this.numero + 
				   ", Agencia: " + this.agencia + 
				   ", Saldo: " + this.getSaldo() +
				   ", Titular: " + this.getTitular().getNome();
		}
				
		public double getSaldo() {
			return saldo;
		}
		
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}		
		
		public int getNumero() {
			return numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
}