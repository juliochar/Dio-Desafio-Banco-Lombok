package desafioBanco;

public interface IConta {
	 void sacar(double valor);
	 void depositar(double valor);
	 void transferir(Double valor, Conta contaDestino);
	 void imprimirExtrato();
	 

}
