package matrizes;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int escolha = 0;
		String cores[] = new String[10];

		cores[0] = "azul";
		cores[1] = "amarelo";
		cores[2] = "vermelho";
		cores[3] = "roxo";
		cores[4] = "preto";
		cores[5] = "verde";
		cores[6] = "cinza";
		cores[7] = "branco";
		cores[8] = "laranja";
		cores[9] = "lilas";

		System.out.println("Digite uma cor: ");
		escolha = leitor.nextInt();

		while (escolha <= cores.length) {
			
			if (escolha >= cores.length) {
				System.out.println("temos essa cor.");
			}
			else{
				System.out.println("não temos essa cor.");
			}
			escolha++;

		}
	}
}
