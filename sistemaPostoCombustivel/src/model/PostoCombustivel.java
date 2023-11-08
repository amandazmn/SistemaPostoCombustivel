package model;

public class PostoCombustivel {

	private float precoOleoDiesel;
	private float precoGasComum;
	private float precoGasAditivada;
	private float precoEtanol;
	private float precoOleo500;
	private float precoOleo1;
	private float totalOleo500;
	private float totalOleo1;
	private float totalOleo;
	private float combustivelSelecionado;
	private float litros;
	private float totalCombustivel;
	private int dias;
	private float total;
	
	public float getPrecoOleoDiesel() {
		return precoOleoDiesel;
	}
	public void setPrecoOleoDiesel(float precoOleoDiesel) {
		this.precoOleoDiesel = precoOleoDiesel;
	}
	public float getPrecoGasComum() {
		return precoGasComum;
	}
	public void setPrecoGasComum(float precoGasComum) {
		this.precoGasComum = precoGasComum;
	}
	public float getPrecoGasAditivada() {
		return precoGasAditivada;
	}
	public void setPrecoGasAditivada(float precoGasAditivada) {
		this.precoGasAditivada = precoGasAditivada;
	}
	public float getPrecoEtanol() {
		return precoEtanol;
	}
	public void setPrecoEtanol(float precoEtanol) {
		this.precoEtanol = precoEtanol;
	}
	public float getPrecoOleo500() {
		return precoOleo500;
	}
	public void setPrecoOleo500(float precoOleo500) {
		this.precoOleo500 = precoOleo500;
	}
	public float getPrecoOleo1() {
		return precoOleo1;
	}
	public void setPrecoOleo1(float precoOleo1) {
		this.precoOleo1 = precoOleo1;
	}
	public float getTotalOleo500() {
		return totalOleo500;
	}
	public void setTotalOleo500(float totalOleo500) {
		this.totalOleo500 = totalOleo500;
	}
	public float getTotalOleo1() {
		return totalOleo1;
	}
	public void setTotalOleo1(float totalOleo1) {
		this.totalOleo1 = totalOleo1;
	}
	public float getTotalOleo() {
		return totalOleo;
	}
	public void setTotalOleo(float totalOleo) {
		this.totalOleo = totalOleo;
	}
	public float getCombustivelSelecionado() {
		return combustivelSelecionado;
	}
	public void setCombustivelSelecionado(float combustivelSelecionado) {
		this.combustivelSelecionado = combustivelSelecionado;
	}
	public float getLitros() {
		return litros;
	}
	public void setLitros(float litros) {
		this.litros = litros;
	}
	public float getTotalCombustivel() {
		return totalCombustivel;
	}
	public void setTotalCombustivel(float totalCombustivel) {
		this.totalCombustivel = totalCombustivel;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public float calcularValorPagar(float preco, float quantidade) {
		float total = preco * quantidade;
		return total;
	}
	
	public float somarTotal(float valor1, float valor2) {
		float total = valor1 + valor2;
		return total;
	}
	
	public float calcularTotalPrazo(int dias, float valor1, float valor2) {
		float total = somarTotal(valor1, valor2);
		if(dias == 30) {
			return total;
		} else if(dias > 30) {
			total = (total * 0.1f) + total;
			return total;
		}
		return 0;
	}
	
	public float calcularTotalVista(float valor1, float valor2) {
		float total = somarTotal(valor1, valor2);
		total = total - (total * 0.1f);
		return total;
	}
	

}
