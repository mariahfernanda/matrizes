package matrizes;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String escolha;
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
		escolha = leitor.next();
		leitor.close();

		Boolean encontrei = true;

		for (int i = 0; i < cores.length; i++) {

			if (escolha.equalsIgnoreCase(cores[i])) {
				System.out.println("Temos essa cor.");
				encontrei = true;
				break;
			}
			if (encontrei ) {
				System.out.println("temos essa cor.");
			}else {
				System.out.println("não temos essa cor");
			}

		}
	}
}
