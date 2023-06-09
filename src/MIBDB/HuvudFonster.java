/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIBDB;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jpn
 */
public class HuvudFonster extends javax.swing.JFrame {

    private InfDB idb;
        
    /**
     * Creates new form huvudfonster
     */
    public HuvudFonster(InfDB idb) {
        initComponents();
        
        try{
        this.idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            System.out.println ("internt fel");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgent = new javax.swing.JButton();
        lblRubrikVisafornamn = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        btnAlien = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgent.setText("Logga in som Agent");
        btnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentActionPerformed(evt);
            }
        });

        lblRubrikVisafornamn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrikVisafornamn.setText("Välkommen till MiB!");

        lblNamn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblNamnAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnAlien.setText("Logga in som Alien");
        btnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlienActionPerformed(evt);
            }
        });

        btnAdmin.setText("Logga in som Adminstrinatör");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRubrikVisafornamn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgent)
                            .addComponent(btnAlien)
                            .addComponent(btnAdmin))
                        .addGap(18, 18, 18)
                        .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRubrikVisafornamn)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgent)
                    .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmin)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentActionPerformed
//Öppnar nytt fönster för agent
AgentWindow agentWindow = new AgentWindow();
agentWindow.setVisible(true);
    }//GEN-LAST:event_btnAgentActionPerformed

    private void lblNamnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblNamnAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNamnAncestorAdded

    private void btnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlienActionPerformed
         // Öppnar nytt fönster för Alien
    AlienWindow alienWindow = new AlienWindow();
    alienWindow.setVisible(true);
    }//GEN-LAST:event_btnAlienActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // Öppnar nytt fönster för admin
        AdminWindow adminWindow = new AdminWindow();
        adminWindow.setVisible(true);
        
    }//GEN-LAST:event_btnAdminActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAgent;
    private javax.swing.JButton btnAlien;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrikVisafornamn;
    // End of variables declaration//GEN-END:variables
}