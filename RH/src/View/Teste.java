package View;

import Model.Funcionario;
import Model.Treinamento;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("testando");
		
		Treinamento meuTreinamento = new Treinamento(23, "Java Avan�ado");
		
		System.out.println(meuTreinamento.getNome() + " (" + meuTreinamento.getCodigo() + ")");
		
		Funcionario meuFuncionario = new Funcionario(99, "Jo�o Lino", meuTreinamento);
		meuFuncionario.setNota1(8);
		meuFuncionario.setNota2(10);
		
		System.out.println(meuFuncionario.getNome() +" / " + meuFuncionario.getTreinamento().getNome());
	
		System.out.println("A M�dia final do Funcion�rio foi: " + meuFuncionario.mediaFinal());

		Funcionario outroFuncionario = new Funcionario(123, "Ana Maria", new Treinamento(88, "Banco de dados"));	
	
		System.out.println(outroFuncionario.toString());
	
	}

}
