package edu.escuela.gamepz.utils; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import java.util.Comparator; //IMPORT CORRESPONDIENTE
public class BySize implements Comparator <Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.getSize() != p2.getSize()) {
			return (p1.getSize() < p2.getSize()) ? -1 : 1;
		}
		if (p1.getNombre().compareTo(p2.getNombre()) != 0) {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		return (p2.getVida() < p1.getVida()) ? -1 : 1;
	} //CIERRE compare
} //CIERRE CLASE