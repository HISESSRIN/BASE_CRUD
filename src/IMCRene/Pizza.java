package IMCRene;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Pizza {

	private JFrame frmPizzasElNegro;
	private JLabel si;
	double s = 0, ji = 0,pa=0,co=0,al=0;
	double total = 0;
	String l = "" ,j="";
	double po=1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_1;
	private JLabel si_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza window = new Pizza();
					window.frmPizzasElNegro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pizza() {
		initialize();
	}

	public void resu() {
		l = (String) comboBox.getSelectedItem();
		switch (l) {
		case "chica":
			ji = 80 * s;
			break;
		case "mediana":
			ji = 100 * s;
			break;
		case "grande":
			ji = 130 * s;
			break;
		case "tmanio moto moto":
			ji = 150 * s;
			break;
		}
		total=ji;
	}
public void ingre() {
	j= (String) comboBox_1.getSelectedItem();

	switch(j) {
	case "1":po=1;break;
	case "2":po=1.1;break;
	case "3":po=1.5;break;
	case "4":po=1.2;break;
	}
}
	public void papa() {
		pa=(chckbxNewCheckBox.isSelected())?30:0;
	}
	public void coca() {
		co=(chckbxNewCheckBox_1.isSelected())?25:0;
	}
	public void alitas() {
		al=(chckbxNewCheckBox_2.isSelected())?60:0;
	}
public void total() {
	DecimalFormat f=new DecimalFormat("#.00");
	si_1.setText(""+f.format((total*po)+pa+co+al));

}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzasElNegro = new JFrame();
		frmPizzasElNegro.setBackground(new Color(192, 192, 192));
		frmPizzasElNegro.getContentPane().setBackground(new Color(192, 192, 192));
		frmPizzasElNegro.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmPizzasElNegro.setTitle("HISESSRIN-pizza uno moneda");
		frmPizzasElNegro.setBounds(100, 100, 255, 543);
		frmPizzasElNegro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzasElNegro.getContentPane().setLayout(null);
		si = new JLabel("cantidad ");
		si.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		si.setBounds(81, 11, 90, 14);
		frmPizzasElNegro.getContentPane().add(si);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		lblNewLabel.setBounds(88, 40, 55, 26);
		frmPizzasElNegro.getContentPane().add(lblNewLabel); 

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\unomoneda.png"));
		lblNewLabel_1.setBounds(10, 248, 219, 190);
		frmPizzasElNegro.getContentPane().add(lblNewLabel_1);

		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setMinimum(1);
		slider.setMajorTickSpacing(1);
		slider.setValue(1);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				s = slider.getValue();
				lblNewLabel.setText("" + s);
				resu();
				total();
			}
		});
		slider.setBounds(10, 69, 210, 26);
		frmPizzasElNegro.getContentPane().add(slider);

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resu();
				total();
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "chica", "mediana", "grande", "tmanio moto moto" }));
		comboBox.setBounds(10, 151, 210, 22);
		frmPizzasElNegro.getContentPane().add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ingre();
			total();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
		comboBox_1.setBounds(10, 215, 133, 22);
		frmPizzasElNegro.getContentPane().add(comboBox_1);

		lblNewLabel_2 = new JLabel("ingredientes");
		lblNewLabel_2.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 184, 133, 14);
		frmPizzasElNegro.getContentPane().add(lblNewLabel_2);

		si_1 = new JLabel("");
		si_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		si_1.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		si_1.setBounds(10, 449, 219, 38);
		frmPizzasElNegro.getContentPane().add(si_1);
		
		chckbxNewCheckBox = new JCheckBox("papas");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			papa();
			total();			
			}
			
		});
		chckbxNewCheckBox.setBounds(10, 102, 97, 23);
		frmPizzasElNegro.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("coca");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coca();
				total();
			}
		});
		chckbxNewCheckBox_1.setBounds(123, 102, 97, 23);
		frmPizzasElNegro.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("alitas");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alitas();
				total();
			}
		});
		chckbxNewCheckBox_2.setBounds(10, 127, 97, 23);
		frmPizzasElNegro.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("HISESSRIN ©");
		lblNewLabel_3.setBounds(149, 490, 90, 14);
		frmPizzasElNegro.getContentPane().add(lblNewLabel_3);

	}
}
