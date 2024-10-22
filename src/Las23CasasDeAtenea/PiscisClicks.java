package Las23CasasDeAtenea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.JPopupMenu;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PiscisClicks {
		private JFrame frmHisessrinclicks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiscisClicks window = new PiscisClicks();
					window.frmHisessrinclicks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PiscisClicks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHisessrinclicks = new JFrame();
		frmHisessrinclicks.getContentPane().setBackground(new Color(0, 0, 0));
		frmHisessrinclicks.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.SC2-PC12\\Desktop\\vic\\Practicas_304_P1\\src\\173641045.png"));
		frmHisessrinclicks.setTitle("HISESSRIN.Clicks");
		frmHisessrinclicks.setBounds(100, 100, 450, 300);
		frmHisessrinclicks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setLocation(107, 80);
		addPopup(frmHisessrinclicks.getContentPane(), popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("rojo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmHisessrinclicks.getContentPane().setBackground(Color.red);
			}
		});
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("verde");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHisessrinclicks.getContentPane().setBackground(Color.green);
			}
		});
		popupMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("azul");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHisessrinclicks.getContentPane().setBackground(Color.blue);
			}
		});
		popupMenu.add(mntmNewMenuItem_1);
		frmHisessrinclicks.getContentPane().setLayout(null);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
