package Tablos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeMuLtLpLiCaR {

	public JFrame frmHisessrintablos;
	private JTextField txtnum;
	private JTextPane textresultado;
	private JButton btnver_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeMuLtLpLiCaR window = new DeMuLtLpLiCaR();
					window.frmHisessrintablos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeMuLtLpLiCaR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrintablos = new JFrame();
		frmHisessrintablos.setTitle("HISESSRIN-tablos");
		frmHisessrintablos.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrintablos.setBounds(100, 100, 450, 467);
		frmHisessrintablos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrintablos.getContentPane().setLayout(null);

		txtnum = new JTextField();
		txtnum.setBounds(59, 77, 86, 20);
		frmHisessrintablos.getContentPane().add(txtnum);
		txtnum.setColumns(10);
		frmHisessrintablos.setLocationRelativeTo(null);
		JButton btnver = new JButton("ver");
		btnver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(txtnum.getText());
					String msj = "";
					System.out.print(n1);
					for (int ia = 1; ia < 11; ia++) {
						msj += (n1 + " x " + ia + "=" + n1 * ia + "\n");
					}
					System.out.print(msj);
					textresultado.setText(msj);
				} catch (Exception e2) {
					// TODO: handle exception

					JOptionPane.showMessageDialog(null, "ERROR");
				}

			}
		});
		btnver.setBounds(59, 42, 89, 23);
		frmHisessrintablos.getContentPane().add(btnver);

		textresultado = new JTextPane();
		textresultado.setBounds(86, 125, 258, 281);
		frmHisessrintablos.getContentPane().add(textresultado);

		btnver_1 = new JButton("borrar");
		btnver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textresultado.setText("");

			}
		});
		btnver_1.setBounds(158, 42, 89, 23);
		frmHisessrintablos.getContentPane().add(btnver_1);
	}
}
