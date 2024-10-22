package NoGuiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IVA {

	private JFrame frmHisessriniva;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IVA window = new IVA();
					window.frmHisessriniva.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IVA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessriniva = new JFrame();
		frmHisessriniva.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessriniva.setTitle("HISESSRIN-IVA");
		frmHisessriniva.setBounds(100, 100, 450, 300);
		frmHisessriniva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessriniva.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Total sin iva");
		lblNewLabel.setBounds(10, 107, 108, 20);
		frmHisessriniva.getContentPane().add(lblNewLabel);
		
		JLabel lblIva = new JLabel("iva");
		lblIva.setBounds(10, 138, 108, 20);
		frmHisessriniva.getContentPane().add(lblIva);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 169, 108, 20);
		frmHisessriniva.getContentPane().add(lblTotal);
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		frmHisessriniva.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 42, 86, 20);
		frmHisessriniva.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a,b,total,totalsin,iva;
				a=Double.parseDouble(textField.getText());
				b=Double.parseDouble(textField_1.getText());
				total=a*b;
				iva=total*.16;
				totalsin=total-iva;
				 lblIva.setText("iva "+iva);
				 lblTotal.setText("total "+total);
				 lblNewLabel.setText("total sin iva "+totalsin);
				
				
			}
		});
		btnNewButton.setBounds(7, 73, 89, 23);
		frmHisessriniva.getContentPane().add(btnNewButton);
		
	
	}
}
