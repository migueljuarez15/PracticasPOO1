package mx.parc1.soft.pruebas; // PAQUETE CORRESPONDIENTE.
import mx.parc1.soft.series.Serie; //IMPORTACION.

public class TestSeries{
	public static void main(String[] args){
		Serie s = new Serie(0, 0);
		int m = s.genNumero(100);
		//s.primos(m);
		int o = s.primoN(m/10);
		System.out.println(o);
		//int n = s.genNumero(100);
		//s.fibo(n);
		//int p = s.fiboN(3, 11);
		//System.out.println(p);
	}
}