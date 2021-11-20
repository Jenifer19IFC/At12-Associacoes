package Att04;

public class Hd {

	private String marca;
	private String modelo;
	private float capacidade;
	private int rpm;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0)
			this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0)
			this.modelo = modelo;
	}
	
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		if(capacidade > 0)
			this.capacidade = capacidade;
	}
	
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		if(rpm > 0)
			this.rpm = rpm;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hd [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", rpm=");
		builder.append(rpm);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
