package ManagementSystem;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PublicMemberList {
    private ArrayList<PublicMember> PublicMemebrs;

    public PublicMemberList(){
        PublicMemebrs = new ArrayList<PublicMember>();
    }

    /**
     * this method will read a csv and convert data into a odject
     * @return
     * */
    public void readCSV(){
        BufferedReader buff =null;
        try {
            buff = new BufferedReader(new FileReader("PublicMembers.csv"));
            String inputLine = buff.readLine();  //read first line
            while(inputLine != null){
                ProccessLine(inputLine);
                //read next line
                inputLine = buff.readLine();

            }
            buff.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } finally  {
            try{
                buff.close();
            }
            catch (IOException ioe) {
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
        Name name = new Name(data[1]);
        PublicMember p = new PublicMember(data[0], name, data[2],data[3],data[4],data[5]);
        //add to list
        PublicMemebrs.add(p);
    }

    /**
     *@return receptionist object
     * */
    public PublicMember getByIndex(int index){
        return PublicMemebrs.get(index);
    }

    /**
     * @return size of the list
     * */
    public int getsize(){
        return PublicMemebrs.size();
    }

    /**
     * Look up an id and return the
     * corresponding staff details.
     * @param  id  to be looked up.
     * @return The details corresponding to the id, null if none
     */

    public PublicMember findById(String id)
    {
        for (PublicMember p : PublicMemebrs)
        {
            if (p.getId().equals(id))
            {
                return p;
            }
        }
        return null;
    }

    /**
     * Add a new set of details to the list
     * assumes that details are correct and not already there
     * @param details The details of the staff
     */
    public void addDetails(PublicMember details)
    {
        PublicMemebrs.add(details);
    }

    /**
     * @return All the staff details
     */
    public String listDetails()
    {
        StringBuffer allEntries = new StringBuffer();
        for(PublicMember details : PublicMemebrs) {
            allEntries.append(details);
            allEntries.append('\n');
        }
        return allEntries.toString();
    }

    /**
     * Get total memebrship fees
     * @return fees
     * */
    public double getmemfees(){
        double fees = 0;
        for(PublicMember p : PublicMemebrs){
            fees+=p.getMonthlyFee();
        }
        return fees;
    }

    /**
     * get total amount of fees of all members
     * @return fees
     * */
    public double gettotfees (){
        double fees = 0;
        for (PublicMember p: PublicMemebrs){
            fees+=p.getfullfees();
        }
        return fees;
    }

    /***
     * Get a new Student Member from user add it to CSV
     * @param ID - user ID
     * @param name - Name as a string odject
     * @param age -age
     * @param phone  - phone
     * @param email - email
     * */
    public void AddMemebrtoCSV (String ID, String name, String age, String phone, String email, String Mem){
        String filepath = "PublicMembers.csv";

        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw =new PrintWriter(bw);
            pw.println(ID+","+name+","+age+","+phone+","+email+","+"full");
            pw.flush();
            pw.close();
        }
        catch (Exception E){
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
    /**
     * Edit existing recodes
     * */
    public void EditPublicMembers(String id, String name, String age, String phone, String email){
        String filepath = "PublicMembers.csv";
        String tempfile = "Temp.csv";
        File oldFIle = new File(filepath);
        File newFile = new File(tempfile);

        String ID = "" ; String Name = "";
        String Age = "";
        String Phone = "";
        String Email="";
        String Mem="";
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()){
                ID = x.next();
                Name = x.next();
                Age=x.next();
                Phone=x.next();
                Email=x.next();
                Mem = x.next();

                if(ID.equals(id)){
                    pw.println(ID+","+name+","+age+","+phone+","+email+","+Mem.trim());
                }else {
                    pw.println(ID+","+Name+","+Age+","+Phone+","+Email+","+Mem.trim());
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFIle.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    /***
     * Delete Recodes
     */
    public void DeletePublicMembers(String id){
        String filepath = "PublicMembers.csv";
        String tempFIle = "Temp.csv";
        File oldFIle = new File(filepath);
        File newFIle = new File(tempFIle);
        String ID=""; String name=""; String age=""; String phone=""; String email="" ;
        String mem="";

        try {
            FileWriter fw = new FileWriter(tempFIle,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNextLine()){
                ID=x.next();
                name=x.next();
                age = x.next();
                phone=x.next();
                email=x.next();
                mem=x.next();

                if(!ID.equals(id)){
                    pw.println(ID+","+name+","+age+","+phone+","+email+","+mem);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFIle.delete();
            File dump = new File(filepath);
            newFIle.renameTo(dump);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
}
