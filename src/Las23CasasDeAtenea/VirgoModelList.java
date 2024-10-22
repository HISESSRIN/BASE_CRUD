package Las23CasasDeAtenea;

import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VirgoModelList {

	private JFrame frmHisessrinmodellist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirgoModelList window = new VirgoModelList();
					window.frmHisessrinmodellist.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VirgoModelList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinmodellist = new JFrame();
		frmHisessrinmodellist.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinmodellist.setTitle("HISESSRIN-ModelList");
		frmHisessrinmodellist.setBounds(100, 100, 450, 300);
		frmHisessrinmodellist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinmodellist.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 113, 295, 49);
		frmHisessrinmodellist.getContentPane().add(lblNewLabel);
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

                     
				
				
				lblNewLabel.setText(comboBox.getSelectedItem().toString());
				
			}
		});
		comboBox.setBounds(28, 11, 136, 36);
		frmHisessrinmodellist.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("par");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=0;i<10;i+=2) {
				modelo.addElement("No "+i);
				}
				comboBox.setModel(modelo);
			
			}
		});
		btnNewButton.setBounds(203, 18, 89, 23);
		frmHisessrinmodellist.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("inpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=1;i<10;i+=2) {
				modelo.addElement("No "+i);
				}
				comboBox.setModel(modelo);
			}
		});
		btnNewButton_1.setBounds(313, 18, 89, 23);
		frmHisessrinmodellist.getContentPane().add(btnNewButton_1);
		
		
	}
}
