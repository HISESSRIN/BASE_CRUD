package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class AriesCheck {

	private JFrame frmHisessrincheckbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriesCheck window = new AriesCheck();
					window.frmHisessrincheckbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AriesCheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrincheckbox = new JFrame();
		frmHisessrincheckbox.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrincheckbox.setTitle("HISESSRIN-CheckBox");
		frmHisessrincheckbox.setBounds(100, 100, 450, 300);
		frmHisessrincheckbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrincheckbox.getContentPane().setLayout(null);
		JLabel lblAAA = new JLabel("");
		lblAAA.setBounds(33, 187, 225, 36);
		frmHisessrincheckbox.getContentPane().add(lblAAA);
		JCheckBox chkPerra = new JCheckBox("perro");
		chkPerra.setBounds(33, 31, 97, 23);
		frmHisessrincheckbox.getContentPane().add(chkPerra);
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setBounds(33, 69, 97, 23);
		frmHisessrincheckbox.getContentPane().add(chkGato);
		
		JCheckBox chckbxRataDeDos = new JCheckBox("Rata de dos patas");
		chckbxRataDeDos.setBounds(33, 106, 131, 23);
		frmHisessrincheckbox.getContentPane().add(chckbxRataDeDos);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				if (chkPerra.isSelected()) {
				mensaje=mensaje+"Perro ";
				}
				if (chkGato.isSelected()) {
				mensaje=mensaje+"Gato ";
				}
				if (chckbxRataDeDos.isSelected()) {
				mensaje=mensaje+"Raton ";
				}
				lblAAA.setText(mensaje);
				
				
				
				
			}
		});
		btnNewButton.setBounds(33, 136, 89, 23);
		frmHisessrincheckbox.getContentPane().add(btnNewButton);
		
		
	}
}
