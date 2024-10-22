package uni;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Areas.*;
import Tablos.*;
import jops.JOps;

import nuevo.*;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class Uni {

	public JFrame frmUnion;
	aReAs v1 = new aReAs();	
	JOps v2 = new JOps();
	Hola v3 = new Hola();
	DeMuLtLpLiCaR v4 = new DeMuLtLpLiCaR();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uni window = new Uni();
					window.frmUnion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Uni() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnion = new JFrame();
		frmUnion.setTitle("HISESSRIN-Union");
		frmUnion.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmUnion.setBounds(100, 100, 450, 300);
		frmUnion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnion.getContentPane().setLayout(null);
		frmUnion.setLocationRelativeTo(null);
		JButton btnNewButton = new JButton("areas");
		btnNewButton.setForeground(new Color(128, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				v1.frmAreas.setVisible(true);
				v1.frmAreas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			}catch(Exception e2) {}
				
			}
		});
		btnNewButton.setBounds(278, 11, 146, 70);
		frmUnion.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("joptionframes");
		btnNewButton_1.setForeground(new Color(128, 0, 255));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				v2.frmHisessrinjoption.setVisible(true);
				v2.frmHisessrinjoption.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}catch(Exception e2) {}
				
			}
		});
		btnNewButton_1.setBounds(10, 160, 146, 70);
		frmUnion.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("calculadora");
		btnNewButton_2.setForeground(new Color(128, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					v3.frmSumaDe.setVisible(true);
					v3.frmSumaDe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					}catch(Exception e2) {}
			}
		});
		btnNewButton_2.setBounds(278, 160, 146, 70);
		frmUnion.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("tablas");
		btnNewButton_3.setForeground(new Color(128, 0, 255));
		btnNewButton_3.setBackground(new Color(240, 240, 240));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						v4.frmHisessrintablos.setVisible(true);
						v4.frmHisessrintablos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						}catch(Exception e2) {}
			}
		});
		btnNewButton_3.setBounds(10, 11, 146, 70);
		frmUnion.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno.SC2-PC12\\Desktop\\imagen\\4ecqwi0dhlba1.png"));
		lblNewLabel.setBounds(0, 0, 629, 444);
		frmUnion.getContentPane().add(lblNewLabel);
	}
}
