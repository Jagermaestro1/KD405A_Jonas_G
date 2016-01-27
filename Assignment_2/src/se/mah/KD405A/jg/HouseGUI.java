package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Uppgift 1.2
				House houseA = new House(1999,999);
				House houseB = new House(1777,500);
				House houseC = new House(2008,5);
		//Uppgift 1.3
				House [] houses;
				houses = new House [10];
				
				houses[0]= new House(1800,1000);
				houses[1]= new House(1820,980);
				houses[2]= new House(1840,960);
				houses[3]= new House(1660,940);
				houses[4]= new House(1880,920);
				houses[5]= new House(1900,900);
				houses[6]= new House(1920,880);
				houses[7]= new House(1940,860);
				houses[8]= new House(1960,840);
				houses[9]= new House(1980,820);				
		//Uppgift 1.4
				Random r = new Random();
				Random s = new Random();
				
				ArrayList<House> bostadsarea = new ArrayList<House>();
				for(int qq = 0; qq<100; qq++){
					int ra = r.nextInt(216) + 1800;  // Skillnaden mellan årtalen + startår
					int sa = s.nextInt(991) + 10;	// Skillnaden mellan storlekarna + min storlek
					bostadsarea.add(new House(ra,sa));
				}
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 438, 266);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("");
		scrollPane.setViewportView(textArea);
		
		//Uppgift 1.2 Print
		
		String a = "Uppgift 1.2:\n";
		String b = null;
		String c = null;
		String d = null;	
		
		if(houseA.getYearBuilt() !=0 && houseA.getSize() !=0){
			b = "Hus A är byggt år:" +houseA.getYearBuilt() + " och är " +houseA.getSize() +"kvm stort. Grattis! \n";
			
		} else{
			b = "Ditt hus A har fel byggår eller fel storlek. Det har demolerats. \n";
		}
		if(houseB.getYearBuilt() !=0 && houseB.getSize() !=0){
			c = "Hus B är byggt år:" +houseB.getYearBuilt() + " och är " +houseB.getSize() +"kvm stort. Grattis!\n";
			
		} else{
			c = "Ditt hus B har fel byggår eller fel storlek. Det har demolerats.\n";
		}
		if(houseC.getYearBuilt() !=0 && houseC.getSize() !=0){
			d = "Hus C är byggt år:" +houseC.getYearBuilt() + " och är " +houseC.getSize() +"kvm stort. Grattis!\n";
			
		} else{
			d = "Ditt hus C har fel byggår eller fel storlek. Det har demolerats.\n";
		}
	
		textArea.append(a+b+c+d);
		System.out.println(a+b+c+d);
		
		//Uppgift 1.3 Print
		textArea.append("Uppgift 1.3 \n");
		for(int q =0; q<houses.length; q++){
			if(houses[q].getYearBuilt() !=0 && houses[q].getSize() !=0){
				 textArea.append( "Hus " +q +" är byggt år:" +houses[q].getYearBuilt() + " och är " +houses[q].getSize() +"kvm stort. Grattis!\n");
				
			} else{
				textArea.append("Ditt hus " +q +" har fel byggår eller fel storlek. Det har demolerats.\n");
			}
		//Uppgift 1.4 Print
			textArea.append("1.4 \n");
			for(House h:bostadsarea){
				if(h.getYearBuilt() !=0 && h.getSize() !=0){
					 textArea.append( "Ett hus är byggt år:" +h.getYearBuilt() + " och är " +h.getSize() +"kvm stort. Grattis!\n");
					
				} else{
					textArea.append("Ett hus har fel byggår eller fel storlek. Det har demolerats.\n");
				}
				
			}
		}
	}
}
