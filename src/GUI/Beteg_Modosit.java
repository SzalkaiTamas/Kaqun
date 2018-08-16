/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Beteg_Adat;
import Managers.Beteg_Adat_Manager;
import Managers.Manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author T-Dog
 */
public class Beteg_Modosit extends javax.swing.JFrame {

    /**
     * Creates new form Beteg_Modosit
     */
    public Beteg_Modosit() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelKeres = new javax.swing.JLabel();
        jTextFieldKeres = new javax.swing.JTextField();
        jButtonKeres = new javax.swing.JButton();
        jButtonModosit = new javax.swing.JButton();
        jButtonTorol = new javax.swing.JButton();
        jButtonUj = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Beteg keresés/módositás/törlés"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        populateTable(Beteg_Adat_Manager.listAll());
        jScrollPane1.setViewportView(jTable1);

        jLabelKeres.setText("Keresés: ");

        jTextFieldKeres.setText("kereses");

        jButtonKeres.setText("Keresés");
        jButtonKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeresActionPerformed(evt);
            }
        });

        jButtonModosit.setText("Módositás");
        jButtonModosit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModositActionPerformed(evt);
            }
        });

        jButtonTorol.setText("Törlés");
        jButtonTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTorolActionPerformed(evt);
            }
        });

        jButtonUj.setText("Új");
        jButtonUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUjActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelKeres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonKeres))
                    .addComponent(jButtonUj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonModosit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTorol)))
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButtonUj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKeres)
                    .addComponent(jTextFieldKeres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKeres))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModosit)
                    .addComponent(jButtonTorol))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUjActionPerformed
        Beteg_Felvetel betegFelvetel = new Beteg_Felvetel();
        betegFelvetel.setVisible(true);
        betegFelvetel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_jButtonUjActionPerformed

    private void jButtonKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeresActionPerformed
       String nev = jTextFieldKeres.getText();
       List<Beteg_Adat> beteg_Adatok = Beteg_Adat_Manager.ListByName(nev);
       populateTable(beteg_Adatok);
    }//GEN-LAST:event_jButtonKeresActionPerformed

    private void jButtonModositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModositActionPerformed
       int[] rowIndex = jTable1.getSelectedRows();
        if (rowIndex.length == 0) {
            JOptionPane.showMessageDialog(Beteg_Modosit.this, "Nincs sor kiválasztva!", "Hiba!", JOptionPane.WARNING_MESSAGE);
        }else{
            Integer id = (Integer)jTable1.getValueAt(rowIndex[0], 5);
            Kezelesek kezelesek = new Kezelesek(id);
            kezelesek.setVisible(true);
            kezelesek.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           
        }
    }//GEN-LAST:event_jButtonModositActionPerformed

    private void jButtonTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTorolActionPerformed
        int[] rowindex = jTable1.getSelectedRows();
        if (rowindex.length == 0) {
            JOptionPane.showMessageDialog(Beteg_Modosit.this, "Nincs sor kiválasztva!", "Hiba!", JOptionPane.WARNING_MESSAGE );
        }else{
            List<Integer> Ids = new ArrayList<>();
            for (int i : rowindex) {
                Ids.add((Integer) jTable1.getValueAt(i, 0));
               
            }
            Beteg_Adat_Manager.delete(Ids);
            populateTable(Beteg_Adat_Manager.listAll());
        }
        
    }//GEN-LAST:event_jButtonTorolActionPerformed

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
            java.util.logging.Logger.getLogger(Beteg_Modosit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beteg_Modosit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beteg_Modosit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beteg_Modosit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beteg_Modosit().setVisible(true);
            }
        });
        
        
    }
    
    
    private void populateTable(List<Beteg_Adat> beteg_Adatok){
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Id");
        tableHeaders.add("Név");
        tableHeaders.add("Születési Dátum");
        tableHeaders.add("Email");
        tableHeaders.add("Lakcim");
        tableHeaders.add("Nem");

        

        Vector tableData = new Vector();
        for (Beteg_Adat beteg_Adat : beteg_Adatok) {
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(beteg_Adat.getId());
            oneRow.add(beteg_Adat.getNev());
            oneRow.add(beteg_Adat.getSzul_date());
            oneRow.add(beteg_Adat.getLakcim());
            oneRow.add(beteg_Adat.getNem());
            oneRow.add(beteg_Adat.getEmail());
            tableData.add(oneRow);
        }

        jTable1.setModel(new DefaultTableModel(tableData, tableHeaders));
        TableColumn id = jTable1.getColumn("Id");
        id.setMaxWidth(0);
        id.setMinWidth(0);
        id.setPreferredWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonKeres;
    private javax.swing.JButton jButtonModosit;
    private javax.swing.JButton jButtonTorol;
    private javax.swing.JButton jButtonUj;
    private javax.swing.JLabel jLabelKeres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldKeres;
    // End of variables declaration//GEN-END:variables
}