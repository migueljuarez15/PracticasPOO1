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
		if (ataque == false) {
            super.decVida(1 * 3);
        }else{
            super.decVida();
        }
	} //CIERRE decVida()
	public void decVida(int vidaDZ){
		if (ataque == false) {
            super.decVida(vidaDZ * 3);
        }else{
            super.decVida(vidaDZ);
        }
	} //CIERRE decVida(int)
	public void addVida(){
		if (ataque == true) {
            super.addVida(1 * 3);
        }
	} //CIERRE addVida()
	public void addVida(int vidaAZ){
		if (ataque == true) {
            super.addVida(vidaAZ * 3);
        }
	} //CIERRE addVida(int)
	public String toString(){
		return super.toString() + "\t" + ataque;
	} //CIERRE getDetalle
} //CIERRE CLASE