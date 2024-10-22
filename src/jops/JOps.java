package jops;

import java.awt.EventQueue;
import Tablos.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Areas.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class JOps {

	public JFrame frmHisessrinjoption;
	aReAs v1 = new aReAs();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOps window = new JOps();
					window.frmHisessrinjoption.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JOps() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinjoption = new JFrame();
		frmHisessrinjoption.setTitle("HISESSRIN-Joption");
		frmHisessrinjoption.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinjoption.setBounds(100, 100, 450, 300);
		frmHisessrinjoption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHisessrinjoption.getContentPane().setLayout(null);
		frmHisessrinjoption.setLocationRelativeTo(null);
		JTextArea txttexto = new JTextArea();
		txttexto.setBackground(new Color(255, 255, 255));
		txttexto.setBounds(194, 134, 206, 100);
		frmHisessrinjoption.getContentPane().add(txttexto);
		
		JButton btnNewButton = new JButton("messaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"RENE>aley (o como se escriba)");
			}
			
		});
		btnNewButton.setBounds(24, 23, 89, 23);
		frmHisessrinjoption.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("option");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String[] i= {"si","no"};
					 int variable = JOptionPane.showOptionDialog(null, "Seleccione una opción", "si/no", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, i, 0);
					if(variable==0) {
						txttexto.setText("si");
					}else {
						txttexto.setText("no");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnNewButton_1.setBounds(24, 57, 89, 23);
		frmHisessrinjoption.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("input");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=JOptionPane.showInputDialog(null,"ingresa tu mensaje");
				txttexto.setText(msg);
						
			}
		});
		btnNewButton_1_1.setBounds(24, 90, 89, 23);
		frmHisessrinjoption.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("borrar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txttexto.setText("");
				
				
			}
		});
		btnNewButton_1_1_1.setBounds(24, 211, 89, 23);
		frmHisessrinjoption.getContentPane().add(btnNewButton_1_1_1);
	}
}
