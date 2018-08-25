/** 4) Fa�a um programa para uma loja de tintas. O programa dever� pedir o
 * tamanho em metros quadrados da �rea a ser pintada. Considere que a
 * cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta �
 * vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a
 * quantidades de latas de tinta a serem compradas e o pre�o total.
 */

import java.util.Scanner;

public class Teste04 {

	private static Scanner entrada;

	public static void main(String[] args) {
		int quantLatas;
		double valor = 80, metrosQuadrados;
		
		entrada = new Scanner(System.in);
		
		System.out.println("Informe a area em m2 a ser pintada: ");
		metrosQuadrados = entrada.nextDouble();
		
		if(metrosQuadrados <= 54) {
			System.out.println("Ser� necess�ria apenas 1 lata de tinta para pintar o local. Valor total: R$ " + valor);
		} else {
			quantLatas = (int) Math.ceil(metrosQuadrados/54);
			valor *= quantLatas;
			System.out.println("Ser�o necess�rias " + quantLatas + " latas de tintas para pintar o local. Valor total: R$ " + valor);
		}
		
	}
}
