/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Person;

/**
 *
 * @author somnathsolaskar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person person;
    String path_selected_file_photo;
    String path_selected_file_biometric;
    
    public CreateJPanel(Person person) {
        initComponents();
        this.person = person;
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
        lblname = new javax.swing.JLabel();
        lblgeo = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMid = new javax.swing.JLabel();
        lblHid = new javax.swing.JLabel();
        geographicData = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        telNum = new javax.swing.JTextField();
        fax = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        mrn = new javax.swing.JTextField();
        health = new javax.swing.JTextField();
        lblAccnum = new javax.swing.JLabel();
        bank = new javax.swing.JTextField();
        lblLicense = new javax.swing.JLabel();
        lblVehicle = new javax.swing.JLabel();
        lblDevice = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblBiometric = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblUID = new javax.swing.JLabel();
        lic = new javax.swing.JTextField();
        vin = new javax.swing.JTextField();
        dev = new javax.swing.JTextField();
        linkedIn = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        uin = new javax.swing.JTextField();
        btnPhoto = new javax.swing.JButton();
        btnBiometric = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        biometricPreview = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        photoPreview = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE PERSONAL PROFILE");

        lblname.setText("Name*");

        lblgeo.setText("Geographic Data");

        lblDob.setText("Date of Birth*");

        lblPhone.setText("Telephone*");

        lblFax.setText("Fax");

        lblEmail.setText("Email*");

        lblSSN.setText("SSN*");

        lblMid.setText("Medicle record ID");

        lblHid.setText("Health Plan Beneficiary ID");

        lblAccnum.setText("Account number");

        lblLicense.setText("License Number");

        lblVehicle.setText("Vehicle Number");

        lblDevice.setText("Device Identifier");

        jLabel15.setText("LinkedIn");

        lblIP.setText("IP Address");

        lblBiometric.setText("Biometric ID");

        lblPhoto.setText("Photo*");

        lblUID.setText("Unique Identifier");

        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devActionPerformed(evt);
            }
        });

        btnPhoto.setText("Upload Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        btnBiometric.setText("Upload Biometric");
        btnBiometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiometricActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setText("jpg,png,jpeg");

        jLabel3.setText("jpg,png,jpeg");

        jLabel4.setText("MM-DD-YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblgeo)
                                    .addComponent(lblDob)
                                    .addComponent(lblPhone)
                                    .addComponent(lblFax)
                                    .addComponent(lblEmail)
                                    .addComponent(lblSSN)
                                    .addComponent(lblMid)
                                    .addComponent(lblname))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(303, 303, 303)
                                        .addComponent(lblHid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBiometric, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(uin, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(ip)
                                                .addComponent(linkedIn, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(vin, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(health)
                                                .addComponent(dev))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblBiometric)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblUID, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(fax)
                                                                .addComponent(telNum)
                                                                .addComponent(dob)
                                                                .addComponent(geographicData, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel4)
                                                                        .addGap(51, 51, 51)
                                                                        .addComponent(lblVehicle))
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGap(147, 147, 147)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel15)
                                                                            .addComponent(lblDevice)
                                                                            .addComponent(lblIP))))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(147, 147, 147)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblLicense)
                                                                        .addComponent(lblAccnum)))))))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(btnPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(mrn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGap(96, 96, 96)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(photoPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(125, 125, 125)
                                                .addComponent(biometricPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPhoto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblname)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccnum)
                            .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblgeo)
                            .addComponent(geographicData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLicense)
                            .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDob)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehicle)
                            .addComponent(vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(telNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDevice)
                            .addComponent(dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFax)
                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(linkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIP)
                            .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSN)
                            .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUID)
                            .addComponent(uin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMid)
                                .addComponent(mrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblHid)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPhoto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBiometric)
                                    .addComponent(btnBiometric)
                                    .addComponent(jLabel3))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(biometricPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(photoPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(431, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        
        JFileChooser imgPhoto = new JFileChooser();
        FileNameExtensionFilter extension = new FileNameExtensionFilter("Supported Extensions:", "jpg", "png", "jpeg");
        imgPhoto.setFileFilter(extension);
        int browsedFile = imgPhoto.showOpenDialog(null);
        if(browsedFile == JFileChooser.APPROVE_OPTION){
            File selected_file = imgPhoto.getSelectedFile();
            path_selected_file_photo = selected_file.getAbsolutePath();
            ImageIcon img = new ImageIcon(new ImageIcon(path_selected_file_photo).getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
            photoPreview.setIcon(img);
                }
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void btnBiometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiometricActionPerformed
        // TODO add your handling code here:
        
        JFileChooser imgPhoto = new JFileChooser();
        FileNameExtensionFilter extension = new FileNameExtensionFilter("Supported Extensions:", "jpg", "png", "jpeg");
        imgPhoto.setFileFilter(extension);
        int browsedFile = imgPhoto.showOpenDialog(null);
        if(browsedFile == JFileChooser.APPROVE_OPTION){
            File selected_file = imgPhoto.getSelectedFile();
            path_selected_file_biometric = selected_file.getAbsolutePath();
            ImageIcon img = new ImageIcon(new ImageIcon(path_selected_file_biometric).getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
            biometricPreview.setIcon(img);
                }
    }//GEN-LAST:event_btnBiometricActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        int res = validateInput();
        if(res == 1){
        //CreatePanel createPanel = new CreatePanel(person);
       // splitPane.setRightComponent(createPanel);
        }
        else{
        person.setName(name.getText());
        person.setGeographicData(geographicData.getText());
        person.setDob(dob.getText());
        person.setTelNum(telNum.getText());
        person.setFaxNum(fax.getText());
        person.setEmail(email.getText());
        person.setSsn(ssn.getText());
        person.setMedicalNum(mrn.getText());
        person.setHealthNum(health.getText());
        person.setBankNum(bank.getText());
        person.setLic(lic.getText());
        person.setVin(vin.getText());
        person.setDev(dev.getText());
        person.setLinkedIn(linkedIn.getText());
        person.setIp(ip.getText());
        person.setUin(uin.getText());
        person.setPhoto(path_selected_file_photo);
        person.setBiometric(path_selected_file_biometric);
        
        JOptionPane.showMessageDialog(this,"Your profile was saved successfully !");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bank;
    private javax.swing.JLabel biometricPreview;
    private javax.swing.JButton btnBiometric;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField dev;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fax;
    private javax.swing.JTextField geographicData;
    private javax.swing.JTextField health;
    private javax.swing.JTextField ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAccnum;
    private javax.swing.JLabel lblBiometric;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblHid;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblMid;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblVehicle;
    private javax.swing.JLabel lblgeo;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField lic;
    private javax.swing.JTextField linkedIn;
    private javax.swing.JTextField mrn;
    private javax.swing.JTextField name;
    private javax.swing.JLabel photoPreview;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField telNum;
    private javax.swing.JTextField uin;
    private javax.swing.JTextField vin;
    // End of variables declaration//GEN-END:variables

    private int validateInput() {
    
        int flag = 0;
         if(name.getText().equals("")){
             flag = 1;
            JOptionPane.showMessageDialog(null,"Name is required");
        } 
          if(telNum.getText().equals("") || (!(Pattern.matches("^([1-9][0-9]{9})|([0][1-9][0-9]{9})$",telNum.getText())))){
            flag = 1;
              JOptionPane.showMessageDialog(null,"Please enter a valid telephone number", "Error", JOptionPane.ERROR_MESSAGE);
        } 
          if (email.getText().equals("") || (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email.getText())))) {
              flag = 1;
              JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
          if (dob.getText().equals("") || (!(Pattern.matches("^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$", dob.getText())))) {
              flag = 1;
              JOptionPane.showMessageDialog(null, "Please enter a valid DOB in MM-DD-YYYY format", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(ssn.getText().equals("") || (!(Pattern.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$",ssn.getText())))){
                flag =1;
            JOptionPane.showMessageDialog(null,"SSN is required");
        } 
             if(photoPreview.getIcon() == null){
              flag = 1;
            JOptionPane.showMessageDialog(null,"Profile Photo is required");
         }
            
            return flag;
    }


}
