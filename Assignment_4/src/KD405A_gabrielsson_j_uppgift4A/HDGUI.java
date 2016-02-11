package KD405A_gabrielsson_j_uppgift4A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HDGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuman;
	private JTextField txtDog;
	private JTextField txtError;
	private JTextField txtInfo;
	
	private Human h;
	private Dog d;
	private boolean humanExist = false;
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HDGUI frame = new HDGUI();
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
	public HDGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtError.setText("");
				txtInfo.setText("");
				if(txtHuman.getText().length()>=3){         //kollar så att namnet är minst 3 bokstäver
					String newHuman = txtHuman.getText();
					h = new Human(newHuman);				// skapar en ny människa och ger den namnet
					humanExist = true;
				}
				else{
					txtError.setText("namnet är för kort");	// om fel 
				}
			}
		});
		btnNewHuman.setBounds(176, 58, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnNewDog = new JButton("Buy Dog");
		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtError.setText("");
				txtInfo.setText("");
				
				if(humanExist == true){						//kollar om det finns en människa
					String hund = txtDog.getText();
					
				d = new Dog(hund);							//skapar ny dog och ger den namn från txtHund
					h.buyDog(d);							// dog får en ägare
				System.out.println("Namnet är : " +h.getName());
				System.out.println("Hundnamnet är : " +txtDog.getText());
				System.out.println("Hund : " + hund);
				
				}
				else{
					txtError.setText("Du är inte männsklig");
				}
			}
		});
		btnNewDog.setBounds(176, 99, 117, 29);
		contentPane.add(btnNewDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtError.setText("");
				txtInfo.setText("");
				txtHuman.setText("");
				txtDog.setText("");
				if (humanExist == true){
				txtInfo.setText(h.getInfo());
				System.out.println("test : " +h.getInfo());
				}
				humanExist = false;
			}
			
		});
		btnPrintInfo.setBounds(176, 140, 117, 29);
		contentPane.add(btnPrintInfo);
		
		txtHuman = new JTextField();
		txtHuman.setText("Human");
		txtHuman.setBounds(34, 58, 130, 26);
		contentPane.add(txtHuman);
		txtHuman.setColumns(10);
		
		txtDog = new JTextField();
		txtDog.setText("Dog");
		txtDog.setBounds(34, 99, 130, 26);
		contentPane.add(txtDog);
		txtDog.setColumns(10);
		
		txtError = new JTextField();
		txtError.setText("Error");
		txtError.setBounds(34, 246, 355, 26);
		contentPane.add(txtError);
		txtError.setColumns(10);
		
		txtInfo = new JTextField();
		txtInfo.setText("Info");
		txtInfo.setBounds(34, 179, 355, 39);
		contentPane.add(txtInfo);
		txtInfo.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info:");
		lblInfo.setBounds(34, 159, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblError = new JLabel("Error:");
		lblError.setBounds(34, 230, 61, 16);
		contentPane.add(lblError);
		
		JLabel lblHumansDogs = new JLabel("Humans & Dogs");
		lblHumansDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblHumansDogs.setBounds(125, 18, 136, 28);
		contentPane.add(lblHumansDogs);
	}
}
