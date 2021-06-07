package View;

import Model.Funcionario;
import Model.Treinamento;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("testando");
		
		Treinamento meuTreinamento = new Treinamento(23, "Java Avançado");
		
		System.out.println(meuTreinamento.getNome() + " (" + meuTreinamento.getCodigo() + ")");
		
		Funcionario meuFuncionario = new Funcionario(99, "João Lino", meuTreinamento);
		meuFuncionario.setNota1(8);
		meuFuncionario.setNota2(10);
		
		System.out.println(meuFuncionario.getNome() +" / " + meuFuncionario.getTreinamento().getNome());
	
		System.out.println("A Média final do Funcionário foi: " + meuFuncionario.mediaFinal());

		Funcionario outroFuncionario = new Funcionario(123, "Ana Maria", new Treinamento(88, "Banco de dados"));	
	
		System.out.println(outroFuncionario.toString());
	
	}

}
