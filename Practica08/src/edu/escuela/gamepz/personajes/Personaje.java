package edu.escuela.gamepz.personajes; //PAQUETE CORRESPONDIENTE

public class Personaje{
	private String nombre;
	private int vida;
	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	} //CIERRE Personaje1(String, int)
	public Personaje(String nombre){
		this(nombre, 3);
	} //CIERRE Personaje2(String)
	public void decVida(){
		if (vida-1 > 0 && vida-1 < 99){
			vida--;
		}else{
			vida = 3;
		}
	} //CIERRE decVida1()
	public void decVida(int vida){
		if (vida-vida > 0 && vida-vida < 99){
			vida--;
		}else{
			vida = 3;
		}
	} //CIERRE decVida2(int)
	public void addVida(){
		if (vida > 0 && vida < 99){
			vida++;
		}
	} //CIERRE addVida1()
	public void addVida(int vida){
		if (vida > 0 && vida < 99){
			vida += vida;
		}
	} //CIERRE addVida2(int)
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