package edu.escuela.personajes;

public class Personaje{
	private String nombre;
	private int edad;
	public Personaje(String nombre, int edad){
		this.nombre = nombre;
		if (edad > 0 && edad < 120){
			this.edad = edad;
		}
		edad = 0;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
		String.length(nombre > 5 && nombre < 25)
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

