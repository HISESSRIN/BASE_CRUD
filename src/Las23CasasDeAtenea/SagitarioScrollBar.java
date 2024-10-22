package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JLabel;

public class SagitarioScrollBar {

	private JFrame frmHisessrinscorllbar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SagitarioScrollBar window = new SagitarioScrollBar();
					window.frmHisessrinscorllbar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SagitarioScrollBar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinscorllbar = new JFrame();
		frmHisessrinscorllbar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinscorllbar.setTitle("HISESSRIN-ScorllBar");
		frmHisessrinscorllbar.setBounds(100, 100, 450, 300);
		frmHisessrinscorllbar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinscorllbar.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(55, 120, 46, 14);
		frmHisessrinscorllbar.getContentPane().add(lblNewLabel);
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setUnitIncrement(2);
		scrollBar.setMinimum(50);
		scrollBar.setMaximum(150);
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(28, 22, 359, 17);
		frmHisessrinscorllbar.getContentPane().add(scrollBar);
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				
				
				lblNewLabel.setText(""+scrollBar.getValue());
				
				
				
			}
		});
		
		
	
	}
}
