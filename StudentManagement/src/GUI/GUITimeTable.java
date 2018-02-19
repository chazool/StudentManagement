/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Mannager.ComboBox;
import Mannager.Save;
import Mannager.TextBox;
import java.awt.Color;

/**
 *
 * @author Chazool
 */
public class GUITimeTable extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUITimeTable() {
        initComponents();
        comboclassplace.setModel(ComboBox.SetClassPlace());
        setshedule();
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
        jLayeredPane5 = new javax.swing.JLayeredPane();
        comboDate = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ComboClassType = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        comboclassplace = new javax.swing.JComboBox();
        SpinnerEndTimeH = new javax.swing.JSpinner();
        SpinnerStartTimeH = new javax.swing.JSpinner();
        SpinnerStartTimeM = new javax.swing.JSpinner();
        SpinnerEndTimeM = new javax.swing.JSpinner();
        ComboBatch = new javax.swing.JComboBox();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtmonday = new javax.swing.JTextPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txttuesday = new javax.swing.JTextPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtwednseday = new javax.swing.JTextPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtthursday = new javax.swing.JTextPane();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtfriday = new javax.swing.JTextPane();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtsaturday = new javax.swing.JTextPane();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtsunday = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managment");

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New Event", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        comboDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To");

        ComboClassType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboClassType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Theory", "Revision", "Paper" }));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setText("Add");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        comboclassplace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboclassplace.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboclassplaceItemStateChanged(evt);
            }
        });

        SpinnerEndTimeH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerEndTimeH.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00"}));

        SpinnerStartTimeH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerStartTimeH.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00"}));

        SpinnerStartTimeM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerStartTimeM.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        SpinnerEndTimeM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerEndTimeM.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        ComboBatch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboBatch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(comboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpinnerStartTimeH, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(SpinnerEndTimeH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpinnerStartTimeM, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(SpinnerEndTimeM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 124, Short.MAX_VALUE))))
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ComboBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboClassType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(comboclassplace, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addComponent(comboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerEndTimeH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerEndTimeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerStartTimeH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerStartTimeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(comboclassplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboClassType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane5.setLayer(comboDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ComboClassType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(comboclassplace, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(SpinnerEndTimeH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(SpinnerStartTimeH, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(SpinnerStartTimeM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(SpinnerEndTimeM, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ComboBatch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Monday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtmonday.setEditable(false);
        txtmonday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txtmonday);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jLayeredPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tuesday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txttuesday.setEditable(false);
        txttuesday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(txttuesday);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Wednesday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtwednseday.setEditable(false);
        txtwednseday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane10.setViewportView(txtwednseday);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );
        jLayeredPane3.setLayer(jScrollPane10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thursday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtthursday.setEditable(false);
        txtthursday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane11.setViewportView(txtthursday);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane6.setLayer(jScrollPane11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Friday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtfriday.setEditable(false);
        txtfriday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane12.setViewportView(txtfriday);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane7.setLayer(jScrollPane12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Saturday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtsaturday.setEditable(false);
        txtsaturday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane13.setViewportView(txtsaturday);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane8.setLayer(jScrollPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sunday", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtsunday.setEditable(false);
        txtsunday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane14.setViewportView(txtsunday);

        javax.swing.GroupLayout jLayeredPane9Layout = new javax.swing.GroupLayout(jLayeredPane9);
        jLayeredPane9.setLayout(jLayeredPane9Layout);
        jLayeredPane9Layout.setHorizontalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        jLayeredPane9Layout.setVerticalGroup(
            jLayeredPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jLayeredPane9.setLayer(jScrollPane14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout leyerDisigngLayout = new javax.swing.GroupLayout(leyerDisigng);
        leyerDisigng.setLayout(leyerDisigngLayout);
        leyerDisigngLayout.setHorizontalGroup(
            leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leyerDisigngLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leyerDisigngLayout.createSequentialGroup()
                        .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leyerDisigngLayout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        leyerDisigngLayout.setVerticalGroup(
            leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leyerDisigngLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leyerDisigngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane6)
                    .addComponent(jLayeredPane8)
                    .addComponent(jLayeredPane7)
                    .addComponent(jLayeredPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        leyerDisigng.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        leyerDisigng.setLayer(jLayeredPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private boolean Check() {

        Boolean bool = true;

        if (comboDate.getSelectedItem().equals(" ")) {
            comboDate.setBackground(Color.red);
            bool = false;
        } else {
            comboDate.setBackground(getBackground());
        }

        if (comboclassplace.getSelectedItem().equals(" ")) {
            comboclassplace.setBackground(Color.red);
            bool = false;
        } else {
            comboclassplace.setBackground(getBackground());

        }

        if (ComboClassType.getSelectedItem().equals(" ")) {
            ComboClassType.setBackground(Color.red);
            bool = false;
        } else {
            ComboClassType.setBackground(getBackground());
        }
        if (ComboBatch.getSelectedItem().equals(" ")) {
            ComboBatch.setBackground(Color.red);
            bool = false;
        } else {
            ComboBatch.setBackground(getBackground());
        }

        int x = Integer.parseInt(SpinnerStartTimeH.getValue() + "");
        int y = Integer.parseInt(SpinnerEndTimeH.getValue() + "");

        if (x >= y) {
            bool = false;
            jLabel2.setForeground(Color.red);
        }

        return bool;
    }

    private void Save() {
        if (Check()) {
            boolean bool = Save.TimeTable(comboDate.getSelectedItem().toString().trim(),
                    SpinnerStartTimeH.getValue() + ":" + SpinnerStartTimeM.getValue(),
                    SpinnerEndTimeH.getValue() + ":" + SpinnerEndTimeM.getValue(),
                    comboclassplace.getSelectedItem().toString().trim(),
                    ComboBatch.getSelectedItem().toString().trim(),
                    ComboClassType.getSelectedItem().toString().trim());

            if (bool) {
                comboDate.setSelectedItem(" ");
                SpinnerStartTimeH.setValue("01");
                SpinnerStartTimeM.setValue("00");
                SpinnerEndTimeH.setValue("01");
                SpinnerEndTimeM.setValue("00");
                comboclassplace.setSelectedItem(" ");
                ComboBatch.setSelectedItem(" ");
                ComboClassType.setSelectedItem(" ");

                setshedule();
            }
        }

    }

    private void setshedule() {
        String array[] = TextBox.ShowTimeTable();
        txtmonday.setText(array[0]);
        txttuesday.setText(array[1]);
        txtwednseday.setText(array[2]);
        txtthursday.setText(array[3]);
        txtfriday.setText(array[4]);
        txtsaturday.setText(array[5]);
        txtsunday.setText(array[6]);

    }


    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Save();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void comboclassplaceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboclassplaceItemStateChanged
        ComboBatch.setModel(ComboBox.SetBatchyear(comboclassplace.getSelectedItem().toString()));
    }//GEN-LAST:event_comboclassplaceItemStateChanged

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
            java.util.logging.Logger.getLogger(GUITimeTable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITimeTable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITimeTable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITimeTable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUITimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBatch;
    private javax.swing.JComboBox ComboClassType;
    private javax.swing.JSpinner SpinnerEndTimeH;
    private javax.swing.JSpinner SpinnerEndTimeM;
    private javax.swing.JSpinner SpinnerStartTimeH;
    private javax.swing.JSpinner SpinnerStartTimeM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboDate;
    private javax.swing.JComboBox comboclassplace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLayeredPane leyerBackground;
    private javax.swing.JLayeredPane leyerDisigng;
    private javax.swing.JTextPane txtfriday;
    private javax.swing.JTextPane txtmonday;
    private javax.swing.JTextPane txtsaturday;
    private javax.swing.JTextPane txtsunday;
    private javax.swing.JTextPane txtthursday;
    private javax.swing.JTextPane txttuesday;
    private javax.swing.JTextPane txtwednseday;
    // End of variables declaration//GEN-END:variables
}