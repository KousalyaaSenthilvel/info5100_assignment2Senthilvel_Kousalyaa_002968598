/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarsDataBase;

/**
 *
 * @author dineshmurugesan
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    CarsDataBase CarsDb;

    public SearchJPanel(CarsDataBase CarsDb) {
        initComponents();
        this.CarsDb = CarsDb;
        lastentrylabel.setText(CarsDb.getLastUpdatedTime());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        firstAvailablepass = new javax.swing.JButton();
        Caravailable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carunavailable = new javax.swing.JLabel();
        avail1label = new javax.swing.JLabel();
        buttoncheckavailability = new javax.swing.JButton();
        Manufaccturersearch = new javax.swing.JLabel();
        manufacturerseachtext = new javax.swing.JTextField();
        manufacturersearchbutton = new javax.swing.JButton();
        Makeyearlabel = new javax.swing.JLabel();
        Makeyeartext = new javax.swing.JTextField();
        Makeyearsearchbutton = new javax.swing.JButton();
        minseat = new javax.swing.JLabel();
        Minseattext = new javax.swing.JTextField();
        maxseat = new javax.swing.JLabel();
        Maxseattext = new javax.swing.JTextField();
        minmaxsearchbutton = new javax.swing.JButton();
        serialnumber = new javax.swing.JLabel();
        Serialnumbertext = new javax.swing.JTextField();
        searchserailnumberbutton = new javax.swing.JButton();
        modelnumber = new javax.swing.JLabel();
        modelnumbertext = new javax.swing.JTextField();
        Serachmodelnumberbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Manufacturertable = new javax.swing.JTable();
        carmanufacturerlistbutton = new javax.swing.JButton();
        Lastupdatedlabel = new javax.swing.JLabel();
        lastentrylabel = new javax.swing.JLabel();
        expmaintenancecert = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial Number", "Manufacturer", "Model Number", "Make Year", "Seat Capacity", "City", "Maintenance Certificate Date", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Panel");
        jLabel1.setToolTipText("");

        firstAvailablepass.setText("Click to View First Available Passenger Car");
        firstAvailablepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstAvailablepassActionPerformed(evt);
            }
        });

        Caravailable.setText("Cars Available");

        jLabel3.setText("Cars Unavailable");

        carunavailable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        avail1label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttoncheckavailability.setText("Click to Check Availability Status");
        buttoncheckavailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncheckavailabilityActionPerformed(evt);
            }
        });

        Manufaccturersearch.setText("Manufacturer Search ");

        manufacturersearchbutton.setText("Search");
        manufacturersearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturersearchbuttonActionPerformed(evt);
            }
        });

        Makeyearlabel.setText("Make Year");

        Makeyeartext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeyeartextActionPerformed(evt);
            }
        });

        Makeyearsearchbutton.setText("Search");
        Makeyearsearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeyearsearchbuttonActionPerformed(evt);
            }
        });

        minseat.setText("Min Seats");

        maxseat.setText("Max Seats");

        minmaxsearchbutton.setText("Search");
        minmaxsearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minmaxsearchbuttonActionPerformed(evt);
            }
        });

        serialnumber.setText("Serial Number");

        searchserailnumberbutton.setText("Search");
        searchserailnumberbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchserailnumberbuttonActionPerformed(evt);
            }
        });

        modelnumber.setText("Model Number");

        modelnumbertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelnumbertextActionPerformed(evt);
            }
        });

        Serachmodelnumberbutton.setText("Search");
        Serachmodelnumberbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerachmodelnumberbuttonActionPerformed(evt);
            }
        });

        Manufacturertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Manufacturer"
            }
        ));
        jScrollPane2.setViewportView(Manufacturertable);

        carmanufacturerlistbutton.setText("Car Manufacturer's List");
        carmanufacturerlistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carmanufacturerlistbuttonActionPerformed(evt);
            }
        });

        Lastupdatedlabel.setText("Last Updated Time : ");

        lastentrylabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        expmaintenancecert.setText("Click to View Expired maintenance certificate Cars");
        expmaintenancecert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expmaintenancecertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(carunavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttoncheckavailability)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(manufacturerseachtext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchserailnumberbutton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Makeyeartext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(manufacturersearchbutton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(modelnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Serialnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(maxseat)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Maxseattext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Makeyearsearchbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(minmaxsearchbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Serachmodelnumberbutton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lastupdatedlabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(lastentrylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(expmaintenancecert, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(firstAvailablepass)
                                                .addGap(57, 57, 57))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(307, 307, 307)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 169, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Manufaccturersearch)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Caravailable)
                                        .addGap(29, 29, 29)
                                        .addComponent(avail1label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Makeyearlabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(minseat)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Minseattext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(modelnumber)
                                            .addComponent(serialnumber))
                                        .addGap(43, 43, 43)))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)))
                        .addGap(391, 391, 391)
                        .addComponent(carmanufacturerlistbutton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(expmaintenancecert))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttoncheckavailability)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(firstAvailablepass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carmanufacturerlistbutton)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caravailable)
                            .addComponent(avail1label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carunavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchserailnumberbutton)
                            .addComponent(manufacturerseachtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manufaccturersearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manufacturersearchbutton)
                            .addComponent(Makeyeartext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Makeyearlabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Makeyearsearchbutton)
                            .addComponent(Maxseattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxseat)
                            .addComponent(Minseattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minseat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minmaxsearchbutton)
                            .addComponent(Serialnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialnumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Serachmodelnumberbutton)
                            .addComponent(modelnumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelnumber))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Lastupdatedlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastentrylabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstAvailablepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstAvailablepassActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);

        for (Car cdb : CarsDb.getCarsDb()) {
            if (cdb.getAvailability() == true) {
                
                Object[] row = new Object[8];
                row[0] = cdb;
                row[1] = cdb.getSerialNumber();
                row[2] = cdb.getManufacturer();
                row[3] = cdb.getMakeYear();
                row[4] = cdb.getSeatCapacity();
                row[5] = cdb.getCity();
                row[6] = cdb.getMaintainCertificate();
                row[7] = cdb.getAvailability();

                model.addRow(row);
                break;
            }
    }//GEN-LAST:event_firstAvailablepassActionPerformed
    }
    private void buttoncheckavailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncheckavailabilityActionPerformed
        // TODO add your handling code here:
        int count = 0;
        int count1 = 0;
        for(Car cdb : CarsDb.getCarsDb()){

        if (cdb.getAvailability() == true) {
        count++;
        }
        }
        
        for(Car cdb : CarsDb.getCarsDb()){
        if (cdb.getAvailability() == false) {
        count1++;
        }
        }
        avail1label.setText(Integer.toString(count));
        carunavailable.setText(Integer.toString(count1));
    }//GEN-LAST:event_buttoncheckavailabilityActionPerformed

    private void manufacturersearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturersearchbuttonActionPerformed
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
            model.setRowCount(0);
            String manuName = manufacturerseachtext.getText();
            for (Car cdb : CarsDb.getCarsDb()) {
                if (cdb.getManufacturer().equals(manuName)) {
                    Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();


                    model.addRow(row);
                    }
                }
    }//GEN-LAST:event_manufacturersearchbuttonActionPerformed

    private void MakeyeartextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeyeartextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MakeyeartextActionPerformed

    private void MakeyearsearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeyearsearchbuttonActionPerformed
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
            model.setRowCount(0);
            int mkYr = Integer.parseInt(Makeyeartext.getText());
            for (Car cdb : CarsDb.getCarsDb()) {
                if (cdb.getMakeYear() == (mkYr)) {
                    Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();

                    model.addRow(row);
                    }
                }
    }//GEN-LAST:event_MakeyearsearchbuttonActionPerformed

    private void minmaxsearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minmaxsearchbuttonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        int minSeats = Integer.parseInt(Minseattext.getText());
        int maxSeats = Integer.parseInt(Maxseattext.getText());
        
        for (Car cdb : CarsDb.getCarsDb()) {
            if (cdb.getSeatCapacity() >= minSeats && cdb.getSeatCapacity() <= maxSeats) {
                    Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();
                    
                    model.addRow(row);
            }
        }
        
    }//GEN-LAST:event_minmaxsearchbuttonActionPerformed

    private void SerachmodelnumberbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerachmodelnumberbuttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        String modelNumber = modelnumbertext.getText();
        for (Car cdb : CarsDb.getCarsDb()) {
            if (cdb.getModelNumber().equals(modelNumber)) {
                Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();
                    
                    model.addRow(row);
            }
        }
    }//GEN-LAST:event_SerachmodelnumberbuttonActionPerformed

    private void modelnumbertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelnumbertextActionPerformed
        // TODO add your handling code here:
        
            
      
    }//GEN-LAST:event_modelnumbertextActionPerformed

    private void searchserailnumberbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchserailnumberbuttonActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
        model.setRowCount(0);
        int serialNumber = Integer.parseInt(Serialnumbertext.getText());
        for (Car cdb : CarsDb.getCarsDb()) {
            if (cdb.getSerialNumber() == (serialNumber)) {
                    Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();
                    
                    model.addRow(row);
                    
            }
        }
        
    }//GEN-LAST:event_searchserailnumberbuttonActionPerformed

    private void carmanufacturerlistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carmanufacturerlistbuttonActionPerformed
        // TODO add your handling code here:
            Set<String> Manufacturer = new HashSet<>();
            for(Car cdb : CarsDb.getCarsDb()) {
                Manufacturer.add(cdb.getManufacturer());
            }   
                DefaultTableModel model = (DefaultTableModel) Manufacturertable.getModel();
                model.setRowCount(0);
                for(String c : Manufacturer){
                Object[] row = new Object[1];
                row[0] = c;
                model.addRow(row);
                }
    
    }//GEN-LAST:event_carmanufacturerlistbuttonActionPerformed

    private void expmaintenancecertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expmaintenancecertActionPerformed
        // TODO add your handling code here:
        
            DefaultTableModel model = (DefaultTableModel) tblCars.getModel();
            model.setRowCount(0);       
            for(Car cdb : CarsDb.getCarsDb())
            {
                if(cdb.getMaintainCertificate()==true)
                {
                    Object[] row = new Object[8];
                    row[0] = cdb;
                    row[1] = cdb.getSerialNumber();
                    row[2] = cdb.getManufacturer();
                    row[3] = cdb.getMakeYear();
                    row[4] = cdb.getSeatCapacity();
                    row[5] = cdb.getCity();
                    row[6] = cdb.getMaintainCertificate();
                    row[7] = cdb.getAvailability();

                    model.addRow(row);

                }
            }
        
    }//GEN-LAST:event_expmaintenancecertActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caravailable;
    private javax.swing.JLabel Lastupdatedlabel;
    private javax.swing.JLabel Makeyearlabel;
    private javax.swing.JButton Makeyearsearchbutton;
    private javax.swing.JTextField Makeyeartext;
    private javax.swing.JLabel Manufaccturersearch;
    private javax.swing.JTable Manufacturertable;
    private javax.swing.JTextField Maxseattext;
    private javax.swing.JTextField Minseattext;
    private javax.swing.JButton Serachmodelnumberbutton;
    private javax.swing.JTextField Serialnumbertext;
    private javax.swing.JLabel avail1label;
    private javax.swing.JButton buttoncheckavailability;
    private javax.swing.JButton carmanufacturerlistbutton;
    private javax.swing.JLabel carunavailable;
    private javax.swing.JButton expmaintenancecert;
    private javax.swing.JButton firstAvailablepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastentrylabel;
    private javax.swing.JTextField manufacturerseachtext;
    private javax.swing.JButton manufacturersearchbutton;
    private javax.swing.JLabel maxseat;
    private javax.swing.JButton minmaxsearchbutton;
    private javax.swing.JLabel minseat;
    private javax.swing.JLabel modelnumber;
    private javax.swing.JTextField modelnumbertext;
    private javax.swing.JButton searchserailnumberbutton;
    private javax.swing.JLabel serialnumber;
    private javax.swing.JTable tblCars;
    // End of variables declaration//GEN-END:variables
}
