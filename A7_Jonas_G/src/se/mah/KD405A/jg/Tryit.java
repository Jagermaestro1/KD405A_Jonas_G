package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class Tryit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tryit frame = new Tryit();
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
	public Tryit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.ASSIGNMENT_7);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		px.setPixel(30, 13, Color.BLACK);
		px.setPixel(31, 14, Color.BLACK);
		px.setPixel(32, 15, Color.BLACK);
		px.setPixel(33, 16, Color.BLACK);
		px.setPixel(34, 17, Color.BLACK);
		px.setPixel(35, 18, Color.BLACK);
		px.setPixel(36, 19, Color.BLACK);
		px.setPixel(37, 20, Color.BLACK);
		px.setPixel(38, 21, Color.BLACK);
		px.setPixel(13, 30, Color.BLACK);
		px.setPixel(14, 31, Color.BLACK);
		px.setPixel(15, 32, Color.BLACK);
		px.setPixel(16, 33, Color.BLACK);
		px.setPixel(17, 34, Color.BLACK);
		px.setPixel(18, 35, Color.BLACK);
		px.setPixel(19, 36, Color.BLACK);
		px.setPixel(20, 37, Color.BLACK);
		px.setPixel(21, 38, Color.BLACK);
		
		
		
	}

}