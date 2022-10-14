package mx.desasof.inmobiliaria.casas;

public class Casa{
	private String tipo;
	private int hab;
	private float costo;
	public Casa(String tipo, int hab, float costo){
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	}
	public Casa(String tipo){
		this(tipo, 2, 2000000f);
	}
	public int hashCode(){
		return tipo.hashCode() * hab * (int)(costo);
	}
	public boolean equals(Object objeto){
		if (objeto != null && objeto instanceof Casa){
			Casa c = ((Casa)objeto);
			if ((tipo.equals(c.tipo)) && (costo == c.costo)){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return tipo + " " + hab + " " + costo + " ";
	}
}