package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Promedio {

	private JFrame frmHisessrinpromedio;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promedio window = new Promedio();
					window.frmHisessrinpromedio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Promedio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinpromedio = new JFrame();
		frmHisessrinpromedio.setTitle("HISESSRIN-Promedio");
		frmHisessrinpromedio.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinpromedio.setBounds(100, 100, 450, 300);
		frmHisessrinpromedio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinpromedio.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 169, 110, 43);
		frmHisessrinpromedio.getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		frmHisessrinpromedio.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 43, 86, 20);
		frmHisessrinpromedio.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 74, 86, 20);
		frmHisessrinpromedio.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,c,pro;
				a=Double.parseDouble(textField.getText());
				b=Double.parseDouble(textField_1.getText());
				c=Double.parseDouble(textField_2.getText());
				pro=(a+b+c)/3;
				if(pro<6) {
					lblNewLabel.setText("suspenso");
				}else if(pro>6) {
					lblNewLabel.setText("Aprobo");
				}
				
			}
		});
		btnNewButton.setBounds(10, 114, 89, 23);
		frmHisessrinpromedio.getContentPane().add(btnNewButton);
	
		
	}

}
