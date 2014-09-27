package luchadoresJaponeses;

public class Luchador {

	private Integer peso;
	private Integer altura;
	Integer victorias;
	
	
	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	public Integer getAltura() {
		return altura;
	}


	public void setAltura(Integer altura) {
		this.altura = altura;
	}


	public Integer getVictorias() {
		return victorias;
	}


	public void setVictorias(Integer victorias) {
		this.victorias = victorias;
	}


	public Luchador(Integer peso, Integer altura) {
		
		this.peso = peso;
		this.altura = altura;
		this.victorias=0;
	}
	
	
	
}
