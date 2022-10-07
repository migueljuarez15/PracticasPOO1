package edu.escuela.gamepz.personajes;

public class Personaje{
	private String nombre;
	private int vida;
	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	} //CIERRE Personaje(String, int)
	public Personaje(String nombre){
		this(nombre, 3);
	} //CIERRE Personaje(String)
	public void decVida(){
		vida -= 1;
	} //CIERRE decVida()
	public void decVida(int vida){
		vida --;
	} //CIERRE decVida(int)
	public void addVida(){
		vida += 1;
	} //CIERRE addVida()
	public void addVida(int vida){
		vida ++;
	} //CIERRE addVida(int)
	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25){
			this.nombre = nombre;
		}
	} //CIERRE setNombre
	public String getNombre(){
		return nombre;
	} //CIERRE getNombre
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	} //CIERRE saludar
	public int getVida(){
		return vida;
	} //CIERRE getVida
	public boolean setVida(int vida){
		if (vida > 0 && vida < 99){
			this.vida = vida;
			return true;
		}else{
			return false;
		}
	} //CIERRE setVida
	public String getDetalle(){
		return nombre + "\t" + vida;
	} //CIERRE getDetalle
} //CIERRE CLASE