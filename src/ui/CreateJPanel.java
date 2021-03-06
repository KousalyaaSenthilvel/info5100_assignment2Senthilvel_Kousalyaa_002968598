/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Car;
import model.CarsDataBase;

/**
 *
 * @author dineshmurugesan
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    CarsDataBase CarsDb;
    
    public CreateJPanel(CarsDataBase CarsDb) {
        initComponents();
        
       this.CarsDb = CarsDb;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        Availablitylabel = new javax.swing.JLabel();
        Makeyearlabel = new javax.swing.JLabel();
        ModelnumberLabel = new javax.swing.JLabel();
        Manufacturerlabel = new javax.swing.JLabel();
        Seatcapacitylabel = new javax.swing.JLabel();
        Serialnumberlabel = new javax.swing.JLabel();
        citylabel = new javax.swing.JLabel();
        Maintenancecertificatelabel = new javax.swing.JLabel();
        Makeyeartext = new javax.swing.JTextField();
        ModelNumberText = new javax.swing.JTextField();
        ManufacturerText = new javax.swing.JTextField();
        Seatcapacitytext = new javax.swing.JTextField();
        Serialnumbertext = new javax.swing.JTextField();
        Citytext = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        availabilitycheckbox = new javax.swing.JCheckBox();
        MaintenanceCheckbox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 255, 255));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Cars Database");

        Availablitylabel.setText("Availability");

        Makeyearlabel.setText("Make Year");

        ModelnumberLabel.setText("Model Number");

        Manufacturerlabel.setText("Manufacturer");

        Seatcapacitylabel.setText("Seat Capacity");

        Serialnumberlabel.setText("Serial Number");

        citylabel.setText("City");

        Maintenancecertificatelabel.setText("MaintenanceCertification ");

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(citylabel)
                                    .addComponent(Maintenancecertificatelabel)
                                    .addComponent(Serialnumberlabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Seatcapacitylabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ModelnumberLabel)
                                            .addComponent(Manufacturerlabel)
                                            .addComponent(Makeyearlabel)
                                            .addComponent(Availablitylabel))))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaintenanceCheckbox)
                                    .addComponent(availabilitycheckbox)
                                    .addComponent(Makeyeartext, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ModelNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ManufacturerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seatcapacitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Serialnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Citytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(savebutton)
                                .addGap(83, 83, 83)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addGap(164, 164, 164))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Citytext, Makeyeartext, ManufacturerText, ModelNumberText, Seatcapacitytext, Serialnumbertext});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Availablitylabel)
                            .addComponent(availabilitycheckbox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makeyearlabel)
                            .addComponent(Makeyeartext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModelnumberLabel)
                            .addComponent(ModelNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManufacturerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manufacturerlabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Seatcapacitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seatcapacitylabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Serialnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Serialnumberlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Citytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citylabel))
                        .addGap(18, 18, 18)
                        .addComponent(Maintenancecertificatelabel))
                    .addComponent(MaintenanceCheckbox))
                .addGap(33, 33, 33)
                .addComponent(savebutton)
                .addContainerGap(296, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
           
         if (Makeyeartext.getText() == null || "".equals(Makeyeartext.getText()))
         {
             
            JOptionPane.showMessageDialog(this, "Please enter valid Make year");
            
         } 
         else if (ModelNumberText.getText() == null || "".equals(ModelNumberText.getText()))
         {
             
            JOptionPane.showMessageDialog(this, "Please enter valid model number");
            
         } 
         else if (ManufacturerText.getText() == null || "".equals(ManufacturerText.getText()) 
                 || !Pattern.matches("^[a-zA-Z]+$", ManufacturerText.getText())) {
             
             JOptionPane.showMessageDialog(this, "Please enter valid manufacturer name");
             return;
             
         }
         else if (Seatcapacitytext.getText() == null || "".equals(Seatcapacitytext.getText()) 
                || !Pattern.matches("^[0-9]+$", Seatcapacitytext.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter valid seats");
            
         } 
         else if (Serialnumbertext.getText() == null || "".equals(Serialnumbertext.getText()))
         {
            
            JOptionPane.showMessageDialog(this, "Please enter valid serial number");
            
         }
         else if (Citytext.getText() == null || "".equals(Citytext.getText()) 
                || !Pattern.matches("^[a-zA-Z]+$", Citytext.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter valid city");
            
         } 
         else if (!CarsDb.isUnique(Serialnumbertext.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter unique serial number");
        } 
        
        else {
         
         boolean Availability = availabilitycheckbox.isSelected();
         int MakeYear = Integer.parseInt(Makeyeartext.getText());
         String ModelNumber = ModelNumberText.getText();
         String Manufacturer = ManufacturerText.getText();
         int SeatCapacity = Integer.parseInt(Seatcapacitytext.getText());
         int SerialNumber = Integer.parseInt(Serialnumbertext.getText());
         String City = Citytext.getText();
         boolean MaintainCertificate = MaintenanceCheckbox.isSelected();
        
         Car cdb = CarsDb.addNewCars();
         
         cdb.setAvailability(Availability);
         cdb.setMakeYear(MakeYear);
         cdb.setModelNumber(ModelNumber);
         cdb.setCity(City);
         cdb.setManufacturer(Manufacturer);
         cdb.setSeatCapacity(SeatCapacity);
         cdb.setSerialNumber(SerialNumber);
         cdb.setCity(City);
         cdb.setMaintainCertificate(MaintainCertificate);
         
         JOptionPane.showMessageDialog(this, "New Car Details added");
         
         availabilitycheckbox.setSelected(false);
         Makeyeartext.setText("");
         ModelNumberText.setText("");
         ManufacturerText.setText("");
         Seatcapacitytext.setText("");
         Serialnumbertext.setText("");
         Citytext.setText("");
         MaintenanceCheckbox.setSelected(false);
         
         
        }
         
    }//GEN-LAST:event_savebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availablitylabel;
    private javax.swing.JTextField Citytext;
    private javax.swing.JCheckBox MaintenanceCheckbox;
    private javax.swing.JLabel Maintenancecertificatelabel;
    private javax.swing.JLabel Makeyearlabel;
    private javax.swing.JTextField Makeyeartext;
    private javax.swing.JTextField ManufacturerText;
    private javax.swing.JLabel Manufacturerlabel;
    private javax.swing.JTextField ModelNumberText;
    private javax.swing.JLabel ModelnumberLabel;
    private javax.swing.JLabel Seatcapacitylabel;
    private javax.swing.JTextField Seatcapacitytext;
    private javax.swing.JLabel Serialnumberlabel;
    private javax.swing.JTextField Serialnumbertext;
    private javax.swing.JCheckBox availabilitycheckbox;
    private javax.swing.JLabel citylabel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton savebutton;
    // End of variables declaration//GEN-END:variables
}
