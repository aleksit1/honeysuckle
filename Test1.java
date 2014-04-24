/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package test1;
import java.io.*;
//import java.util.Calendar;
/**
 *
 * @author aleks
 */
public class Test1 {
    static BufferedWriter out;
    String read;

    int linenum = 3;//the specific line i want to read
    public static void FileWrite(String teacher, String date, String period, String booking){
        try
        {
            String dates = "dates.txt";
            
            FileWriter fw = new FileWriter("data.txt",true); //the true will append the new data
            FileWriter log = new FileWriter("data.txt",true);
            log.write("\r\n");
            log.write(date + '\t' + booking);
            log.close();
            fw.write("\r\n");
            fw.write(teacher + '\t' + date + '\t' + period + '\t' + booking);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }   

     
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("data.txt");
        File file2 = new File("dates.txt");
        tests app = new tests();
        app.setVisible(true);

    } 
}
    
    
