package mx.desasof.inmobiliaria.casas; //PAQUETE CORRESPONDIENTE

public class Casa{
	//ATRIBUTOS DE LA CLASE
	private String tipo;
	private int hab;
	private float costo;

	//CONSTRUCTOR 1
	public Casa(String tipo, int hab, float costo){
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	} //CIERRE CONSTRUCTOR 1

	//CONSTRUCTOR 2
	public Casa(String tipo){
		this(tipo, 2, 2000000);
	} //CIERRE CONSTRUCTOR 2

	//MÉTODO HASHCODE()
	public int hashCode(){
		return tipo.hashCode() * hab * (int)(costo);
	} //CIERRE HASHCODE()

	//MÉTODO EQUAlS()
	public boolean equals(Object objeto1){
		if (objeto1 != null && objeto1 instanceof Casa){
			Casa c = ((Casa)objeto1);
			if ((tipo.equals(c.tipo)) && (costo == c.costo)){
				return true;
			}
		}
		return false;
	} //CIERRE EQUALS()

	//MÉTODO TOSTRING()
	public String toString(){
		return tipo + " " + hab + " " + costo + " ";
	} //CIERRE TOSTRING()
} //CIERRE CLASE