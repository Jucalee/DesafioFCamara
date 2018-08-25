/** 6) Crie uma classe que modele um retângulo:
 * Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a
 * escolher)
 * Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e
 * calcular Perímetro;
 * Crie um programa que utilize esta classe. Ele deve pedir ao usuário que
 * informe as medidas de um local. Depois, deve criar um objeto com as
 * medidas e calcular a quantidade de pisos e de rodapés necessárias para o
 * local.
 */

import java.util.Scanner;

public class Teste06 {

	public static void main(String[] args) {
		
		double largLocal, compLocal, largPiso, compPiso, compRodape;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira o tamanho da largura do local em metros.");
		largLocal = dados.nextDouble();
		System.out.println("Insira o tamanho do comprimento do local em metros");
		compLocal = dados.nextDouble();
		
		Retangulo medidasLocal = new Retangulo(largLocal, compLocal);

		
		System.out.println("Informe abaixo o tamanho dos pisos e rodapes");
		System.out.println("Largura dos pisos: ");
		largPiso = dados.nextDouble();
		System.out.println("Comprimento dos pisos");
		compPiso = dados.nextDouble();
		System.out.println("Comprimento dos rodapes");
		compRodape = dados.nextDouble();
		
		Retangulo medidasPiso = new Retangulo(largPiso, compPiso);
		Retangulo medidasRodape = new Retangulo(0, compRodape);
		
		System.out.println("Serão necessários " + (medidasLocal.calculaArea() / medidasPiso.calculaArea()) + " pisos para o local e " + 
		medidasLocal.calculaPerimetro() / compRodape + " rodapés");
	}
}
