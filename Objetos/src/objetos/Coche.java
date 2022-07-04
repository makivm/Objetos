package objetos;

public class Coche {
	private String modelo, marca;
	private int velocidad;
	private int velocidadMax;
	private int potencia;

	public Coche() {
		velocidad = 0;
	}

	public Coche(String modelo, String marca, int velocidadMax, int potencia) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.velocidadMax = velocidadMax;
		this.potencia = potencia;
		this.velocidad = 0;
	}

	public void acelerar() {
		if (velocidad + 10 <= velocidadMax)
			velocidad = velocidad + 10;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void frenar() {
		if (velocidad >= 10)
			velocidad = velocidad - 10;
		else
			velocidad = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
