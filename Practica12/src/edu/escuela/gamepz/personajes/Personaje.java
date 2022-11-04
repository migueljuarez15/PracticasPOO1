package edu.escuela.gamepz.personajes; //PAQUETE CORRESPONDIENTE

public abstract class Personaje{
	private String nombre;
	protected int vida;
	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	} //CIERRE Personaje1(String, int)
	public Personaje(String nombre){
		this(nombre, 3);
	} //CIERRE Personaje2(String)
	public abstract void decVida(); //CIERRE ABSTRACT decVida1()

	public abstract void decVida(int vidaD); //CIERRE ABSTRACT decVida2(int)

	public abstract void addVida(); //CIERRE ABSTRACT addVida()

	public abstract void addVida(int vidaA); //CIERRE ABSTRACT addVida2(int)

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
		if (vida > 0 && vida < 100){
			this.vida = vida;
			return true;
		}else{
			return false;
		}
	} //CIERRE setVida
	public String toString(){
		return nombre + "\t" + vida;
	} //CIERRE getDetalle
} //CIERRE CLASE