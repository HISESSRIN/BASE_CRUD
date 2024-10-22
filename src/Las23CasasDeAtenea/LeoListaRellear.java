package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Toolkit;

public class LeoListaRellear {

	private JFrame frmHisessrinlistarellenar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeoListaRellear window = new LeoListaRellear();
					window.frmHisessrinlistarellenar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LeoListaRellear() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinlistarellenar = new JFrame();
		frmHisessrinlistarellenar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinlistarellenar.setTitle("HISESSRIN-ListaRellenar");
		frmHisessrinlistarellenar.setBounds(100, 100, 450, 300);
		frmHisessrinlistarellenar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinlistarellenar.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(130, 33, 294, 46);
		frmHisessrinlistarellenar.getContentPane().add(lblNewLabel);
		JList lista = new JList();
		lista.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String mensaje="La persona seleccionada es: "+lista.getSelectedValue().toString();
				lblNewLabel.setText(mensaje);
			}
		});
		lista.setBounds(31, 33, 89, 108);
		frmHisessrinlistarellenar.getContentPane().add(lista);
		
		
		JButton btnNewButton = new JButton("Curso 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("María");
				modelo.addElement("Luis");
				lista.setModel(modelo);
				
			
		
				
		
			}
		
		});
		btnNewButton.setBounds(31, 157, 89, 23);
		frmHisessrinlistarellenar.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Curso 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lista.setModel(modelo);
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(31, 192, 89, 23);
		frmHisessrinlistarellenar.getContentPane().add(btnNewButton_1);
	}

}
