package edu.escuela.gamepz.pruebas; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.buenos.Planta; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.malos.Zombie; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.*; //IMPORT CORRESPONDIENTE
import java.util.LinkedList; //IMPORT CORRESPONDIENTE
import java.util.Collections; //IMPORT CORRESPONDIENTE
import java.util.TreeSet; //IMPORT CORRESPONDIENTE

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

		TreeSet<Personaje>arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<>();

		for (Personaje tmp: datos){
			arbol.add(tmp);
			lista.add(tmp);
		}
		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p:arbol){
			System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p:lista){
			System.out.println(p);
		}
		ArrayList arr = new ArrayList();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
			System.out.println(p);
		}
	} //CIERRE MAIN
} //CIERRE CLASE