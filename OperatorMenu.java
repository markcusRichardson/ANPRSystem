
package anpr.system.program;

import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author markcusrichardson
 */
public class OperatorMenu extends javax.swing.JFrame {

   
    public OperatorMenu() {
        initComponents();
    }
    
    public String [] PreMemory = new String [10];
    public String [] Memory = new String [10];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1568, 915));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        jLabel1.setText("Operator Menu");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anpr/system/program/Screenshot 2022-12-29 at 14.33.44.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton3.setText("System On");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton4.setText("System OFF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(589, 589, 589)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(622, 622, 622)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(686, 686, 686)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(188, 188, 188)
                                .addComponent(jButton4)))))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1562, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Code for turning on ANPR system
        
    //Receiving VRN info from camera from file and storing in PRE-Memory
           
           //Variables
                String VRNTimeSP  = "";
                int i = 1;
                //int lineCount;
                String VRNInfo = "";
                int lineCount;
           //Process
                // Lines amount for the for loop from VRN Info
                lineCount = LengthFile(1);
                lineCount++;
                PreMemory = new String [lineCount];

                for (i=1;i<lineCount;i++){
                VRNTimeSP = Filereader(i);
                PreMemory[i] = VRNTimeSP;
                
                }// End for statement  
            
          
           
    //Update PRE-memory with correct VRN data from VRNInfo file and store in Memory
           
           //Variables
                int j = 1;
                String VRN, LookUp = "";
           //Process 
                Memory = new String [lineCount];
                
                for(j=1;j<lineCount;j++){
              
                VRN = PreMemory[j];
               
                Scanner inp = new Scanner(VRN);
                LookUp = inp.next();
               
                VRNInfo = VRNComparison(LookUp);
               
                Memory[j] = VRNInfo;
                }// End for statement  
                jLabel3.setText("System has been turned on");
                jLabel4.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 //Code for turning off ANPR system 
    
    //Code to upload cars with SP marker to file
        // Variables
            int k;
            String SPMarked = "";
            Date date = new Date();
            boolean Exist = true;
            String VRN = "";
            int lineCount;
            
        // Process
            //Create file
            lineCount = LengthFile(1);
            lineCount++;
            
            try{
        
            File SPMarkedVehicles = new File("SPMarkedVehicles");
            Exist = SPMarkedVehicles.createNewFile();
            
            }
            catch (IOException e){
            e.printStackTrace();
            
                
                }
            
            
            for(k=1;k<lineCount;k++){
            VRN = PreMemory[k];
            
                if (VRN.contains("SP")){
                    try{  
                    File SPMarkedVehicles = new File("SPMarkedVehicles");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(SPMarkedVehicles, true));
                    writer.write(VRN + "\n");
                    writer.close();
                    }
                    catch (IOException e){
                    e.printStackTrace();
                    }
                 
                 
                }  
            }// End for statement  
            
    //Code to upload carsd with PNC marker to file
        // Variables
             // Variables
            boolean NotExist = true;
            String VRNPNC = "";
            int L = 0;
            String[] data = null;
        // Process
            try{
        
            File PNCMarkedVehicles = new File("PNCMarkedVehicles");
            NotExist = PNCMarkedVehicles.createNewFile();
            
            }
            catch (IOException e){
            e.printStackTrace();
            }
            
            for(L=1;L<lineCount;L++){
            VRNPNC = Memory[L];
            VRNPNC = VRNPNC.replaceAll(" ", "");
            data = VRNPNC.split(",");
            if (data.length == 5) {
            
            try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("PNCMarkedVehicles", true));
            writer.write(VRNPNC + "\n");
            writer.close(); 
            }
             
            
            catch (IOException e){
                    e.printStackTrace();
            }
            
             }
            
            
                    }
            
            
            
    //Code to upload cars recorded from the day to file
        // Variables
        int M = 0;
        String FinalVRN = "";
        boolean IfExist = true;
        // Process
        
            try{
        
            File EndOfShiftFile = new File("EndOfShiftFile");
            IfExist = EndOfShiftFile.createNewFile();
            
            }
            catch (IOException e){
            e.printStackTrace();
            }
    
            for(M=1;M<lineCount;M++){
            FinalVRN = Memory[M];
            
            try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("EndOfShiftFile", true));
            writer.write(FinalVRN + "\n");
            writer.close(); 
            }
             
            
            catch (IOException e){
                    e.printStackTrace();
            }
            
             }// End for statement  
                
            
    
    jLabel3.setText("");
    jLabel4.setText("System has been turned off");
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Code to close the operator menu
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorMenu().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    // Method for: Receiving VRN info from camera from file and storing in PRE-Memory
    public static String Filereader(int Number) {
        
        //Variables
            int lineNumber = 1;
            String line = "";
            BufferedReader reader = null;
            int i=0;
            String lineToRead="";
        
        //Process
            try{
            reader = new BufferedReader(new FileReader("CameraVRNInfo"));
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
        
 
    }// End Filereader method
    
    // Method for: Update PRE-memory with correct VRN data from VRNInfo file and store in Memory
    public static String VRNComparison(String VRN) {
        
        // Variables
        String line = null;
        String Info = "";
        
        // Process
            try{
            BufferedReader reader = new BufferedReader(new FileReader("VRN.Info"));
          
          
                while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");

            
                    if (fields[0].equals(VRN)) {
                    Info = line;
                    }// End IF Statement
            
                } //End While Statement
        
     
        
            }// End Try statement
        
            catch(IOException e){
                e.printStackTrace();                

            }//End catch statement
            
        return Info;
}

    public static int LengthFile(int Number){
        // Variables 
        int Count = 0;
        // Process
        try (BufferedReader reader = new BufferedReader(new FileReader("CameraVRNInfo"))) {
                while (reader.readLine() != null) {
                Count++;
                }// End while statement
                }// End try statement
                catch (IOException e) {
                e.printStackTrace();
                
                }// End catch statement
    return Count;
    }// End LengthFile method
    
    public static int LengthFile2(int Number){
        // Variables 
        int Count = 0;
        // Process
        try (BufferedReader reader = new BufferedReader(new FileReader("CameraVRNInfo"))) {
                while (reader.readLine() != null) {
                Count++;
                }// End while statement
                }// End try statement
                catch (IOException e) {
                e.printStackTrace();
                
                }// End catch statement
    return Count;
    }// End lengthFile2 method
}// End class


   


