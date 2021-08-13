package ManagementSystem;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Simple java class to implement Scheduling System and read the Schedules and Edit
 * */
public class Schedule {
    private Map<String, List<Employees>> map;

    public Schedule(){
        map = new HashMap<String,List<Employees>>();

    }

    /**
     * Display Schedule
     * */
    public String DispaySchedule(){
        String Schedule="";
        BufferedReader buff =null;

        try{
            buff = new BufferedReader(new FileReader("Shifts.csv"));
            String inputLine = buff.readLine();  //read first line
            while(inputLine != null){
                Schedule+=ProcessLine(inputLine);
                //read next line
                inputLine = buff.readLine();
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
        return Schedule;
    }

    private String ProcessLine(String line){
        String data [] = line.split(",");
        String returnLine = "\n"+ String.format("%s",data[0])+ String.format("%30s",data[1])+ String.format("%10s",data[2])+ String.format("%25s",data[3])+ String.format("%10s",data[4]);
        return returnLine;
    }

    /**
     *Edit Schedule
     * @param Day  Day need to edit
     * */
    public void EditSchedule(String Day){

    }
}
