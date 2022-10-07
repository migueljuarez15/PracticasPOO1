package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
	private char escudo;
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	} //CIERRE Planta1(String, int, char)
	public Planta(String nombre, char escudo){
		super(nombre, 3);
		this.escudo = escudo;
	} //CIERRE Planta2(String, char)
	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = 'A';
	} //CIERRE Planta3(String, int)
	public Planta(String nombre){
		super(nombre, 3);
		escudo = 'A';
	} //CIERRE Planta4(String)
	public char getEscudo(){
		return escudo;
	} //CIERRE getEscudo
	public void decVida(){
		super.decVida()
		if (escudo == 'A'){
			decVida(1);
		}
	} //CIERRE decVida()
	public void decVida(int vida){
		super.decVida(vida)
		if (escudo == 'A'){
			vida *= 2;
		}
	} //CIERRE decVida(int)
	public void addVida(){
		super.addVida()
		if (escudo == 'A'){
			addVida(1);
		}
	} //CIERRE addVida()
	public void addVida(int vida){
		super.addVida()
		if (escudo == 'A'){
			addVida(1);
		}
	} //CIERRE addVida(int)
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;
	} //CIERRE getDetalle
} //CIERRE CLASE