package model;

public enum OleoMotor {

	OLEO_500, OLEO_1;
	
	private float preco;

	public Double calcularOleo500(float quantidade) {
		Double valor500 = Double.valueOf(OLEO_500.getPreco()) * Double.valueOf(quantidade);
		return valor500;
	}
	
	public Double calcularOleo1(float quantidade) {
		Double valor1 = Double.valueOf(OLEO_1.getPreco()) * Double.valueOf(quantidade);
		return valor1;
	}
	
	public Double calcularTotalOleo(Double valor500, Double valor1) {
		Double total = valor500 + valor1;
		return total;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
