package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RunHilos{
	public void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
		char ch1 = txt1.charAt(0);
		char ch2 = txt2.charAt(0);
		if (txt1.setText("") && txt2.setText("") || txt1.setText(" ") && txt2.setText(" ")){
			ch1 = 'E';
			ch2 = 'M';
		}
	}
}