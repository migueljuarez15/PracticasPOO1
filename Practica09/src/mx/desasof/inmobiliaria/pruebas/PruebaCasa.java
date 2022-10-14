package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;

public class PruebaCasa{
	public static void main(String[] args) {
		Casa casa1 = new Casa("Estandar", 3, 3000000);
		Campo campo1 = new Campo("Cazador", 3.5f, 10f);
		Urbana urbana1 = new Urbana("Residencia", 3, 2500000, 2);
		Casa casa2 = new Casa("Estandar", 3, 3000000);
		Campo campo2 = new Campo("Cazador", 3.5f, 10);
		Urbana urbana2 = new Urbana("Residencia", 3, 2500000, 2);
		Casa casa3 = new Casa("Estandar");
		Campo campo3 = new Campo("Cazador", 4, 15000, 3f, 5f);
		Urbana urbana3 = new Urbana("Residencia", 5);
		Casa casas[] = {casa1, campo1, urbana1, casa2, campo2, urbana2, casa3, campo3, urbana3};
	}
}