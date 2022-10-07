package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje pers[] = {new Personaje("David", 100), 
				new Personaje("Bianca"), 
				new Planta("Fabian", 10, 'B'), 
				new Planta("Almendra", 50), 
				new Planta("Ricardo", 'C'), 
				new Planta("Silvia"), 
				new Zombie("Armando", 80, false), 
				new Zombie("Josseline", true), 
				new Zombie("Eduardo")};

		for (Personaje tmp: pers) {
			System.out.println(tmp.getDetalle());
			int numA = (int)(Math.random()*100);
			if (tmp instanceof Planta){
				System.out.println("Soy planta" + "\t" + ((Planta)tmp).getEscudo());
				tmp.addVida(numA);
			}
			if (tmp instanceof Zombie){
				System.out.println("Soy zombie" + "\t" + ((Zombie)tmp).getAtaque());
				tmp.decVida(numA);
			}
			System.out.println(numA);
			System.out.println(tmp.getDetalle());
			for (int i = 1; i < 10; i++) {
				System.out.println("*****Objeto " + i + "*****");
			}
		}
	}
}