/** 5) Crie uma classe para implementar uma conta corrente. A classe deve
 * possuir os seguintes atributos: n�mero da conta, nome do correntista e
 * saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e saque; No
 * construtor, saldo � opcional, com valor default zero e os demais atributos
 * s�o obrigat�rios.
 */

public class Teste05 {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("Jos� Carlos", 5421);
		
		c1.alterarNome("Ot�vio Netto");
		c1.deposito(68);
		c1.saque(50);

	}
}
