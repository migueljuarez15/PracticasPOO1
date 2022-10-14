package mx.desasof.inmobiliaria.casas; //PAQUETE CORRESPONDIENTE

public class Urbana extends Casa{
	//ATRIBUTOS DE LA CLASE
	private int bannos;

	//CONSTRUCTOR 1
	public Urbana(String tipo, int hab, float costo, int bannos){
		super(tipo, hab, costo);
		this.bannos = bannos;
	} //CIERRE CONSTRUCTOR 1

	//CONSTRUCTOR 2
	public Urbana(String tipo, int bannos){
		super(tipo, 2, 2000000f);
		this.bannos = bannos;
	} //CIERRE CONSTRUCTOR 2
	
	//MÉTODO HASHCODE()
	public int hashCode(){
		return super.hashCode() * bannos * 23;
	} //CIERRE HASHCODE()

	//MÉTODO EQUALS()
	public boolean equals(Object objeto3){
		if (super.equals(objeto3) && objeto3 instanceof Urbana){
			return true;
		}
		return false;
	} //CIERRE EQUALS()

	//MÉTODO TOSTRING()
	public String toString(){
		return super.toString() + bannos;
	} //CIERRE TOSTRING()
} //CIERRE CLASE