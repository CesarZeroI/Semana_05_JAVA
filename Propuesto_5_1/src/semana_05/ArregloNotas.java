package semana_05;

public class ArregloNotas {

	private int [] nota ={11,10,16,18,13,20,12,19,17};
	
	public ArregloNotas(){

	}
	
	public int tamanio(){
		return nota.length;
	}
	
	public int obtener(int i){
		return nota[i];
	}
	
	
	public double notaPromedio (){
		double promedio=0;
		double suma=0;
		for (int i = 0; i < tamanio(); i++) {
			suma += nota[i];
		}
		promedio=suma / tamanio();
		return promedio;
	}
	
	public double notaMayor(){
		double mayor=0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] > mayor) {
				mayor = nota[i];
			}
		}
		return mayor;
	}
	
	public double notaMenor(){
		double menor= 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] < menor) {
				menor = nota[i];
			}
		}
		return menor;
	}
	public int cantNotasAprobatorias(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 13) {
				cont++;
			}
		}
		return cont;
	}
	public int cantNotasDesaprobatorias(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] <= 13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantNotasMayoresA15(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 15) {
				cont++;
			}
		}
		return cont;
	}
	
	public int posPrimeraNotaAprobatoria(){
		int cont = -1;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] >= 13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int PenultimaNotaDesaprobatoria(){
		int cont = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (nota[i] <13) {
				cont++;
			}
			if(cont == 9) {
				return i;
			}
		}
		return -1;
	}
	
	public void generarNotas(){
	
	        for (int i = 0; i < nota.length; i++) {
	            nota[i] = aleatorio(21, i); 
	        }
			
	}
	
	
private int aleatorio(int min, int max) {
	return (int) ((max - min + 1) * Math.random()) + min;
}
}
