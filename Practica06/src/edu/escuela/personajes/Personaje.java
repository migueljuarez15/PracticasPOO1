package com.patito.poo1pract.personajes;

public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public void setNombre(String nombre){
		this.nombre= nombre;
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
}

