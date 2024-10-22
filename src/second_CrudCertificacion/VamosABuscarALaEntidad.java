package second_CrudCertificacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;

public class VamosABuscarALaEntidad {

	private JFrame frmHisessrincertificacion;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JLabel lblModelo;
	private JTextField txtCosto;
	private JLabel lblCosto;
	private JButton btnAgregar;
	private JButton btnCargar;
	private JButton btnEditar;
	private JButton btnEliminar;
	int id;
	Celular c;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VamosABuscarALaEntidad window = new VamosABuscarALaEntidad();
					window.frmHisessrincertificacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VamosABuscarALaEntidad() {
		initialize();
	}

	public void limpiar() {
		txtMarca.setText("");
		txtModelo.setText("");
		txtCosto.setText("");

	}
	



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrincertificacion = new JFrame();
		frmHisessrincertificacion.addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
				
			
			}
			public void windowLostFocus(WindowEvent e) {
			}
		});
		frmHisessrincertificacion.setFont(new Font("ROG LyonsType", Font.PLAIN, 14));
		frmHisessrincertificacion.setTitle("HISESSRIN-Certificacion");
		frmHisessrincertificacion.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrincertificacion.setBounds(100, 100, 419, 250);
		frmHisessrincertificacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrincertificacion.getContentPane().setLayout(null);

		JLabel lblMarca = new JLabel("marca");
		lblMarca.setBounds(10, 11, 46, 14);
		frmHisessrincertificacion.getContentPane().add(lblMarca);

		txtMarca = new JTextField();
		txtMarca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtMarca.getText().length() > 100) {
					e.consume();
				}
			}
		});
		txtMarca.setBounds(61, 8, 335, 20);
		frmHisessrincertificacion.getContentPane().add(txtMarca);
		txtMarca.setColumns(10);

		txtModelo = new JTextField();
		txtModelo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtModelo.getText().length() > 100) {
					e.consume();
				}
			}
		});
		txtModelo.setColumns(10);
		txtModelo.setBounds(61, 47, 335, 20);
		frmHisessrincertificacion.getContentPane().add(txtModelo);

		lblModelo = new JLabel("modelo");
		lblModelo.setBounds(10, 50, 46, 14);
		frmHisessrincertificacion.getContentPane().add(lblModelo);

		txtCosto = new JTextField();
		txtCosto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCosto.getText().length() > 100) {
					e.consume();
				}
			}
		});
		txtCosto.setColumns(10);
		txtCosto.setBounds(61, 94, 335, 20);
		frmHisessrincertificacion.getContentPane().add(txtCosto);

		lblCosto = new JLabel("costo");
		lblCosto.setBounds(10, 97, 46, 14);
		frmHisessrincertificacion.getContentPane().add(lblCosto);

		btnAgregar = new JButton("agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String marca = txtMarca.getText();
					String modelo = txtModelo.getText();
					String costo = txtCosto.getText();

					Celular ce = new Celular(marca, modelo, costo);

					if (ce.insertarCelular()) {
						JOptionPane.showMessageDialog(null, "gud");
					} else {
						JOptionPane.showMessageDialog(null, "error grandote");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error chiquit    adsdsadasd");
				}
				limpiar();
			}

		});
		btnAgregar.setBounds(10, 144, 89, 23);
		frmHisessrincertificacion.getContentPane().add(btnAgregar);

		btnCargar = new JButton("cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					id = Integer.parseInt(JOptionPane.showInputDialog("introduce id"));
					c = new Celular(id, "", "", "");
					if (c.cargarCelular()) {
						txtMarca.setText(c.getMarca());
						txtModelo.setText(c.getModelo());
						txtCosto.setText(c.getCosto());
						JOptionPane.showMessageDialog(null, "se cargo a tu *¨**?=");
					} else {
						JOptionPane.showMessageDialog(null, "error ");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error ");

				}

			}
		});
		btnCargar.setBounds(109, 144, 89, 23);
		frmHisessrincertificacion.getContentPane().add(btnCargar);

		btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					c.setMarca(txtMarca.getText());
					c.setModelo(txtModelo.getText());
					c.setCosto(txtCosto.getText());
					if (c.editarCelular()) {
						JOptionPane.showMessageDialog(null, "se actualizo");
					} else {
						JOptionPane.showMessageDialog(null, "error");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error");
				}
				limpiar();
			}
		});
		btnEditar.setBounds(208, 144, 89, 23);
		frmHisessrincertificacion.getContentPane().add(btnEditar);

		btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("id a eliminar"));
					Celular x = new Celular();
					x.setId(id);
					if (x.eliminarCelular()) {
						JOptionPane.showMessageDialog(null, "se elimino");

					} else {
						JOptionPane.showMessageDialog(null, "error");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "error");
				}

			}
		});
		btnEliminar.setBounds(307, 144, 89, 23);
		frmHisessrincertificacion.getContentPane().add(btnEliminar);
	}
}
