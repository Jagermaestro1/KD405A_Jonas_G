package se.mah.KD405A.jg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtH;
	private JTextField txtM;
	private ClockLogic clock;
	private JLabel lblTime;
	private JLabel lblAlarm;
	private int hour;
	private int minute;
	private boolean alarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 163, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblALARM = new JLabel("ALARM");
		lblALARM.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblALARM.setBounds(40, 6, 82, 31);
		contentPane.add(lblALARM);

		JLabel lblHour = new JLabel("Hour:");
		lblHour.setBounds(20, 128, 41, 16);
		contentPane.add(lblHour);

		JLabel lblMinute = new JLabel("Minute:");
		lblMinute.setBounds(20, 156, 61, 16);
		contentPane.add(lblMinute);

		txtH = new JTextField();
		txtH.setText("H");
		txtH.setBounds(73, 123, 61, 26);
		contentPane.add(txtH);
		txtH.setColumns(10);

		txtM = new JTextField();
		txtM.setText("M");
		txtM.setBounds(73, 151, 61, 26);
		contentPane.add(txtM);
		txtM.setColumns(10);

		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtH.getText().isEmpty() || txtM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You have to set alarm!");
				} else {
					_setHour();
					_setMinute();
					if (hour > 12 || minute > 60) {
						JOptionPane.showMessageDialog(null, "WRONG!!!");
					} else {
						clock.setAlarm(hour, minute);
						lblALARM.setText(txtH.getText() + " : " + txtM.getText());
					}
				}
			}
		});
		btnSetAlarm.setBounds(17, 184, 117, 29);
		contentPane.add(btnSetAlarm);

		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clock.clearAlarm();
				txtH.setText("");
				txtM.setText("");
				lblALARM.setText("no alarm");
			}
		});
		btnClearAlarm.setBounds(17, 226, 117, 29);
		contentPane.add(btnClearAlarm);

		lblTime = new JLabel("");
		lblTime.setBackground(Color.BLACK);
		lblTime.setForeground(Color.BLACK);
		lblTime.setFont(new Font("DialogInput", Font.PLAIN, 17));
		lblTime.setBounds(20, 90, 120, 30);
		contentPane.add(lblTime);

		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		lblC.setBounds(60, 35, 31, 53);
		contentPane.add(lblC);

		clock = new ClockLogic(this);
	}

	public void setTimeOnLabel(String time) {
		lblTime.setText(time);

	}

	public void activateAlarm(boolean activate) {
		alarm = activate;
		if (alarm == true) {
			JOptionPane.showMessageDialog(null, "RingRing");
			clock.clearAlarm();

		}
	}

	private void _setHour() {
		String text = txtH.getText();
		hour = Integer.parseInt(text);
	}

	private void _setMinute() {
		String text = txtM.getText();
		minute = Integer.parseInt(text);
	}

}
