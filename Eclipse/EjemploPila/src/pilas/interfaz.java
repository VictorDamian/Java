package pilas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;
	private JRadioButton rMaiz;
	private JRadioButton rSorgo;
	private JRadioButton rCebada;
	private JRadioButton rTrigo;
	private JTextField textPrecio;
	private JTextField textCantidad2;
	private JTextField textTotal;

	
	
	////////////////////////////////////////////
	pilass pilamaiz = new pilass();
	pilass pilasorgo = new pilass();
	pilass pilacebada = new pilass();
	pilass pilatrigo = new pilass();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setForeground(Color.GREEN);
		setBackground(Color.GREEN);
		setTitle("Menu de Semilla");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setForeground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijaElTipo = new JLabel("Elija el tipo de Semilla");
		lblElijaElTipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblElijaElTipo.setBounds(10, 11, 210, 24);
		contentPane.add(lblElijaElTipo);
		
		rMaiz = new JRadioButton("Maiz");
		rMaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rMaiz.isSelected()){
					
					
				}else{
					
				}
	
			}
		});
		rMaiz.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rMaiz.setBounds(20, 68, 109, 23);
		contentPane.add(rMaiz);
		
		rTrigo = new JRadioButton("Trigo");
		rTrigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rTrigo.isSelected()){
					
		
				
			}
			}
		});
		rTrigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rTrigo.setBounds(390, 68, 109, 23);
		contentPane.add(rTrigo);
		
		rSorgo = new JRadioButton("Sorgo");
		rSorgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rSorgo.isSelected()){
					
					
				}
			}
		});
		rSorgo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rSorgo.setBounds(143, 68, 109, 23);
		contentPane.add(rSorgo);
		
		rCebada = new JRadioButton("Cebada");
		rCebada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rCebada.isSelected()){
				
			}
			}
		});
		rCebada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rCebada.setBounds(277, 68, 88, 23);
		contentPane.add(rCebada);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(20, 115, 88, 19);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(194, 116, 46, 14);
		contentPane.add(lblPrecio);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(82, 115, 86, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(250, 115, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		
		///////////////////////////////////////////////////////////////////
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rMaiz.isSelected()){
					int cantidad= Integer.parseInt(textCantidad.getText());
					int precio = Integer.parseInt(textPrecio.getText());
					pilamaiz.inserta(precio, cantidad);
				}
					
				if(rSorgo.isSelected()){
					int cantidad= Integer.parseInt(textCantidad.getText());
					int precio = Integer.parseInt(textPrecio.getText());
					pilasorgo.inserta(precio, cantidad);
					
				}
				
				if(rCebada.isSelected()){
					int cantidad= Integer.parseInt(textCantidad.getText());
					int precio = Integer.parseInt(textPrecio.getText());
					pilacebada.inserta(precio, cantidad);
				}
				
				if(rTrigo.isSelected()){
					int cantidad= Integer.parseInt(textCantidad.getText());
					int precio = Integer.parseInt(textPrecio.getText());
					pilatrigo.inserta(precio, cantidad);
				}
			}
		});
		btnAceptar.setBounds(163, 163, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1); 
			}
		});
		btnSalir.setBounds(188, 426, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblVentas = new JLabel("Ventas");
		lblVentas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVentas.setBounds(206, 239, 46, 14);
		contentPane.add(lblVentas);
		
		JRadioButton rdbtnMaiz_1 = new JRadioButton("Maiz");
		rdbtnMaiz_1.setBounds(20, 261, 109, 23);
		contentPane.add(rdbtnMaiz_1);
		
		JRadioButton rdbtnSorgo_1 = new JRadioButton("Sorgo");
		rdbtnSorgo_1.setBounds(143, 261, 109, 23);
		contentPane.add(rdbtnSorgo_1);
		
		JRadioButton rdbtnCebada_1 = new JRadioButton("Cebada");
		rdbtnCebada_1.setBounds(277, 261, 63, 23);
		contentPane.add(rdbtnCebada_1);
		
		JRadioButton rdbtnTrigo_1 = new JRadioButton("Trigo");
		rdbtnTrigo_1.setBounds(373, 261, 88, 23);
		contentPane.add(rdbtnTrigo_1);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad:");
		lblCantidad_1.setBounds(20, 344, 88, 14);
		contentPane.add(lblCantidad_1);
		
		textCantidad2 = new JTextField();
		textCantidad2.setBounds(82, 341, 86, 20);
		contentPane.add(textCantidad2);
		textCantidad2.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(264, 344, 46, 14);
		contentPane.add(lblTotal);
		
		textTotal = new JTextField();
		textTotal.setBounds(320, 341, 86, 20);
		contentPane.add(textTotal);
		textTotal.setColumns(10);
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rMaiz.isSelected() && (textCantidad2!=null)){
					int cantidad= Integer.parseInt(textCantidad2.getText());
					double c = pilamaiz.elimina(cantidad);
					c=c*1.1;
					textTotal.setText(c+"");
				}
				
				if(rSorgo.isSelected() && (textCantidad2!=null)){
					int cantidad= Integer.parseInt(textCantidad2.getText());
					double c = pilasorgo.elimina(cantidad);
					c=c*1.1;
					textTotal.setText(c+"");
				}
				
				if(rCebada.isSelected() && (textCantidad2!=null)){
					int cantidad= Integer.parseInt(textCantidad2.getText());
					double c = pilacebada.elimina(cantidad);
					c=c*1.1;
					textTotal.setText(c+"");
				}
				
				if(rTrigo.isSelected() && (textCantidad2!=null)){
					int cantidad= Integer.parseInt(textCantidad2.getText());
					double c = pilatrigo.elimina(cantidad);
					c=c*1.1;
					textTotal.setText(c+"");
				}
				
				
			}
		});
		btnAceptar_1.setBounds(163, 378, 89, 23);
		contentPane.add(btnAceptar_1);
		
		
		
		
	}
}
