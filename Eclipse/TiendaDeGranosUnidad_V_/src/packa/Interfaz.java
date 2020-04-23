package packa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {
	
	private JPanel contentPane;
	Pila pilaCebada=new Pila();
	Pila pilaMaiz=new Pila();
	Pila pilaSorgo=new Pila();
	Pila pilaTrigo=new Pila();
	Colas colaCebada=new Colas();
	Colas colaMaiz=new Colas();
	Colas colaSorgo=new Colas();
	Colas colaTrigo=new Colas();
	private JTextField txtCanTonCom;
	private JTextField txtPre;
	private JTextField txtCanVen;
	private JButton btnComprar;
	private JButton btnVender;
	private JComboBox cmbGranoCom;
	private JComboBox cmbGranoVen;
	private JLabel label_2;
	int can;
	int total=0;
	int preci=0;
	double tota=0;
	double tot=0;
	double totc=0;
	double totac=0;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton button;
	private JButton button_1;
	private JLabel label_7;
	private JLabel label_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label_2.setText("0");	
				total=0;
			}
		});
		btnComprar.setBounds(109, 237, 89, 23);
		contentPane.add(btnComprar);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label_5.setText("0");
				tot=0;
				tota=0;
			}
		});
		btnVender.setBounds(269, 237, 89, 23);
		contentPane.add(btnVender);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(118, 0, 175, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(10, 237, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblCompra = new JLabel("Compra:");
		lblCompra.setForeground(Color.GREEN);
		lblCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCompra.setBounds(52, 38, 76, 23);
		contentPane.add(lblCompra);
		
		JLabel lblVenta = new JLabel("Venta  por  pilas :");
		lblVenta.setForeground(Color.GREEN);
		lblVenta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenta.setBounds(269, 38, 106, 23);
		contentPane.add(lblVenta);
		
		JLabel lblTipoDeGrano = new JLabel("Tipo de grano:");
		lblTipoDeGrano.setBounds(10, 70, 79, 14);
		contentPane.add(lblTipoDeGrano);
		
		cmbGranoCom = new JComboBox();
		cmbGranoCom.setModel(new DefaultComboBoxModel(new String[] {"Cebada", "Maiz", "Sorgo", "Trigo"}));
		cmbGranoCom.setBounds(99, 67, 71, 20);
		contentPane.add(cmbGranoCom);
		
		JLabel label = new JLabel("Tipo de grano:");
		label.setBounds(238, 70, 79, 14);
		contentPane.add(label);
		
		cmbGranoVen = new JComboBox();
		cmbGranoVen.setModel(new DefaultComboBoxModel(new String[] {"Cebada", "Maiz", "Sorgo", "Trigo"}));
		cmbGranoVen.setBounds(330, 67, 71, 20);
		contentPane.add(cmbGranoVen);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad (ton):");
		lblNewLabel_1.setBounds(10, 100, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPrecioporTon = new JLabel("Precio (por ton):");
		lblPrecioporTon.setBounds(10, 125, 79, 14);
		contentPane.add(lblPrecioporTon);
		
		txtCanTonCom = new JTextField();
		txtCanTonCom.setBounds(99, 98, 86, 20);
		contentPane.add(txtCanTonCom);
		txtCanTonCom.setColumns(10);
		
		txtPre = new JTextField();
		txtPre.setBounds(99, 122, 86, 20);
		contentPane.add(txtPre);
		txtPre.setColumns(10);
		
		JLabel label_1 = new JLabel("Cantidad (ton):");
		label_1.setBounds(238, 100, 79, 14);
		contentPane.add(label_1);
		
		txtCanVen = new JTextField();
		txtCanVen.setBounds(328, 97, 86, 20);
		contentPane.add(txtCanVen);
		txtCanVen.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grano=cmbGranoCom.getSelectedItem().toString();
				int op=0;
				if(grano=="Cebada"){
					op=1;
				}
				if(grano=="Maiz"){
					op=2;
				}
				if(grano=="Sorgo"){
					op=3;
				}
				if(grano=="Trigo"){
					op=4;
				}
				can= Integer.parseInt(txtCanTonCom.getText());
				preci=Integer.parseInt(txtPre.getText());
				switch (op){
					
					case 1:
						pilaCebada.inserta(preci, can);
						colaCebada.inserta(preci, can);
						break;
					case 2:
						pilaMaiz.inserta(preci, can);
						colaMaiz.inserta(preci, can);
						break;
					case 3:
						pilaSorgo.inserta(preci, can);
						colaSorgo.inserta(preci, can);
						break;
					case 4:
						pilaTrigo.inserta(preci, can);
						colaTrigo.inserta(preci, can);
						break;
				}
				total=total+(can*preci);
				String tot= Integer.toString(total);
				label_2.setText(tot);
				txtCanTonCom.setText("");
				txtPre.setText("");
				
			}
		});
		btnAgregar.setBounds(39, 153, 89, 23);
		contentPane.add(btnAgregar);
		
		JLabel lblTotal = new JLabel("Total:  $");
		lblTotal.setForeground(Color.BLUE);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTotal.setBounds(10, 187, 79, 34);
		contentPane.add(lblTotal);
		
		label_2 = new JLabel("0");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_2.setBounds(96, 190, 89, 28);
		contentPane.add(label_2);
		
		JButton btnAgregar_1 = new JButton("Agregar");
		btnAgregar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grano=cmbGranoVen.getSelectedItem().toString();
				int op=0;
			
				if(grano=="Cebada"){
					op=1;
				}
				if(grano=="Maiz"){
					op=2;
				}
				if(grano=="Sorgo"){
					op=3;
				}
				if(grano=="Trigo"){
					op=4;
				}
				can= Integer.parseInt(txtCanVen.getText());
				switch (op){
					
					case 1:
						tot=pilaCebada.elimina(can);
						break;
					case 2:
						tot=pilaMaiz.elimina(can);
						break;
					case 3:
						tot=pilaSorgo.elimina(can);
						break;
					case 4:
						tot=pilaTrigo.elimina(can);
						break;
				}
				
				tota=tota+(tot+(tot*0.10));
				String total= Double.toString(tota);
				label_5.setText(total);
				txtCanVen.setText("");
			}
		});
		btnAgregar_1.setBounds(286, 139, 89, 23);
		contentPane.add(btnAgregar_1);
		
		JLabel lblVentaPorColas = new JLabel("Venta  por  colas :");
		lblVentaPorColas.setForeground(Color.GREEN);
		lblVentaPorColas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVentaPorColas.setBounds(490, 38, 111, 23);
		contentPane.add(lblVentaPorColas);
		
		JLabel label_3 = new JLabel("Tipo de grano:");
		label_3.setBounds(458, 70, 79, 14);
		contentPane.add(label_3);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cebada", "Maiz", "Sorgo", "Trigo"}));
		comboBox.setBounds(547, 67, 71, 20);
		contentPane.add(comboBox);
		
		JLabel label_4 = new JLabel("Cantidad (ton):");
		label_4.setBounds(458, 100, 79, 14);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(547, 97, 86, 20);
		contentPane.add(textField);
		
		button = new JButton("Agregar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String grano=comboBox.getSelectedItem().toString();
				int op=0;
			
				if(grano=="Cebada"){
					op=1;
				}
				if(grano=="Maiz"){
					op=2;
				}
				if(grano=="Sorgo"){
					op=3;
				}
				if(grano=="Trigo"){
					op=4;
				}
				can= Integer.parseInt(textField.getText());
				switch (op){
					
					case 1:
						totc=colaCebada.elimina(can);
						break;
					case 2:
						totc=colaMaiz.elimina(can);
						break;
					case 3:
						totc=colaSorgo.elimina(can);
						break;
					case 4:
						totc=colaTrigo.elimina(can);
						break;
				}
				
				totac=totac+(totc+(totc*0.10));
				String total= Double.toString(totac);
				label_7.setText(total);
				textField.setText("");
			}
		});
		button.setBounds(484, 139, 89, 23);
		contentPane.add(button);
		
		JLabel lblTotal_1 = new JLabel("Total:  $");
		lblTotal_1.setForeground(Color.BLUE);
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTotal_1.setBounds(206, 187, 89, 34);
		contentPane.add(lblTotal_1);
		
		label_5 = new JLabel("0");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_5.setBounds(286, 190, 89, 28);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Total:  $");
		label_6.setForeground(Color.BLUE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_6.setBounds(448, 187, 89, 34);
		contentPane.add(label_6);
		
		label_7 = new JLabel("0");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_7.setBounds(536, 193, 89, 28);
		contentPane.add(label_7);
		
		button_1 = new JButton("Vender");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					label_7.setText("0");
					totc=0;
					totac=0;
			}
		});
		button_1.setBounds(484, 237, 89, 23);
		contentPane.add(button_1);
	}
}
