/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonleaf1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author lenovo
 */
public class Sales extends javax.swing.JFrame {
    Connection  conn= Moonleaf1.ConnecrDb();
    OraclePreparedStatement pst= null ;
    OracleResultSet rs= null; 

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
        
          Toolkit  toolkit= getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size .height/2 - getHeight()/2);
        
        
        
       conn=Moonleaf1.ConnecrDb();
       try{
           String st4="SELECT DATEORDERED,PROD,SIZEE,PRICEORDER FROM ORDERED WHERE PROD IS NOT NULL";
             pst=(OraclePreparedStatement) conn.prepareStatement(st4);
          rs=(OracleResultSet) pst.executeQuery();         
          sales.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           
       }
       sales.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MONTH = new javax.swing.JComboBox<>();
        DAY = new javax.swing.JComboBox<>();
        YEAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sales = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        countsales = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalsales = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabelClose4 = new javax.swing.JLabel();
        JLabelMin4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Sales");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel2.setText("Month:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel3.setText("Day:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel4.setText("Year:");

        MONTH.setFont(new java.awt.Font("Ink Free", 1, 11)); // NOI18N
        MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC", " " }));

        DAY.setFont(new java.awt.Font("Ink Free", 1, 11)); // NOI18N
        DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        YEAR.setFont(new java.awt.Font("Ink Free", 1, 11)); // NOI18N
        YEAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));

        sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT", "SIZE", "PRICE", "ADDONS", "PRICEADDONS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sales);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL:");

        countsales.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        show.setBackground(new java.awt.Color(0, 0, 0));
        show.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("Show");
        show.setBorder(null);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 0, 0));
        reset.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL SALES:");

        totalsales.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 204, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 204, 0));

        jLabelClose4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelClose4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose4.setText("X");
        jLabelClose4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose4MouseClicked(evt);
            }
        });

        JLabelMin4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelMin4.setForeground(new java.awt.Color(255, 255, 255));
        JLabelMin4.setText("_");
        JLabelMin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelMin4MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sales Form");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelMin4)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClose4)
                            .addComponent(JLabelMin4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(countsales, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(totalsales))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(reset))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(countsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(totalsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit)
                        .addComponent(show))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        conn=Moonleaf1.ConnecrDb();
        
         DefaultTableModel model = (DefaultTableModel) sales.getModel();
        String monnth,daay,yeaar,exe;
        monnth=(String)MONTH.getSelectedItem();
        daay=(String)DAY.getSelectedItem();
        yeaar=YEAR.getText();
        exe=daay+"-"+monnth+"-"+yeaar;
        
        
       
        
        
        
         try{
            Statement st= conn.createStatement();
            String st1,st2,st3,st4,st5;
            st3="ALTER TABLE ORDERED MODIFY DATEORDERED TIMESTAMP";
            st2="ALTER TABLE ORDERED MODIFY DATEORDERED DATE";
            st4="SELECT * FROM ORDERED";
            st1="SELECT DATEORDERED,PROD,SIZEE,PRICEORDER FROM ORDERED where trunc(DATEORDERED)=to_date('"+exe+"','dd-MON-yy') and prod IS NOT NULL";
            st5="SELECT COUNT(*) FROM ORDERED WHERE trunc(DATEORDER)=to_date('"+exe+"','dd-MON-yy')";
            
          pst=(OraclePreparedStatement) conn.prepareStatement(st1);
          rs=(OracleResultSet) pst.executeQuery();         
          sales.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
         }
         
         try{
             Statement sql=conn.createStatement();
             String st="SELECT COUNT(PROD) FROM ORDERED WHERE trunc(DATEORDERED)=to_date('"+exe+"','dd-MON-yy')";
              pst=(OraclePreparedStatement) conn.prepareStatement(st);
          rs=(OracleResultSet) pst.executeQuery(); 
          
          while(rs.next()){
              countsales.setText(Integer.toString(rs.getInt(1)));
          }
             
               
         }
             catch(Exception e){
                 
             }
       
         try{
          String st="SELECT SUM(PRICEORDER) FROM ORDERED WHERE trunc(DATEORDERED)=to_date('"+exe+"','dd-MON-yy')";  
          pst=(OraclePreparedStatement) conn.prepareStatement(st);
          rs=(OracleResultSet) pst.executeQuery(); 
          
          while(rs.next()){
              
             String add=rs.getString("SUM(PRICEORDER)");
              
              totalsales.setText(add);
          }
         }
         catch(Exception e){
             
         }
    }//GEN-LAST:event_showActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        conn=Moonleaf1.ConnecrDb();
        
        try{
            Statement st=conn.createStatement(); 
            String st1="DELETE *FROM ORDERED";
            st.executeUpdate(st1);
            
            conn.close();
        }
        catch (Exception e) {
       
        }
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
          frame1 user=new frame1();
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void jLabelClose4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose4MouseClicked
        // Close
        System.exit(0);
    }//GEN-LAST:event_jLabelClose4MouseClicked

    private void JLabelMin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelMin4MouseClicked
        // TODO add your handling code here

        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_JLabelMin4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DAY;
    private javax.swing.JLabel JLabelMin4;
    private javax.swing.JComboBox<String> MONTH;
    private javax.swing.JTextField YEAR;
    private javax.swing.JTextField countsales;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JTable sales;
    private javax.swing.JButton show;
    private javax.swing.JTextField totalsales;
    // End of variables declaration//GEN-END:variables
}
