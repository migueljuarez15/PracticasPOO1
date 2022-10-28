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
		if (escudo == 'A') {
            super.decVida(1*2);
        }else{
            super.decVida();
        }
	} //CIERRE decVida()
	public void decVida(int vidaDP){
		if (escudo == 'A') {
            super.decVida(vidaDP * 2);
        }else{
            super.decVida(vidaDP);
        }
	} //CIERRE decVida(int)
	public void addVida(){
		if (escudo == 'A') {
            super.addVida(1 * 2);
        }else{
            super.addVida();
        }
	} //CIERRE addVida()
	public void addVida(int vidaAP){
		if (escudo == 'A') {
            super.addVida(vidaAP * 2);
        }else{
            super.addVida(vidaAP);
        }
	} //CIERRE addVida(int)
	public String toString(){
		return super.toString() + "\t" + escudo;
	} //CIERRE getDetalle
} //CIERRE CLASE