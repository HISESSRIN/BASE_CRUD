package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vaciar {

	private JFrame frmHisessrinvaciar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vaciar window = new Vaciar();
					window.frmHisessrinvaciar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vaciar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinvaciar = new JFrame();
		frmHisessrinvaciar.setTitle("HISESSRIN-Vaciar");
		frmHisessrinvaciar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinvaciar.setBounds(100, 100, 450, 300);
		frmHisessrinvaciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinvaciar.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 66, 179, 50);
		frmHisessrinvaciar.getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
		
				lblNewLabel.setText(textField.getText());	
				
			}
		});
		textField.setBounds(10, 21, 179, 20);
		frmHisessrinvaciar.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(null);
				textField.setText(null);
				
				
				
			}
		});
		btnNewButton.setBounds(10, 145, 89, 23);
		frmHisessrinvaciar.getContentPane().add(btnNewButton);
	}
}
