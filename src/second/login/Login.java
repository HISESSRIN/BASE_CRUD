package second.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Login {

	private JFrame frmHisessrinlogin;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
register r=new register();
private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmHisessrinlogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinlogin = new JFrame();
		frmHisessrinlogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinlogin.setTitle("HISESSRIN-Login");
		frmHisessrinlogin.setBounds(100, 100, 278, 312);
		frmHisessrinlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinlogin.getContentPane().setLayout(null);
		frmHisessrinlogin.setUndecorated(true);
		textField = new JTextField();
		textField.setBorder(new TitledBorder(null, "email", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBounds(47, 118, 149, 37);
		frmHisessrinlogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "pasword", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_1.setBounds(47, 182, 149, 37);
		frmHisessrinlogin.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(72, 230, 89, 23);
		frmHisessrinlogin.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(226, 11, 42, 23);
		frmHisessrinlogin.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Registrar");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				r.frame.setVisible(true);
			}
		});
		lblNewLabel.setBounds(72, 264, 89, 37);
		frmHisessrinlogin.getContentPane().add(lblNewLabel);
	}
}
