package Model;

public class Treinamento {

	//Atributos (variáveis de instancias)
	
	private int codigo;
	private String nome;
	
	//Construtor
	
	public Treinamento(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Treinamento() {
		
	}
	
	//Getters
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	//Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
