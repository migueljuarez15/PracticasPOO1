package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;

public class PruebaTablero{
	Personaje datos[] = {
		new Planta("David", 100), 
		new Zombie("Bianca"), 
		new Planta("Fabian", 10, Escudo.MEDIO), 
		new Planta("Almendra", 50), 
		new Planta("Ricardo", Escudo.BAJO), 
		new Planta("Silvia"), 
		new Zombie("Armando", 80, false), 
		new Zombie("Josseline", true), 
		new Zombie("Eduardo")
	}; //CIERRE ARREGLOS
	for (Personaje p: datos) {
		try{
			int poss = (int)(Math.random()*20-5);
			Tablero.insertar(p, poss);
		}catch(PersException pe){
			System.err.println(pe.getMessage() + " " + pe.getPoss());
		}
		Tablero.mostrar();
	}
	for (int i = 0; i < Tablero.MAX_SIZE; i++) {
		try{
			int poss = (int)(Math.random()*20-5);
			Tablero.borrar(poss);
		}catch(PersException pe){
			System.err.println(pe.getMessage() + " " + pe.getPoss());
		}
		Tablero.mostrar();
	}
}