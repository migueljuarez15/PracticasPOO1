package mx.parc1.soft.series; //PAQUETE CORRESPONDIENTE.

public class Serie{
	private int n;
	private int x;
	public Serie(int n, int x){
		this.n = n;
		this.x = x;
	}
	public int genNumero(int x){
		int n = (int)(Math.random()*x*10);
		outfor:
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				System.out.println(n + " No es primo");
			}else{
				System.out.println(n + " Es primo");
			}
			do{
				n = ((int)(Math.random()*x*10));
				continue outfor;
			}while(n < x);
		}

		return x;
	}
	public int primoN(int n){
		return n;
	}
}// CIERRE CLASE.