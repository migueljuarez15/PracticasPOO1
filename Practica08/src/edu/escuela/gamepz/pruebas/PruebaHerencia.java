public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("David", 100);
		Personaje per02 = new Personaje("Bianca");
		Planta plan01 = new Planta("Fabian", 10, 'B');
		Planta plan02 = new Planta("Almendra", 50);
		Planta plan03 = new Planta("Ricardo", 'C');
		Planta plan04 = new Planta("Silvia");
		Zombie zom01 = new Zombie("Armando", 80, false);
		Zombie zom02 = new Zombie("Josseline", true);
		Zombie zom03 = new Zombie("Eduardo");

		Personaje pers[] = {per01, per02, plan01, plan02, plan03, plan04, zom01, zom02, zom03}
	}
}