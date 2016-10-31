/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvqzao.secondorder;

import burp.IBurpExtenderCallbacks;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTable;

/**
 *
 * @author nme
 */
public class SecondOrderOptions extends javax.swing.JPanel {

    /**
     * Creates new form SecondOrderOptionsPane
     */
    public SecondOrderOptions() {
        initComponents();
    }

    public SecondOrderOptions(IBurpExtenderCallbacks callbacks) {
        initComponents();
        callbacks.customizeUiComponent(removeRule);
        callbacks.customizeUiComponent(clearRules);
        callbacks.customizeUiComponent(ruleTableSplitPane);
    }    

    public JButton getOptionsDefaults() {
        return optionsDefaults;
    }

    public JButton getOptionsHelp() {
        return optionsHelp;
    }

    public JTable getRuleTable() {
        return ruleTable;
    }

    public JSplitPane getRuleTableSplitPane() {
        return ruleTableSplitPane;
    }

    public JButton getRemoveRule() {
        return removeRule;
    }

    public JButton getClearRules() {
        return clearRules;
    }

    public JLabel getState() {
        return state;
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
        optionsHelp = new javax.swing.JButton();
        optionsDefaults = new javax.swing.JButton();
        optionsRewriteTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        removeRule = new javax.swing.JButton();
        clearRules = new javax.swing.JButton();
        ruleTableSplitPane = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ruleTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scanner = new javax.swing.JCheckBox();
        intruder = new javax.swing.JCheckBox();
        extender = new javax.swing.JCheckBox();
        state = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        optionsHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        optionsHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        optionsHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        optionsHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        optionsDefaults.setMargin(new java.awt.Insets(0, 0, 0, 0));
        optionsDefaults.setMaximumSize(new java.awt.Dimension(24, 24));
        optionsDefaults.setMinimumSize(new java.awt.Dimension(24, 24));
        optionsDefaults.setPreferredSize(new java.awt.Dimension(24, 24));

        optionsRewriteTitle.setText("<html><b style='color:#e58900;font-size:10px'>Second Order</b></html>");
        optionsRewriteTitle.setToolTipText("");

        jLabel1.setText("<html>The purpose of this extension is to allow semi-automated detection of second order issues.</html>");

        removeRule.setText("Remove");

        clearRules.setText("Clear");

        ruleTableSplitPane.setDividerLocation(450);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        ruleTableSplitPane.setRightComponent(jPanel3);

        ruleTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ruleTable);

        ruleTableSplitPane.setLeftComponent(jScrollPane1);

        jLabel2.setText("Extension state:");

        jLabel4.setText("Tools in scope:");

        scanner.setSelected(true);
        scanner.setText("Scanner");

        intruder.setSelected(true);
        intruder.setText("Intruder");

        extender.setSelected(true);
        extender.setText("Extender");

        state.setText("<html><i style='color:#e58900'>Inactive</i></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(optionsHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionsRewriteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(optionsDefaults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearRules, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeRule, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruleTableSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(scanner)
                        .addGap(6, 6, 6)
                        .addComponent(intruder)
                        .addGap(8, 8, 8)
                        .addComponent(extender)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(optionsHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsDefaults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(optionsRewriteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(removeRule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearRules))
                            .addComponent(ruleTableSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scanner)
                    .addComponent(intruder)
                    .addComponent(extender)
                    .addComponent(jLabel2)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearRules;
    private javax.swing.JCheckBox extender;
    private javax.swing.JCheckBox intruder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton optionsDefaults;
    private javax.swing.JButton optionsHelp;
    private javax.swing.JLabel optionsRewriteTitle;
    private javax.swing.JButton removeRule;
    private javax.swing.JTable ruleTable;
    private javax.swing.JSplitPane ruleTableSplitPane;
    private javax.swing.JCheckBox scanner;
    private javax.swing.JLabel state;
    // End of variables declaration//GEN-END:variables
}
