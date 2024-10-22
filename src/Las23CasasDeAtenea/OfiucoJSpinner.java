package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class OfiucoJSpinner {

	private JFrame frmHisessrinjspinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfiucoJSpinner window = new OfiucoJSpinner();
					window.frmHisessrinjspinner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OfiucoJSpinner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinjspinner = new JFrame();
		frmHisessrinjspinner.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinjspinner.setTitle("HISESSRIN-JSpinner");
		frmHisessrinjspinner.setBounds(100, 100, 450, 300);
		frmHisessrinjspinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinjspinner.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(33, 63, 55, 14);
		frmHisessrinjspinner.getContentPane().add(lblNewLabel);
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblNewLabel.setText(""+spinner.getValue());
				
			}
		});
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 2));
		spinner.setBounds(33, 11, 55, 20);
		frmHisessrinjspinner.getContentPane().add(spinner);
		
	}
}
