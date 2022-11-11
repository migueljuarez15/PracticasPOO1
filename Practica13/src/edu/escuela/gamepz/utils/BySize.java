package edu.escuela.gamepz.utils;
import java.util.Comparator;
public class BySize implements Comparator <Personaje>{
	public int compare(Caricatura c1, Caricatura c2){
		if (c1.getSueldo()!=c2.getSueldo()) {
			return (c2.getSueldo()<c1.getSueldo()) ? -1 : 1; //el ? es para regresar una cosa u otra y cortar codigo (else)
		}
		if (c1.getHora() !=c2.getHora()) {
			return c2.getHora()-c1.getHora();
		}
		return 1;

	}
}