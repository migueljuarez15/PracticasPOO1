package mx.com.hilos.corredores.ventanas;
import mx.com.hilos.corredores.hilos.RunHilos;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

public class Ventana extends JFrame{
	public Ventana(){
		initComponents();
	}
	private void initComponents(){
		int ancho = 550;
		int alto = 250;
		Dimension lblDim = new Dimension(ancho - 15, alto / 10);
		Color border = new Color(0, 0, 255);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblTitulo = new JLabel("* Practica 15 - Manejo de hilos *");
		lblTitulo.setPreferredSize(lblDim);
		lblElem1 = new JLabel("Hilo 1");
		txtElem1 = new JTextField(3);
		lblElem2 = new JLabel("Hilo 2");
		txtElem2 = new JTextField(3);
		btnStart = new JButton("Comenzar");
		btnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click){
				btnStart.setEnabled(true);
				//RunHilos.iniciar();
			}
		});
		hElem1 = new JLabel("* Aqui va el hilo 1 *");
		hElem1.setBorder(BorderFactory.createLineBorder(border));
		hElem1.setPreferredSize(lblDim);
		hElem2 = new JLabel("* Aqui va el hilo 2 *");
		hElem2.setBorder(BorderFactory.createLineBorder(border));
		hElem2.setPreferredSize(lblDim);
		btnStart.setPreferredSize(lblDim);
		setTitle("Practica 15");
		setLayout(new FlowLayout());
		setSize(ancho, alto);
		add(lblTitulo);
		add(lblElem1);
		add(txtElem1);
		add(lblElem2);
		add(txtElem2);
		add(btnStart);
		add(hElem1);
		add(hElem2);
	}
	private JLabel lblTitulo;
	private JLabel lblElem1;
	private JLabel lblElem2;
	private JLabel hElem1;
	private JLabel hElem2;
	private JTextField txtElem1;
	private JTextField txtElem2;
	private JButton btnStart;
}