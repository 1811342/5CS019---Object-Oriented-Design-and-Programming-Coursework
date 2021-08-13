/**
 * List of all the lifeguards
 * */
package ManagementSystem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LifeguardList {
    private ArrayList <Lifeguards> LifeguardArralist;

    public LifeguardList(){
        LifeguardArralist =new ArrayList<Lifeguards>();
    }
    /**
     * this method will read a csv and convert data into a odject
     * @return
     * */
    public void ReadCSV(){
        BufferedReader buff =null;
        try {
            buff = new BufferedReader(new FileReader("SchoolMembers.csv"));
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
        Lifeguards s = new Lifeguards(data[0], name, data[2],hours);
        s.addHours(hours);
        //add to list
        LifeguardArralist.add(s);

    }
    /**
     *@return receptionist object
     * */
    public Lifeguards getByIndex(int index){
        return LifeguardArralist.get(index);
    }
    /**
     * @return size of the list
     * */
    public int getsize(){
        return LifeguardArralist.size();
    }

    /**
     * Look up an id and return the
     * corresponding staff details.
     * @param  id  to be looked up.
     * @return The details corresponding to the id, null if none
     */
    public Lifeguards findById(String id)
    {
        for (Lifeguards l : LifeguardArralist)
        {
            if (l.getId().equals(id))
            {
                return l;
            }
        }
        return null;
    }

    /**
     * Add a new set of details to the list
     * assumes that details are correct and not already there
     * @param details The details of the staff
     */
    public void addDetails(Lifeguards details)
    {
        LifeguardArralist.add(details);
    }

    /**
     * @return All the staff details
     */
    public String listDetails()
    {
        StringBuffer allEntries = new StringBuffer();
        for(Lifeguards details : LifeguardArralist) {
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
        for (Lifeguards l: LifeguardArralist){
            l.setSalary(4.25);
            completeSalary=l.getSalary();
        }
        return completeSalary/4; // divide by 4 to get weekly tot salary
    }

}
