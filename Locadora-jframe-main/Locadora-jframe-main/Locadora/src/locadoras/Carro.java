package locadoras;

public class Carro {
	
	
	private String placa;
	private String potencia;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico;
	private int ano;
	private float preco;
	
	
	//construtor
	
	
	public Carro(String plac,String poten,String modelo,String cor,String marca,boolean cambio_automatico,int ano) 
	{
		placa=plac;
		potencia=poten;
		this.modelo=modelo;
		this.cor=cor;
		this.marca=marca;
		this.cambio_automatico=cambio_automatico;
		this.ano=ano;
	}
	
	//Metodos de acesso
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}


	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getPotencia() {
		return potencia;
	}



	public void setPotencia(String string) {
		this.potencia = string;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public boolean isCambio_automatico() {
		return cambio_automatico;
	}



	public void setCambio_automatico(boolean cambio_automatico) {
		this.cambio_automatico = cambio_automatico;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}

	
	public void andar() {
		System.out.println("Andando");
	}
	
	public boolean freio() {
		System.out.println("Freando");
		return true;
		
	}
	public void correr (int velocidade) {
		System.out.println("Estou correndo "+velocidade+"Km");
	}
	
    public void Informacao_carro(){

        System.out.println("Modelo: " + modelo + "\n" +
        "Marca: " + marca + "\n" +
        "Ano: " + ano + "\n");
    }
}