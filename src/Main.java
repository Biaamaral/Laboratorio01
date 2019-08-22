import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		
		Scanner sc1 = new Scanner(System.in); 
		Carro ca = new Carro();
		Condutor co = new Condutor();
		
		System.out.println("Nome condutor: ");
		co.setNome(sc1.nextLine());
		System.out.println("Idade condutor: ");
		co.setIdade(sc1.nextInt());
		System.out.println("Naturalidade condutor: ");
		sc1.nextLine();
		co.setNaturalidade(sc1.nextLine());
		
		
		System.out.println("Cor carroceria: ");
		ca.setCor_carroceria(sc1.nextLine());
		System.out.println("Qtde rodas: ");
		ca.setQtd_rodas(sc1.nextInt());
		System.out.println("Qtde passageiros: ");
		ca.setQtd_passageiros(sc1.nextInt());
		System.out.println("Num portas: ");
		ca.setNum_portas(sc1.nextInt());
		System.out.println("Ano fabricacao: ");
		ca.setAno_fabricacao(sc1.nextInt());
		System.out.println("Nome modelo: ");
		sc1.nextLine();
		ca.setNome_modelo(sc1.nextLine());
		System.out.println("Nome fabricante: ");
		ca.setNome_fabricante(sc1.nextLine());
		
		
		System.out.println("O condutor " + co.getNome() + " de idade " + co.getIdade()
		+ " e naturalidade " + co.getNaturalidade() + " possui o carro de");
		ca.informacoes();
		
	}
}
