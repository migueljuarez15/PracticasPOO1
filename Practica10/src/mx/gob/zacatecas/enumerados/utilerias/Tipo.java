package mx.gob.zacatecas.enumerados.utilerias;
public enum Tipo{
	SERVER("Servidor"),
	workstation("Estacion de trabajo"),
	Desktop("Escritorio"),
	Laptop("Portatil");
	String type;
	private Tipo(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}