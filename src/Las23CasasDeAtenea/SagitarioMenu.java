package Las23CasasDeAtenea;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class SagitarioMenu {

	private JFrame frmHisessrinjmenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SagitarioMenu window = new SagitarioMenu();
					window.frmHisessrinjmenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SagitarioMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinjmenu = new JFrame();
		frmHisessrinjmenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinjmenu.setTitle("HISESSRIN-Jmenu");
		frmHisessrinjmenu.setBackground(new Color(255, 255, 255));
		frmHisessrinjmenu.setBounds(100, 100, 450, 300);
		frmHisessrinjmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		frmHisessrinjmenu.setJMenuBar(menuBar);
		frmHisessrinjmenu.getContentPane().setLayout(null);
		JMenu mnNewMenu_2 = new JMenu("Archivo");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("abrir");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("guardar");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_2.add(separator);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("salir");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu = new JMenu("Edicion");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("colores");
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
			}
		});
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Rojo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHisessrinjmenu.getContentPane().setBackground(Color.red);
				
				
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Verde");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHisessrinjmenu.getContentPane().setBackground(Color.green);
				
				
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Azul");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHisessrinjmenu.getContentPane().setBackground(Color.blue);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("insertar");
		menuBar.add(mnNewMenu_3);
		
		
	
	}
}
