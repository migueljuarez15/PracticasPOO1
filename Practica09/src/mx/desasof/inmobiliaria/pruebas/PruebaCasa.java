package mx.desasof.inmobiliaria.pruebas; //PAQUETE CORRESPONDIENTE
import mx.desasof.inmobiliaria.casas.*; //IMPORT CORRESPONDIENTE

public class PruebaCasa{
	//MAIN
	public static void main(String[] args) {
		//CREACIÓN DE LAS INSTANCIAS
		Casa casa1 = new Casa("Estandar", 3, 3000000);
		Campo campo1 = new Campo("Cazador", 3.5f, 10f);
		Urbana urbana1 = new Urbana("Residencia", 3, 2500000, 2);
		Casa casa2 = new Casa("Estandar", 3, 3000000);
		Campo campo2 = new Campo("Cazador", 3.5f, 10);
		Urbana urbana2 = new Urbana("Residencia", 3, 2500000, 2);
		Casa casa3 = new Casa("Estandar");
		Campo campo3 = new Campo("Cazador", 4, 15000, 3f, 5f);
		Urbana urbana3 = new Urbana("Residencia", 5);
		
		//SE GUARDAN LAS INSTANCIAS EN UN ARREGLO
		Casa casas[] = {casa1, campo1, urbana1, casa2, campo2, urbana2, casa3, campo3, urbana3};
		
		//CICLO WHILE
		int i = 0;
		while (i < casas.length){
			//CICLO FOREACH
			for (Casa c: casas){
				//CICLO IF 1
				if (c == casas[i]){
					System.out.println(casas[i] + " Son el mismo objeto " + c);
					System.out.println(" = = = = = ");
					break;
				} //CIERRE IF 1

				//CICLO IF 2
				if (c.equals(casas[i])){
					System.out.println(casas[i] + " Son iguales " + c);
					System.out.println(" e e e e e ");
					break;
				} //CIERRE IF 2

				//CICLO IF 3
				if (!c.equals(casas[i])){
					System.out.println(casas[i] + " No son iguales " + c);
					System.out.println(" ! ! ! ! ! ");
					continue;
				} //CIERRE IF 3
			} //CIERRE FOREACH
			i++;
		} //CIERRE WHILE
	} //CIERRE MAIN
} //CIERRE CLASE