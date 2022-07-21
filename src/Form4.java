import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mailSender.EmailUtility;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Form4 extends JFrame {

	private JPanel contentPane;
	private JTextField nameText;
	private JTextField surnameText;
	private JTextField telephoneText;
	private JTextField ýdText;
	private JTextField emailText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form4 frame = new Form4();
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
	public Form4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(10, 39, 61, 24);
		contentPane.add(nameLabel);
		
		nameText = new JTextField();
		nameText.setBounds(10, 73, 96, 19);
		contentPane.add(nameText);
		nameText.setColumns(10);
		
		JLabel surnameLabel = new JLabel("Surame");
		surnameLabel.setBounds(10, 102, 61, 24);
		contentPane.add(surnameLabel);
		
		surnameText = new JTextField();
		surnameText.setColumns(10);
		surnameText.setBounds(10, 136, 96, 19);
		contentPane.add(surnameText);
		
		JComboBox codeBox = new JComboBox();
		codeBox.setBounds(10, 222, 61, 34);
		contentPane.add(codeBox);
		
		telephoneText = new JTextField();
		telephoneText.setBounds(81, 223, 119, 34);
		contentPane.add(telephoneText);
		telephoneText.setColumns(10);
		
		JLabel telephoneLabel = new JLabel("Telephone");
		telephoneLabel.setBounds(10, 199, 61, 24);
		contentPane.add(telephoneLabel);
		
		JLabel ýdLabel = new JLabel("ID");
		ýdLabel.setBounds(10, 255, 61, 24);
		contentPane.add(ýdLabel);
		
		ýdText = new JTextField();
		ýdText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (ýdText.getText().length() >= 11 ) 
			            e.consume(); 
			}
		});
		ýdText.setColumns(10);
		ýdText.setBounds(10, 281, 102, 24);
		contentPane.add(ýdText);
		
		emailText = new JTextField();
		emailText.setBounds(10, 177, 96, 19);
		contentPane.add(emailText);
		emailText.setColumns(10);
		
		JButton emailButton = new JButton("SEND MAIL");
		emailButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					EmailUtility emailSender=new EmailUtility();
					emailSender.sendEmail(emailText.getText(),"Bilet" , " Isim:"+nameText.getText()+" \nSoyad: "+surnameText.getText()+"\nBilet No"+Form3a.txtbill.getText(), null);
					JOptionPane.showMessageDialog(null, "E posta gönderildi");

				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Hata Oluþtu: "+ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
		emailButton.setBounds(356, 319, 175, 41);
		contentPane.add(emailButton);
		
		JButton nextButton = new JButton("RATE");
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Form5 frame = new Form5();
				frame.setVisible(true);
				
			}
		});
		nextButton.setBounds(548, 319, 85, 41);
		contentPane.add(nextButton);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(10, 165, 45, 13);
		contentPane.add(emailLabel);
		
		}
	}

