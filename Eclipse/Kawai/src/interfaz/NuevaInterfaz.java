package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class NuevaInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaInterfaz frame = new NuevaInterfaz();
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
	public NuevaInterfaz() {
		setForeground(Color.BLUE);
		setBackground(new Color(0, 102, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 471);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivos = new JMenu("Nuevo");
		menuBar.add(mnArchivos);
		
		JMenu mnAgregar = new JMenu("Agregar");
		mnArchivos.add(mnAgregar);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnVentana = new JMenu("Ventana");
		menuBar.add(mnVentana);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelnorte = new JPanel();
		contentPane.add(panelnorte, BorderLayout.NORTH);
		panelnorte.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panelnorte1 = new JPanel();
		panelnorte.add(panelnorte1);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		panelnorte1.add(lblNombre);
		
		textField = new JTextField();
		panelnorte1.add(textField);
		textField.setColumns(25);
		
		JLabel lblEdad = new JLabel("Edad: ");
		panelnorte1.add(lblEdad);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(10, 10, 40, 1));
		panelnorte1.add(spinner);
		
		JLabel lblSexo = new JLabel("Sexo:");
		panelnorte1.add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre ", "Mujer"}));
		panelnorte1.add(comboBox);
		
		JPanel panelnorte2 = new JPanel();
		panelnorte.add(panelnorte2);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		panelnorte2.add(lblDomicilio);
		
		textField_1 = new JTextField();
		panelnorte2.add(textField_1);
		textField_1.setColumns(25);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		panelnorte2.add(lblTelefono);
		
		textField_2 = new JTextField();
		panelnorte2.add(textField_2);
		textField_2.setColumns(12);
		
		JPanel panelsur = new JPanel();
		contentPane.add(panelsur, BorderLayout.SOUTH);
		panelsur.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setMnemonic('A');
		btnAceptar.setHorizontalAlignment(SwingConstants.RIGHT);
		panelsur.add(btnAceptar);
		
		JButton btnCalcelar = new JButton("Calcelar");
		btnCalcelar.setMnemonic('C');
		btnCalcelar.setHorizontalAlignment(SwingConstants.RIGHT);
		panelsur.add(btnCalcelar);
		
		JPanel paneleste = new JPanel();
		contentPane.add(paneleste, BorderLayout.EAST);
		paneleste.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnNewButton = new JButton("\r\n");
		btnNewButton.setToolTipText("Ola k Ase");
		paneleste.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\r\n");
		paneleste.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		paneleste.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		paneleste.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		paneleste.add(btnNewButton_4);
		
		JPanel panelcentro = new JPanel();
		contentPane.add(panelcentro, BorderLayout.CENTER);
		panelcentro.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelcentro.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Edad", "Sexo", "Domicilio", "Telefono"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(275);
		table.getColumnModel().getColumn(3).setPreferredWidth(275);
		table.getColumnModel().getColumn(4).setPreferredWidth(175);
		scrollPane.setViewportView(table);
	}

}
