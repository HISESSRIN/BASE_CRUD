package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseExcitado {

	private JFrame frmHisessrinmouseExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseExcitado window = new MouseExcitado();
					window.frmHisessrinmouseExit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MouseExcitado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinmouseExit = new JFrame();
		frmHisessrinmouseExit.setTitle("HISESSRIN-Mouse exit");
		frmHisessrinmouseExit.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinmouseExit.setBounds(100, 100, 450, 300);
		frmHisessrinmouseExit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinmouseExit.getContentPane().setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Spiterman en infinity war");
		lblNewLabel_1.setBounds(27, 149, 143, 51);
		frmHisessrinmouseExit.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AAAAAAAAAAAAAAAAAAAA");
		lblNewLabel_2.setBounds(342, 149, 46, 14);
		frmHisessrinmouseExit.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MEW lavel");
		lblNewLabel_3.setBounds(213, 149, 79, 14);
		frmHisessrinmouseExit.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setEnabled(false);
				lblNewLabel_2.setEnabled(false);
				lblNewLabel_3.setEnabled(false);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setEnabled(true);
				lblNewLabel_2.setEnabled(true);
				lblNewLabel_3.setEnabled(true);
				
				
			}
		});
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setBounds(10, 11, 414, 102);
		frmHisessrinmouseExit.getContentPane().add(lblNewLabel);
		
		
	}

}
