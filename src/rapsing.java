
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AARON
 */
public class rapsing extends javax.swing.JFrame {

    public double cost;
    private String classification;
    private String drink;
    private String add;
    String drink1;
    boolean drk_water;
    Timer timer;
     
    
       
       
    
    /**
     * Creates new form rapsing
     */
    public rapsing() {
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

        jLabel3 = new javax.swing.JLabel();
        cb = new javax.swing.ButtonGroup();
        rb = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbrice = new javax.swing.JCheckBox();
        cbchili = new javax.swing.JCheckBox();
        cbegg = new javax.swing.JCheckBox();
        rbbeer = new javax.swing.JRadioButton();
        rbcoke = new javax.swing.JRadioButton();
        rbice = new javax.swing.JRadioButton();
        req = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        water = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        Submit = new javax.swing.JMenu();
        place = new javax.swing.JMenuItem();
        Ordetimer = new javax.swing.JMenuItem();
        clear = new javax.swing.JMenuItem();
        display = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        Clear = new javax.swing.JMenu();
        MenuSelection = new javax.swing.JMenuItem();
        DrinkSelection = new javax.swing.JMenuItem();
        AddonsMenu = new javax.swing.JMenuItem();
        SpecialReq = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        FAQ = new javax.swing.JMenuItem();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Add ons:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Menu Selection");

        menu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select your order here!", "Fried Chicken", "Sisig", "Crispy Pata", "Adobo" }));
        menu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Drinks:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Add ons:");

        cb.add(cbrice);
        cbrice.setText("Rice");
        cbrice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbriceItemStateChanged(evt);
            }
        });

        cb.add(cbchili);
        cbchili.setText("Chili Sauce");
        cbchili.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbriceItemStateChanged(evt);
            }
        });

        cb.add(cbegg);
        cbegg.setText("Egg");
        cbegg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbriceItemStateChanged(evt);
            }
        });

        rb.add(rbbeer);
        rbbeer.setText("Beer");
        rbbeer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbbeerItemStateChanged(evt);
            }
        });

        rb.add(rbcoke);
        rbcoke.setText("Coke");
        rbcoke.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbbeerItemStateChanged(evt);
            }
        });

        rb.add(rbice);
        rbice.setText("Ice Tea");
        rbice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbbeerItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Special Request");

        water.setText("water");
        water.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                waterItemStateChanged(evt);
            }
        });

        Submit.setText("Submit");

        place.setText("Place Order");
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        Submit.add(place);

        Ordetimer.setText("Order Timer");
        Ordetimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdetimerActionPerformed(evt);
            }
        });
        Submit.add(Ordetimer);

        clear.setText("Clear Order");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        Submit.add(clear);

        display.setText("Display Order");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        Submit.add(display);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        Submit.add(exit);

        jMenuBar1.add(Submit);

        Clear.setText("Clear");

        MenuSelection.setText("Menu Selection");
        MenuSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelectionActionPerformed(evt);
            }
        });
        Clear.add(MenuSelection);

        DrinkSelection.setText("Drink Selection");
        DrinkSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkSelectionActionPerformed(evt);
            }
        });
        Clear.add(DrinkSelection);

        AddonsMenu.setText("Addons Selection");
        AddonsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddonsMenuActionPerformed(evt);
            }
        });
        Clear.add(AddonsMenu);

        SpecialReq.setText("Special Request");
        SpecialReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialReqActionPerformed(evt);
            }
        });
        Clear.add(SpecialReq);

        jMenuBar1.add(Clear);

        About.setText("About");

        FAQ.setText("FAQ`S");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });
        About.add(FAQ);

        jMenuBar1.add(About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbbeer)
                                        .addComponent(jLabel2)
                                        .addComponent(rbcoke)
                                        .addComponent(rbice))))
                            .addComponent(cbrice)
                            .addComponent(cbchili)
                            .addComponent(cbegg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(req))
                        .addGap(32, 32, 32)
                        .addComponent(water)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbrice)
                    .addComponent(rbbeer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbchili)
                    .addComponent(rbcoke))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbegg)
                    .addComponent(rbice))
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(req, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(water)
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        Object source = evt.getSource();
        
        if(source == place){
            if(drk_water== true)
                drink1 = "Glass of Water";
            else
                drink1 = "";
            
            JOptionPane.showMessageDialog(this, "Ordered Item: " + classification + " and " + drink 
                    + "\n"+"Special Request: "+ req.getText()+"\n"+"Additional: "+add+"\n"+drink1+"\n"+"Total Amount: "+ "PHP "+
                   cost);
        }
        
        else if(source == clear){
            menu.setSelectedItem("Please,Select Your Menu");
            rbbeer.setSelected(false);
            rbcoke.setSelected(false);
            rbice.setSelected(false);
            water.setSelected(false);
            req.setText("");
            cbrice.setSelected(false);
            cbchili.setSelected(false);
            cbegg.setSelected(false);
            
        }  
        else if(source == display){
            if(drk_water== true)
                drink1 = "Glass of Water";
            else
                drink1 = "";
            JOptionPane.showMessageDialog(this, "Ordered Item: " + classification + " and " + drink 
                    +"\n"+"Special Request: "+ req.getText()+"\n"+"Additional: "+add+"\n"+drink1);
        }
        
        else
            System.exit(0);
    }//GEN-LAST:event_placeActionPerformed

    private void rbbeerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbbeerItemStateChanged
        if(rbbeer.isSelected()){
            cost += 50;
            drink = "Beer";
        }
        else if(rbcoke.isSelected()){
            cost += 20;
            drink = "Coke";
        }
        
        else if(rbice.isSelected()){
            cost += 35;
            drink = "Ice tea";
            
        }
    }//GEN-LAST:event_rbbeerItemStateChanged

    private void menuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuItemStateChanged
        if(menu.getSelectedIndex()==1){
           cost += 125;
           classification = "Fried Chicken";
       }
        else if(menu.getSelectedIndex()==2){
           cost += 95;
           classification = "Sisig";
       }
        else if(menu.getSelectedIndex()==3){
           cost += 325;
           classification = "Crispy Pata";
       }
        else if(menu.getSelectedIndex()==4){
           cost += 60;
           classification = "Adobo";
       }
    }//GEN-LAST:event_menuItemStateChanged

    private void waterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_waterItemStateChanged
       if(evt.getStateChange()==ItemEvent.SELECTED){
            drk_water =  true;
        }
        else if(evt.getStateChange()==ItemEvent.DESELECTED){
            drk_water = false;
        }
    }//GEN-LAST:event_waterItemStateChanged

    private void DrinkSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkSelectionActionPerformed
        rbbeer.setSelected(false);
        rbcoke.setSelected(false);
        rbice.setSelected(false);
        JOptionPane.showMessageDialog(this, "The Drink Menu is Cleared.");
    }//GEN-LAST:event_DrinkSelectionActionPerformed

    private void MenuSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelectionActionPerformed
       menu.setSelectedIndex(0);
        JOptionPane.showMessageDialog(this, "The Menu Selection is Cleared");
    }//GEN-LAST:event_MenuSelectionActionPerformed

    private void SpecialReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialReqActionPerformed
        req.setText("");
        JOptionPane.showMessageDialog(this, "The Special Request is Cleared");
    }//GEN-LAST:event_SpecialReqActionPerformed

    private void cbriceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbriceItemStateChanged
        if(cbrice.isSelected()){
            cost += 15;
            add = "rice";
        }
        else if(cbchili.isSelected()){
            cost += 10;
            add = "Chili Sauce";
        }
        
        else if(cbegg.isSelected()){
            cost += 15;
            add = "Egg";
            
        }
    }//GEN-LAST:event_cbriceItemStateChanged

    private void AddonsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddonsMenuActionPerformed
        cbrice.setSelected(false);
        cbchili.setSelected(false);
        cbegg.setSelected(false);
        JOptionPane.showMessageDialog(this, "The Add ons Menu is Cleared.");
    }//GEN-LAST:event_AddonsMenuActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        Object sources = evt.getSource();
        
        if(sources == FAQ){
            JOptionPane.showMessageDialog(this, "Application Name: LafangRestau \n"
                                        + "Located at: Barangay Bayanan, Bacoor",
                                "About the Restaurant", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_FAQActionPerformed

    private void OrdetimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdetimerActionPerformed
       
        
         
        
        
        
    }//GEN-LAST:event_OrdetimerActionPerformed

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
            java.util.logging.Logger.getLogger(rapsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rapsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rapsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rapsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rapsing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem AddonsMenu;
    private javax.swing.JMenu Clear;
    private javax.swing.JMenuItem DrinkSelection;
    private javax.swing.JMenuItem FAQ;
    private javax.swing.JMenuItem MenuSelection;
    private javax.swing.JMenuItem Ordetimer;
    private javax.swing.JMenuItem SpecialReq;
    private javax.swing.JMenu Submit;
    private javax.swing.ButtonGroup cb;
    private javax.swing.JCheckBox cbchili;
    private javax.swing.JCheckBox cbegg;
    private javax.swing.JCheckBox cbrice;
    private javax.swing.JMenuItem clear;
    private javax.swing.JMenuItem display;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JMenuItem place;
    private javax.swing.ButtonGroup rb;
    private javax.swing.JRadioButton rbbeer;
    private javax.swing.JRadioButton rbcoke;
    private javax.swing.JRadioButton rbice;
    private javax.swing.JTextField req;
    private javax.swing.JCheckBox water;
    // End of variables declaration//GEN-END:variables
}
