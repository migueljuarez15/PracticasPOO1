package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
	private char escudo;
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		super(nombre, 3);
		this.escudo = escudo;
	}
	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = 'A';
	}
	public Planta(String nombre){
		super(nombre, 3);
		escudo = 'A';
	}

	public char getEscudo(){
		return escudo;
	}
} //CIERRE CLASE