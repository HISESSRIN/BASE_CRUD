package second.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class register {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	public void limpiar() {
		textField.setText("");
		textField_3.setText("");
		passwordField.setText("");
	}

	public boolean validaEmail(String email) {
		Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validarPassword(String contrasena) {

		if (contrasena.length() > 8) { // una contraseña tiene más de 12 caracteres.
			boolean mayuscula = false;
			boolean numero = false;
			boolean letraOsimbolo = false;
			boolean especial = false;

			// Define caracteres especiales
			Pattern special = Pattern.compile("[?!¡@¿.,´)]");
			Matcher hasSpecial = special.matcher(contrasena);

			int i;
			char l;

			for (i = 0; i < contrasena.length(); i++) {
				l = contrasena.charAt(i);

				if (Character.isDigit(l)) {// mínimo un número.
					numero = true;
				}
				if (Character.isLetter(l)) {// contiene letras o símbolos (?!¡@¿.,´)
					letraOsimbolo = true;
				}
				if (Character.isUpperCase(l)) { // mínimo una letra mayúscula
					mayuscula = true;
				}
				if (hasSpecial.find()) { // Valida "caracteres especiales".
					especial = true;
				}
			}
			System.out.println("numero: " + numero + "mayuscula: " + mayuscula + "letra o simbolo: " + letraOsimbolo
					+ "especial: " + especial);
			if (numero == true && mayuscula == true && letraOsimbolo == true && especial == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 281, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "email",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField.setBounds(20, 21, 213, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		passwordField = new JPasswordField();
		passwordField.setBorder(new TitledBorder(null, "pasword", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		passwordField.setBounds(20, 99, 213, 36);
		frame.getContentPane().add(passwordField);
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new TitledBorder(null, "nombre", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField_3.setBounds(20, 161, 213, 36);
		frame.getContentPane().add(textField_3);

		JButton btnNewButton = new JButton("registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario u = new Usuario(0, textField_3.getText(), textField.getText(), passwordField.getText());

					if (textField_3.getText().equals("") || textField.getText().equals("")
							|| passwordField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "ERROR CAMPOS VACIOS");
						return;
					}
					if (!validaEmail(textField.getText())) {
						JOptionPane.showMessageDialog(null, "CORREO NO VALIDO");
						return;
					}
					if (!validarPassword(passwordField.getText())) {

						JOptionPane.showMessageDialog(null,
								"PASSWORD NO SEGURO (Mayuscula, minusculas, numero, caracteres especial y min longitud de 8)");
						return;
					}
					if (u.insertarUsuario()) {

						JOptionPane.showMessageDialog(null, "CORREO NO DISPONIBLE");
						return;
					}
					if (u.insertarUsuario()) {
						limpiar();
						JOptionPane.showMessageDialog(null, "SE REGISTRO CORRECTAMENTE");
					} else {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setBounds(86, 234, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(236, 0, 45, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
