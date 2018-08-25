/**3) Receba o número de horas trabalhadas por uma pessoa e o valor do
 * salário mínimo e mostre o salário a receber baseado nas seguintes regras:
 * A hora trabalhada equivale a 10% do salário mínimo informado;
 * O salário bruto é dado pelo número de horas trabalhadas multiplicado pelo
 * valor de cada hora;
 * O imposto pago é de 3%.
 * O salário a receber é equivalente ao salário bruto subtraído do imposto.
 */

import java.util.Scanner;

public class Teste03 {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		int horasTrabalhadas;
		double salarioMinimo, salario;
		
		entrada = new Scanner(System.in);
		
		System.out.println("Informe o salario minimo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.println("Informe as horas trabalhadas");
		horasTrabalhadas = entrada.nextInt();
		
		salario = (salarioMinimo*10/100) * horasTrabalhadas;
		salario -= (salario * 3 / 100);
		
		System.out.println("Salario a receber: " + salario);
	}
}
