package Signos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zodiacales {
int dia=1;
String mes="Enero ";
	private JFrame frmHisessrinsignosZodiacales;
	private JComboBox comboBox;
	private JSlider slider;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblFecha;
	private JSlider slider_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zodiacales window = new Zodiacales();
					window.frmHisessrinsignosZodiacales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zodiacales() {
		initialize();
	}
	public void calcular() {
		String sig=" ";
		String Fe=(""+dia+" de "+mes+" "+sig);
		lblFecha.setText(Fe);
	///	
		if ((mes.equals("Marzo") && dia >= 21) || (mes.equals("Abril") && dia <= 19)) {
            sig = "Aries";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/aries.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Abril") && dia >= 20) || (mes.equals("Mayo") && dia <= 20)) {
            sig = "Tauro";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/tau.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
          
        }
        else if ((mes.equals("Mayo") && dia >= 21) || (mes.equals("Junio") && dia <= 20)) {
            sig = "Geminis";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/geminis.png")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Junio") && dia >= 21) || (mes.equals("Julio") && dia <= 22)) {
            sig = "Cáncer";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/cancer.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Julio") && dia >= 23) || (mes.equals("Agosto") && dia <= 22)) {
            sig = "Leo";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/leo.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
            
        }
        else if ((mes.equals("Agosto") && dia >= 23) || (mes.equals("Septiembre") && dia <= 22)) {
            sig = "Virgo";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/virgo.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Septiembre") && dia >= 23) || (mes.equals("Octubre") && dia <= 22)) {
            sig = "Libra";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/libra.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
           
        }
        else if ((mes.equals("Octubre") && dia >= 23) || (mes.equals("Noviembre") && dia <= 21)) {
            sig = "Escorpio";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/escorpio.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Noviembre") && dia >= 22) || (mes.equals("Diciembre") && dia <= 21)) {
            sig = "Sagitario";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/sg.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Diciembre") && dia >= 22) || (mes.equals("Enero") && dia <= 19)) {
            sig= "Capricornio";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/capri.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Enero") && dia >= 20) || (mes.equals("Febrero") && dia <= 18)) {
            sig = "Acuario";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/acua.jpg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
        else if ((mes.equals("Febrero") && dia >= 19) || (mes.equals("Marzo") && dia <= 20)) {
            sig = "Piscis";
            ImageIcon imageIcon = new ImageIcon(Zodiacales.class.getResource("/Signos/picis.jpeg")); // load the image to a imageIcon
    		Image image = imageIcon.getImage(); // transform it 
    		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    		imageIcon = new ImageIcon(newimg);  // transform it back
            lblNewLabel_3.setIcon(new ImageIcon(newimg));
        }
	
	
//
		Fe=(""+dia+" de "+mes+" "+sig);
		lblFecha.setText(Fe);
	}
		
		
		
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinsignosZodiacales = new JFrame();
		frmHisessrinsignosZodiacales.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinsignosZodiacales.setTitle("HISESSRIN-Signos Zodiacales");
		frmHisessrinsignosZodiacales.setBounds(100, 100, 683, 518);
		frmHisessrinsignosZodiacales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinsignosZodiacales.getContentPane().setLayout(null);

		lblNewLabel_3 = new JLabel("");
		
		lblNewLabel_3.setOpaque(true);
		
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setBounds(10, 283, 200, 185);
		frmHisessrinsignosZodiacales.getContentPane().add(lblNewLabel_3);
		lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("ROG LyonsType", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(142, 11, 118, 52);
		frmHisessrinsignosZodiacales.getContentPane().add(lblNewLabel_2);
		JLabel lblNewLabel = new JLabel("DIA");
		lblNewLabel.setFont(new Font("ROG LyonsType", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 118, 52);
		frmHisessrinsignosZodiacales.getContentPane().add(lblNewLabel);
		
		JLabel lblMeses = new JLabel("MESES");
		lblMeses.setFont(new Font("ROG LyonsType", Font.PLAIN, 16));
		lblMeses.setBounds(10, 127, 118, 52);
		frmHisessrinsignosZodiacales.getContentPane().add(lblMeses);
		
		
		
	
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\Signos\\menu.png"));
		lblNewLabel_1.setBounds(340, 11, 288, 296);
		frmHisessrinsignosZodiacales.getContentPane().add(lblNewLabel_1);
		
		
		
		
		lblFecha = new JLabel("1 de Enero");
		lblFecha.setFont(new Font("ROG LyonsType", Font.PLAIN, 16));
		lblFecha.setBounds(10, 232, 250, 52);
		frmHisessrinsignosZodiacales.getContentPane().add(lblFecha);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mes=comboBox.getSelectedItem().toString();
				calcular();
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox.setBounds(10, 179, 118, 22);
		frmHisessrinsignosZodiacales.getContentPane().add(comboBox);
		
		slider_1 = new JSlider();
		slider_1.setMinimum(1);
		slider_1.setMaximum(30);
		slider_1.setValue(1);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				dia=slider_1.getValue();
				int di=slider_1.getValue();
				calcular();
				lblNewLabel_2.setText(""+di);
				
				
			}
		});
		slider_1.setBounds(10, 74, 200, 26);
		frmHisessrinsignosZodiacales.getContentPane().add(slider_1);
	}
}
