package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;
public class BySize implements Comparator <Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.genSize() != p2.genSize()) {
			return (p2.genSize() < p1.genSize()) ? -1 : 1;
		}
		if (p1.getNombre().compareTo(p2.getNombre()) != 0) {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		if (p1.getVida() != p2.getVida()) {
			return (p2.getVida() < p1.getVida()) ? -1 : 1;
		}
		return 0;
	}
}