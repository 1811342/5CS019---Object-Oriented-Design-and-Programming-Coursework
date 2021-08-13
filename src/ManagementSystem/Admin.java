/**
 * Admin Class
 * */
package ManagementSystem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Admin {
   private String uname="admin";
   private String password = "1234";

   public Admin(){
   }

   public void ReadCSV() {
       BufferedReader buff = null;
       try {
           buff = new BufferedReader(new FileReader("Admin.csv"));
           String inputLine = buff.readLine();  //read first line
           while (inputLine != null) {
               ProccessLine(inputLine);
               //read next line
               inputLine = buff.readLine();
           }
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           System.exit(1);
       } catch (IOException e) {
           e.printStackTrace();
           System.exit(1);
       } finally {
           try {
               buff.close();
           } catch (IOException ioe) {
               //don't do anything
           }
       }
   }
       /**
        * @param inputLine each line in the CSV
        * @return
        * */
       private void ProccessLine(String inputLine){
           //split line into parts
           String data [] = inputLine.split(",");
           //create staff object
           String Uname = data[0];
           String pword = data[1];
           setuname(Uname);
           setPassword(pword);
       }

   public String getUname() {
        return uname;
    }
    public String getPassword() {
       return password;
    }
    private void setuname(String Uname){ this.uname=uname; }
    private void setPassword(String Password){ this.password=password; }

}
