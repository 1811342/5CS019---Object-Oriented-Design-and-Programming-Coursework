/**
 * maintains a list of Staff objects as an ArrayList
 * with methods to add objects, find size, various reports
 */
package ManagementSystem;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;

public class ReceptionistList {
    private ArrayList <Receptionist> receptionistArrayList;

    public ReceptionistList(){
        receptionistArrayList =new ArrayList<Receptionist>();
    }
    /**
     * this method will read a csv and convert data into a odject
     * @return
     * */
    public void ReadCSV(){
        BufferedReader buff =null;
        try {
            buff = new BufferedReader(new FileReader("Receptionist.csv"));
            String inputLine = buff.readLine();  //read first line
            while(inputLine != null){
                ProccessLine(inputLine);
                //read next line
                inputLine = buff.readLine();
            }
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
        int hours = Integer.parseInt(data[3]);
        Receptionist s = new Receptionist(data[0], name, data[2],hours);

        s.addHours(hours);
        //add to list
        receptionistArrayList.add(s);

    }

    /**
     *@return receptionist object
     * */
    public Receptionist getByIndex(int index){
        return receptionistArrayList.get(index);
    }

    /**
     * @return size of the list
     * */
    public int getsize(){
        return receptionistArrayList.size();
    }

    /**
     * Look up an id and return the
     * corresponding staff details.
     * @param  id  to be looked up.
     * @return The details corresponding to the id, null if none
     */
    public Receptionist findById(String id)
    {
        for (Receptionist r : receptionistArrayList)
        {
            if (r.getId().equals(id))
            {
                return r;
            }
        }
        return null;
    }

    /**
     * Add a new set of details to the list
     * assumes that details are correct and not already there
     * @param details The details of the staff
     */
    public void addDetails(Receptionist details)
    {
        receptionistArrayList.add(details);
    }

    /**
     * @return All the staff details
     */
    public String listDetails()
    {
        StringBuffer allEntries = new StringBuffer();
        for(Receptionist details : receptionistArrayList) {
            allEntries.append(details);
            allEntries.append('\n');
        }
        return allEntries.toString();
    }

    /**
     * get the final salary of all receptionist
     * */

    public double getFinalSalary(){
        double completeSalary = 0;
        for (Receptionist r: receptionistArrayList){
            r.setSalary(5);
            completeSalary+=r.getSalary();
        }
        return completeSalary;
    }
}

