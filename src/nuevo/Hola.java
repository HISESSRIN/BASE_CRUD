package nuevo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Hola {

	public JFrame frmSumaDe;
	private JTextField txtnumeo2;
	private JTextField txtnumero1;
	private JLabel txtresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Hola window = new Hola();
		window.frmSumaDe.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public Hola() {
		inicio();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void inicio() {
		frmSumaDe = new JFrame();
		frmSumaDe.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\imagen\\descarga.jfif"));

		frmSumaDe.getContentPane().setBackground(new Color(255, 255, 255));
		frmSumaDe.getContentPane().setForeground(new Color(128, 255, 255));
		frmSumaDe.setTitle("calculadora");
		frmSumaDe.setBounds(100, 100, 593, 394);

		frmSumaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSumaDe.getContentPane().setLayout(null);
		frmSumaDe.setLocationRelativeTo(null);
		txtnumeo2 = new JTextField();
		txtnumeo2.setBounds(102, 148, 292, 20);
		frmSumaDe.getContentPane().add(txtnumeo2);
		txtnumeo2.setColumns(10);

		txtnumero1 = new JTextField();
		txtnumero1.setColumns(10);
		txtnumero1.setBounds(102, 98, 292, 20);
		frmSumaDe.getContentPane().add(txtnumero1);

		JLabel numero1 = new JLabel("numero 1");
		numero1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		numero1.setBounds(102, 73, 102, 14);
		frmSumaDe.getContentPane().add(numero1);

		JLabel lblNewLabel_1 = new JLabel("numero 2");
		lblNewLabel_1.setBounds(102, 129, 102, 14);
		frmSumaDe.getContentPane().add(lblNewLabel_1);

		JButton butborrar = new JButton("borrar");
		butborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnumero1.setText("");
				txtnumeo2.setText("");
				txtresultado.setText("");

			}
		});
		butborrar.setBounds(305, 208, 89, 23);
		frmSumaDe.getContentPane().add(butborrar);

		JButton butsuma = new JButton("suma");
		butsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txtnumero1.getText());
					int n2 = Integer.parseInt(txtnumeo2.getText());
					int suma = n1 + n2;
					txtresultado.setText("Suma:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}
		});
		butsuma.setBounds(102, 208, 89, 23);
		frmSumaDe.getContentPane().add(butsuma);

		JLabel lblNewLabel_2 = new JLabel("rei chiquita");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\imagen\\descarga.jfif"));
		lblNewLabel_2.setBounds(400, 206, 149, 149);
		frmSumaDe.getContentPane().add(lblNewLabel_2);

		txtresultado = new JLabel("");
		txtresultado.setBackground(new Color(255, 255, 255));
		txtresultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtresultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtresultado.setBounds(102, 259, 292, 96);
		frmSumaDe.getContentPane().add(txtresultado);

		JButton butmul = new JButton("multiplicar");
		butmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txtnumero1.getText());
					int n2 = Integer.parseInt(txtnumeo2.getText());
					int suma = n1 * n2;
					txtresultado.setText("multi:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}
		});
		butmul.setBounds(102, 236, 89, 23);
		frmSumaDe.getContentPane().add(butmul);

		JButton btnResta = new JButton("resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txtnumero1.getText());
					int n2 = Integer.parseInt(txtnumeo2.getText());
					int suma = n1 - n2;
					txtresultado.setText("resta:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}
		});
		btnResta.setBounds(305, 236, 89, 23);
		frmSumaDe.getContentPane().add(btnResta);

		JButton btnMod = new JButton("mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txtnumero1.getText());
					int n2 = Integer.parseInt(txtnumeo2.getText());
					int suma = n1 % n2;
					txtresultado.setText("mod:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}
		});
		btnMod.setBounds(305, 179, 89, 23);
		frmSumaDe.getContentPane().add(btnMod);

		JButton btnPotencia = new JButton("potencia");
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1 = Double.parseDouble(txtnumero1.getText());
					double n2 = Double.parseDouble(txtnumeo2.getText());
					int suma = (int) Math.pow(n1, n2);
					txtresultado.setText("potencia:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}
		});
		btnPotencia.setBounds(102, 174, 89, 23);
		frmSumaDe.getContentPane().add(btnPotencia);

		JButton butsuma_1 = new JButton("divi");
		butsuma_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double n1 = Double.parseDouble(txtnumero1.getText());
					double n2 = Double.parseDouble(txtnumeo2.getText());
					double suma = n1 / n2;
					txtresultado.setText("divicion:" + suma);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "mal");

				}

			}

		});
		butsuma_1.setBounds(206, 208, 89, 23);
		frmSumaDe.getContentPane().add(butsuma_1);

	}
}
