/**
 * Project: ANPR 
 * Author: Markcus Richardson
 * Date:11-1-2022
 * 
 */

package anpr.system.program;

import java.io.File;
import java.io.IOException;


public class ANPRSystemProgram {
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        new Menu().setVisible(true);
      
    
        
        
        
        //Code for creation of VRN info file
        boolean ifNotExist = true;
        
        
        try{
        File file = new File("VRN.Info");
        ifNotExist = file.createNewFile();
        }// End try statement
        catch (IOException e){
            e.printStackTrace();
        }// End catch statement
        
        
        
            
        //Code for creation of CameraVRNInfo file
        
        
        try{
        File file = new File("CameraVRNInfo");
        ifNotExist = file.createNewFile();
        }// End try statement
        catch (IOException e){
            e.printStackTrace();
        }// End catch statement
        
        
        
}// End main statement
}// End class statement