package NoGuiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextoChange {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextoChange window = new TextoChange();
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
	public TextoChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(42, 102, 116, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("rojo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblNewLabel.setForeground(Color.red);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("transparente");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setBackground(null);
			}
		});
		btnNewButton_6.setBounds(335, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("opaco");
		btnNewButton_7.setOpaque(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setOpaque(true);
			}
		});
		btnNewButton_7.setBounds(335, 45, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1 = new JButton("rojo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setBackground(Color.red);
				
			}
		});
		btnNewButton_1.setBounds(10, 45, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnVerde = new JButton("verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setForeground(Color.green);
				
			}
		});
		btnVerde.setBounds(105, 11, 89, 23);
		frame.getContentPane().add(btnVerde);
		
		JButton btnVerde_1 = new JButton("verde");
		btnVerde_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setBackground(Color.green);
			}
		});
		btnVerde_1.setBounds(105, 45, 89, 23);
		frame.getContentPane().add(btnVerde_1);
		
		JButton btnAzul = new JButton("azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel.setForeground(Color.blue);
			}
		});
		btnAzul.setBounds(204, 11, 89, 23);
		frame.getContentPane().add(btnAzul);
		
		JButton btnAzul_1 = new JButton("azul");
		btnAzul_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setBackground(Color.blue);
			}
		});
		btnAzul_1.setBounds(204, 45, 89, 23);
		frame.getContentPane().add(btnAzul_1);
	}

}
