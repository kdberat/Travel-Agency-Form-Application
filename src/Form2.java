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


public class Form2 extends JFrame {

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
    
    public Form2() {
        
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
        String[] rows = {"Depature 	Time","Arriving Time","Company","Model","Time", "Stop Over", "Seats","Seat Order"};
        String[][] cols = new String[Form1.inv.getBusses().size()+1][8];
        
        int i = 0,taken = 0,free = 0;
        LocalDate form1Date = Form1.selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (Bus bus : Form1.inv.getBusses()) {    
            LocalDate busDate = bus.getDepatureTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            System.out.println(form1Date + " " + busDate);
        	if((bus.getRoute().getCities().get(0).getCityName() == Form1.selectedRoute.getCities().get(0).getCityName())&& (bus.getRoute().getCities().get(bus.getRoute().getCities().size()-1).getCityName() == Form1.selectedRoute.getCities().get(1).getCityName())
        		&&	(form1Date.isEqual(busDate))) {
            	cols[i][0] = bus.getDepatureTime().toString();
            	cols[i][1] = bus.getArrivingTime().toString();
            	cols[i][2] = bus.getCompany();
            	cols[i][3] = bus.getModel();
            	cols[i][4] = "" + bus.getRoute().calculateTime(bus);
            	if(bus.isStopOver()) cols[i][5] = "Yes";
            	else cols[i][5] = "No";
            	for (int j = 0; j < bus.getSeatAmount(); j++) {
    				if(bus.getSeats()[j])taken++;
    				else free++;
    			}
            	cols[i][6] = taken+"/"+bus.getSeatAmount();
            	cols[i][7] = bus.getSeatOrder();
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
                    	for (Bus bus : Form1.inv.getBusses()) {
							if(bus.getModel() == table.getValueAt(selectedRow,3))
								selectedBusIndex = Form1.inv.getBusses().indexOf(bus);
						}
                    	if("2+2" == table.getValueAt(selectedRow,7)) {
                            try {
                            	Form3a frame2 = new Form3a();
                                frame2.setVisible(true);
                                setVisible(false); 
                                dispose();
                            } catch (Exception a) {
                                a.printStackTrace();
                            }
                    	}
                    	else {
                          try {
                        	Form3b frame3 = new Form3b();
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
