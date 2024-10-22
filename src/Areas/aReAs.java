package Areas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class aReAs {

	public JFrame frmAreas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aReAs window = new aReAs();
					window.frmAreas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public aReAs() {
		initialize();
	}

	public String redondear(double area) {
		DecimalFormat df = new DecimalFormat("#.00");
		return "AREA:" + df.format(area);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAreas = new JFrame();
		frmAreas.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmAreas.setTitle("HISESSRIN-areas");
		frmAreas.setBounds(100, 100, 450, 304);
		frmAreas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAreas.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("resultado");
		lblNewLabel.setBounds(230, 129, 61, 14);
		frmAreas.getContentPane().add(lblNewLabel);

		JLabel txtresultado = new JLabel("");
		txtresultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtresultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtresultado.setBackground(Color.WHITE);
		txtresultado.setBounds(132, 154, 292, 96);
		frmAreas.getContentPane().add(txtresultado);
		frmAreas.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("triangulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "base"));
					double b = Double.parseDouble(JOptionPane.showInputDialog(null, "altura"));
					double area = (a * b) / 2;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		frmAreas.getContentPane().add(btnNewButton);

		JButton btnCuadrado = new JButton("cuadrado");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "lado"));

					double area = a * a;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnCuadrado.setBounds(10, 41, 89, 23);
		frmAreas.getContentPane().add(btnCuadrado);

		JButton btnRectangulo = new JButton("rectangulo");
		btnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "base"));
					double b = Double.parseDouble(JOptionPane.showInputDialog(null, "altura"));
					double area = a * b;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnRectangulo.setBounds(10, 70, 89, 23);
		frmAreas.getContentPane().add(btnRectangulo);

		JButton btnCirculo = new JButton("circulo");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "radio"));

					double area = 3.1416 * (Math.pow(a, 2));

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnCirculo.setBounds(10, 101, 89, 23);
		frmAreas.getContentPane().add(btnCirculo);

		JButton btnTrapecio = new JButton("trapecio");
		btnTrapecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "base menor"));
					double b = Double.parseDouble(JOptionPane.showInputDialog(null, "base mayor"));
					double c = Double.parseDouble(JOptionPane.showInputDialog(null, "altura"));

					double area = (a + b) / 2;
					area = area / c;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnTrapecio.setBounds(10, 129, 89, 23);
		frmAreas.getContentPane().add(btnTrapecio);

		JButton btnPentagono = new JButton("pentagono");
		btnPentagono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "apotema"));
					double b = Double.parseDouble(JOptionPane.showInputDialog(null, "lado"));

					double area = (a * (b * 5)) / 2;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnPentagono.setBounds(10, 154, 89, 23);
		frmAreas.getContentPane().add(btnPentagono);

		JButton btnHexagono = new JButton("hexagono");
		btnHexagono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(JOptionPane.showInputDialog(null, "apotema"));
					double b = Double.parseDouble(JOptionPane.showInputDialog(null, "lado"));

					double area = (a * (b * 6)) / 2;

					txtresultado.setText(redondear(area));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}

		});
		btnHexagono.setBounds(10, 188, 89, 23);
		frmAreas.getContentPane().add(btnHexagono);
		JButton btnNewButton_1 = new JButton("borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtresultado.setText("");

			}
		});
		btnNewButton_1.setBounds(335, 11, 89, 23);
		frmAreas.getContentPane().add(btnNewButton_1);
	}
}
