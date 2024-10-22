package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BtnOcultar {

	private JFrame frmHisessrinbtnocultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BtnOcultar window = new BtnOcultar();
					window.frmHisessrinbtnocultar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BtnOcultar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinbtnocultar = new JFrame();
		frmHisessrinbtnocultar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinbtnocultar.setTitle("HISESSRIN-BtnOcultar");
		frmHisessrinbtnocultar.setBounds(100, 100, 450, 300);
		frmHisessrinbtnocultar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinbtnocultar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 41, 46, 14);
		frmHisessrinbtnocultar.getContentPane().add(lblNewLabel);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(202, 41, 46, 14);
		frmHisessrinbtnocultar.getContentPane().add(lblCiudad);
		
		JButton btnNewButton = new JButton("ocultar nombre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(false);	
				
			}
		});
		btnNewButton.setBounds(10, 116, 113, 23);
		frmHisessrinbtnocultar.getContentPane().add(btnNewButton);
		
		JButton btnMostrarNombre = new JButton("mostrar nombre");
		btnMostrarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(true);	
			}
		});
		btnMostrarNombre.setBounds(10, 147, 113, 23);
		frmHisessrinbtnocultar.getContentPane().add(btnMostrarNombre);
		
		JButton btnOcultarCiudad = new JButton("ocultar ciudad");
		btnOcultarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCiudad.setVisible(false);
				
				
			}
		});
		btnOcultarCiudad.setBounds(202, 116, 137, 23);
		frmHisessrinbtnocultar.getContentPane().add(btnOcultarCiudad);
		
		JButton btnMostrarCiudad = new JButton("mostrar ciudad");
		btnMostrarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCiudad.setVisible(true);
			}
		});
		btnMostrarCiudad.setBounds(202, 147, 137, 23);
		frmHisessrinbtnocultar.getContentPane().add(btnMostrarCiudad);
	}
}
