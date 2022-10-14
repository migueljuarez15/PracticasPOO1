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
}