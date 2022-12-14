package edu.escuela.gamepz.pruebas; //PAQUETE CORRESPONDIENTE
import edu.escuela.gamepz.personajes.Personaje; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.buenos.Planta; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.personajes.malos.Zombie; //IMPORT CORRESPONDIENTE
import edu.escuela.gamepz.utils.*; //IMPORT CORRESPONDIENTE
import java.util.Collections; //IMPORT CORRESPONDIENTE
import java.util.LinkedList; //IMPORT CORRESPONDIENTE
import java.util.TreeSet; //IMPORT CORRESPONDIENTE
import java.util.ArrayList; //IMPORT CORRESPONDIENTE
import java.util.Scanner; //IMPORT CORRESPONDIENTE
import java.io.File; //IMPORT CORRESPONDIENTE
import java.io.ObjectInputStream; //IMPORT CORRESPONDIENTE
import java.io.ObjectOutputStream; //IMPORT CORRESPONDIENTE
import java.io.FileInputStream; //IMPORT CORRESPONDIENTE
import java.io.FileOutputStream; //IMPORT CORRESPONDIENTE
import java.io.OutputStream; //IMPORT CORRESPONDIENTE
import java.io.Serializable; //IMPORT CORRESPONDIENTE
import java.io.IOException; //IMPORT CORRESPONDIENTE

public class PruebaColeccion{
	public static void main(String[] args) {
		Personaje datos[] = {
			new Planta("Fabian", Tablero.genVida(), Escudo.MEDIO),
			new Planta("Bianca", Tablero.genVida()),
			new Planta("Fabian", Tablero.genVida()),
			new Planta("Armando", Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca", Tablero.genVida()),
			new Planta("Dayan", Tablero.genVida()),
			new Zombie("Armando", Tablero.genVida(), false),
			new Zombie("Dayan", Tablero.genVida(), true),
			new Zombie("Armando", Tablero.genVida())
		}; //CIERRE ARREGLOS

		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		Scanner s = new Scanner(System.in);

		System.out.print("Escribe el nombre del archivo/directorio:   ");
		String fname = s.nextLine();
		path += fname;
		File f = new File(path);
		if (f.exists() && f.isFile()){
			System.out.println("El archivo ya existe");
			return;
		}
		if (f.isDirectory()){
			mostrarDirectorio(f);
			return;
		}

		TreeSet<Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<>();

		for (Personaje tmp: datos){
			arbol.add(tmp);
			lista.add(tmp);
		}
		guardarObjetos(f, arbol);

		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p: arbol){
			System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p: lista){
			System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p: arr){
			System.out.println(p);
		}
	} //CIERRE MAIN
	private static void mostrarDirectorio(File fMe){
		for (String fileTmp: fMe.list()) {
			System.out.println(fileTmp);
		}
	} //CIERRE METODO mostrarDirectorio
	private static void guardarObjetos(File fMe, TreeSet<Personaje> arbMe){
		try{
			FileOutputStream outS = new FileOutputStream(fMe);
			ObjectOutputStream oIn = new ObjectOutputStream(outS);
			for (Personaje o: arbMe) {
				oIn.writeObject(o);
			}
			oIn.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	} //CIERRE METODO guardarObjetos
} //CIERRE CLASE