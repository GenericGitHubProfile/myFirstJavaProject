package box;


import javax.swing.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author up863207
 */
public class FlexBoxGUI extends JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FlexBoxGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        widthText = new javax.swing.JTextField();
        lengthText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        gradeCombo = new javax.swing.JComboBox<>();
        sealableCheck = new javax.swing.JCheckBox();
        reinfBotCheck = new javax.swing.JCheckBox();
        reinfCorCheck = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        noColoursCombo = new javax.swing.JComboBox<>();
        addBoxButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        colour1Combo = new javax.swing.JComboBox<>();
        colour2Combo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("Width");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setText("Height");

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setText("Length");

        widthText.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        widthText.setMinimumSize(new java.awt.Dimension(43, 18));
        widthText.setPreferredSize(new java.awt.Dimension(80, 24));
        widthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextActionPerformed(evt);
            }
        });

        lengthText.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lengthText.setPreferredSize(new java.awt.Dimension(80, 24));
        lengthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("Grade");

        heightText.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        heightText.setPreferredSize(new java.awt.Dimension(80, 24));
        heightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextActionPerformed(evt);
            }
        });

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        gradeCombo.setBorder(null);
        gradeCombo.setPreferredSize(new java.awt.Dimension(78, 24));
        gradeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gradeComboItemStateChanged(evt);
            }
        });
        gradeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeComboActionPerformed(evt);
            }
        });

        sealableCheck.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        sealableCheck.setText("Sealable top");
        sealableCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sealableCheck.setPreferredSize(new java.awt.Dimension(185, 24));

        reinfBotCheck.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        reinfBotCheck.setText("Reinforced Bottom");
        reinfBotCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reinfBotCheck.setPreferredSize(new java.awt.Dimension(145, 24));
        reinfBotCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinfBotCheckActionPerformed(evt);
            }
        });

        reinfCorCheck.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        reinfCorCheck.setText("Reinforced Corners");
        reinfCorCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reinfCorCheck.setPreferredSize(new java.awt.Dimension(145, 24));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setText("Colours");

        noColoursCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        noColoursCombo.setBorder(null);
        noColoursCombo.setPreferredSize(new java.awt.Dimension(78, 24));
        noColoursCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noColoursComboItemStateChanged(evt);
            }
        });
        noColoursCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noColoursComboActionPerformed(evt);
            }
        });

        addBoxButton.setText("Add Box");
        addBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setText("Colour 1");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setText("Colour 2");

        colour1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Green", "Blue", "Purple", "Pink", "White", "Black" }));
        colour1Combo.setBorder(null);
        colour1Combo.setPreferredSize(new java.awt.Dimension(78, 24));
        colour1Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour1ComboActionPerformed(evt);
            }
        });

        colour2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Green", "Blue", "Purple", "Pink", "White", "Black" }));
        colour2Combo.setBorder(null);
        colour2Combo.setPreferredSize(new java.awt.Dimension(78, 24));
        colour2Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour2ComboActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel10.setText("Quantity");

        quantityText.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        quantityText.setPreferredSize(new java.awt.Dimension(80, 24));
        quantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reinfBotCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reinfCorCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colour2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(colour1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sealableCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noColoursCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(widthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBoxButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 329, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(widthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(heightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(noColoursCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(colour1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(colour2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sealableCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reinfBotCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reinfCorCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBoxButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void widthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTextActionPerformed

    private void lengthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthTextActionPerformed

    private void heightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextActionPerformed

    private void gradeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeComboActionPerformed

    private void reinfBotCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinfBotCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinfBotCheckActionPerformed

    private void noColoursComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noColoursComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noColoursComboActionPerformed

    private void addBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoxButtonActionPerformed
        //Main Button code
        
        //Checks whether there is anything inside the typeable attributes.
        try{
            if(widthText.getText().equals("") || lengthText.getText().equals("") || heightText.getText().equals("") || quantityText.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Invalid Dimentions or amount");
                return;
            }
            double width = Double.valueOf((String)widthText.getText());
            double height = Double.valueOf((String)lengthText.getText());
            double length = Double.valueOf((String)heightText.getText());
            int quantity = Integer.parseInt((String)quantityText.getText());
            //Sets up local variables so we don't need to constantly type them
            //Message promting user to have logical dimentions of the Box.
            if(0.5 >= width || 0.5 >= height || 0.5 >= length || 10 <= width || 10 <= height || 10 <= length){
                JOptionPane.showMessageDialog(null, "Box dimentions must be between 0.5 and 10", "Invalid inputs", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Custom message for quantity
            else if(0 >= quantity){
                JOptionPane.showMessageDialog(null, "Must have at least one box", "Invalid inputs", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Until anything else is done, tells user that the values have successfully validated.
            else {
                JOptionPane.showConfirmDialog(null, "Do you wish to confirm this Box?");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "please enter a positive number", "Invalid Inputs", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_addBoxButtonActionPerformed

    private void gradeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gradeComboItemStateChanged
        //gets Grade from ComboBox, then checks the value
        int grade = 0;
        switch(grade = Integer.parseInt((String)gradeCombo.getSelectedItem())){
            case 1:
            //Grade 1 Boxes cannot have Colours or Reinforced Bottoms and Corners
            //The set index sets the colours comboBox to 0, preventing the user from editing colours when disallowed.
                noColoursCombo.setSelectedIndex(0);
                reinfBotCheck.setEnabled(false);
                reinfBotCheck.setSelected(false);
                reinfCorCheck.setEnabled(false);
                reinfCorCheck.setSelected(false);
                noColoursCombo.setEnabled(false);
                break;
            case 2:
            //Grade 2 Boxes can have colours, but cannot have Reinforced Corners.
                reinfBotCheck.setEnabled(true);
                reinfCorCheck.setEnabled(false);
                reinfCorCheck.setSelected(false);
                noColoursCombo.setEnabled(true);
                break;
            //Grade 3 and above can have all attributes, so simply allow editing for all the rest of the case clauses.
            case 3:
                reinfBotCheck.setEnabled(true);
                reinfCorCheck.setEnabled(true);
                noColoursCombo.setEnabled(true);
                break;
            case 4:
                reinfBotCheck.setEnabled(true);
                reinfCorCheck.setEnabled(true);
                noColoursCombo.setEnabled(true);
                break;
            case 5:
                reinfBotCheck.setEnabled(true);
                reinfCorCheck.setEnabled(true);
                noColoursCombo.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_gradeComboItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Sets default varibales and prevents editing of attributes that are incompatible with a Grade 1 box.
        reinfBotCheck.setEnabled(false);
        reinfCorCheck.setEnabled(false);
        noColoursCombo.setEnabled(false);
        colour1Combo.setEnabled(false);
        colour2Combo.setEnabled(false);
        widthText.setText("0.0");
        lengthText.setText("0.0");
        heightText.setText("0.0");
        quantityText.setText("0");
    }//GEN-LAST:event_formWindowOpened

    private void colour1ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour1ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colour1ComboActionPerformed

    private void colour2ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour2ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colour2ComboActionPerformed

    private void noColoursComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noColoursComboItemStateChanged
        //controls editing of colours.
        //gets noColours from noColours comboBox.
        int noColours = 0;
        switch(noColours = Integer.parseInt((String)noColoursCombo.getSelectedItem())){
            case 0:
                //0 colours means neither user cannot select any colours.
                colour1Combo.setEnabled(false);
                colour2Combo.setEnabled(false);
                break;
            case 1:
                //1 colour means user can only select a single colour.
                colour1Combo.setEnabled(true);
                colour2Combo.setEnabled(false);
                break;
            case 2:
                //2 colours means suer can select 2 colours.
                colour1Combo.setEnabled(true);
                colour2Combo.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_noColoursComboItemStateChanged

    private void quantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextActionPerformed

    /**
     * @param args the command line arguments
     */

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoxButton;
    private javax.swing.JComboBox<String> colour1Combo;
    private javax.swing.JComboBox<String> colour2Combo;
    private javax.swing.JComboBox<String> gradeCombo;
    private javax.swing.JTextField heightText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lengthText;
    private javax.swing.JComboBox<String> noColoursCombo;
    private javax.swing.JTextField quantityText;
    private javax.swing.JCheckBox reinfBotCheck;
    private javax.swing.JCheckBox reinfCorCheck;
    private javax.swing.JCheckBox sealableCheck;
    private javax.swing.JTextField widthText;
    // End of variables declaration//GEN-END:variables
}
