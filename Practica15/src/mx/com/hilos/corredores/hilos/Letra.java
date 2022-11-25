package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;

public class Letra implements Runnable{
	private char letra;
	public Letra(JLabel etq, char letra){
		this.etq = etq;
		this.letra = letra;
	}
	public void run(){
		String cadena = etq.getText();
		for (int i = 0; i <= 50; i++) {
			cadena.charAt(0);
			etq.setText(etq.getText() + cadena);
			int rand = (int)(Math.random()*1000);
			try{
				Thread.sleep(rand);
			}catch(InterruptedException ie){
				//NO ES NECESARIO EL PRINTLN, SOLO ERA PARA PONER ALGO EN EL CATCH
				System.out.println("EJECUCION INTERRUMPIDA");
			}
		}
		cadena = "Finalizado";
		etq.setText(cadena);
	}
	private JLabel etq;
}