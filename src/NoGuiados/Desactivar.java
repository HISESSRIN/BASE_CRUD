package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Desactivar {

	private JFrame frmHisessrindesactivar;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desactivar window = new Desactivar();
					window.frmHisessrindesactivar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Desactivar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrindesactivar = new JFrame();
		frmHisessrindesactivar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrindesactivar.setTitle("HISESSRIN-Desactivar");
		frmHisessrindesactivar.setBounds(100, 100, 412, 300);
		frmHisessrindesactivar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrindesactivar.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 162, 304, 55);
		frmHisessrindesactivar.getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(10, 11, 157, 20);
		frmHisessrindesactivar.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 53, 157, 20);
		frmHisessrindesactivar.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =("hola "+textField.getText()+" vives en la ciudad de "+textField_1.getText());
				lblNewLabel.setText(a);
			}
		});
		btnNewButton.setBounds(10, 84, 89, 23);
		frmHisessrindesactivar.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Desactivar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				
			}
		});
		btnNewButton_1.setBounds(10, 107, 89, 23);
		frmHisessrindesactivar.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Activar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				textField_1.setEnabled(true);
				
			}
			
		});
		btnNewButton_2.setBounds(10, 128, 89, 23);
		frmHisessrindesactivar.getContentPane().add(btnNewButton_2);
		
		
	}
}
