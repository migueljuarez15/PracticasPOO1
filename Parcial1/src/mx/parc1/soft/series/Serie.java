package mx.parc1.soft.series; //PAQUETE CORRESPONDIENTE.

public class Serie{
	private int n;
	private int x;
	public Serie(int n, int x){
		this.n = n;
		this.x = x;
	}
	public int genNumero(int x){
		while (n < x){
			n = ((int)(Math.random()*x*10));
		}
		return x;
	}
	public int primoN(int n){
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				System.out.println(n + "Es primo");
			}else{
				System.out.println(n + "No es primo");
			}
		}
		return n;
	}
}// CIERRE CLASE.