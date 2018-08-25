// Classe do desafio 06

public class Retangulo {
	double largura;
	double comprimento;
	
	public Retangulo(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public void alteraValores(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
		System.out.println("Valores alterados com sucesso.");
	}
	
	public void retornaValores() {
		System.out.println("O valor atual da largura é: " + this.largura + 
			" e o valor do comprimento é: " + this.comprimento);
	}
	
	public double calculaArea() {
		double area = this.largura * this.comprimento;

		return area;
	}
	
	public double calculaPerimetro() {	
		//System.out.println("O perimetro do retangulo é de: " + ((this.largura + this.comprimento) * 2) + "m");
		return (this.largura + this.comprimento) * 2;
	}
}
