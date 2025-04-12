package ejerciciosADAGitRemoto2025;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JFrameFormVacioGIT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
	private int contador = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameFormVacioGIT frame = new JFrameFormVacioGIT();
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
	public JFrameFormVacioGIT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(33, 26, 75, 19);
		contentPane.add(lblNombre);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPeso.setBounds(33, 56, 75, 19);
		contentPane.add(lblPeso);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblColor.setBounds(33, 88, 75, 19);
		contentPane.add(lblColor);
		
		textField = new JTextField();
		textField.setBounds(120, 27, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 57, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 89, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(33, 131, 89, 23);
		contentPane.add(btnInsertar);btnInsertar.addActionListener(e -> {
		    String nombre = textField.getText();
		    String peso = textField_1.getText();
		    String color = textField_2.getText();

		    ClaseObjeto nuevo = new ClaseObjeto(nombre, peso, color);
		    nuevo.setNumero(contador++);
		    
		    lista.InsertarEnMedio(nuevo);

		    System.out.println("Objeto insertado: " + nombre);
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(159, 131, 89, 23);
		contentPane.add(btnEliminar);
		btnEliminar.addActionListener(e -> {
		    String input = javax.swing.JOptionPane.showInputDialog("Número del objeto a eliminar:");
		    if (input != null) {
		        try {
		            int num = Integer.parseInt(input);
		            lista.eliminarDeEnmedio(num);
		            System.out.println("Intentando eliminar objeto con número: " + num);
		        } catch (NumberFormatException ex) {
		            System.out.println("Número inválido.");
		        }
		    }
		});

		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(288, 131, 89, 23);
		contentPane.add(btnBuscar);
	}
}
