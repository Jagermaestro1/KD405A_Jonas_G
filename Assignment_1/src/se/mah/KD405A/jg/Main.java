package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setBackground(Color.GRAY);
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setBackground(Color.GRAY);
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		mnHjlp.setBackground(Color.GRAY);
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/images/bruceW.jpg")));
		lblNewLabel_1.setBounds(230, 16, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 15));
		lblNamn.setForeground(Color.WHITE);
		lblNamn.setBounds(230, 177, 61, 16);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 15));
		lblPersonnr.setForeground(Color.WHITE);
		lblPersonnr.setBounds(230, 205, 76, 16);
		contentPane.add(lblPersonnr);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setForeground(Color.WHITE);
		lblEpost.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 15));
		lblEpost.setBounds(230, 233, 61, 16);
		contentPane.add(lblEpost);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 15));
		lblTelefon.setBounds(230, 264, 61, 16);
		contentPane.add(lblTelefon);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setForeground(Color.WHITE);
		lblAdress.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 15));
		lblAdress.setBounds(230, 294, 61, 16);
		contentPane.add(lblAdress);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/gym2.jpg")));
		lblNewLabel.setBounds(0, 0, 720, 480);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 200, 480);
		contentPane.add(scrollPane);
		
		JList list = new JList();

		list.setBackground(Color.BLACK);
		list.setForeground(Color.WHITE);
	
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jonas Gabrielsson", "Robin Medin", "Tim Roth  \t", "Amanda Plummer  \t", "John Travolta  \t", "Samuel L. Jackson  \t", "Phil LaMarr  \t", "Frank Whaley  ", "Burr Steers  ", "Bruce Willis  ", "Ving Rhames  \t", "Paul Calderón  \t", "Rosanna Arquette  \t", "Bronagh Gallagher  \t", "Eric Stoltz  \t", "Uma Thurman  \t", "Michael Gilden  \t", "Steve Buscemi  \t", "Christopher Walken  ", "Angela Jones  \t", "Maria de Medeiros  \t", "Kathy Griffin ", "Duane Whitaker  ", "Peter Greene  ", "Stephen Hibbert  ", "Alexis Arquette  ", "Quentin Tarantino ", "Harvey Keitel  \t", "Julia Sweeney  \t"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
	}
}
