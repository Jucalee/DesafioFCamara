/** 1) Um funcion�rio de uma empresa recebe, anualmente, aumento salarial.
 * Sabe-se que:
 * Esse funcion�rio foi contratado em 2005 com sal�rio inicial de R$ 1.000,00;
 * Em 2006 ele recebeu aumento de 1,5% sobre seu sal�rio inicial; e
 * A partir de 2007, os aumentos salariais sempre corresponderam ao dobro
 * do percentual do ano anterior.
 * Fa�a um algoritmo que determine o sal�rio atual deste funcion�rio.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Teste01 {

	public static void main(String[] args) {
		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int anoInicio = 2005, contador;
		
		double mult = 0.015, salario = 1000;
		
		for(contador = anoInicio + 1; contador <= anoAtual; contador++) {
			salario = salario + (salario * mult);
			if(contador == anoAtual) {
				System.out.printf("Salario em %d R$ %.2f \n", contador, salario);
			}
			mult *= 2;
		}
	}
}