package mx.desasof.inmobiliaria.casas;

public class Urbana extends Casa{
	private int bannos;
	public Urbana(String tipo, int hab, float costo, int bannos){
		super(tipo, hab, costo);
		this.bannos = bannos;
	}
	public Urbana(String tipo, int bannos){
		super(tipo, 2, 2000000f);
		this.bannos = bannos;
	}
	public int hashCode(){
		return super.hashCode() * bannos * 23;
	}
	public boolean equals(Object objeto3){
		if (super.equals(objeto3) && objeto3 instanceof Urbana){
			return true;
		}
		return false;
	}
	public String toString(){
		return super.toString() + bannos;
	}
}