package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GéminisList {

	private JFrame frmHisessrinlist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GéminisList window = new GéminisList();
					window.frmHisessrinlist.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GéminisList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinlist = new JFrame();
		frmHisessrinlist.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinlist.setTitle("HISESSRIN-List");
		frmHisessrinlist.setBounds(100, 100, 450, 300);
		frmHisessrinlist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinlist.getContentPane().setLayout(null);

		JLabel lblNewLabela = new JLabel("New label");
		lblNewLabela.setBounds(37, 182, 313, 33);
		frmHisessrinlist.getContentPane().add(lblNewLabela);
		JList lista = new JList();
		lista.setModel(new AbstractListModel() {
			String[] values = new String[] {"rojo", "verde", "azul"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setBounds(37, 11, 106, 64);
		frmHisessrinlist.getContentPane().add(lista);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				try {
				mensaje="El color seleccionado es: "+lista.getSelectedValue().toString();
				lblNewLabela.setText(mensaje);
				}catch(Exception E) {
					JOptionPane.showMessageDialog(null,"no seleccionastenada pa");
				}
			}
		});
		btnNewButton.setBounds(41, 110, 89, 23);
		frmHisessrinlist.getContentPane().add(btnNewButton);
		
	}
}
