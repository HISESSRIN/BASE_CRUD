package IMCRene;

import java.awt.EventQueue;
import IMCRene.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import Areas.aReAs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tiendita {
	Registro v1 = new Registro();	
	private JFrame frame;
double pago=0;	
double cosa=0;
	String marca;
	DefaultComboBoxModel modelo = new DefaultComboBoxModel();
	DefaultTableModel modelo1 = new DefaultTableModel();
	ArrayList<detalle> lista=new ArrayList<detalle>();
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tiendita window = new tiendita();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public void cardardetalles() {
		while (modelo1.getRowCount() > 0) {
			modelo1.removeRow(0);

		}
double total=0;
		for (detalle d : lista) {
			Object oa[] = new Object[3];

			oa[0] = v1.listaAutos.get(d.getIndex()).getMarca();
			oa[1] = d.getCantidad();
			double importe= v1.listaAutos.get(d.getIndex()).getModelo()*d.getCantidad();
			oa[2] = importe;
			modelo1.addRow(oa);
			total+=importe;
		}
		table.setModel(modelo1);
		lblNewLabel_2.setText(""+total);
		lblNewLabel_3.setText(""+total*.16);
		lblNewLabel_4.setText(""+total*1.16);
	}
	public tiendita() {
		initialize();
	}
	public void actu() {
	
			modelo.removeAllElements();


		for (Auto auto : v1.listaAutos) {
	
		
			modelo.addElement(auto.getMarca());
	}
		comboBox.setModel(modelo);
		
		
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
			
				actu();
			}
			public void windowLostFocus(WindowEvent e) {
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(334, 176, 79, 14);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(334, 144, 90, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(334, 114, 90, 14);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(217, 47, 64, 22);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(217, 80, 64, 22);
		frame.getContentPane().add(lblNewLabel_1);
		JButton registrar = new JButton("registrar");
		registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					v1.frmHisessrinregistros.setVisible(true);
					v1.frmHisessrinregistros.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					actu();
					
					
				}catch(Exception e2) {}
					
				
				
				
			}
		});
		registrar.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(registrar);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			cosa=v1.listaAutos.get(comboBox.getSelectedIndex()).getModelo();
				
				
				
				lblNewLabel.setText("$"+cosa);
				
				
			}
		});
		
		
		
		
		
		comboBox.setBounds(10, 47, 89, 22);
		frame.getContentPane().add(comboBox);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblNewLabel_1.setText(""+slider.getValue());
		        
			
				
				
				

		
				
			}
		});
		slider.setValue(0);
		slider.setBounds(10, 80, 200, 26);
		frame.getContentPane().add(slider);
		
		JButton btnNewButton = new JButton("agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		detalle dv=new detalle(comboBox.getSelectedIndex(),slider.getValue());
		
		boolean siesta=false;
		for (detalle det : lista) {
			
			if(det.getIndex()==comboBox.getSelectedIndex()) {
				det.setCantidad(det.getCantidad()+slider.getValue());
				siesta=true;
			}}
			if(siesta==false) {
				lista.add(dv);
			}
				
			
		
		
		
				
				
		
				
		cardardetalles();
				
			}
		});
		btnNewButton.setBounds(121, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 314, 120);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		modelo1.addColumn("producto");
		modelo1.addColumn("cantidad");
		modelo1.addColumn("importe");
	
		table.setModel(modelo1);
		
		
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("pagar");
		btnNewButton_1.setBounds(320, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
