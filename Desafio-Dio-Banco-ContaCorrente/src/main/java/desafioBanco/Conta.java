package desafioBanco;

public abstract class Conta implements IConta {
		
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente cliente;
	
	
	public Cliente getCliente() {
		return cliente;
	}

	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
		this.cliente = cliente;
	}
		

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		saldo -= valor;
		
	}

	public void depositar(double valor) {
		saldo += valor;
		
	}

	public void transferir(Double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
				
	}
	
	protected void ImprimirExtratoBasico() {
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.agencia));
		System.out.println(String.format("Numero: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}

}
