// DESCRIPCION: La verdad mi lógica estaba fallando, y sinceramente no supe cómo podría haberle hecho para el ciclo "for" del Contador.

package mx.parc1.soft.series; //PAQUETE CORRESPONDIENTE.

public class Serie{
	int n = 0;
	int x = 0;
	int cont = 0;
	public int genNumero(int x){
		while (x > n){
			n = (int)(Math.random()*x*10);
		}
		return n;
	}
	public int primoN(int n){
		return n;
	}
	public static boolean opPrimo(int n, int x){
		return n % x == 0;
	}
	public static boolean esPrimo(int n){
		for (int i = 2; i < n; i++) {
			if (opPrimo(n, i)){
				return false;
			}
		}
		return true;
	}
	public int contador(int cont){
		for (int i = x; i < n; i++) {
			System.out.println("Poscicion " + i);
		}
		return cont;
	}
} // CIERRE CLASE.

