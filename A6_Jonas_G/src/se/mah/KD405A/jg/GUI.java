package se.mah.KD405A.jg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHllplats;
	private JTextField txtFrn;
	private JTextField txtTill;
	private JButton btnSk;
	private JTextArea txtrResultat;
	private JTextArea txtrReseresultat;
	private JButton btnSkResa;
	private JLabel lblCreatedByMasjvel;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 373, 266);
		contentPane.add(panel);
		panel.setLayout(null);

		txtrResultat = new JTextArea();
		txtrResultat.setBounds(22, 76, 345, 159);
		panel.add(txtrResultat);

		btnSk = new JButton("Sök");
		btnSk.setBounds(22, 47, 129, 29);
		btnSk.addActionListener(this);
		panel.add(btnSk);

		txtHllplats = new JTextField();
		txtHllplats.setBounds(22, 20, 130, 26);
		panel.add(txtHllplats);
		txtHllplats.setColumns(10);
		
		JLabel lblSkHllplats = new JLabel("Sök Hållplats");
		lblSkHllplats.setBounds(24, 6, 127, 16);
		panel.add(lblSkHllplats);
		
		lblCreatedByMasjvel = new JLabel("Created by: Masjävel");
		lblCreatedByMasjvel.setBounds(22, 244, 345, 16);
		panel.add(lblCreatedByMasjvel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(391, 6, 474, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		txtFrn = new JTextField();
		txtFrn.setBounds(6, 19, 130, 26);
		panel_1.add(txtFrn);
		txtFrn.setColumns(10);

		txtTill = new JTextField();
		txtTill.setBounds(166, 19, 130, 26);
		panel_1.add(txtTill);
		txtTill.setColumns(10);

		txtrReseresultat = new JTextArea();
		txtrReseresultat.setBounds(6, 57, 436, 178);
		panel_1.add(txtrReseresultat);

		btnSkResa = new JButton("Sök Resa");
		btnSkResa.addActionListener(this);
		btnSkResa.setBounds(308, 19, 117, 29);
		panel_1.add(btnSkResa);
		
		JLabel lblFrn = new JLabel("Från:");
		lblFrn.setBounds(6, 3, 61, 16);
		panel_1.add(lblFrn);
		
		JLabel lblTill = new JLabel("Till:");
		lblTill.setBounds(168, 3, 61, 16);
		panel_1.add(lblTill);

	}

	private String getTime(Calendar time) {
		return time.get(Calendar.HOUR_OF_DAY) + ":" + time.get(Calendar.MINUTE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSk) {
			txtrResultat.setText("Chillaaa... LADDAR");
			new HållplatsThreadSearch().start();
		}
		if (e.getSource() == btnSkResa) {
			txtrReseresultat.setText("Hakuna Matata.....");
			new ReseThreadSearch().start();

		}
	}

	private class HållplatsThreadSearch extends Thread {
		@Override
		public void run() {
			ArrayList<Station> hållplatser = new ArrayList<Station>();

			hållplatser.addAll(Parser.getStationsFromURL(txtHllplats.getText()));
			txtrResultat.setText("");

			for (Station s : hållplatser) {
				txtrResultat.append(s.getStationName() + " Stationsnummer: " + s.getStationNbr() + " Latitude: "
						+ s.getLatitude() + " Longitud: " + s.getLongitude() + "\n");
			}

		}
	}

	private class ReseThreadSearch extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL(txtFrn.getText(), txtTill.getText(), 1);

			Journeys journeys = Parser.getJourneys(searchURL);
			ArrayList<Journey> reseresultat = journeys.getJourneys();

			txtrReseresultat.setText("");

			if (reseresultat.isEmpty()) {
				txtrReseresultat.append("Klant! Du måste fylla i stationsnummer!!" + "\n" + "Stationsnummer hittar du när du söker hållplats!");
			}
			Journey MyJourney = reseresultat.get(0);

			try {
				txtrReseresultat.append("Resan mellan " + MyJourney.getStartStation().getStationName() + " och "
						+ MyJourney.getEndStation().getStationName() + " avgår om " + MyJourney.getTimeToDeparture()
						+ " minuter " + "\n");
				txtrReseresultat.append("Resan avgår kl. " + getTime(MyJourney.getDepDateTime()) + "\n");
				txtrReseresultat.append(
						"Om allt går som det ska är du framme kl. " + getTime(MyJourney.getArrDateTime()) + "\n");

				txtrReseresultat.append("Fordon: " + MyJourney.getLineTypeName() + "\n");
				txtrReseresultat.append("Linje : " + MyJourney.getLineOnFirstJourney() + "\n");
				txtrReseresultat.append("Restid: " + MyJourney.getTravelMinutes() + " min " + "\n");
				txtrReseresultat.append("Antal byten: " + MyJourney.getNoOfChanges() + "\n");
				txtrReseresultat.append("Antal zoner: " + MyJourney.getNoOfZones() + "\n");

				int depTimeDeviation = Integer.parseInt(MyJourney.getDepTimeDeviation());
				if (depTimeDeviation != 0) {
					txtrReseresultat.append("Resan är " + Integer.toString(depTimeDeviation) + "minuter sen");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
