/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moonleaf1;

import java.sql.Connection;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author lenovo
 */
public class accounts extends javax.swing.JFrame {
     Connection  conn= Moonleaf1.ConnecrDb();
    OraclePreparedStatement pst= null ;
    OracleResultSet rs= null; 


    /** Creates new form accounts */
    public accounts() {
        initComponents();
        
        
         conn=Moonleaf1.ConnecrDb();
        try{
           String st4="SELECT FIRSTNAME,LASTNAME,USERNAME,PASSWORD,AUTHORIZATION FROM OPERATOR";
             pst=(OraclePreparedStatement) conn.prepareStatement(st4);
          rs=(OracleResultSet) pst.executeQuery();         
          account.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           
       }
        
        
        try{
            
        String sql="Select * from OPERATOR";
          pst=(OraclePreparedStatement) conn.prepareStatement(sql);
        rs=(OracleResultSet) pst.executeQuery(); 
       while(rs.next()){
           acclist.addItem(rs.getString("LASTNAME"));
       }
        }
        catch(Exception e){
            
        }
       acclist.setVisible(false); 
       account.setEnabled(false);
       save.setEnabled(false);
       save.setVisible(false);
       change.setVisible(false);
       remove.setVisible(false);
       
       
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        account = new javax.swing.JTable();
        register = new javax.swing.JButton();
        giveautho = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        acclist = new javax.swing.JComboBox<>();
        change = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 204, 0), null));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moonleaf1/moonleaflogo (Custom) (Custom).jpg"))); // NOI18N
        jLabel1.setText("Accounts");

        account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(account);

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        register.setForeground(new java.awt.Color(153, 204, 0));
        register.setText("New Employee");
        register.setAlignmentY(0.0F);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        giveautho.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        giveautho.setForeground(new java.awt.Color(153, 204, 0));
        giveautho.setText("Authorization");
        giveautho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveauthoActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 204, 0));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        save.setForeground(new java.awt.Color(153, 204, 0));
        save.setText("save");
        save.setToolTipText("");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        acclist.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        change.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        change.setForeground(new java.awt.Color(153, 204, 0));
        change.setText("change");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        remove.setForeground(new java.awt.Color(153, 204, 0));
        remove.setText("remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acclist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(change)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remove)
                        .addGap(12, 12, 12)
                        .addComponent(save))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(register)
                        .addGap(18, 18, 18)
                        .addComponent(giveautho)))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(acclist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change)
                    .addComponent(remove))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveautho)
                    .addComponent(register)
                    .addComponent(exit))
                .addContainerGap(46, Short.MAX_VALUE))
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

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        register user=new register();
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        frame1 user=new frame1();
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void giveauthoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveauthoActionPerformed
        // TODO add your handling code here:
       
        save.setEnabled(true);
        save.setVisible(true);
        change.setVisible(true);
        acclist.setVisible(true);
        remove.setVisible(true);
    }//GEN-LAST:event_giveauthoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         conn=Moonleaf1.ConnecrDb();
        
         save.setEnabled(false);
        save.setVisible(false);
       change.setVisible(false);
       acclist.setVisible(false);
       remove.setVisible(false);
           conn=Moonleaf1.ConnecrDb();
               
        try{
           String st4="SELECT FIRSTNAME,LASTNAME,USERNAME,PASSWORD,AUTHORIZATION FROM OPERATOR";
             pst=(OraclePreparedStatement) conn.prepareStatement(st4);
          rs=(OracleResultSet) pst.executeQuery();         
          account.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           
       }

    }//GEN-LAST:event_saveActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        conn=Moonleaf1.ConnecrDb();
        
        String al=(String) acclist.getSelectedItem();
        
          try{
            String sql="UPDATE OPERATOR SET AUTHORIZATION='YES' WHERE LASTNAME='"+al+"'";
             pst=(OraclePreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             
              
        
        }
            catch(Exception e){
                
            }
          
           try{
           String st4="SELECT FIRSTNAME,LASTNAME,USERNAME,PASSWORD,AUTHORIZATION FROM OPERATOR";
             pst=(OraclePreparedStatement) conn.prepareStatement(st4);
          rs=(OracleResultSet) pst.executeQuery();         
          account.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_changeActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        conn=Moonleaf1.ConnecrDb();
        
           String al=(String) acclist.getSelectedItem();
        
          try{
            String sql="UPDATE OPERATOR SET AUTHORIZATION='NO' WHERE LASTNAME='"+al+"'";
             pst=(OraclePreparedStatement) conn.prepareStatement(sql);
             pst.execute();
             
              
        
        }
            catch(Exception e){
                
            }
          
           try{
           String st4="SELECT FIRSTNAME,LASTNAME,USERNAME,PASSWORD,AUTHORIZATION FROM OPERATOR";
             pst=(OraclePreparedStatement) conn.prepareStatement(st4);
          rs=(OracleResultSet) pst.executeQuery();         
          account.setModel(DbUtils.resultSetToTableModel(rs));
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acclist;
    private javax.swing.JTable account;
    private javax.swing.JButton change;
    private javax.swing.JButton exit;
    private javax.swing.JButton giveautho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton register;
    private javax.swing.JButton remove;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}
