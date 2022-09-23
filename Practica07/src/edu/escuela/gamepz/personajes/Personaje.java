package edu.escuela.gamepz.personajes;

public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(String nombre){
		this.nombre = nombre;
		edad = 0;
	}
	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25){
			this.nombre = nombre;
		}
		this.edad = edad;
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}else{
			return false;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + edad;
	}
}

