package edu.escuela.gamepz.pruebas; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.buenos.Planta; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.malos.Zombie; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.*; //IMPORT CORRESPONDIENTE

public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje pers[] = {new Planta("David", 100), 
				new Zombie("Bianca"), 
				new Planta("Fabian", 10, Escudo.MEDIO), 
				new Planta("Almendra", 50), 
				new Planta("Ricardo", Escudo.BAJO), 
				new Planta("Silvia"), 
				new Zombie("Armando", 80, false), 
				new Zombie("Josseline", true), 
				new Zombie("Eduardo")}; //CIERRE ARREGLOS

		int cont = 0;
		for (Personaje tmp: pers) {
			cont++;
			System.out.println(tmp);
			int numA = (int)(Math.random()*100);
			if (tmp instanceof Planta){
				System.out.println("Soy planta" + "\t" + ((Planta)tmp).getEscudo());
				((Planta)tmp).addVida(numA);
			}
			if (tmp instanceof Zombie){
				System.out.println("Soy zombie" + "\t" + ((Zombie)tmp).getAtaque());
				((Zombie)tmp).comer();
				((Zombie)tmp).decVida(numA);
			}
			System.out.println(numA);
			System.out.println(tmp);
			System.out.println("*****Objeto " + cont + "*****");
		} //CIERRE FOREACH
	} //CIERRE MAIN
} //CIERRE CLASE