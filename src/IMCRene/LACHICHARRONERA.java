package IMCRene;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class LACHICHARRONERA {
	int a = 0, b = 0, c = 0;
	double x1 = 0, x2 = 0;
	private JFrame frmHisessrinchicharronera;
	private JLabel lblEcuacion;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LACHICHARRONERA window = new LACHICHARRONERA();
					window.frmHisessrinchicharronera.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LACHICHARRONERA() {
		initialize();
	}

	public void calcular() {
		DecimalFormat f= new DecimalFormat ("#.00");
		try {
			lblEcuacion.setText(a + "x² + " + b + "x +" + c + "=0");
			int valor = (b * b) - (4 * a * c);
			if (valor > 0) {
				x1 = (-b + Math.sqrt(valor)) / 2 * a;
				x2 = (-b - Math.sqrt(valor)) / 2 * a;
				lblResultado.setText("x1" +f.format(x1) + "  x2" + f.format(x2));
			} else if (valor > 0) {
				x1 = (-b + Math.sqrt(valor)) / 2 * a;
				x2 = (-b - Math.sqrt(valor)) / 2 * a;
				lblResultado.setText("x1" + f.format(x1) + "  x2" + f.format(x2));
			} else if (valor == 0) {
				x1 = (-b) / 2 * a;

				lblResultado.setText("x1" + f.format(x1));
			} else if (valor < 0) {

				lblResultado.setText("no se puede resolver");
			}
		} catch (Exception ex) {
			
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinchicharronera = new JFrame();
		frmHisessrinchicharronera.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinchicharronera.setTitle("HISESSRIN-chicharronera");
		frmHisessrinchicharronera.setBounds(100, 100, 450, 373);
		frmHisessrinchicharronera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinchicharronera.getContentPane().setLayout(null);
		lblResultado = new JLabel("");
		lblResultado.setBounds(10, 266, 200, 14);
		frmHisessrinchicharronera.getContentPane().add(lblResultado);
		lblEcuacion = new JLabel("");
		lblEcuacion.setBounds(10, 224, 414, 26);
		frmHisessrinchicharronera.getContentPane().add(lblEcuacion);
		JLabel lblValorDeB = new JLabel("valor de B");
		lblValorDeB.setBounds(10, 87, 78, 14);
		frmHisessrinchicharronera.getContentPane().add(lblValorDeB);
		JLabel lblValorA = new JLabel("");
		lblValorA.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValorA.setBounds(220, 11, 46, 51);
		frmHisessrinchicharronera.getContentPane().add(lblValorA);
		JLabel lblNewLabel = new JLabel("valor de A");
		lblNewLabel.setBounds(10, 11, 78, 14);
		frmHisessrinchicharronera.getContentPane().add(lblNewLabel);
		JLabel lblValorB = new JLabel("");
		lblValorB.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValorB.setBounds(220, 87, 46, 51);
		frmHisessrinchicharronera.getContentPane().add(lblValorB);
		JLabel lblValorC = new JLabel("");
		lblValorC.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblValorC.setBounds(220, 155, 46, 51);
		frmHisessrinchicharronera.getContentPane().add(lblValorC);
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a = slider.getValue();
				lblValorA.setText("" + a);
				calcular();
			}

		});
		slider.setMinimum(-50);
		slider.setMaximum(50);
		slider.setValue(0);
		slider.setBounds(10, 36, 200, 26);
		frmHisessrinchicharronera.getContentPane().add(slider);

		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				b = slider_1.getValue();
				lblValorB.setText("" + b);
				calcular();

			}
		});
		slider_1.setMinimum(-50);
		slider_1.setMaximum(50);
		slider_1.setValue(0);
		slider_1.setBounds(10, 112, 200, 26);
		frmHisessrinchicharronera.getContentPane().add(slider_1);

		JSlider slider_2 = new JSlider();
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				c = slider_2.getValue();
				lblValorC.setText("" + c);
				calcular();
			}
		});
		slider_2.setValue(0);
		slider_2.setMaximum(50);
		slider_2.setMinimum(-50);
		slider_2.setBounds(10, 180, 200, 26);
		frmHisessrinchicharronera.getContentPane().add(slider_2);

		JLabel lblValorDeC = new JLabel("valor de C");
		lblValorDeC.setBounds(10, 155, 78, 14);
		frmHisessrinchicharronera.getContentPane().add(lblValorDeC);

	}
}
