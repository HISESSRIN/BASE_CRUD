package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CáncerComboBox {

	private JFrame frmHisessrincombobox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CáncerComboBox window = new CáncerComboBox();
					window.frmHisessrincombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CáncerComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrincombobox = new JFrame();
		frmHisessrincombobox.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrincombobox.setTitle("HISESSRIN-ComboBox");
		frmHisessrincombobox.setBounds(100, 100, 450, 300);
		frmHisessrincombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrincombobox.getContentPane().setLayout(null);
		JLabel etiResultado = new JLabel("New label");
		etiResultado.setBounds(20, 131, 217, 38);
		frmHisessrincombobox.getContentPane().add(etiResultado);
		JComboBox comboBoxAAA = new JComboBox();
		comboBoxAAA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "El color elegido es ";
				mensaje = mensaje + comboBoxAAA.getSelectedItem().toString();
				etiResultado.setText(mensaje);

			}
		});
		comboBoxAAA.setModel(new DefaultComboBoxModel(new String[] { "Rojo", "Verde", "Azul" }));
		comboBoxAAA.setBounds(20, 11, 159, 22);
		frmHisessrincombobox.getContentPane().add(comboBoxAAA);

	}
}
