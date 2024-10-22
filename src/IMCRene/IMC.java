package IMCRene;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IMC {
double peso=0,altura=0;

	private JFrame frmHisessrinimc;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC window = new IMC();
					window.frmHisessrinimc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 

	/**
	 * Create the application.
	 */
	
	public IMC() {
		initialize();
	}
 public void IMCcalc() {
		
		double imc=peso/(altura*altura);
		DecimalFormat f= new DecimalFormat ("#.00");
		lblNewLabel_3.setText("imc:"+f.format(imc));
		if(imc<=18) {
			lblNewLabel_3_1.setText("bajo peso");
		
			lblNewLabel_3_1.setBackground(new Color(191, 191, 191));
			lblNewLabel_3.setBackground(new Color(191, 191, 191));
		}else if(imc>=18.5 && imc<=24.9) {
			lblNewLabel_3_1.setText("normal");
			
			lblNewLabel_3_1.setBackground(new Color(141, 227, 21));
			lblNewLabel_3.setBackground(new Color(141, 227, 21));
		}else if(imc>=25 && imc<=24.9) {
            lblNewLabel_3_1.setText("sobrepeso");
			
			lblNewLabel_3_1.setBackground(new Color(255, 240, 2));
			lblNewLabel_3.setBackground(new Color(255, 240, 2));
			
		}else if(imc>=30 && imc<=34.9) {
			 lblNewLabel_3_1.setText("obesidad 1");
				
				lblNewLabel_3_1.setBackground(new Color(254, 190, 0));
				lblNewLabel_3.setBackground(new Color(254, 190, 0));
			
		}else if(imc>=35.9 && imc<=39.9) {
			 lblNewLabel_3_1.setText("obesidad 2");
				
				lblNewLabel_3_1.setBackground(new Color(250, 96, 2));
				lblNewLabel_3.setBackground(new Color(250, 96, 2));
			
		}else if (imc>=40){
			 lblNewLabel_3_1.setText("obesidad 2");
				
				lblNewLabel_3_1.setBackground(new Color(209, 14, 14));
				lblNewLabel_3.setBackground(new Color(209, 14, 14));
			
		}
		
		
		
		
	}


	
	private void initialize() {
		
		frmHisessrinimc = new JFrame();
		frmHisessrinimc.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinimc.setTitle("HISESSRIN-IMC");
		frmHisessrinimc.setBounds(100, 100, 567, 367);
		frmHisessrinimc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinimc.getContentPane().setLayout(null);
		lblNewLabel_3 = new JLabel("imc:");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(34, 223, 98, 45);
		frmHisessrinimc.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_3_1 = new JLabel("usted esta:");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setBounds(34, 272, 98, 45);
		frmHisessrinimc.getContentPane().add(lblNewLabel_3_1);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\Sin título.png"));
		lblNewLabel.setBounds(173, 0, 380, 205);
		frmHisessrinimc.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IMC DATOS");
		lblNewLabel_1.setFont(new Font("ROG LyonsType", Font.PLAIN, 23));
		lblNewLabel_1.setSize(new Dimension(6, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setBounds(0, 11, 163, 31);
		frmHisessrinimc.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 51, 140, 14);
		frmHisessrinimc.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Altura");
		lblNewLabel_2_1.setFont(new Font("ROG LyonsType", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(10, 116, 153, 14);
		frmHisessrinimc.getContentPane().add(lblNewLabel_2_1);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_2.setText("peso:     kg"+slider.getValue());
				peso=(double)slider.getValue();
				IMCcalc();
			}
		});
		slider.setMinimum(50);
		slider.setMaximum(130);
		slider.setBounds(10, 76, 156, 26);
		frmHisessrinimc.getContentPane().add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				double a=(double)slider_1.getValue()/100;
				lblNewLabel_2_1.setText("altura:     m"+a);
				altura=a;
				IMCcalc();
			}
		});
		slider_1.setValue(100);
		slider_1.setMaximum(200);
		slider_1.setMinimum(100);
		slider_1.setBounds(10, 141, 156, 26);
		frmHisessrinimc.getContentPane().add(slider_1);
		
		
	}
}
