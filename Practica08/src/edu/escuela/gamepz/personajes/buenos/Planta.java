package edu.escuela.gamepz.personajes.buenos; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE

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
		super.decVida();
	} //CIERRE decVida()
	public void decVida(int vida){
		if (escudo == 'A'){
			super.decVida(vida * 2);
		}
	} //CIERRE decVida(int)
	public void addVida(){
		super.addVida();
	} //CIERRE addVida()
	public void addVida(int vida){
		if (escudo == 'A'){
			super.addVida(vida * 2);
		}
	} //CIERRE addVida(int)
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;
	} //CIERRE getDetalle
} //CIERRE CLASE