import java.util.Scanner;

public class Condutor {

	String nome;
	int idade;
	String naturalidade;
	
	public Condutor() {
		
	}
	
	public Condutor(String nome, int idade, String naturalidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.naturalidade = naturalidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	
	
}
