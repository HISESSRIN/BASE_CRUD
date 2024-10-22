package Tablota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	int id;
	EMP c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBorder(new TitledBorder(null, "customer id", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setBounds(10, 11, 338, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"company name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_1.setBounds(10, 58, 338, 36);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"contact title", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_2.setBounds(10, 105, 338, 36);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"contact name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_3.setBounds(10, 152, 338, 36);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "address",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_4.setBounds(10, 199, 338, 36);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "city",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_5.setBounds(10, 246, 338, 36);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "region",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_6.setBounds(10, 293, 338, 36);
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"postal code", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_7.setBounds(10, 339, 338, 36);
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "country",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_8.setBounds(10, 386, 338, 36);
		frame.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "phone",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_9.setBounds(10, 433, 338, 36);
		frame.getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "fax",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		textField_10.setBounds(10, 473, 338, 36);
		frame.getContentPane().add(textField_10);

		JButton btnAgregar = new JButton("agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					int customerid = Integer.parseInt(textField.getText());
					String cp = textField_1.getText();
					String ct = textField_2.getText();
					String cn = textField_3.getText();
					String ad = textField_4.getText();
					String ci = textField_5.getText();
					String re = textField_6.getText();
					String po = textField_7.getText();
					String co = textField_8.getText();
					String ph = textField_9.getText();
					String fa = textField_10.getText();

					EMP ce = new EMP(customerid, cp, ct, cn, ad, ci, re, po, co, ph, fa);

					if (ce.insertarEMP()) {
						JOptionPane.showMessageDialog(null, "gud");
					} else {
						JOptionPane.showMessageDialog(null, "error grandote");

					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error chiquito tablota");
				}

			}

		});
		btnAgregar.setBounds(434, 11, 191, 23);
		frame.getContentPane().add(btnAgregar);

		JButton btnCargar = new JButton("cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					id = Integer.parseInt(JOptionPane.showInputDialog("introduce id"));
					c = new EMP(id,"","","","","","","","","","");
					
					if (c.cargarEMP()) {
						textField.setText(""+ c.getCustomerid());
						textField_1.setText(c.getCompanyName());
						textField_2.setText(c.getContactTitle());
						textField_3.setText(c.getContactName());
						textField_4.setText(c.getAddress());
						textField_5.setText(c.getCity());
						textField_6.setText(c.getRegion());
						textField_7.setText(c.getPostalCode());
						textField_8.setText(c.getCountry());
						textField_9.setText(c.getPhone());
						textField_10.setText(c.getFax());

						JOptionPane.showMessageDialog(null, "se cargo a tu *¨**?=");
					} else {
						JOptionPane.showMessageDialog(null, "error ");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error ");

				}
			}
		});
		btnCargar.setBounds(434, 82, 191, 23);
		frame.getContentPane().add(btnCargar);

		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    c.setCustomerid(Integer.parseInt(textField.getText()));
					c.setCompanyName(textField_1.getText());
					c.setContactTitle(textField_2.getText());
					c.setContactName(textField_3.getText());
					c.setAddress(textField_4.getText());
					c.setCity(textField_5.getText());
					c.setRegion(textField_6.getText());
					c.setPostalCode(textField_7.getText());
					c.setCountry(textField_8.getText());
					c.setPhone(textField_9.getText());
					c.setFax(textField_10.getText());
					
					
					
					
					
					
					
					if (c.editarEMP()) {
						JOptionPane.showMessageDialog(null, "se actualizo");
					} else {
						JOptionPane.showMessageDialog(null, "error");
					}

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "error");
				}
				
				
				
				
			}
		});
		btnEditar.setBounds(434, 46, 191, 23);
		frame.getContentPane().add(btnEditar);

		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("id a eliminar"));
					EMP x = new EMP();
					x.setCustomerid(id);
					if (x.eliminarEMP()) {
						JOptionPane.showMessageDialog(null, "se elimino");

					} else {
						JOptionPane.showMessageDialog(null, "error");
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "error");
				}

			}
		});
		btnEliminar.setBounds(434, 117, 191, 23);
		frame.getContentPane().add(btnEliminar);
	}
}
