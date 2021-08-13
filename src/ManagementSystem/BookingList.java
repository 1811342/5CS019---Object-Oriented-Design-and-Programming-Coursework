/**
 * Booking LIst Class
 * */

package ManagementSystem;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingList {
    private ArrayList <Booking> bookingList;

    /**
     * Constructor
     * */
    public BookingList () {
        bookingList=new ArrayList<Booking>();
    }

    /**
     * Read Each line of CSV file and pass it to Line method
     * */
    public void ReadCSV(){
        String curentLine;
        try {
            FileReader fr = new FileReader("Booking.csv");
            BufferedReader br = new BufferedReader(fr);
            while ((curentLine=br.readLine())!=null){
                Line(curentLine);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error Reading File");
        }
    }
    /**
     * Trun each line into a booking and add to list
     * @param line given from readCSV method
     * */
    private void Line (String line){
        try {
            String data[]=line.split(",");
            Booking b = new Booking(data[0],data[1],data[2],data[3],data[4]);
            bookingList.add(b);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }

    /**
     * Look up an id and return the
     * corresponding staff details.
     * @param  id  to be looked up.
     * @return The details corresponding to the id, null if none
     */
    public Booking findById(String id)
    {
        for (Booking b : bookingList)
        {
            if (b.getId().equals(id))
            {
                return b;
            }
        }
        return null;
    }

    /**
     * Diplay All the Booking to a Screen
     * */
    public String DisplayAllBookings(){
        String Bookings="";
        String filepath = "Booking.csv";
        Scanner x;
        String ID = "";
        String Date = "";
        String facility ="";
        String LifeGuard ="";
        String Memebr ="";
        try {
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while (x.hasNext()){
                ID = x.next();
                Date = x.next();
                facility =x.next();
                LifeGuard =x.next();
                Memebr =x.next();

                Bookings+="\n"+String.format(ID)+" "+String.format("%15s",Date)+" "+String.format("%15s",facility)+" "+String.format("%15s",LifeGuard)+" "+String.format("%15s",Memebr);
            }
            x.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }

        return Bookings;

    }

    /**
     * @param ID  bookin id
     * @param date booking date
     * @param facility facility booked
     * @param LifeguardID staff memebr id
     * @param MemberID memebr id
     * */
    public void newBooking (String ID,String date ,String facility, String LifeguardID, String MemberID){
        String filepath = "Booking.csv";
        try {
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ID+","+date+","+facility+","+LifeguardID+","+MemberID);
            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null,"Booking Created");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }


    }

    /**
     * Delete a booking
     * @param Id ID of the booking need to delete
     * */
    public void DeleteBooking (String Id){
        String filepath = "Booking.csv";
        String tempfile = "TempFile.csv";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);

        String currentLine;
        String data[];
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while ((currentLine=br.readLine()) != null){
                data = currentLine.split(",");
                if (!(data[0].equalsIgnoreCase(Id))){
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    /**
     * Edit Bookings
     * @param ID  bookin id
     * @param date new booking date
     * @param facility new facility booked
     * @param LifeguardID new staff memebr id
     * @param MemberID new memebr id
     * */
    public void EditBooking(String ID,String date ,String facility, String LifeguardID, String MemberID){
        String filepath = "Booking.csv";
        String tempfile = "TempFile.csv";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);

        String currentLine;
        String data[];
        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while ((currentLine=br.readLine()) != null){
                data = currentLine.split(",");
                if (!(data[0].equalsIgnoreCase(ID))){
                    pw.println(currentLine);
                }else {
                    pw.println(ID+","+date+","+facility+","+LifeguardID+","+MemberID);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }

    }

    /**
     * Calc final booking fee of all the bookings
     * */
    /**
     * get the final salary of all receptionist
     * */

    public double totfees(){
        double fee = 0;
        for (Booking b: bookingList){
            b.getPrice();
            fee+=b.getPrice();
        }
        return fee;
    }

}
