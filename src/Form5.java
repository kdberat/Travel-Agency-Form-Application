import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form5 extends JFrame {

	private JPanel contentPane;
	private JRadioButton star1;
	private JRadioButton star2;
	private JRadioButton star3;
	private JRadioButton star4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form5 frame = new Form5();
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
	public Form5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		star1 = new JRadioButton("1");
		
		star1.setBounds(145, 107, 103, 21);
		contentPane.add(star1);
		
		star2 = new JRadioButton("2");
		star2.setBounds(145, 143, 103, 21);
		contentPane.add(star2);
		
		star3 = new JRadioButton("3");
		star3.setBounds(145, 179, 103, 21);
		contentPane.add(star3);
		
		star4 = new JRadioButton("4");
		star4.setBounds(145, 213, 103, 21);
		contentPane.add(star4);
		
		JRadioButton star5 = new JRadioButton("5");
		star5.setBounds(145, 248, 103, 21);
		contentPane.add(star5);
		
		JLabel lblNewLabel = new JLabel("PLEASE GIVE RATE TO YOUR JORNEY 1-5?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 26, 438, 41);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		star1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (star1.isSelected()) {
					star2.setSelected(false);
					star3.setSelected(false);
					star4.setSelected(false);
					star5.setSelected(false);
				}
				
			}
		});
		star2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (star2.isSelected()) {
					star1.setSelected(false);
					star3.setSelected(false);
					star4.setSelected(false);
					star5.setSelected(false);
				}
			}
		});
		star3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (star3.isSelected()) {
					star2.setSelected(false);
					star1.setSelected(false);
					star4.setSelected(false);
					star5.setSelected(false);
				}
			}
		});
		star4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (star4.isSelected()) {
					star2.setSelected(false);
					star3.setSelected(false);
					star1.setSelected(false);
					star5.setSelected(false);
				}
			}
		});
		star5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (star5.isSelected()) {
					star2.setSelected(false);
					star3.setSelected(false);
					star4.setSelected(false);
					star1.setSelected(false);
				}
			}
		});
	}
}
