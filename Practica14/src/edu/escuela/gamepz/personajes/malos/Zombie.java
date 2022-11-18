package edu.escuela.gamepz.personajes.malos; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.Muerto; //IMPORT CORRESPONDIENTE

public class Zombie extends Personaje implements Muerto{
	private boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre, vida, 0.0f);
		this.ataque = ataque;
	} //CIERRE Zombie1(String, int, boolean)
	public Zombie(String nombre, boolean ataque){
		super(nombre, 3, 0.0f);
		this.ataque = ataque;
	} //CIERRE Zombie2(String, boolean)
	public Zombie(String nombre){
		super(nombre, 3, 0.0f);
		ataque = false;
	} //CIERRE Zombie3(String)
	public Zombie(String nombre, float size){
		super(nombre, 3, size);
	}
	public boolean getAtaque(){
		return ataque;
	} //CIERRE getAtaque
	public void decVida(){
		if (ataque == false) {
            setVida(vida - (3));
        }else{
            setVida(vida - (1));
        }
	} //CIERRE decVida()
	public void decVida(int vidaD){
		if (ataque == false) {
            setVida(vida - (vidaD * 3));
        }else{
            setVida(vida - (vidaD));
        }
	} //CIERRE decVida(int)
	public void addVida(){
		if (ataque == true) {
            setVida(vida + (3));
        }
	} //CIERRE addVida()
	public void addVida(int vidaA){
		if (ataque == true) {
            setVida(vida + (vidaA * 3));
        }
	} //CIERRE addVida(int)
	public void comer(){
		System.out.println("Come cerebros");
	} //CIERRE comer
	public String toString(){
		return super.toString() + "\t" + ataque;
	} //CIERRE getDetalle
} //CIERRE CLASE