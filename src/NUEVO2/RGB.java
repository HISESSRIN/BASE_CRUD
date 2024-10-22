package NUEVO2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class RGB {

	private JFrame frmHisessrinrgb;
     int r=0,g=0,b=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RGB window = new RGB();
					window.frmHisessrinrgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RGB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinrgb = new JFrame();
		frmHisessrinrgb.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinrgb.setTitle("HISESSRIN-RGB");
		frmHisessrinrgb.setLocationRelativeTo(null);
		JLabel rgb = new JLabel("0,0,0");
		rgb.setBounds(74, 221, 115, 29);
		frmHisessrinrgb.getContentPane().add(rgb);
		frmHisessrinrgb.setBounds(100, 100, 450, 300);
		frmHisessrinrgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinrgb.getContentPane().setLayout(null);
		JLabel col = new JLabel("");
		col.setOpaque(true);
		col.setBounds(296, 37, 115, 157);
		JLabel lblNewLabel = new JLabel("rojo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frmHisessrinrgb.getContentPane().add(lblNewLabel);
		JLabel roj = new JLabel("0");
		roj.setBounds(240, 11, 46, 52);
		frmHisessrinrgb.getContentPane().add(roj);
		JSlider sliderRED = new JSlider();
		JLabel ver = new JLabel("0");
		JLabel lblAzul = new JLabel("azul");
		lblAzul.setBounds(10, 74, 46, 14);
		frmHisessrinrgb.getContentPane().add(lblAzul);
		
		
		
		
		
		JSlider sliderGREEN = new JSlider();
		sliderGREEN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				g=sliderGREEN.getValue();
				ver.setText(""+g);
				col.setBackground(new java.awt.Color(r, g, b));
				rgb.setText(""+r+" "+g+" "+b);
				
			}
		});
		sliderGREEN.setValue(0);
		sliderGREEN.setMaximum(255);
		sliderGREEN.setBounds(10, 163, 200, 26);
		frmHisessrinrgb.getContentPane().add(sliderGREEN);
		
		
		
		JLabel lblVerde = new JLabel("verde");
		lblVerde.setBounds(10, 137, 46, 14);
		frmHisessrinrgb.getContentPane().add(lblVerde);
		
		JLabel azu = new JLabel("0");
		azu.setBounds(240, 74, 46, 52);
		frmHisessrinrgb.getContentPane().add(azu);
		ver.setBounds(240, 137, 46, 52);
		frmHisessrinrgb.getContentPane().add(ver);
		
		sliderRED.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				r=sliderRED.getValue();
				roj.setText(""+r);
				col.setBackground(new java.awt.Color(r, g, b));
				rgb.setText(""+r+" "+g+" "+b);
			}
		});
		sliderRED.setValue(0);
		sliderRED.setMaximum(255);
		sliderRED.setBounds(10, 37, 200, 26);
		frmHisessrinrgb.getContentPane().add(sliderRED);
		
		
		JSlider sliderBLUE = new JSlider();
		sliderBLUE.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				b=sliderBLUE.getValue();
				azu.setText(""+b);
				col.setBackground(new java.awt.Color(r, g, b));	
				rgb.setText(""+r+" "+g+" "+b);
				
				
			}
		});
		sliderBLUE.setValue(0);
		sliderBLUE.setMaximum(255);
		sliderBLUE.setBounds(10, 100, 200, 26);
		frmHisessrinrgb.getContentPane().add(sliderBLUE);
		
		
		
		
		frmHisessrinrgb.getContentPane().add(col);
		
		
	}
}
