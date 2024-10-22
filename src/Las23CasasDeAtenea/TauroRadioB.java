package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TauroRadioB {

	private JFrame frmHisessrinradiob;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TauroRadioB window = new TauroRadioB();
					window.frmHisessrinradiob.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TauroRadioB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinradiob = new JFrame();
		frmHisessrinradiob.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinradiob.setTitle("HISESSRIN-RadioB");
		frmHisessrinradiob.setBounds(100, 100, 450, 300);
		frmHisessrinradiob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinradiob.getContentPane().setLayout(null);
		JLabel etiResultado = new JLabel("New label");
		etiResultado.setBounds(33, 227, 217, 23);
		frmHisessrinradiob.getContentPane().add(etiResultado);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Colores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(33, 23, 89, 143);
		frmHisessrinradiob.getContentPane().add(panel);
		
		JRadioButton rdbtnAZ = new JRadioButton("Azul");
		buttonGroup.add(rdbtnAZ);
		panel.add(rdbtnAZ);
		
		JRadioButton rdbtnRO = new JRadioButton("Rojo");
		buttonGroup.add(rdbtnRO);
		panel.add(rdbtnRO);
		
		JRadioButton rdbtnVE = new JRadioButton("Verde");
		buttonGroup.add(rdbtnVE);
		panel.add(rdbtnVE);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Color elegido: ";
				if (rdbtnRO.isSelected()) {
				mensaje=mensaje+"Rojo";
				} else if (rdbtnVE.isSelected()) {
				mensaje=mensaje+"Verde";
				} else if (rdbtnAZ.isSelected()) {
				mensaje=mensaje+"Azul";
				}
				etiResultado.setText(mensaje);
				
				
				
			}
		});
		btnNewButton.setBounds(33, 177, 89, 23);
		frmHisessrinradiob.getContentPane().add(btnNewButton);
		
		
	}
}
