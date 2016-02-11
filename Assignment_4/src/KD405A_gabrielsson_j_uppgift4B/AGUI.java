package KD405A_gabrielsson_j_uppgift4B;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AGUI extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animalList = new ArrayList();
	// private String animalInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AGUI frame = new AGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void addAnimals() {
		this.animalList.add(new Dog("Gunde", 5, true));
		this.animalList.add(new Dog("Angelina Jolie", 3, false, "Brad Pitt"));
		this.animalList.add(new Cat("Sylvester Stallone", 12, 9));
		this.animalList.add(new Snake("Donald Trump", true));
		this.animalList.add(new Snake("Dalai Lama", false));
		this.animalList.add(new Dog("Steve Jobs", 8, true, "Bill Gates"));
	}

	/**
	 * Create the frame.
	 */
	public AGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 27, 621, 245);
		contentPane.add(textArea);
		addAnimals();
		for (Animal a : animalList) {
			String animalInfo = a.getInfo();
			System.out.println(animalInfo);
			textArea.append(animalInfo);

			JLabel lblAnimalList = new JLabel("Animal List");
			lblAnimalList.setBounds(6, 6, 110, 16);
			contentPane.add(lblAnimalList);
		}
	}
}
