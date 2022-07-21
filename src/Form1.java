import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import mailSender.EmailUtility;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Form1 extends JFrame {
	private JRadioButton busRadio;
	private JRadioButton planeRadio;
	
	/**
	 * Launch the application.
	 */
	
	public static Inventory inv = new Inventory();
	public static Route selectedRoute = new Route(null);
	public static Date selectedDate = new Date();
	
	public static void main(String[] args) {


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
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
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 454);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	

		JComboBox nerdenBox = new JComboBox();
		nerdenBox.setBounds(23, 130, 163, 35);
		contentPane.add(nerdenBox);
		
		JComboBox nereyeBox = new JComboBox();
		nereyeBox.setBounds(249, 130, 163, 35);
		contentPane.add(nereyeBox);
		
		JLabel nerdenText = new JLabel("NERDEN");
		nerdenText.setBounds(23, 98, 84, 13);
		contentPane.add(nerdenText);
		
		JLabel nereyeText = new JLabel("NEREYE");
		nereyeText.setBounds(249, 98, 78, 13);
		contentPane.add(nereyeText);
		
		busRadio = new JRadioButton("BUS");
		busRadio.addActionListener(new ActionListener() {
		
				public void actionPerformed(ActionEvent e) {
					if (busRadio.isSelected()) {
						planeRadio.setSelected(false);
					}
				}
			
		});
		busRadio.setBounds(249, 227, 65, 21);
		contentPane.add(busRadio);
		
		JCalendar calendar = new JCalendar();
		calendar.getDayChooser().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		
		calendar.setBounds(23, 207, 175, 138);
		contentPane.add(calendar);
		
		JButton button1 = new JButton("DEVAM ET");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedDate.setDate(calendar.getDayChooser().getDay());
				selectedDate.setMonth(calendar.getMonthChooser().getMonth());
				selectedDate.setYear(calendar.getYearChooser().getYear()-1900); //Beacuse setYear method adds an extra 1900
				selectedRoute = new Route( (City) nerdenBox.getSelectedItem(),(City)  nereyeBox.getSelectedItem());
				if(busRadio.isSelected()) {
	            	Form2 frame2 = new Form2();
	                frame2.setVisible(true);
	                setVisible(false); 
	                dispose();
				}
				else {
					Form2b frame2b = new Form2b();
	                frame2b.setVisible(true);
	                setVisible(false); 
	                dispose();
				}
			}
		});
		
		JButton button2 = new JButton("EPosta Gönder");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					EmailUtility emailSender=new EmailUtility();
					emailSender.sendEmail("tubakkin99@gmail.com","Baþlýk" , "Test Message", null);
					JOptionPane.showMessageDialog(null, "E posta gönderildi");

				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Hata Oluþtu: "+ex.getMessage());
					ex.printStackTrace();
				}

			}
		});
		
		button1.setBounds(598, 363, 163, 44);
		contentPane.add(button1);
		button2.setBounds(400, 363, 163, 44);
		contentPane.add(button2);

		planeRadio = new JRadioButton("PLANE");
		planeRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (planeRadio.isSelected()) {
					busRadio.setSelected(false);
				}
			}
		});
		planeRadio.setBounds(249, 250, 103, 21);
		contentPane.add(planeRadio);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(439, 217, 246, 31);
		contentPane.add(textArea);
		textArea.setText(""+calendar.getDayChooser());
		for (City city : inv.getCities()) {
			nerdenBox.addItem(city);
			nereyeBox.addItem(city);
			
		}
	}
	}