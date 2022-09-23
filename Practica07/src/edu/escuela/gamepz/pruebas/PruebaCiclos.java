package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Diego");
		Personaje per02 = new Personaje("Almendra");
		Personaje per03 = new Personaje("Bianca");
		Personaje per04 = new Personaje("Jordan");

		int n = 0;
		int m = 0;
		while (n >= m){
			n = ((int)(Math.random()*100));
			m = ((int)(Math.random()*100));
		} // CIERRE WHILE
		System.out.println("n = " + n);
		System.out.println("m = " + m);

		outfor:
		for (int i = n; i < m; i++) {
			int ed = ((int)(Math.random()*250));
			if (per01.setEdad(ed)){
				System.out.println(per01.getDetalle() + " se modifico la edad");
			}else{
				System.out.println(per01.getDetalle() + " sin modificacion en edad a " + ed);
			} // CIERRE IF per01
			ed = ((int)(Math.random()*250));
			if (per02.setEdad(ed)){
				System.out.println(per02.getDetalle() + " se modifico la edad");
			}else{
				System.out.println(per02.getDetalle() + " sin modificacion en edad a " + ed);
			} // CIERRE IF per02
			ed = ((int)(Math.random()*250));
			if (per03.setEdad(ed)){
				System.out.println(per03.getDetalle() + " se modifico la edad");
			}else{
				System.out.println(per03.getDetalle() + " sin modificacion en edad a " + ed);
			} // CIERRE IF per03
			do{
				ed = ((int)(Math.random()*200));
				System.out.println(ed);
				if (ed > 150){
					System.out.println("*** El numero generado es mayor a 150 ***");
					continue outfor;
				} // CIERRE IF per04
			}while (!per04.setEdad(ed));
		System.out.println(per04.getDetalle());
		} // CIERRE FOR
	} // CIERRE MAIN
} // CIERRE CLASE