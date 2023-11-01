package model;

public enum Combustivel {
	
	OLEO_DIESEL("Oleo Diesel"), GASOLINA_COMUM("Gasolina Comum"), GASOLINA_ADITIVADA("Gasolina Aditivada"), ETANOL("Etanol");
	
	private String nome;

	private Combustivel(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
