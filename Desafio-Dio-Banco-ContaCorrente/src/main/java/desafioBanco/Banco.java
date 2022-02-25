package desafioBanco;
import java.util.ArrayList;
import java.util.List;

import lombok.*;

//O lombok tem que rodar o 'java -jar lombar.jar' na linha de comando para instalar ele corretamente no eclipse
//Fica mais fácil usar um projeto do tipo Maven, mesmo não sabendo muito de Maven dá para rodar.
//A Classe fica mais enxuta com o lombok, imaginase tivesse 10 atributos no banco.

public class Banco {
	
	//Aqui já estamos usando o Lombok para getter e setter para o nome do Banco.
	@Getter
	@Setter
	private String nome;
	private List<Conta> contas;

	Banco(){
		contas = new ArrayList<Conta>();	
		
	}

	public void adicionaContaBanco(Conta conta) {
		contas.add(conta);
		
	}
	
	public void listarClientes() {
		System.out.println("----------------------------------------------");
		System.out.println("Clientes do Banco " + this.nome);
		System.out.println("----------------------------------------------");
		for(Conta c: contas) {
			System.out.println(c.getCliente().getNome());
		}
				
	}
}
