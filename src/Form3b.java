import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Form3b extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form3b frame = new Form3b();
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
	String seatno= "0";
	private JTable table;
	public Form3b() {
		
		JTextArea txtbill = new JTextArea();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(20, 107, 287, 108);
		contentPane.add(panel_1);
		
        Label lbl1 = new Label("1");
		
		
     	lbl1.setBounds(10, 10, 20, 21);
		panel_1.add(lbl1);
		
		
		
		Label lbl2 = new Label("2");
        
		lbl2.setBounds(36, 10, 20, 21);
		panel_1.add(lbl2);
		
		
		Label lbl3 = new Label("3");
        
		lbl3.setBounds(62, 10, 20, 21);
		panel_1.add(lbl3);
		
		
		
		Label lbl4 = new Label("4");
       
		lbl4.setBounds(88, 10, 20, 21);
		panel_1.add(lbl4);
		
		
		Label lbl5 = new Label("5");
       
		lbl5.setBounds(114, 10, 20, 21);
		panel_1.add(lbl5);
		
		Label lbl6 = new Label("6");
        
		lbl6.setBounds(140, 10, 20, 21);
		panel_1.add(lbl6);
		
		Label lbl7 = new Label("7");
       
		lbl7.setBounds(166, 10, 20, 21);
		panel_1.add(lbl7);
		
		Label lbl8 = new Label("8");
		
		lbl8.setBounds(192, 10, 20, 21);
		panel_1.add(lbl8);
		
		Label lbl9 = new Label("9");
		
		lbl9.setBounds(218, 10, 20, 21);
		panel_1.add(lbl9);
		
		Label lbl10 = new Label("10");
		
		lbl10.setBounds(244, 10, 20, 21);
		panel_1.add(lbl10);
		
		Label lbl11 = new Label("11");
		
		lbl11.setBounds(10, 37, 20, 21);
		panel_1.add(lbl11);
		
		Label lbl12 = new Label("12");
		
		lbl12.setBounds(36, 37, 20, 21);
		panel_1.add(lbl12);
		
		Label lbl13 = new Label("13");
		
		lbl13.setBounds(62, 37, 20, 21);
		panel_1.add(lbl13);
		
		Label lbl14 = new Label("14");
		
		lbl14.setBounds(88, 37, 20, 21);
		panel_1.add(lbl14);
		
		Label lbl15 = new Label("15");
 
		lbl15.setBounds(114, 37, 20, 21);
		panel_1.add(lbl15);
		
		Label lbl16 = new Label("16");

		lbl16.setBounds(140, 37, 20, 21);
		panel_1.add(lbl16);
		
		Label lbl17 = new Label("17");

		lbl17.setBounds(166, 37, 20, 21);
		panel_1.add(lbl17);
		
		Label lbl18 = new Label("18");
     
		lbl18.setBounds(192, 37, 20, 21);
		panel_1.add(lbl18);
		
		Label lbl19 = new Label("19");
	
		lbl19.setBounds(218, 37, 20, 21);
		panel_1.add(lbl19);
		
		Label lbl20 = new Label("20");
		
		lbl20.setBounds(244, 37, 20, 21);
		panel_1.add(lbl20);
		
		
		Label lbl21 = new Label("21");
		
		lbl21.setBounds(10, 81, 20, 21);
		panel_1.add(lbl21);
		
		Label lbl22 = new Label("22");
		
		lbl22.setBounds(36, 81, 20, 21);
		panel_1.add(lbl22);
		
		Label lbl23 = new Label("23");
		
		lbl23.setBounds(62, 81, 20, 21);
		panel_1.add(lbl23);
		
		Label lbl24 = new Label("24");

		lbl24.setBounds(88, 81, 20, 21);
		panel_1.add(lbl24);
		
		Label lbl25 = new Label("25");

		lbl25.setBounds(114, 81, 20, 21);
		panel_1.add(lbl25);
		
		Label lbl26 = new Label("26");

		lbl26.setBounds(140, 81, 20, 21);
		panel_1.add(lbl26);
		
		Label lbl27 = new Label("27");

		lbl27.setBounds(166, 81, 20, 21);
		panel_1.add(lbl27);
		
		Label lbl28 = new Label("28");

		lbl28.setBounds(192, 81, 20, 21);
		panel_1.add(lbl28);
		
		Label lbl29 = new Label("29");

		lbl29.setBounds(218, 81, 20, 21);
		panel_1.add(lbl29);
		
		Label lbl30 = new Label("30");
		
		
		lbl30.setBounds(244, 81, 20, 21);
		panel_1.add(lbl30);
		
		Label label2_1 = new Label("Seats");
		label2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2_1.setBounds(313, 187, 53, 21);
		contentPane.add(label2_1);
		
		Label label2_1_1 = new Label("Price");
		label2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label2_1_1.setBounds(39, 294, 53, 21);
		contentPane.add(label2_1_1);
		
		TextField txtprice = new TextField();
		txtprice.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtprice.setBounds(120, 294, 159, 21);
		contentPane.add(txtprice);
			
		
		Label label1 = new Label("Advanced Bus Booking VIP Edition");
		label1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label1.setBounds(149, 10, 503, 43);
		contentPane.add(label1);
			
		txtbill.setBounds(336, 107, 23, 38);
		contentPane.add(txtbill);
		
				
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Form4 frame2b = new Form4();
                frame2b.setVisible(true);
                setVisible(false); 
                dispose();
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(20, 368, 91, 32);
		contentPane.add(btnNewButton);
		
		
		
		txtbill.setBounds(328, 143, 23, 38);
		contentPane.add(txtbill);
		lbl1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e) {
					
				if (e.getSource()==lbl1 && seatno!="1") {
					     
						seatno = "1";
						txtbill.setText(" ");
						txtbill.append(seatno);
						lbl1.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl1,seatno);
						if (lbl1.getBackground()==Color.BLUE) {
							
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl7.disable();
							lbl8.disable();
							lbl9.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
			}
		});	
		lbl2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getSource()==lbl2 && seatno!="2") {
					txtbill.setText(" ");
					seatno = "2";
					txtbill.append(seatno);
					lbl2.setBackground(Color.BLUE);
					JOptionPane.showMessageDialog(lbl2,seatno);
					if (lbl2.getBackground()==Color.BLUE) {
						
						lbl1.disable();
						lbl3.disable();
						lbl4.disable();
						lbl5.disable();
						lbl6.disable();
						lbl7.disable();
						lbl8.disable();
						lbl9.disable();
						lbl10.disable();
						lbl11.disable();
						lbl12.disable();
						lbl13.disable();
						lbl14.disable();
						lbl15.disable();
						lbl16.disable();
						lbl17.disable();
						lbl18.disable();
						lbl19.disable();
						lbl20.disable();
						lbl21.disable();
						lbl22.disable();
						lbl23.disable();
						lbl24.disable();
						lbl25.disable();
						lbl26.disable();
						lbl27.disable();
						lbl28.disable();
						lbl29.disable();
						lbl30.disable();

						
						
					}
					
				}
			}
		});
		lbl3.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if (e.getSource()==lbl3 && seatno!="3") {
					txtbill.setText(" ");
					seatno = "3";
					txtbill.append(seatno);
					lbl3.setBackground(Color.BLUE);
					JOptionPane.showMessageDialog(lbl3,seatno);
					if (lbl3.getBackground()==Color.BLUE) {
						
						lbl1.disable();
						lbl2.disable();
						lbl4.disable();
						lbl5.disable();
						lbl6.disable();
						lbl7.disable();
						lbl8.disable();
						lbl9.disable();
						lbl10.disable();
						lbl11.disable();
						lbl12.disable();
						lbl13.disable();
						lbl14.disable();
						lbl15.disable();
						lbl16.disable();
						lbl17.disable();
						lbl18.disable();
						lbl19.disable();
						lbl20.disable();
						lbl21.disable();
						lbl22.disable();
						lbl23.disable();
						lbl24.disable();
						lbl25.disable();
						lbl26.disable();
						lbl27.disable();
						lbl28.disable();
						lbl29.disable();
						lbl30.disable();

						
						
					}
				}
			}
		});
		 lbl4.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl4 && seatno!="4") {
						txtbill.setText(" ");
						seatno = "4";
						txtbill.append(seatno);
						lbl4.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl4,seatno);
						 if (lbl4.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl5.disable();
								lbl6.disable();
								lbl7.disable();
								lbl8.disable();
								lbl9.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();

								
								
							}
					}
				}
			});
		 lbl5.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl5 && seatno!="5") {
						txtbill.setText(" ");
						seatno = "5";
						txtbill.append(seatno);
						lbl5.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl5,seatno);
						 if (lbl5.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl6.disable();
								lbl7.disable();
								lbl8.disable();
								lbl9.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();

								
								
							}
					}
				}
			});
		 lbl6.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl6 && seatno!="6") {
						txtbill.setText(" ");
						seatno = "6";
						txtbill.append(seatno);
						lbl6.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl6,seatno);
						 if (lbl6.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl7.disable();
								lbl8.disable();
								lbl9.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();

								
								
							}
					}
				}
			});
		 lbl7.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl7 && seatno!="7") {
						txtbill.setText(" ");
						seatno = "8";
						txtbill.append(seatno);
						lbl7.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl7,seatno);
						 if (lbl7.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();

								
								
							}
					}
				}
			});
		 lbl8.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl8 && seatno!="8") {
						txtbill.setText(" ");
						seatno = "8";
						txtbill.append(seatno);
						lbl8.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl8,seatno);
						 if (lbl8.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl7.disable();
								lbl9.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();

								
								
							}
					}
				}
			});
		 lbl9.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl9 && seatno!="9") {
						txtbill.setText(" ");
						seatno = "9";
						txtbill.append(seatno);
						lbl9.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl9,seatno);
						if (lbl9.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl7.disable();
							lbl8.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
				}
			});
		 lbl10.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl10 && seatno!="10") {
						txtbill.setText(" ");
						seatno = "10";
						txtbill.append(seatno);
						lbl10.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl10,seatno);
						if (lbl10.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
				}
			});
		 lbl11.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl11 && seatno!="11") {
						txtbill.setText(" ");
						seatno = "11";
						txtbill.append(seatno);
						lbl11.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl11,seatno);
		if (lbl11.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
				}
			});
		 lbl12.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl12 && seatno!="12") {
						txtbill.setText(" ");
						seatno = "12";
						txtbill.append(seatno);
						lbl12.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl12,seatno);
						if (lbl12.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
				}
			});
		 lbl13.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl13 && seatno!="13") {
						txtbill.setText(" ");
						seatno = "13";
						txtbill.append(seatno);
						lbl13.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl13,seatno);
						if (lbl13.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();

							
							
						}
					}
				}
			});
		 lbl14.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl14 && seatno!="14") {
						txtbill.setText(" ");
						seatno = "14";
						txtbill.append(seatno);
						lbl14.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl14,seatno);
						if (lbl14.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
	
							
							
						}
					}
				}
			});
	       lbl15.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl15 && seatno!="15") {
						txtbill.setText(" ");
						seatno = "15";
						txtbill.append(seatno);
						lbl15.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl15,seatno);
						if (lbl15.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
	
							
							
						}
					}
				}
			});
			lbl16.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl16 && seatno!="16") {
						txtbill.setText(" ");
						seatno = "16";
						txtbill.append(seatno);
						lbl16.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl16,seatno);
	if (lbl16.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl17.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
			
							
							
						}
					}
				}
			});
			lbl17.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl17 && seatno!="17") {
						txtbill.setText(" ");
						seatno = "17";
						txtbill.append(seatno);
						lbl17.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl17,seatno);
	if (lbl17.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl18.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
			
							
							
						}
					}
				}
			});  
			lbl18.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl18 && seatno!="18") {
						txtbill.setText(" ");
						seatno = "18";
						txtbill.append(seatno);
						lbl18.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl18,seatno);
						if (lbl18.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl19.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
				
							
							
						}
					}
				}
			});
			lbl19.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl19 && seatno!="19") {
						txtbill.setText(" ");
						seatno = "19";
						txtbill.append(seatno);
						lbl19.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl19,seatno);
if (lbl19.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl18.disable();
							lbl20.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
				
							
							
						}
					}
				}
			});
			lbl20.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if (e.getSource()==lbl20 && seatno!="20") {
						txtbill.setText(" ");
						seatno = "20";
						txtbill.append(seatno);
						lbl20.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(lbl20,seatno);
	if (lbl20.getBackground()==Color.BLUE) {
							
							lbl1.disable();
							lbl2.disable();
							lbl3.disable();
							lbl4.disable();
							lbl5.disable();
							lbl6.disable();
							lbl8.disable();
							lbl9.disable();
							lbl7.disable();
							lbl10.disable();
							lbl11.disable();
							lbl12.disable();
							lbl13.disable();
							lbl14.disable();
							lbl15.disable();
							lbl16.disable();
							lbl17.disable();
							lbl19.disable();
							lbl18.disable();
							lbl21.disable();
							lbl22.disable();
							lbl23.disable();
							lbl24.disable();
							lbl25.disable();
							lbl26.disable();
							lbl27.disable();
							lbl28.disable();
							lbl29.disable();
							lbl30.disable();
				
							
							
						}
					}
				}
			});
			lbl21.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl21 && seatno!="21") {
							txtbill.setText(" ");
							seatno = "21";
							txtbill.append(seatno);
							lbl21.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl21,seatno);
							if (lbl21.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
					
								
								
							}
						}
					}
				});
			lbl22.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl22 && seatno!="22") {
							txtbill.setText(" ");
							seatno = "22";
							txtbill.append(seatno);
							lbl22.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl22,seatno);
							if (lbl22.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
			
								
								
							}
						}
					}
				});
			lbl23.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl23 && seatno!="23") {
							txtbill.setText(" ");
							seatno = "23";
							txtbill.append(seatno);
							lbl23.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl23,seatno);
							if (lbl23.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
					
								
								
							}
						}
					}
				});
                lbl24.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl24 && seatno!="24") {
							txtbill.setText(" ");
							seatno = "24";
							txtbill.append(seatno);
							lbl24.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl24,seatno);
							if (lbl24.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
					
								
								
							}
						}
					}
				});
                lbl25.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl25 && seatno!="25") {
							txtbill.setText(" ");
							seatno = "25";
							txtbill.append(seatno);
							lbl25.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl24,seatno);
							if (lbl25.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
				
								
								
							}
						}
					}
				});
                lbl26.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl26 && seatno!="26") {
							txtbill.setText(" ");
							seatno = "26";
							txtbill.append(seatno);
							lbl26.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl24,seatno);
							if (lbl26.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
				
								
								
							}
						}
					}
				});
                lbl27.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl27 && seatno!="27") {
							txtbill.setText(" ");
							seatno = "27";
							txtbill.append(seatno);
							lbl27.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl27,seatno);
							if (lbl27.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl28.disable();
								lbl29.disable();
								lbl30.disable();
				
								
								
							}
						}
					}
				});
                lbl28.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl28 && seatno!="28") {
							txtbill.setText(" ");
							seatno = "28";
							txtbill.append(seatno);
							lbl28.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl28,seatno);
							if (lbl28.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl29.disable();
								lbl30.disable();
			
								
								
							}
						}
					}
				});
                lbl29.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl29 && seatno!="29") {
							txtbill.setText(" ");
							seatno = "29";
							txtbill.append(seatno);
							lbl29.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl29,seatno);
							if (lbl29.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl30.disable();
				
								
								
							}
						}
					}
				});
                lbl30.addMouseListener(new MouseAdapter() {
    				
				public void mouseClicked(java.awt.event.MouseEvent e) {
						if (e.getSource()==lbl30 && seatno!="30") {
							txtbill.setText(" ");
							seatno = "30";
							txtbill.append(seatno);
							lbl30.setBackground(Color.BLUE);
							JOptionPane.showMessageDialog(lbl30,seatno);
							if (lbl30.getBackground()==Color.BLUE) {
								
								lbl1.disable();
								lbl2.disable();
								lbl3.disable();
								lbl4.disable();
								lbl5.disable();
								lbl6.disable();
								lbl8.disable();
								lbl9.disable();
								lbl7.disable();
								lbl10.disable();
								lbl11.disable();
								lbl12.disable();
								lbl13.disable();
								lbl14.disable();
								lbl15.disable();
								lbl16.disable();
								lbl17.disable();
								lbl18.disable();
								lbl19.disable();
								lbl20.disable();
								lbl21.disable();
								lbl22.disable();
								lbl23.disable();
								lbl24.disable();
								lbl25.disable();
								lbl26.disable();
								lbl27.disable();
								lbl28.disable();
								lbl29.disable();
			
								
								
							}
						}
					}
				});
		
	}

}