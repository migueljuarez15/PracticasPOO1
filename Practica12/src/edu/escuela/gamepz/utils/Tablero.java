package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.PersException;
public class Tablero{
	public static final int MAX_SIZE = 10;
	public static Personaje personajes[] = new Personaje[MAX_SIZE];
	private Tablero(){}
	public static void mostrar(){
		System.out.println("\n Inicio *** Contenido del arreglo en Tablero");
		int cont = 0;
		for (Personaje tmp: personajes){
			cont++;
			if(tmp == null){
				System.out.println(cont + " - - - ");
			}else{
				System.out.println(cont + personajes[]);
			}
		}
		System.out.println("\n Fin *** Contenido del arreglo en Tablero");
	}
	public void insertar(Personaje p, int poss) throws PersException{
		if(poss < 0 | poss > MAX_SIZE){
			throw new PersException("Indice fuera de rango ", poss)
		}else{
			p.getPoss();
		}
	}
}