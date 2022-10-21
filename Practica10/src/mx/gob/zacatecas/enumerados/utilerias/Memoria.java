package mx.gob.zacatecas.enumerados.utilerias;
public enum Memoria{
	DDR("Memoria RAM", 166, 30),
	DDR2("Laptop", 240, 35),
	DDR3("Laptop Nueva", 533, 40),
	DDR4("Gamer", 1600, 40);
	String tipo;
	float vel;
	int pines;
	private Memoria(String tipo, float vel, int pines){
		this.tipo = tipo;
		this.vel = vel;
		this.pines = pines;
	}
	public String getTipo(){
		return tipo;
	}
	public float getVelocidad(){
		return vel;
	}
	public int getPines(){
		return pines;
	}
}