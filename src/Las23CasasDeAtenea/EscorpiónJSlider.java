package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class EscorpiónJSlider {

	private JFrame frmHisessrinjslider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscorpiónJSlider window = new EscorpiónJSlider();
					window.frmHisessrinjslider.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EscorpiónJSlider() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinjslider = new JFrame();
		frmHisessrinjslider.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinjslider.setTitle("HISESSRIN-JSlider");
		frmHisessrinjslider.setBounds(100, 100, 450, 300);
		frmHisessrinjslider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinjslider.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		
		lblNewLabel.setBounds(186, 139, 46, 14);
		frmHisessrinjslider.getContentPane().add(lblNewLabel);
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setValue(400);
		slider.setMinimum(100);
		slider.setMaximum(500);
		slider.setBounds(67, 49, 301, 45);
		frmHisessrinjslider.getContentPane().add(slider);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblNewLabel.setText("$"+slider.getValue());
				
				
			}
		});
	
		
	}
}
