// Classe do desafio 05

public class ContaCorrente {

	public String nomeCorrentista;
	public int numeroConta;
	private double saldo;

	public ContaCorrente(String nomeCorrentista, int conta, double saldo) {
		this.numeroConta = conta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	public ContaCorrente(String nomeCorrentista, int conta) {
		this(nomeCorrentista, conta, 0);
	}

	public void alterarNome(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
		System.out.println("O nome do correntista foi alterado para " + this.nomeCorrentista);
	}

	public void deposito(double valor) {
		if (valor <= 0) {
			System.out.println("Insira um valor valido para deposito.");
		} else {
			this.saldo += valor;
			System.out.println("O saldo atual da conta é: R$ " + this.saldo);
		}
	}

	public void saque(double valor) {
		if (saldo < valor) {
			System.out.println("Seu saldo é insuficiente para essa operação.");
		} else {
			this.saldo -= valor;
			System.out.println("O saldo atual da conta é: R$ " + this.saldo);
		}
	}

}
