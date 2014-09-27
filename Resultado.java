package luchadoresJaponeses;

public class Resultado {

	
	public static void main(String[] args) {
		Torneo miTorneo = new Torneo();
		
		miTorneo.cargarLuchadores();
		miTorneo.buscarVictorias();
		
		Archivo.escribirArchivo(miTorneo);

	}

}
