package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NombreECAA {
int x=50,y=10,xa=50,xy=50;
	private JFrame frmHisessrinnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NombreECAA window = new NombreECAA();
					window.frmHisessrinnombre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NombreECAA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinnombre = new JFrame();
		frmHisessrinnombre.setTitle("HISESSRIN-Nombre");
		frmHisessrinnombre.setBounds(100, 100, 450, 300);
		frmHisessrinnombre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinnombre.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 50, 94, 14);
		JButton btnNewButton_1 = new JButton("Centro");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnNewButton_1.setBounds(92, 0, 100, 50);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBounds(92, 0, 89, 23);
			}
		});
		btnNewButton_1.setBounds(92, 0, 89, 23);
		frmHisessrinnombre.getContentPane().add(btnNewButton_1);
		frmHisessrinnombre.getContentPane().add(lblNewLabel);
		JButton btnNewButton = new JButton("Esquina");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//agranda bot
				btnNewButton.setBounds(0, 11, 100, 50);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnNewButton.setBounds(0, 11, 89, 23);
				
				
			}
		});
		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setBounds(380,250,x,y);
				xa=380;
				xy=250;
				
			}
		});
		btnNewButton.setBounds(0, 11, 89, 23);
		frmHisessrinnombre.getContentPane().add(btnNewButton);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				lblNewLabel.setBounds(176,115, x, y);
				xa=176;
				xy=115;
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("Agrandar");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnNewButton_2.setBounds(183, 0, 100, 50);	
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBounds(183, 0, 89, 23);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			x=90;
			y=90;
				lblNewLabel.setBounds(xa,xy,x,y);				
			}
		});
		btnNewButton_2.setBounds(183, 0, 89, 23);
		frmHisessrinnombre.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Achicar");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setBounds(276, 0, 100, 50);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBounds(276, 0, 89, 23);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=50;
				y=50;
				lblNewLabel.setBounds(xa,xy,x,y);
			}
		});
		btnNewButton_3.setBounds(276, 0, 89, 23);
		frmHisessrinnombre.getContentPane().add(btnNewButton_3);
		
		
	}

}
