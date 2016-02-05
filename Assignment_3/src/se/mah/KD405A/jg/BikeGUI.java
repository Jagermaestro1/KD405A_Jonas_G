package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private BikeStore Bstore;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
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
	public BikeGUI() {
		Bstore = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 126, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 196, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(163, 63, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAddNewBike = new JLabel("Add New Bike:");
		lblAddNewBike.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAddNewBike.setBounds(163, 5, 130, 26);
		contentPane.add(lblAddNewBike);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(163, 35, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(163, 101, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(163, 164, 61, 16);
		contentPane.add(lblPrice);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 35, 145, 222);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bcolor = textField_1.getText();
				int bsize = Integer.parseInt(textField_2.getText()); 
				int bprice = Integer.parseInt(textField_3.getText());
				Bstore.addBike(bcolor, bsize, bprice);
				textArea_1.setText(Bstore.getAllBikes());
			}
		});
		
		btnAdd.setBounds(311, 228, 117, 29);
		contentPane.add(btnAdd);
		
	
		
		
		
		
		
	}
}
