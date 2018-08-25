/** 5) Crie uma classe para implementar uma conta corrente. A classe deve
 * possuir os seguintes atributos: número da conta, nome do correntista e
 * saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
 * construtor, saldo é opcional, com valor default zero e os demais atributos
 * são obrigatórios.
 */

public class Teste05 {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("José Carlos", 5421);
		
		c1.alterarNome("Otávio Netto");
		c1.deposito(68);
		c1.saque(50);

	}
}
