import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;


public class Form2b extends JFrame {

    public JPanel contentPane;
    JTable table;
    DefaultTableModel dtm;
	
    /**
     * Launch the application.
     */
    
    public static int selectedBusIndex;
    
    public static void main(String[] args) {    
 
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Form2 frame = new Form2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Form2b() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 962, 762);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        table = new JTable() {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {                
                    return false;               
            };
        };

        table.setBounds(63, 42, 430, 541);    
        String[] rows = {"Depature 	Time","Arriving Time","Company","Model","Time", "Mal Senih", "Seats","Seat Order"};
        String[][] cols = new String[Form1.inv.getBusses().size()+1][8];
        
        int i = 0,taken = 0,free = 0;
        LocalDate form1Date = Form1.selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (Plane planes : Form1.inv.getPlanes()) {    
            LocalDate planesDate = planes.getDepatureTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            System.out.println(form1Date + " " + planesDate);
        	if((planes.getRoute().getCities().get(0).getCityName() == Form1.selectedRoute.getCities().get(0).getCityName())&& (planes.getRoute().getCities().get(planes.getRoute().getCities().size()-1).getCityName() == Form1.selectedRoute.getCities().get(1).getCityName())
        		&&	(form1Date.isEqual(planesDate))) {
            	cols[i][0] = planes.getDepatureTime().toString();
            	cols[i][1] = planes.getArrivingTime().toString();
            	cols[i][2] = planes.getCompany();
            	cols[i][3] = planes.getModel();
            	cols[i][4] = "" + planes.getRoute().calculateTime(planes);
            	for (int j = 0; j < planes.getSeatAmount(); j++) {
    				if(planes.getSeats()[j])taken++;
    				else free++;
    			}
            	cols[i][5] = taken+"/"+planes.getSeatAmount();
            	for (int j = 0; j < planes.getSeatAmount(); j++) {
    				if(planes.getVipSeats()[j])taken++;
    				else free++;
    			}
            	cols[i][6] = taken+"/"+planes.getVipCount();
            	cols[i][7] = planes.getSeatOrder();
                i++;   
        	}
        }

        dtm = new DefaultTableModel(cols,rows);
        table.setModel(dtm);
        contentPane.add(table);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(60, 50, 818, 613);
        contentPane.add(scrollPane);
        
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        ListSelectionModel model = table.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty()) {
                    int selectedRow = model.getMinSelectionIndex();
                    if(JOptionPane.showConfirmDialog(null, "Selected Row: " + selectedRow) == 0){
                    	for (Plane planes : Form1.inv.getPlanes()) {
							if(planes.getModel() == table.getValueAt(selectedRow,3))
								selectedBusIndex = Form1.inv.getBusses().indexOf(planes);
						}
                    	if(table.getValueAt(selectedRow,6)=="eco" ) {
                            try {
                            	Form4 frame2 = new Form4();
                                frame2.setVisible(true);
                                setVisible(false); 
                                dispose();
                            } catch (Exception a) {
                                a.printStackTrace();
                            }
                    	}
                    	else {
                          try {
                        	Form4 frame3 = new Form4();
                            frame3.setVisible(true);
                            setVisible(false); 
                            dispose();
                        } catch (Exception b) {
                            b.printStackTrace();
                        }
                    	}

                    }

                }
            }
        });
    }
}
