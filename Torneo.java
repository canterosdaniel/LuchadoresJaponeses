package luchadoresJaponeses;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;



public class Torneo {
	Integer cantidadLuchadores;
	ArrayList<Luchador> listaLuchadores;
	
	
	
	
	public void cargarLuchadores(){
		
		String line;
		String [] data;
		int contLinea=-1;
		BufferedReader br = Archivo.abrirArchivo();
		try {
			while((line=br.readLine())!=null){
				if(contLinea==-1){
					this.cantidadLuchadores=Integer.parseInt(line);
					this.listaLuchadores= new ArrayList<Luchador>(this.cantidadLuchadores);
				}
				else{
					data=line.split(" ");
					Luchador miLuchador = new Luchador(Integer.parseInt(data[0]),Integer.parseInt(data[1]));
					this.listaLuchadores.add(miLuchador);
					
				}
				
				contLinea++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void buscarVictorias(){
		for(Luchador aComparar:this.listaLuchadores){
			
			for(Luchador comparadoCon:this.listaLuchadores){
				if(aComparar.getPeso()>comparadoCon.getPeso() && aComparar.getAltura()>=comparadoCon.getAltura()){
					aComparar.victorias++;
				}
				else if(aComparar.getAltura()>comparadoCon.getAltura() && aComparar.getPeso()>=comparadoCon.getPeso()){
					aComparar.victorias++;
				}
				
			}
			
			
		}
		
	}

}
