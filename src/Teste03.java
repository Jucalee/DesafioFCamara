/**3) Receba o n�mero de horas trabalhadas por uma pessoa e o valor do
 * sal�rio m�nimo e mostre o sal�rio a receber baseado nas seguintes regras:
 * A hora trabalhada equivale a 10% do sal�rio m�nimo informado;
 * O sal�rio bruto � dado pelo n�mero de horas trabalhadas multiplicado pelo
 * valor de cada hora;
 * O imposto pago � de 3%.
 * O sal�rio a receber � equivalente ao sal�rio bruto subtra�do do imposto.
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
