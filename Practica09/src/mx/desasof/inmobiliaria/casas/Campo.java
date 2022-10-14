package mx.desasof.inmobiliaria.casas;

public class Campo extends Casa{
	float piscina[] = new float[2];
	
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
	public Campo(String tipo, float ancho, float largo){
		super(tipo, 2, 2000000f);
		piscina[0] = ancho;
		piscina[1] = largo;
	}
	public int hashCode(){
		return super.hashCode() * ancho * largo / 5;
	}
	public boolean equals(Object objeto2){
		if (super.equals(objeto2) && objeto2 instanceof Campo){
			return true;
		}
		return false;
	}
	public String toString(){
		return super.toString() + ancho + " " + largo + " ";
	}
}