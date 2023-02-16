package entities;

public class EletricCars {
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Double velocidadeMaxima;
	private Double autonomia;
	private Double tempoDeCarregamento;
	private Double preço;
	public Double valorEnergia = 0.90;
	
	public EletricCars() {}

	public EletricCars(String marca, String modelo, Integer anoFabricacao, Double velocidadeMaxima, Double autonomia,
			Double tempoDeCarregamento, Double preço) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.autonomia = autonomia;
		this.tempoDeCarregamento = tempoDeCarregamento;
		this.preço = preço;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}

	public Double getTempoDeCarregamento() {
		return tempoDeCarregamento;
	}

	public void setTempoDeCarregamento(Double tempoDeCarregamento) {
		this.tempoDeCarregamento = tempoDeCarregamento;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
		
	public double getValorEnergia() {
		return valorEnergia;
	}

	public void setValorEnergia(double valorEnergia) {
		this.valorEnergia = valorEnergia;
	}
	
	public double calculaRecarga(Double valorEnergia, Double tempoCarregamento,Double autonomia) {
		double valorRecarga = valorEnergia * tempoCarregamento;
		double valorKmRodado = valorRecarga/ autonomia;
		return valorKmRodado;
	}

	public String toString() {
		return "\nMarca: "+ marca+
				"\nModelo: "+modelo+
				"\nAno de Fabricação: "+anoFabricacao+
				"\nVelocidade Máxima: "+velocidadeMaxima+
				"\nAutonomia: "+autonomia+
				"\nTempo de Carregamento: "+tempoDeCarregamento+
				"\nPreço: "+preço+"\n";
	}
}
