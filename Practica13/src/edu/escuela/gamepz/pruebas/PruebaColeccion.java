package edu.escuela.gamepz.pruebas; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.buenos.Planta; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.malos.Zombie; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.*; //IMPORT CORRESPONDIENTE

public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje datos[] = {
			new Planta("David", Tablero.genVida()), 
			new Zombie("Bianca", Tablero.genVida()), 
			new Planta("Fabian", Tablero.genVida(), Escudo.MEDIO), 
			new Planta("Almendra", Tablero.genVida()), 
			new Planta("Ricardo", Tablero.genVida(), Escudo.BAJO), 
			new Planta("Silvia", Tablero.genVida()), 
			new Zombie("Armando", Tablero.genVida(), false), 
			new Zombie("Josseline", Tablero.genVida(), true), 
			new Zombie("Eduardo", Tablero.genVida())
		}; //CIERRE ARREGLOS
	}
} //CIERRE CLASE