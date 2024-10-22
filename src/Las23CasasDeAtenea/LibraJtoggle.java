package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraJtoggle {

	private JFrame frmHisessrinjtoggle;
	private JTextField textField;
     double suma=0;
     double resultado=0;
     double ent=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraJtoggle window = new LibraJtoggle();
					window.frmHisessrinjtoggle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraJtoggle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinjtoggle = new JFrame();
		frmHisessrinjtoggle.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinjtoggle.setTitle("HISESSRIN-Jtoggle");
		frmHisessrinjtoggle.setBounds(100, 100, 450, 300);
		frmHisessrinjtoggle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinjtoggle.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(33, 213, 121, 37);
		frmHisessrinjtoggle.getContentPane().add(lblNewLabel);
				textField = new JTextField();
				textField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
		textField.setBounds(33, 33, 121, 20);
		frmHisessrinjtoggle.getContentPane().add(textField);
		textField.setColumns(10);
		JToggleButton tglbtnNewToggleButton = new JToggleButton("instalacion");
		tglbtnNewToggleButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				suma+=40;
				
				
				
			}
		});
		tglbtnNewToggleButton.setBounds(33, 76, 121, 23);
		frmHisessrinjtoggle.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("formacion");
		tglbtnNewToggleButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				suma+=200;
				
			}
		});
		tglbtnNewToggleButton_1.setBounds(33, 110, 121, 23);
		frmHisessrinjtoggle.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("alimentacionBD");
		tglbtnNewToggleButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				suma+=200;
				
			}
		});
		tglbtnNewToggleButton_2.setBounds(33, 144, 121, 23);
		frmHisessrinjtoggle.getContentPane().add(tglbtnNewToggleButton_2);
		
		
		JButton btnNewButton = new JButton("calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ent=Double.parseDouble(textField.getText());
              resultado=ent+suma;
				lblNewLabel.setText(""+resultado);
				
				
			}
		});
		btnNewButton.setBounds(33, 179, 121, 23);
		frmHisessrinjtoggle.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("40");
		lblNewLabel_1.setBounds(160, 80, 46, 14);
		frmHisessrinjtoggle.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("200");
		lblNewLabel_1_1.setBounds(160, 114, 46, 14);
		frmHisessrinjtoggle.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("200");
		lblNewLabel_1_2.setBounds(160, 144, 46, 14);
		frmHisessrinjtoggle.getContentPane().add(lblNewLabel_1_2);
	}
}
