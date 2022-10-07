package edu.escuela.gamepz.personajes.malos; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE

public class Zombie extends Personaje{
	private boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida);
		this.ataque = ataque;
	} //CIERRE Zombie1(String, int, boolean)
	public Zombie(String nombre, boolean ataque){
		super(nombre, 3);
		this.ataque = ataque;
	} //CIERRE Zombie2(String, boolean)
	public Zombie(String nombre){
		super(nombre, 3);
		ataque = false;
	} //CIERRE Zombie3(String)
	public boolean getAtaque(){
		return ataque;
	} //CIERRE getAtaque
	public void decVida(){
		super.decVida();
	} //CIERRE decVida()
	public void decVida(int vida){
		super.decVida(vida);
		if (ataque = false){
			vida *= 3;
		}else{
			vida *= 2;
		}
	} //CIERRE decVida(int)
	public void addVida(){
		super.addVida();
	} //CIERRE addVida()
	public void addVida(int vida){
		super.addVida(vida);
		if (ataque = true){
			vida *= 3;
		}
	} //CIERRE addVida(int)
	public String getDetalle(){
		return super.getDetalle() + "\t" + ataque;
	} //CIERRE getDetalle
} //CIERRE CLASE