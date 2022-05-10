package locadoras;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
	

	          


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		Carro end = new Carro();
		
		System.out.println("Digite o nome do cliente:");
		c1.setNome(entrada.nextLine());
		System.out.println("Digite o RG do cliente:");
		c1.setRG(entrada.nextLine());
		System.out.println("Digite a data de Nascimento do cliente:");
		c1.setNascimento(entrada.nextLine());
		
		System.out.println("Digite o Carro a ser alugado:");
		end.setModelo(entrada.nextLine());
		System.out.println("Digite a marca do Carro a ser alugado:");
		end.setMarca(entrada.nextLine());
		System.out.println("Digite a Potencia do Carro a ser alugado:");
		end.setPotencia(entrada.nextLine());
		System.out.println("Digite a Placa Carro a ser alugado:");
		end.setPlaca(entrada.nextLine());
		System.out.println("Digite o Preço do Carro a ser alugado:");
		end.setPreco(entrada.nextLine().charAt(0));
		
		c1.setEnd(end);
		
		System.out.println("Dados do Client" + c1.Informacao());
	}

	private static Cliente Cliente() {
		// TODO Auto-generated method stub
		return null;
	}

}