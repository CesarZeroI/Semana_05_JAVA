package semana_05;

public class ArregloPrecio {
	private double [] precio ={240.0, 350.2, 80.4,100.3,470.1,60.0,330,8,260.6,510.9,200.7};
	
	public ArregloPrecio(){
		
	}
	
	
	public double tamanio(){
		return precio.length;
	}
	
	public double obtener(int i){
		return precio[i];
	}
	
	public double precioPromedio(){
		double promedio=0;
		double suma=0;
		for (int i = 0; i < tamanio(); i++) {
			suma += precio[i];
		}
		promedio=suma / tamanio();
		return promedio;
	}
	
	public double precioMayor(){
		double mayor=0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] > mayor) {
				mayor = precio[i];
			}
		}
		return mayor;
	}
	
	public double precioMenor(){
		double menor= 0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] < menor) {
				menor = precio[i];
			}
		}
		return menor;
	}
	
	public double cantMayoresPrecioPromedio(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] >= precioPromedio()) {
				cont++;
			}
		}
		return cont;
	}
	
	public double cantMenoresPrecioPromedio(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] < precioPromedio()) {
				cont++;
			}
		}
		return cont;
	}
	
	public double posPrimerPrecioMayoralSegundo(){
		for (int i = 0; i < precio.length; i++) {
            if (precio[i] > precio[1] && precio[i] > precio[2]) {
                return i;
            }
		}
		return -1;
	}
	
	public double posUltimoPrecioMenorAlPenultimo(){
		 for (int i = precio.length - 1; i >= 1; i--) {
	            if (precio[i] < precio[i - 1]) {
	                return i;
	            }
	        }
	        return -1; 
	    
	}
	public void generarPrecio(){
		
		for (int i = 0; i < tamanio(); i++)
			precio[i] = aleatorio(799.9,4999.9);
		
	}



	private double aleatorio(double min, double max) {
	return (double) ((max - min + 1) * Math.random()) + min;
}

}
