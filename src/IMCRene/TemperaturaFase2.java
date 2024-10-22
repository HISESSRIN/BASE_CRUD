package IMCRene;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperaturaFase2 {
	int valor = 0;
	String a="", de="";
	private JFrame frmHisessrincombersiones;
	private JSlider slider;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperaturaFase2 window = new TemperaturaFase2();
					window.frmHisessrincombersiones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TemperaturaFase2() {
		initialize();
	}

	public void convert() {
double resultado=0;
		switch (de) {

		case "C°":
			switch (a) {

			case "c°":
                   resultado=valor;
                   lblNewLabel_1_1.setText(resultado+"C°");
				break;
			case "f°":
                   resultado=(valor * 9/5) + 32; 
                   lblNewLabel_1_1.setText(resultado+"F°");
                   
				break;
			case "k°":
                   resultado=valor+273.15;
                   lblNewLabel_1_1.setText(resultado+"K°");
				break;

			}

			break;
		case "F°":
			switch (a) {

			case "c°":
                   resultado=(valor - 32) * 5/9;
                   lblNewLabel_1_1.setText(resultado+"C°");
				break;
			case "f°":
                  resultado=valor;
                  lblNewLabel_1_1.setText(resultado+"F°");
				break;
			case "k°":
				resultado=(valor - 32) * 5/9 + 273.15;
				lblNewLabel_1_1.setText(resultado+"K°");
				break;

			}
			break;
		case "K°":
			switch (a) {

			case "c°":
                resultado=valor-273.15;
                lblNewLabel_1_1.setText(resultado+"C°");
				break;
			case "f°":
				resultado=(valor - 273.15) * 9/5 + 32 ;
				lblNewLabel_1_1.setText(resultado+"F°");
				break;
			case "k°":
                 resultado=valor;
                 lblNewLabel_1_1.setText(resultado+"K°");
                 
				break;

			}
			break;

		}

	}

	private void initialize() {
		frmHisessrincombersiones = new JFrame();
		frmHisessrincombersiones.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrincombersiones.setTitle("HISESSRIN-combersiones");
		frmHisessrincombersiones.setBounds(100, 100, 450, 300);
		frmHisessrincombersiones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrincombersiones.getContentPane().setLayout(null);
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(20, 154, 259, 73);
		frmHisessrincombersiones.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(233, 42, 46, 26);
		frmHisessrincombersiones.getContentPane().add(lblNewLabel_1);
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valor = slider.getValue();
				lblNewLabel_1.setText("" + valor);
				convert();
			}
		});
		slider.setMinimum(1);
		slider.setValue(1);
		slider.setBounds(10, 42, 200, 26);
		frmHisessrincombersiones.getContentPane().add(slider);

		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frmHisessrincombersiones.getContentPane().add(lblNewLabel);

		lblNewLabel_2 = new JLabel("de");
		lblNewLabel_2.setBounds(20, 79, 46, 14);
		frmHisessrincombersiones.getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("a");
		lblNewLabel_3.setBounds(95, 79, 46, 14);
		frmHisessrincombersiones.getContentPane().add(lblNewLabel_3);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// de
				de = comboBox.getSelectedItem().toString();
				convert();

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C°", "F°", "K°"}));
		comboBox.setBounds(10, 104, 46, 22);
		frmHisessrincombersiones.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// a
				a = comboBox_1.getSelectedItem().toString();
				convert();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "c°", "f°", "k°" }));
		comboBox_1.setBounds(82, 104, 59, 22);
		frmHisessrincombersiones.getContentPane().add(comboBox_1);

	}
}
