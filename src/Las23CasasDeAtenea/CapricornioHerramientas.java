package Las23CasasDeAtenea;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CapricornioHerramientas {

	private JFrame frmHisessrinherramientas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CapricornioHerramientas window = new CapricornioHerramientas();
					window.frmHisessrinherramientas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CapricornioHerramientas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinherramientas = new JFrame();
		frmHisessrinherramientas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinherramientas.setTitle("HISESSRIN-Herramientas");
		frmHisessrinherramientas.setBounds(100, 100, 409, 300);
		frmHisessrinherramientas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinherramientas.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 626, 46);
		frmHisessrinherramientas.getContentPane().add(toolBar);
		
		
		ImageIcon imageIcon = new ImageIcon("C:\\\\Users\\\\Alumno.SC2-PC12\\\\Desktop\\\\imagen\\\\descarga.jfif"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(80, 20,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"imagen 1");
			}
		});
		btnNewButton.setIcon(new ImageIcon(newimg));
		
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"imagen 2");
			}
			
			
		});
		btnNewButton_1.setIcon(new ImageIcon(newimg));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"imagen 3");
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(newimg));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"imagen 4");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(newimg));
		toolBar.add(btnNewButton_2);
	}

}
