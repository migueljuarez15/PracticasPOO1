package mx.parc1.soft.series; //PAQUETE CORRESPONDIENTE.

public class Serie{
	private int n;
	private int x;
	public Serie(int n, int x){
		this.n = n;
		this.x = x;
	}
	public int genNumero(int x){
		return x;
	}
	public int primoN(int n){
		return n;
	}
	public static boolean opPrimo(int n, int x){
		return m % n == 0;
	}
	public static boolean esPrimo(int n){
		for (int i = 2; i < n; i++) {
			if (opPrimo(n, i)){
				return false;
			}
		}
		return true;
	}
}// CIERRE CLASE.