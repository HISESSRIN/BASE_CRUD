package NUEVO2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.event.MouseWheelListener;
import java.text.DecimalFormat;
import java.awt.event.MouseWheelEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class Ñut {
	DecimalFormat df = new DecimalFormat("#.00");
	private JFrame frmHisessrinpesosADolares;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ñut window = new Ñut();
					window.frmHisessrinpesosADolares.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ñut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinpesosADolares = new JFrame();
		frmHisessrinpesosADolares.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinpesosADolares.setTitle("HISESSRIN-pesos a dolares");
		frmHisessrinpesosADolares.setLocationRelativeTo(null);
		frmHisessrinpesosADolares.setBounds(100, 100, 450, 300);
		frmHisessrinpesosADolares.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinpesosADolares.getContentPane().setLayout(null);
		
		JLabel lblnum = new JLabel("");
		lblnum.setBounds(189, 43, 46, 14);
		frmHisessrinpesosADolares.getContentPane().add(lblnum);
		JLabel dol = new JLabel("dolares");
		dol.setBounds(148, 161, 98, 42);
		frmHisessrinpesosADolares.getContentPane().add(dol);
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblnum.setText("$"+slider.getValue());
				
				dol.setText(""+df.format((slider.getValue())*19.32));
				
				
			}
		});
		slider.setBounds(95, 97, 200, 26);
		frmHisessrinpesosADolares.getContentPane().add(slider);
		
		
	}
}
