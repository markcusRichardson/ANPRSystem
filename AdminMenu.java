
package anpr.system.program;

import static anpr.system.program.OperatorMenu.Filereader;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author markcusrichardson
 */
public class AdminMenu extends javax.swing.JFrame {

    
    public AdminMenu() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anpr/system/program/Screenshot 2022-12-29 at 14.33.44.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("Admin Menu");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jButton1.setText("Update Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jButton2.setText("Update Changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jButton3.setText("Update Changes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton5.setText("SP Marked Vehicles");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Click on the buttons to see the list of that particular \nvehicle scanned. Modify the records if needed and click\nUpdate changes next to the button pressed to store changes.\nClick on \"Clear text area\" when updates have been made ");
        jScrollPane2.setViewportView(jTextArea2);

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton4.setText("PNC Marked vehicles");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton6.setText("All vehicles scanned");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton7.setText("Clear text area");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(38, 38, 38)
                                                .addComponent(jButton7))
                                            .addComponent(jButton1)
                                            .addComponent(jButton3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(983, 983, 983))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton8)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Code for storing changes to SPMarkedVehicles
        
        String text = jTextArea1.getText();
        SPMarkedvehicleFile(text);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Code to display the SP marked vehciles in menu
        // Variables
            int i = 0;
            String Text = "";
        // Process
        
            for (i=1;i<=16;i++){
            
            Text = DisplayFileSP(i);
            jTextArea1.append(Text + "\n");
        
        }// End for statement       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Code to display the PNC marked vehciles in menu
        // Variables
            int i = 0;
            String Text = "";
            int lineCount;
        // Process
        lineCount = LengthFile(1);
            for (i=1;i<lineCount;i++){
            
            Text = DisplayFilePNC(i);
            jTextArea1.append(Text + "\n");
        
        }// End for statement       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     // Code to display the Allvehciles in menu
        // Variables
            int i = 0;
            String Text = "";
            int lineCount;
        // Process
        lineCount = LengthFile(1);
            for (i=1;i<lineCount;i++){
            
            Text = DisplayFileEndOfShift(i);
            jTextArea1.append(Text + "\n");
        
        }// End for statement         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Clearing textarea
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// Code for storing changes to PNCMarkedVehicles
        
        String text = jTextArea1.getText();
        PNCMarkedvehicleFile(text);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// Code for storing changes to AllVehicles
        
        String text = jTextArea1.getText();
        AllvehicleFile(text);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Code to close the Admin menu
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }// End main statement

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables


public static String DisplayFileSP(int Number) {
        
        //Variables
            int lineNumber = 1;
            String line = "";
            BufferedReader reader = null;
            int i=0;
            String lineToRead="";
        
        //Process
            try{
            reader = new BufferedReader(new FileReader("SPMarkedVehicles"));
            line = reader.readLine();
            
            
                while (line != null) {
                
                    if (lineNumber == Number) {
                    lineToRead = line;
                    }//End If statement    
                    
            
                line = reader.readLine();
                lineNumber++;
                }//End While Statement
            
            }// End Try Statement
            
            catch(IOException e){
                e.printStackTrace();                

            }// End catch Statement
            
        return lineToRead;
        
 
    }// End of DisplayFileSP method

public static String DisplayFilePNC(int Number) {
        
        //Variables
            int lineNumber = 1;
            String line = "";
            BufferedReader reader = null;
            int i=0;
            String lineToRead="";
        
        //Process
            try{
            reader = new BufferedReader(new FileReader("PNCMarkedVehicles"));
            line = reader.readLine();
            
            
                while (line != null) {
                
                    if (lineNumber == Number) {
                    lineToRead = line;
                    }//End If statement    
                    
            
                line = reader.readLine();
                lineNumber++;
                }//End While Statement
            
            }// End Try Statement
            
            catch(IOException e){
                e.printStackTrace();                

            }// End catch Statement
            
        return lineToRead;
        
 
    }// End DisplayFilePNC method

public static String DisplayFileEndOfShift(int Number) {
        
        //Variables
            int lineNumber = 1;
            String line = "";
            BufferedReader reader = null;
            int i=0;
            String lineToRead="";
        
        //Process
            try{
            reader = new BufferedReader(new FileReader("EndOfShiftFile"));
            line = reader.readLine();
            
            
                while (line != null) {
                
                    if (lineNumber == Number) {
                    lineToRead = line;
                    }//End If statement    
                    
            
                line = reader.readLine();
                lineNumber++;
                }//End While Statement
            
            }// End Try Statement
            
            catch(IOException e){
                e.printStackTrace();                

            }// End catch Statement
            
        return lineToRead;
        
 
    }// End DisplayFileEndOfShift method



public static void SPMarkedvehicleFile (String Start){
    // Variables
    int Length, i;
    String line;
    //Process
    String [] lines = Start.split("\n");
    Length = lines.length;
    File Originalfile = new File("SPMarkedVehicles");
    File TempFile = new File("tempFile");
   
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tempFile"))) {
        for (i=0;i<Length;i++) {
        line = lines[i];
        writer.write(line);
        writer.newLine();
        }// End for statemnent
        writer.close();
        Originalfile.delete();
        TempFile.renameTo(Originalfile);
    }// End try statement
    catch (IOException e) {
    e.printStackTrace();
    }// End catch statement
    
}// End SPMarkedVehcileFile method

public static void PNCMarkedvehicleFile (String Start){
    // Variables
    int Length, i;
    String line;
    //Process
    String [] lines = Start.split("\n");
    Length = lines.length;
    File Originalfile = new File("PNCMarkedVehicles");
    File TempFile = new File("tempFile");
   
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tempFile"))) {
        for (i=0;i<Length;i++) {
        line = lines[i];
        writer.write(line);
        writer.newLine();
        }// End for statement
        writer.close();
        Originalfile.delete();
        TempFile.renameTo(Originalfile);
    }// End try statement
    catch (IOException e) {
    e.printStackTrace();
    }// End catch statement
    
}// End PNCMarkedvehicleFile method

public static void AllvehicleFile (String Start){
    // Variables
    int Length, i;
    String line;
    //Process
    String [] lines = Start.split("\n");
    Length = lines.length;
    File Originalfile = new File("EndOfShiftFile");
    File TempFile = new File("tempFile");
   
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tempFile"))) {
        for (i=0;i<Length;i++) {
        line = lines[i];
        writer.write(line);
        writer.newLine();
        }// End for statement
        writer.close();
        Originalfile.delete();
        TempFile.renameTo(Originalfile);
    }// End try statement
    catch (IOException e) {
    e.printStackTrace();
    }// End catch statement
    
}// End AllVehicleFile method


 public static int LengthFile(int Number){
        // Variables 
        int Count = 0;
        // Process
        try (BufferedReader reader = new BufferedReader(new FileReader("CameraVRNInfo"))) {
                while (reader.readLine() != null) {
                Count++;
                }// End While statement
                }// End try Statement
                catch (IOException e) {
                e.printStackTrace();
                
                }// End catch statement
    return Count;
    }// End LengthFile method
}// End class