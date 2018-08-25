
/** 2) Elabore um algoritmo para mostrar os números primos existentes em um
 * intervalo.
 * O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial <
 * final) e os números primos existentes no intervalo ([inicial, final]) devem
 * ser separados por um espaço em branco
 * Exemplo:
 * Entrada: 2 13
 * Saída: 2 3 5 7 11 13
 */

import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {
		int numeroInicial, numeroFinal;
		
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Digite o numero inicial: ");
			numeroInicial = entrada.nextInt();
			if (numeroInicial <= 0) {
				System.out.println("Digite um numero maior que 0.");
			}

		} while (numeroInicial <= 0);

		do {
			System.out.println("Digite o numero final: ");
			numeroFinal = entrada.nextInt();
			if (numeroFinal < numeroInicial) {
				System.out.println("O numero final deve ser maior que o inicial.");
			}
		} while (numeroFinal < numeroInicial);

		if ((numeroFinal - numeroInicial) == 1) {
			System.out.println("Não há nenhum dado entre os numeros que voce digitou");
		} else {
			for (int cont = numeroInicial + 1; cont < numeroFinal; cont++) {
				boolean numPrimo = true;
				
				for(int cont2 = 2; cont2 < cont; cont2++) {
					if(cont % cont2 == 0) {
						numPrimo = false;
					}
				}
				if(numPrimo) {
					System.out.printf("%d ", cont);
				}
			}
		}
		
	}
}
