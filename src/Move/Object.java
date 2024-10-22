package Move;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Object {
int x=0,y=0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Object window = new Object();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Object() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ᗜ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 39));
		lblNewLabel.setIcon(null);
	
		
	
		lblNewLabel.setBounds(211, 39,  39, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("↑");
		btnNewButton.setMnemonic('w');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y-=10;
				lblNewLabel.setText("↑");
				lblNewLabel.setBounds(x, y,  148, 109);
			}
		});
		
		
		btnNewButton.setBounds(42, 185, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("←");
		btnNewButton_1.setMnemonic('a');
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x-=10;
				lblNewLabel.setBounds(x, y,  148, 109);
				lblNewLabel.setText("←");
				
			}
		});
		btnNewButton_1.setBounds(0, 205, 46, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("→");
		btnNewButton_2.setMnemonic('d');
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x+=10;
				lblNewLabel.setBounds(x, y,  148, 109);
				lblNewLabel.setText("→");
				
				
			}
		});
		btnNewButton_2.setBounds(86, 205, 46, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("↓");
		btnNewButton_3.setMnemonic('s');
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				y+=10;
				lblNewLabel.setBounds(x, y, 148, 109);
				
				lblNewLabel.setText("↓");
			}
		});
		btnNewButton_3.setBounds(42, 227, 46, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\imagen\\4ecqwi0dhlba1.png"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
