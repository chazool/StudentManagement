/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Bean.Student;
import DAO.SelectStudentName;
import Mannager.Check;
import Mannager.Table;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chazool
 */
public class GUISearch extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUISearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        leyerBackground = new javax.swing.JLayeredPane();
        leyerDisigng = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        butS = new javax.swing.JToggleButton();
        Combosearchtype = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        txtMsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managment");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "First Name", "Middle Name", "Last Name", "NIC", "DOB", "Gender", "Phone Home", "Phone Mobile", "email", "image"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        butS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        butS.setText("Search");
        butS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSActionPerformed(evt);
            }
        });

        Combosearchtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Combosearchtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Index", "Name", "Badge", "Class Place" }));
        Combosearchtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombosearchtypeActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Combosearchtype, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(Combosearchtype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(butS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Combosearchtype, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtMsg.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMsg.setForeground(new java.awt.Color(255, 0, 0));
        txtMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout leyerDisigngLayout = new javax.swing.GroupLayout(leyerDisigng);
        leyerDisigng.setLayout(leyerDisigngLayout);
        leyerDisigngLayout.setHorizontalGroup(
            leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leyerDisigngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(leyerDisigngLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leyerDisigngLayout.setVerticalGroup(
            leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leyerDisigngLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        leyerDisigng.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(txtMsg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        leyerBackground.add(leyerDisigng);
        leyerDisigng.setBounds(0, 0, 1100, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/BG Image.jpg"))); // NOI18N
        leyerBackground.add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 630);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leyerBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leyerBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1120, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public static String Massage;
    private void search() {

        table1.setModel(Table.SelectTimeTable(txtSearch.getText(), Combosearchtype.getSelectedItem().toString().trim()));
        txtMsg.setText(Massage);
    }

    public boolean checkselect() {

        boolean bool = false;
        String msg = "";
        if (Combosearchtype.getSelectedItem() == " ") {

            Combosearchtype.setBackground(Color.red);
            if (txtSearch.getText().length() == 0) {
                txtSearch.setBackground(Color.red);
                msg = "Please Enter the Search Value and Select Search Item  ";

            } else {
                msg = "Please Select Search Item ";
                txtSearch.setBackground(getBackground());
            }
        } else {
            if (txtSearch.getText().length() == 0) {
                msg = "Please Enter the Search Value ";
                Combosearchtype.setBackground(getBackground());
                txtSearch.setBackground(Color.red);

            } else {
                Combosearchtype.setBackground(getBackground());
                txtSearch.setBackground(getBackground());
                bool = true;
            }

        }
        //  lblmsg.setText(msg);
        return bool;
    }

    private void butSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSActionPerformed
        search();


    }//GEN-LAST:event_butSActionPerformed

    private void CombosearchtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombosearchtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombosearchtypeActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

        char c = evt.getKeyChar();
        if ((evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();  // ignore event
        }

    }//GEN-LAST:event_txtSearchKeyTyped

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
            java.util.logging.Logger.getLogger(GUISearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combosearchtype;
    private javax.swing.JToggleButton butS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLayeredPane leyerBackground;
    private javax.swing.JLayeredPane leyerDisigng;
    private javax.swing.JTable table1;
    private javax.swing.JLabel txtMsg;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}