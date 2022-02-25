package desafioBanco;

public class ClassePrincipal {

	public static void main(String[] args) {
		//Inicia os Clientes
		Cliente pessoa1 =  new Cliente();
		pessoa1.setNome("Pedro Silva");
		
		Cliente pessoa2 = new Cliente();
		pessoa2.setNome("Joana Ester");
		
		
		//Inicia as contas correntes e poupanças
		Conta cc1 = new ContaCorrente(pessoa1);
		Conta poupanca1 = new ContaPoupanca(pessoa1);
		Conta poupanca2 = new ContaPoupanca(pessoa2);
				
		
		//Inicia apenas 1 banco neste exemplo.
		//São 02 clientes e 3 contas até o momento.
				
		Banco bancoX = new Banco();
		
		bancoX.setNome("Banco Catador_De_Centavos");
		
		//adicionar as contas ao banco
		bancoX.adicionaContaBanco(cc1);
		bancoX.adicionaContaBanco(poupanca1);
		bancoX.adicionaContaBanco(poupanca2);
				
		
		cc1.depositar(100);
		cc1.transferir(100.0, poupanca1);
				
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		poupanca2.depositar(450.00);
		poupanca2.imprimirExtrato();
		
		
		System.out.println("-------- Listar os Clientes a partir do Banco --------------");
		//depois de imprimir o extrato de todos, listar os clientes a partir do banco.
		
		bancoX.listarClientes();
	}

}
