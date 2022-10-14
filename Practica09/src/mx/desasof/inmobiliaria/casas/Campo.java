package mx.desasof.inmobiliaria.casas; //PAQUETE CORRESPONDIENTE

public class Campo extends Casa{
	//ATRIBUTOS DE LA CLASE
	float piscina[] = new float[2];
	
	//CONSTRUCTOR 1
	public Campo(String tipo, int hab, float costo, float ancho, float largo){
		super(tipo, hab, costo);
		piscina[0] = ancho;
		piscina[1] = largo;
	} //CIERRE CONSTRUCTOR 1

	//CONSTRUCTOR 2
	public Campo(String tipo, float ancho, float largo){
		super(tipo, 2, 2000000f);
		piscina[0] = ancho;
		piscina[1] = largo;
	} //CIERRE CONSTRUCTOR 2

	//MÉTODO HASHCODE()
	public int hashCode(){
		return super.hashCode() * (int)(piscina[0] * piscina[1]) / 5;
	} //CIERRE HASHCODE()

	//MÉTODO EQUALS()
	public boolean equals(Object objeto2){
		if (super.equals(objeto2) && objeto2 instanceof Campo){
			return true;
		}
		return false;
	} //CIERRE EQUALS()

	//MÉTODO TOSTRING()
	public String toString(){
		return super.toString() + piscina[0] + " " + piscina[1] + " ";
	} //CIERRE TOSTRING()
} //CIERRE CLASE