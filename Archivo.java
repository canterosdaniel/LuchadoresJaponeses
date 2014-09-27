package luchadoresJaponeses;

import java.io.*;


public class Archivo {
	static File archivo =null;
	static FileReader fr = null;
	static BufferedReader br = null;
	static FileWriter fw = null;
	static PrintWriter pw = null;

	public static BufferedReader abrirArchivo(){
		try {
			archivo= new File("10.IN");
			fr=new FileReader(archivo);
			br=new BufferedReader(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return br;
		
		
	}
	
	public static void escribirArchivo(Torneo miTorneo){
		try {
			fw= new FileWriter("salida.OUT");
			pw=new PrintWriter(fw);
			for(Luchador cadaUno:miTorneo.listaLuchadores){
				pw.println(cadaUno.victorias);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
		
		
	}
}
