package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtColor;
	private JTextField txtSize;
	private JTextField txtPrice;
	private BikeStore bikeStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		bikeStore = new BikeStore();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtColor = new JTextField();
		txtColor.setText("Color");
		txtColor.setBounds(314, 47, 130, 26);
		contentPane.add(txtColor);
		txtColor.setColumns(10);

		txtSize = new JTextField();
		txtSize.setText("Size");
		txtSize.setBounds(314, 85, 130, 26);
		contentPane.add(txtSize);
		txtSize.setColumns(10);

		txtPrice = new JTextField();
		txtPrice.setText("Price");
		txtPrice.setBounds(314, 123, 130, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 34, 282, 217);
		contentPane.add(textArea);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bikeColor = txtColor.getText();
				int bikeSize = Integer.parseInt(txtSize.getText());
				int bikePrice = Integer.parseInt(txtPrice.getText());
				bikeStore.addBike(bikeColor, bikeSize, bikePrice);
				textArea.setText(bikeStore.getAllBikes());
			}
		});
		btnAdd.setBounds(327, 220, 117, 29);
		contentPane.add(btnAdd);
	}

}
