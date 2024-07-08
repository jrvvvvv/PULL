/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtableexamples;

/**
 *
 * @author JRV
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTableExamples {

    /**
     * @param args the command line arguments
     */
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    JTableExamples()
    {
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE","sadasd " },
            { "Anand Jha", "6014", "IT","dasdas " }
        };
 
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department","ddasdsadas" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new JTableExamples();
    }
    
}
