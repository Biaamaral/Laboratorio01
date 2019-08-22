
public class Carro {

	String cor_carroceria;
	int qtd_rodas;
	int qtd_passageiros;
	int num_portas;
	int ano_fabricacao;
	String nome_modelo;
	String nome_fabricante;
	
	public Carro() {
		
	}
	
	public Carro(String cor_carroceria, int qtd_rodas, int qtd_passageiros, int num_portas, int ano_fabricacao, String nome_modelo,
			String nome_fabricante) {
		super();
		this.cor_carroceria = cor_carroceria;
		this.qtd_rodas = qtd_rodas;
		this.qtd_passageiros = qtd_passageiros;
		this.num_portas = num_portas;
		this.nome_modelo = nome_modelo;
		this.nome_fabricante = nome_fabricante;
		this.ano_fabricacao = ano_fabricacao;
	}

	public String getCor_carroceria() {
		return cor_carroceria;
	}
	public void setCor_carroceria(String cor_carroceria) {
		this.cor_carroceria = cor_carroceria;
	}
	public int getQtd_rodas() {
		return qtd_rodas;
	}
	public void setQtd_rodas(int qtd_rodas) {
		this.qtd_rodas = qtd_rodas;
	}
	public int getQtd_passageiros() {
		return qtd_passageiros;
	}
	public void setQtd_passageiros(int qtd_passageiros) {
		this.qtd_passageiros = qtd_passageiros;
	}
	public int getNum_portas() {
		return num_portas;
	}
	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}
	public int getAno_fabricacao() {
		return ano_fabricacao;
	}
	public void setAno_fabricacao(int ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}
	public String getNome_modelo() {
		return nome_modelo;
	}
	public void setNome_modelo(String nome_modelo) {
		this.nome_modelo = nome_modelo;
	}
	public String getNome_fabricante() {
		return nome_fabricante;
	}
	public void setNome_fabricante(String nome_fabricante) {
		this.nome_fabricante = nome_fabricante;
	}
	
	public float km (float km) {
		float count = 0;
		count += km;
		return count;
	}
	
	public int porta (String status) {
		int condicao = 0;
		if(status.equals("aberta")) {
			condicao = 1;
		}
		if(status.equals("fechada")) {
			condicao = 0;
		}
		return condicao;
	}
	
	public void informacoes() {
	
		System.out.println("cor " + getCor_carroceria() + " com " + getNum_portas() + " portas, fabricacao no ano de " 
		+ getAno_fabricacao() + "," + " de fabricante " + getNome_fabricante() + "," + " modelo " + getNome_modelo()
		+ "," + " do ano de " + getAno_fabricacao() + ".\n");
	}

	
	
}
