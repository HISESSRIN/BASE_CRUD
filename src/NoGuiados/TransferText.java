package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TransferText {

	private JFrame frmHisessrintransfer;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransferText window = new TransferText();
					window.frmHisessrintransfer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TransferText() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrintransfer = new JFrame();
		frmHisessrintransfer.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrintransfer.setTitle("HISESSRIN-Transfer");
		frmHisessrintransfer.setBounds(100, 100, 450, 300);
		frmHisessrintransfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrintransfer.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 26, 86, 20);
		frmHisessrintransfer.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 26, 86, 20);
		frmHisessrintransfer.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Transferir 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				textField_1.setText(a);
				textField.setText(null);
				
				
			}
		});
		btnNewButton.setBounds(21, 77, 102, 23);
		frmHisessrintransfer.getContentPane().add(btnNewButton);
		
		JButton btnTransferir = new JButton("Transferir 2");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField_1.getText();
				textField.setText(a);
				textField_1.setText(null);
			}
			
		});
		btnTransferir.setBounds(164, 77, 112, 23);
		frmHisessrintransfer.getContentPane().add(btnTransferir);
	}
}
