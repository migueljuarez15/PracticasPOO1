package mx.parc1.soft.pruebas; // PAQUETE CORRESPONDIENTE.
import mx.parc1.soft.series.Serie; //IMPORTACION.

public class TestSeries{
	public static void main(String[] args){
		Serie s = new Serie();
		int n1 = s.genNumero(100);
		//s.primos(m);
		int n2 = s.primoN(n1/10);
		System.out.println(n2);
		//int n = s.genNumero(100);
		//s.fibo(n);
		//int p = s.fiboN(3, 11);
		//System.out.println(p);
	}
}