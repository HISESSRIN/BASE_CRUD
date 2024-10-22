package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circuloso {

	private JFrame frmHisessrincircula;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circuloso window = new Circuloso();
					window.frmHisessrincircula.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Circuloso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrincircula = new JFrame();
		frmHisessrincircula.setTitle("HISESSRIN-Circulo");
		frmHisessrincircula.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrincircula.setBounds(100, 100, 450, 300);
		frmHisessrincircula.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrincircula.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 35, 86, 20);
		frmHisessrincircula.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Area");
		lblNewLabel_1.setBounds(10, 144, 105, 14);
		frmHisessrincircula.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Perimetro");
		lblNewLabel_2.setBounds(10, 163, 148, 38);
		frmHisessrincircula.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,pro;
				a=Double.parseDouble(textField.getText());
			if(a>0) {
				b=Math.PI*(Math.pow(a, 2));
				c=(2*(Math.PI))*a;
				lblNewLabel_1.setText("area "+a);
				lblNewLabel_2.setText("perimetro "+b);
			}else {
				lblNewLabel_1.setForeground(Color.red);
				lblNewLabel_1.setText("ERROR");
				lblNewLabel_2.setForeground(Color.red);
				lblNewLabel_2.setText("ERROR");
				
				
			}
				
				
			}
		});
		btnNewButton.setBounds(7, 78, 89, 23);
		frmHisessrincircula.getContentPane().add(btnNewButton);
	}

}
