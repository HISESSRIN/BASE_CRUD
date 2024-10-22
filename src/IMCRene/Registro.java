package IMCRene;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Registro {

	JFrame frmHisessrinregistros;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField;
	private JScrollPane scrollPane;
	public ArrayList<Auto> listaAutos = new ArrayList<Auto>();
	DefaultTableModel modelo = new DefaultTableModel();
	int index = -1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	public double modelo1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					window.frmHisessrinregistros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
	}

	public void cargara() {
		while (modelo.getRowCount() > 0) {
			modelo.removeRow(0);

		}

		for (Auto auto : listaAutos) {
			Object oa[] = new Object[6];

			oa[0] = auto.getMarca();
			oa[1] = auto.getModelo();
			oa[2] = auto.getAnio();
			oa[3] = auto.getColor();
			oa[4] = auto.getPlaca();
			oa[5] = auto.getPrecio();
			modelo.addRow(oa);
		}
		table.setModel(modelo);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinregistros = new JFrame();
		frmHisessrinregistros.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinregistros.setTitle("HISESSRIN-Registros");
		frmHisessrinregistros.setBounds(100, 100, 450, 590);
		frmHisessrinregistros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinregistros.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("producto");
		lblNewLabel.setBounds(10, 11, 113, 21);
		frmHisessrinregistros.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(128, 12, 147, 20);
		frmHisessrinregistros.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblModelo = new JLabel("precio");
		lblModelo.setBounds(10, 52, 113, 21);
		frmHisessrinregistros.getContentPane().add(lblModelo);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 53, 147, 20);
		frmHisessrinregistros.getContentPane().add(textField_1);

		JLabel lblAnio = new JLabel("categoria");
		lblAnio.setBounds(10, 93, 113, 21);
		frmHisessrinregistros.getContentPane().add(lblAnio);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 94, 147, 20);
		frmHisessrinregistros.getContentPane().add(textField_2);

		JLabel lblColor = new JLabel("proveedor");
		lblColor.setBounds(10, 137, 113, 21);
		frmHisessrinregistros.getContentPane().add(lblColor);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 138, 147, 20);
		frmHisessrinregistros.getContentPane().add(textField_3);
		scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 293, 414, 222);
		frmHisessrinregistros.getContentPane().add(scrollPane);
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String marca = textField.getText();
				modelo1 =Double.parseDouble( textField_1.getText());
				String anio = textField_2.getText();
				String color = textField_3.getText();
				String placa = null;
				String precio = null;
				// validar
				if (marca.equals("") || modelo1==0 || anio.equals("") || color.equals("") ) {
					JOptionPane.showMessageDialog(null, "completa los campos vacios");
					return;
				}
				Auto autox = new Auto(marca, modelo1, anio, color, placa,precio);
				listaAutos.add(autox);

				cargara();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnNewButton.setBounds(10, 261, 89, 23);
		frmHisessrinregistros.getContentPane().add(btnNewButton);
		table = new JTable();
		modelo.addColumn("producto");
		modelo.addColumn("precio");
		modelo.addColumn("categoria");
		modelo.addColumn("proveedor");
		table.setModel(modelo);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				index = table.getSelectedRow();
				Auto x = listaAutos.get(index);
				textField.setText(x.getMarca());
				textField_1.setText(""+x.getModelo());
				textField_2.setText(x.getAnio());
				textField_3.setText(x.getColor());
			

			}
		});
		scrollPane.setViewportView(table);

		btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			

			}

		});
		btnNewButton_1.setBounds(335, 261, 89, 23);
		frmHisessrinregistros.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("eliminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index < 0) {
					JOptionPane.showMessageDialog(null, "error");
					return;
				}
				int op = JOptionPane.showConfirmDialog(null, "seguro ?");
				if (op == 0) {

					listaAutos.remove(index);
					cargara();
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
				
				}
			}
		});
		btnNewButton_2.setBounds(102, 261, 89, 23);
		frmHisessrinregistros.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("modificar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Auto x = listaAutos.get(index);
				String marca = textField.getText();
				 modelo1 = Double.parseDouble(textField_1.getText());
				String anio = textField_2.getText();
				String color = textField_3.getText();
			
				// validar
				if (marca.equals("") || modelo1==0 || anio.equals("") || color.equals("")) {
					JOptionPane.showMessageDialog(null, "completa los campos vacios");
					return;
				}
				x.setMarca(marca);
				x.setModelo(modelo1);
				x.setAnio(anio);
				x.setColor(color);
				x.setPlaca(null);
				x.setPrecio(null);
				cargara();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			

			}
		});
		btnNewButton_3.setBounds(236, 261, 89, 23);
		frmHisessrinregistros.getContentPane().add(btnNewButton_3);
		
		

	}
}
