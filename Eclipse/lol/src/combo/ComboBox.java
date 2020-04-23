 
package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class ComboBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 87, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Sin estudios");
		comboBox.addItem("Primaria");
		comboBox.addItem("Secundaria");
		comboBox.addItem("Preparatoria o Tecnio");
		comboBox.addItem("Licenciatura o Ingenieria");
		comboBox.addItem("Maestria");
		comboBox.addItem("Doctorado");		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 64, 87, 20);
		contentPane.add(comboBox_1);
		try{
			Scanner listaAutos=new Scanner (new File ("Autos.txt"));
			while (listaAutos.hasNextLine()){
				comboBox_1.addItem(listaAutos.nextLine());
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
