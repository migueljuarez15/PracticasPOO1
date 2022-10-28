package edu.escuela.gamepz.personajes.buenos; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.Escudo; //IMPORT CORRESPONDIENTE

public class Planta extends Personaje{
	private Escudo escudo;
	public Planta(String nombre, int vida, Escudo escudo){
		super(nombre, vida);
		this.escudo = escudo;
	} //CIERRE Planta1(String, int, Escudo)
	public Planta(String nombre, Escudo escudo){
		super(nombre, 3);
		this.escudo = escudo;
	} //CIERRE Planta2(String, Escudo)
	public Planta(String nombre, int vida){
		super(nombre, vida);
		escudo = Escudo.NULO;
	} //CIERRE Planta3(String, int)
	public Planta(String nombre){
		super(nombre, 3);
		escudo = Escudo.NULO;
	} //CIERRE Planta4(String)
	public Escudo getEscudo(){
		return escudo;
	} //CIERRE getEscudo
	public void decVida(){
		vida -= escudo.getNivel();
	} //CIERRE decVida()
	public void decVida(int vidaD){
		vida -= escudo.getNivel() * vidaD;
	} //CIERRE decVida(int)
	public void addVida(){
		vida += escudo.getNivel();
	} //CIERRE addVida()
	public void addVida(int vidaA){
		vida += escudo.getNivel() * vidaA;
	} //CIERRE addVida(int)
	public String toString(){
		return super.toString() + "\t" + escudo.getNivel();
	} //CIERRE getDetalle
} //CIERRE CLASE