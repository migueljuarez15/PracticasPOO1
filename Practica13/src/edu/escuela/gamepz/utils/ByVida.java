package edu.escuela.gamepz.utils;
import java.util.Comparator;
public class ByVida implements Comparator <Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.getVida() != p2.getVida()) {
			return (p2.getVida() < p1.getVida()) ? -1 : 1;
		}
		if (p1.getNombre() != p2.getNombre()) {
			return p2.getHora()-p1.getHora();
		}
		return 1;

	}
}