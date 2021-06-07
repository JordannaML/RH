package Model;

public class Funcionario {
	
	private long matricula;
	private String nome;
	private Treinamento treinamento;
	private double nota1;
	private double nota2;
	
	public Funcionario(long matricula, String nome, Treinamento treinamento) {
		this.matricula = matricula;
		this.nome = nome;
		this.treinamento = treinamento;
	}

	
	//Getters
	public long getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Treinamento getTreinamento() {
		return treinamento;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public double mediaFinal() {
		return (this.nota1 + this.nota2)/2;
	}
	
	//Setters
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s = "Nome: " + this.nome + "(" + this.matricula + ")" + "\n" + 
			"Nome do Treinamento: " + this.treinamento.getNome() + "\n";
		
		return s;
	}
}
