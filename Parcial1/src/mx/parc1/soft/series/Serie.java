package mx.parc1.soft.series; //PAQUETE CORRESPONDIENTE.

public class Serie{
	private int n;
	private int x;
	public Serie(int n, int x){
		this.n = n;
		this.x = x;
	}
	public int primoN(int n){
		System.out.println("ola");
	}
	public int genNumero(int x){
		int n = 0;
		int x = 100;
		while (n < x){
			n = (int)(Math.random()*x*10);
		}
	}
}// CIERRE CLASE.